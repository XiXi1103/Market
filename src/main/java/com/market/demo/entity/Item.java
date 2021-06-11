package com.market.demo.entity;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "name",length = 20)
    public String name;

    @Column(name = "price")
    public String price;
}
