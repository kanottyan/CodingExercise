package com.example.demorechandlerapp.ModelAndService;

import java.util.Date;

public class Trade {
    private Integer id;
    private Date tradeDate;
    private Date valueDate;
    private Integer qty;
    private char buySell;
    private double price;
    private String downstream;
    private String tradeRef;
    private Product product;

    public Trade(Integer id, Date tradeDate, Date valueDate, Integer qty,
                 char buySell, double price, String downstream,
                 String tradeRef, Product product) {
        this.id = id;
        this.tradeDate = tradeDate;
        this.valueDate = valueDate;
        this.qty = qty;
        this.buySell = buySell;
        this.price = price;
        this.downstream = downstream;
        this.tradeRef = tradeRef;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
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
