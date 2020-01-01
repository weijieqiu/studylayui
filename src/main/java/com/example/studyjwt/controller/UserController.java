package com.example.studyjwt.controller;

import com.example.studyjwt.annotation.PassToken;
import com.example.studyjwt.annotation.UserLoginToken;
import com.example.studyjwt.pojo.User;
import com.example.studyjwt.service.UserService;
import com.example.studyjwt.utils.Result;
import com.example.studyjwt.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.example.studyjwt.controller
 * @ClassName: UserController
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  15:08
 */
@RequestMapping("/api")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PassToken
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Result login(@Valid User user , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new RuntimeException(bindingResult.getFieldError().toString());
        }
        User userforbase =  userService.getUserByName(user.getUsername());

        if(userforbase==null){

            return Result.fail("登录失败，用户不存在");
        }
        if(!userforbase.getPassword().equals(user.getPassword())){
            return Result.fail("登录失败，密码错误");
        }
        String token = TokenUtils.getToken(userforbase);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("token",token);


        return Result.success(map);
    }
    @UserLoginToken
    @RequestMapping("/getmessage")
    public Result getmessage(){
        return Result.success("你已经通过验证");
    }


}
