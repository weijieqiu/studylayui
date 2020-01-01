package com.example.studyjwt.utils;

import com.sun.corba.se.spi.ior.ObjectKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PackageName: com.example.studyjwt.utils
 * @ClassName: Result
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2020/1/1  15:37
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String status;  // 返回状态
    private String message; // 返回信息描述
    private Object object;  // 返回对象


    public static Result success(){
        Result result = new Result();
        result.setStatus("200");
        result.setMessage("成功");
        result.setObject("");
        return result;
    }
    public static Result success(String message){
        Result result = new Result();
        result.setStatus("200");
        result.setMessage(message);
        result.setObject("");
        return result;
    }
    public static Result success(Object object){
        Result result = new Result();
        result.setStatus("200");
        result.setMessage("成功");
        result.setObject(object);
        return result;
    }

    public static Result success(String message,Object object){
        Result result = new Result();
        result.setStatus("200");
        result.setMessage(message);
        result.setObject(object);
        return result;
    }

    public static Result fail(){
        Result result = new Result();
        result.setStatus("500");
        result.setMessage("失败");
        result.setObject("");
        return result;
    }

    public static Result fail(String message){
        Result result = new Result();
        result.setStatus("500");
        result.setMessage(message);
        result.setObject("");
        return result;
    }
    public static Result fail(Object object){
        Result result = new Result();
        result.setStatus("500");
        result.setMessage("失败");
        result.setObject(object);
        return result;
    }

    public static Result fail(String message,Object object){
        Result result = new Result();
        result.setStatus("500");
        result.setMessage(message);
        result.setObject(object);
        return result;
    }


}
