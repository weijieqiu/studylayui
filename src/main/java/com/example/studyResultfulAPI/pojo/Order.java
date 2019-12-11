package com.example.studyResultfulAPI.pojo;

/**
 * @PackageName: com.example.studyResultfulAPI.pojo
 * @ClassName: Code
 * @Description: 订单ID与订单描述
 * @author: qiuweijie
 * @date: 2019/12/10  11:29
 */
public class Order {
    private Integer id;
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Order(Integer id, String message) {
        this.id = id;
        this.message = message;
    }
}
