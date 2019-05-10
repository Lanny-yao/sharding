package com.lanny.sharding.controller;

import com.dangdang.ddframe.rdb.sharding.keygen.KeyGenerator;
import com.lanny.sharding.dao.Order;
import com.lanny.sharding.dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lanny Yao
 * @date 5/10/2019 2:46 PM
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private KeyGenerator keyGenerator;

    @RequestMapping("/create")
    public Object add() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId((long) i);
            order.setOrderId((long) i);
            orderRepository.save(order);
        }
        for (int i = 10; i < 20; i++) {
            Order order = new Order();
            order.setUserId((long) i + 1);
            order.setOrderId((long) i);
            orderRepository.save(order);
        }

//        for (int i = 0; i < 30; i++) {
//            Order order = new Order();
//            order.setOrderId(keyGenerator.generateKey().longValue());
//            order.setUserId(keyGenerator.generateKey().longValue());
//            orderRepository.save(order);
//        }

        return "success";
    }

    @RequestMapping("/query")
    private Object queryAll() {
        return orderRepository.findAll();
    }

    @RequestMapping("/between")
    private Object queryBetween(){
        return orderRepository.findAllByUserIdBetween(5, 10);
    }
}
