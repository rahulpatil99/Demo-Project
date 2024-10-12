package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DBConfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class DemoController{

    @Value("${app.name}")
    private String name;

    @Autowired
    private DBConfig dbConfig;

    @GetMapping("/")
    public String display(){
        return dbConfig.getConnect()+"\n"+dbConfig.getHost()+"\n"+dbConfig.getPort();
    }

}