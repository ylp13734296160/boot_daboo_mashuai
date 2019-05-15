package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {


    @RequestMapping("easyui")
    public String easyui() {
        System.out.println("lai");
        return "jsp/easyui";
    }
    @RequestMapping("show")
    public String show() {
        return "jsp/show";
    }
    @RequestMapping("torolepower")
    public String toRolePower() {
        return "jsp/torolepower";
    }
    @RequestMapping("tologin")
    public String tologin() {
        return "jsp/login";
    }
}
