package com.springboot.springboot;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.User;
import com.springboot.springboot.service.UserService;

@RestController
public class UserController {
    
   @Autowired
    private UserService service;
   
   @Autowired
    private Dalao dalao;
    @RequestMapping(value="/User" ,method=RequestMethod.GET)
    public List<User> getUsers(){
        System.out.println("dalao"+dalao.toString());
        return service.getUsers();
    }
    @RequestMapping(value="/User",method=RequestMethod.POST)
    public String addUsers(@Valid @ModelAttribute User user){
        return service.addUsers(user);
    }
    @RequestMapping(value="/Test",method=RequestMethod.GET)
    public String test(){
        return "ok";
    }
}
