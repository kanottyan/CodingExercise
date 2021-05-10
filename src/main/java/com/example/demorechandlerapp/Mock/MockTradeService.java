package com.example.demorechandlerapp.Mock;


import com.example.demorechandlerapp.ModelAndService.Bond;
import com.example.demorechandlerapp.ModelAndService.Forward;
import com.example.demorechandlerapp.ModelAndService.Product;
import com.example.demorechandlerapp.ModelAndService.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockTradeService {
    @Autowired
    private MockTradeRepository tradeRepo;

    private List<MockTrade> getAll() {
        return tradeRepo.findAll();
    }

    private Product initProduct(MockProduct mp) {
        if (mp.getProductType() == 1) {
            return new Forward(mp.getCross());
        } else if (mp.getProductType() == 2) {
            return new Bond(mp.getISIN());
        } else {
            return null;
        }
    }

    public Trade initTrade(MockTrade mt) {
        MockProduct mp = mt.getProduct();
        Product p = initProduct(mp);
        return new Trade(mt.getId(), mt.getTradeDate(), mt.getValueDate(), mt.getQty(), mt.getBuySell().charAt(0), mt.getPrice(), mt.getDownstream(), mt.getTradeRef(), p);
    }

    public List<Trade> init() {
        List<MockTrade> mTrades = this.getAll();
        List<Trade> trades = new ArrayList<>();
        for (MockTrade mt : mTrades) {
            Trade t = this.initTrade(mt);
            trades.add(t);
        }
        return trades;
    }
}
