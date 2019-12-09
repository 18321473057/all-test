package org.line.learn.service.impl;

import org.line.learn.repertory.RepertoryFeign;
import org.line.learn.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private RepertoryFeign repertoryFeign;

    @Override
    public Integer getTotleNumber(String sku) {
        return repertoryFeign.getTotalNumber(sku);
    }
}
