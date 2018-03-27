package com.zengs.cloud.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @RequestMapping("/home/index")
    public String index(){
        return String.format("/home/index %s",new Date());
    }

}
