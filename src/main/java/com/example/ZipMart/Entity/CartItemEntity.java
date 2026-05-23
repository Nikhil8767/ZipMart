package com.example.ZipMart.Entity;

import jakarta.persistence.*;

@Entity
public class CartItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductEntity product;

    private int quantity;

    @OneToOne(mappedBy = "cart")
    private CartEntity cart;




}
