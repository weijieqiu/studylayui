package com.example.studyResultfulAPI.service;

import com.example.studyResultfulAPI.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName: com.example.studyResultfulAPI.service
 * @ClassName: OrderService
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/10  11:30
 */
@Service
public class OrderService {

    public Order getOrderById(Integer id){
        /**
         * 在此处构建几个 order
         */

        List<Order> orderList = new LinkedList<>();
        Order order = new Order(1, "第一条订单");
        Order order2 = new Order(2, "第二条订单");
        orderList.add(order);
        orderList.add(order2);
        return orderList.get(id);
    }
}
