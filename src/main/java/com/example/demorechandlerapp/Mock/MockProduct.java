package com.example.demorechandlerapp.Mock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class MockProduct {
    @Id
    private Integer id;

    @Column(name = "producttype")
    private Integer productType;
    @Column(name = "productname")
    private String productName;
    @Column(name = "denominated")
    private String denominated;
    @Column(name = "cross")
    private String cross;
    @Column(name = "ISIN")
    private String ISIN;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDenominated() {
        return denominated;
    }

    public void setDenominated(String denominated) {
        this.denominated = denominated;
    }

    public String getCross() {
        return cross;
    }

    public void setCross(String cross) {
        this.cross = cross;
    }

    public String getISIN() {
        return ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }
}
