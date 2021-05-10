package com.example.demorechandlerapp.ModelAndService;

public class Forward extends Product {
    private String cross;

    public Forward(String cross) {
        this.cross = cross;
        this.productName = "Forward";
    }

    public String getCross() {
        return cross;
    }

    public void setCross(String cross) {
        this.cross = cross;
    }
}
