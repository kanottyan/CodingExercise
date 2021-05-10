package com.example.demorechandlerapp.View;

import com.example.demorechandlerapp.ModelAndService.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseView {
    private Integer id;
    protected String tradeDate;
    protected String valueDate;
    private Integer qty;
    private char buySell;
    private double price;
    private String downstream;
    private String tradeRef;
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String formatDate = dateFormat.format(tradeDate);
        this.tradeDate = formatDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String formatDate = dateFormat.format(valueDate);
        this.valueDate = formatDate;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public char getBuySell() {
        return buySell;
    }

    public void setBuySell(char buySell) {
        this.buySell = buySell;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDownstream() {
        return downstream;
    }

    public void setDownstream(String downstream) {
        this.downstream = downstream;
    }

    public String getTradeRef() {
        return tradeRef;
    }

    public void setTradeRef(String tradeRef) {
        this.tradeRef = tradeRef;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
