package com.example.demorechandlerapp.Controller;

import com.example.demorechandlerapp.ModelAndService.Trade;
import com.example.demorechandlerapp.ModelAndService.TradeService;
import com.example.demorechandlerapp.View.BrokerAView;
import com.example.demorechandlerapp.View.BrokerAviewConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private TradeService service;

    @Autowired
    private BrokerAviewConverter brokerAviewConverter;

    @GetMapping("/")
    public String root() {
        return "Hello World";
    }

    @GetMapping("/trades")
    public List<Trade> list() {
        return service.findAll();
    }

    @GetMapping("/trades/BrokerA")
    public List<BrokerAView> brokerAList(@RequestParam(defaultValue = "") String Product) {
        List<Trade> trades = service.findBlockerA(Product);
        List<BrokerAView> tradeViews = new ArrayList<>();
        trades.forEach(
                trade -> {
                    BrokerAView brokerAView = brokerAviewConverter.convert(trade);
                    tradeViews.add(brokerAView);
                }
        );
        return tradeViews;
    }
}
