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
public class LoginController {
    @Autowired
    UserRepository userRepository;
    @PostMapping(value = {"/login"})
    @ResponseBody
    public String login(@RequestBody String username, String password){
        JSONObject result = new JSONObject();
        User user = userRepository.findUserByUsername(username);
        if (user==null|| !password.equals(user.password)){
            result.put("flag",0);
        }
        else {
            result.put("flag",1);
            result.put("id",user.id);
            result.put("username",username);
        }
        return result.toJSONString();
    }
}
