package com.example.ZipMart.Entity;

import jakarta.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String username;
    private String email;
    private String password;

    private String role;

    @OneToOne(mappedBy = "user")
    private AdminEntity admin;

    @OneToOne(mappedBy = "user")
    private CustomerEntity customer;

}
