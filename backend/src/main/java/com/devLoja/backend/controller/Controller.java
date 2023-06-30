package com.devLoja.backend.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller{

    @GetMapping("/")
    public String hello(){
        return "Hello" + new Date();
    }

}