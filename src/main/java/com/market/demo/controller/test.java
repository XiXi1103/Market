package com.market.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class test {
    @PostMapping(value = "/test")
    @ResponseBody
    public String login(HttpServletRequest request){
        JSONObject result = new JSONObject();
        HttpSession session = request.getSession();
        result.put("name",session.getAttribute("username"));
        return result.toJSONString();
    }
}
