package org.line.learn.controller;

import com.netflix.discovery.converters.Auto;
import org.line.learn.configration.BusinessCard;
import org.line.learn.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;
    @Autowired
    private BusinessCard businessCard;

    //剩余量
    @RequestMapping("/total")
    public Integer getTotalNumber(@RequestParam String sku) {
        System.out.println(businessCard);
        Integer a = orderService.getTotleNumber(sku);
        System.out.println(a);
        return a;
    }

}
