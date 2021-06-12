package com.market.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.market.demo.entity.Bill;
import com.market.demo.entity.Cart;
import com.market.demo.entity.User;
import com.market.demo.repository.BillRepository;
import com.market.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BillController {
    @Autowired
    BillRepository billRepository;

    @PostMapping(value = {"/proposeBill"})
    @ResponseBody
    public String proposeBill(@RequestBody String username, Cart cart){
        JSONObject result = new JSONObject();

        return result.toJSONString();
    }

    @GetMapping(value = {"/myBill"})
    @ResponseBody
    public String myBill(@RequestBody String username, Cart cart){
        JSONObject result = new JSONObject();
        List<Bill> listOfBill = billRepository.findBillsByUsername(username);
        if (user==null|| !password.equals(user.password)) {
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
