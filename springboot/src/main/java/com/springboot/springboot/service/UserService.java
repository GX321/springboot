package com.springboot.springboot.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.springboot.model.User;

@Service
public class UserService {
    
    private static Map<Integer,User> users=Collections.synchronizedMap(new HashMap<Integer,User>());
    
    public List<User> getUsers(){
    List<User> listUsers=new ArrayList<User>(users.values());
    return listUsers;
    }
 
    public String addUsers(User user){
        users.put(user.getId(),user);
        return "success";
    }
    
    
}
