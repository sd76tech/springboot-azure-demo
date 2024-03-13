package com.sree.springbootazuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Congrats ! your app deployed to Azure";
    }
}
