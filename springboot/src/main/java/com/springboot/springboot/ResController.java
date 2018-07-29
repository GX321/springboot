package com.springboot.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {
    @RequestMapping("/index1")
    public Map<String,Integer> msg(){
        Map<String, Integer> map=new HashMap<String,Integer>();
        map.put("lucy", 123);
        map.put("judy", 123);
        map.put("miss", 123);
        return map;
        
        
    }
}
