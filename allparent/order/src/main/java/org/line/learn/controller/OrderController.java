package org.line.learn.controller;

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

    //剩余量
    @RequestMapping("/total")
    public Integer getTotalNumber(@RequestParam String sku){
        Integer a =   orderService.getTotleNumber(sku);
        System.out.println(a);
        return  a;
    }

}
