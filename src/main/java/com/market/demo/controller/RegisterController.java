package com.market.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.market.demo.entity.User;
import com.market.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {
    @Autowired
    UserRepository userRepository;
    @ResponseBody
    public String register(@RequestBody String username, String password, String email){
        JSONObject result = new JSONObject();
        if (userRepository.findUserByUsername(username)!=null){
            result.put("flag",0);
        }
        else {
            User user = new User();
            user.username = username;
            user.email = email;
            user.password = password;
            userRepository.save(user);
            result.put("flag",1);
        }
        return result.toJSONString();
    }
}
