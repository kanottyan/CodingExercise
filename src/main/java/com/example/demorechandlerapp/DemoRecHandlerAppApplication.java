package com.example.demorechandlerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.example.demorechandlerapp",
        "com.example.demorechandlerapp.Controller",
        "com.example.demorechandlerapp.Mock",
        "com.example.demorechandlerapp.ModelAndService",
        "com.example.demorechandlerapp.View"})
public class DemoRecHandlerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRecHandlerAppApplication.class, args);

    }
}
