package com.example.demorechandlerapp.Mock;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trades")
public class MockTrade {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "Tradedate")
    private Date tradeDate;

    @Column(name = "valuedate")
    private Date valueDate;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "buysell")
    private String buySell;

    @Column(name = "price")
    private double price;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "product_id")
    private MockProduct product;

    @Column(name = "downstream")
    private String downstream;

    @Column(name = "traderef")
    private String tradeRef;

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

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MockProduct getProduct() {
        return product;
    }

    public void setProduct(MockProduct product) {
        this.product = product;
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
}
