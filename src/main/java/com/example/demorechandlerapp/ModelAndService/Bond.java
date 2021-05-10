package com.example.demorechandlerapp.ModelAndService;

public class Bond extends Product {
    private String ISIN;

    public String getISIN() {
        return ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    public Bond(String ISIN) {
        this.ISIN = ISIN;
        this.productName = "Bond";
    }

}

