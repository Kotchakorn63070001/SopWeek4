package com.example.week4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cashier {
    private Change c;

    @GetMapping(value = "/getChange")
    public Change getChange(@PathVariable int money){

//        if(money%1000 == 0){
//
//        }
        return c;
    }

}
