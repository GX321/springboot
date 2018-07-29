package com.springboot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.springboot.service.UserService;
@Controller
public class IndexController {
@Autowired
private UserService userSrv;
    
    @RequestMapping("/index")
    // 返回String类型，查找模板文件
    public String html(ModelMap map) {
        
        map.addAttribute("data", userSrv.getUsers());
        return "index";
    }
    
    
    @RequestMapping("/js")
    // 返回String类型，查找模板文件
    public String js(ModelMap map) {
        
        map.addAttribute("data", userSrv.getUsers());
        return "index-js";
    }
    
    
    @RequestMapping("/jsth")
    // 返回String类型，查找模板文件
    public String jsth(ModelMap map) {
        
        map.addAttribute("data", userSrv.getUsers());
        return "index-js-th";
    }
    @RequestMapping("/jsthajax")
    // 返回String类型，查找模板文件
    public String jsthajax(ModelMap map) {
        
        map.addAttribute("data", userSrv.getUsers());
        return "index-js-th-ajax";
    }
}
