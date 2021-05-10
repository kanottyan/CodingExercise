package com.example.demorechandlerapp.View;

import com.example.demorechandlerapp.ModelAndService.Trade;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class BrokerAviewConverter implements Converter<Trade, BrokerAView> {

    @Override
    public BrokerAView convert(@NonNull Trade trade) {
        BrokerAView view = new BrokerAView();
        view.setId(trade.getId());
        view.setValueDate(trade.getValueDate());
        view.setTradeDate(trade.getTradeDate());
        view.setBuySell(trade.getBuySell());
        view.setPrice(trade.getPrice());
        view.setQty(trade.getQty());
        view.setTradeRef(trade.getTradeRef());
        view.setDownstream(trade.getDownstream());
        view.setProduct(trade.getProduct());
        return view;
    }
}