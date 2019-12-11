package com.example.studyResultfulAPI.controller;

import com.example.studyResultfulAPI.Result;
import com.example.studyResultfulAPI.ResultCode;
import com.example.studyResultfulAPI.pojo.Order;
import com.example.studyResultfulAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PackageName: com.example.studyResultfulAPI.controller
 * @ClassName: OrderController
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/10  11:36
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    //@GetMapping("{id}")
    //public Result getOrder(@PathVariable("id") Integer id){
    //    Order order = (Order) orderService.getOrderById(id);
    //    return new Result(ResultCode.SUCCESS, order);
    //}

    @GetMapping("{id}")
    public Result getOrder(@PathVariable("id") Integer id){
        if(id == null){
            return Result.failure(ResultCode.PARAM_IS_INVALID);
        }
        Order order = orderService.getOrderById(id);
        return Result.success(order);
    }
}
