package com.example.demorechandlerapp.ModelAndService;

import com.example.demorechandlerapp.Mock.MockTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TradeService {

    @Autowired
    private MockTradeService service;

    public List<Trade> findAll() {
        return service.init();
    }

    public List<Trade> findBlockerA(String product) {
        List<Trade> res = service.init().stream().filter(t -> "BrokerA".equals(t.getDownstream())).collect(Collectors.toList());
        if (!product.isEmpty())
            res = res.stream().filter(t -> product.equals(t.getProduct().getProductName())).collect(Collectors.toList());
        return res;
    }
}
