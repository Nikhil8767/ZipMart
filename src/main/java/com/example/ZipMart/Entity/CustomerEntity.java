package com.example.ZipMart.Entity;

import jakarta.persistence.*;

@Entity
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String CustomerName;
    private String Gender;
    private int mobileNumber;
    private int orders;
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToOne(mappedBy = "customer")
    private CustomerEntity customer;
}
