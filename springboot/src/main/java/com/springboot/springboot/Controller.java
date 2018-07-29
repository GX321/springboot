package com.springboot.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/index2")
    public String msg(ModelMap map){
       map.addAttribute("msg","hello spring boot!");
        return "index";
        
        
    }
}
