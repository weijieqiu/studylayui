package com.example.studyResultfulAPI;

import lombok.Data;

import java.io.Serializable;

/**
 * @PackageName: com.example.studyResultfulAPI
 * @ClassName: Result
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/10  11:22
 */
@Data
public class Result implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    public Result() {

    }

    public Integer setResultCode(ResultCode resultCode){
        return this.code = resultCode.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(ResultCode resultCode, Object data) {
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }

    // 返回成功
    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return  result;
    }

    // 返回成功
    public static Result success(Object data){
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    // 返回失败
    public static Result failure(ResultCode resultCode){
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    // 返回失败
    public static Result failure(ResultCode resultCode, Object data){
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }
}
