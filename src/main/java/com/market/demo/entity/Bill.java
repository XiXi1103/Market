package com.market.demo.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.persistence.*;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "username",length = 20)
    public String username;

    @Column(name = "goodsListJson")
    public String goodsListJson;

    @Column(name = "totalPrice")
    public int totalPrice;

    @Column(name = "time")
    public String time;
}
