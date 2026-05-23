package com.example.ZipMart.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int totalAmount;


    @OneToOne
    @JoinColumn(name="customer_id")
    private CustomerEntity customer;

    @OneToOne
    @JoinColumn(name="cartItem")
    private CartEntity cart;


}
