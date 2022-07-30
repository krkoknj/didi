package com.dibaba.dibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public void test() {
        System.out.println("Hello World!");
    }
    
    public void onQustionButtonClicked() {
    	System.out.println("Help");
    }
}
