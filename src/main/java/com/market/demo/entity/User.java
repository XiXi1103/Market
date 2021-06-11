package com.market.demo.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "username",length = 20)
    public String username;
    @Column(name = "password",length = 20)
    public String password;
    @Column(name = "email")
    public String email;
}
