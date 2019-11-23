package com.example.studyMybatis.controller;

import com.example.studyMybatis.mapper.UserMapper;
import com.example.studyMybatis.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.example.studyMybatis.controller
 * @ClassName: SysUserInfoController
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/19  15:12
 */
@RestController
public class SysUserInfoController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/userinfo")
    public Map<String, Object> getUserInfo(){
        Map<String, Object> resultMap = new HashMap<>();
        //SysUser sysUser = userMapper.selectById(1L);
        //resultMap.put("result", sysUser);
        return resultMap;
    }
}
