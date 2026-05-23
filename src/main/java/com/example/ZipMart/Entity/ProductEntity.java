package com.example.ZipMart.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private float price;
    private float rating;
    private String reviews;
    private int quantity;

    @OneToOne
    @JoinColumn(name="admin_id")
    private AdminEntity admin;

    @OneToMany
    @JoinColumn(name="customer_id")
    private List<CustomerEntity>customer;

    @OneToMany(mappedBy = "product")
    private ProductEntity product;

}
