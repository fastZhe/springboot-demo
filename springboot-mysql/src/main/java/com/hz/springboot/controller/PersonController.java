package com.hz.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping(path = "/index1",method = {RequestMethod.GET})
    public String index(){
        return "你好";
    }



}
