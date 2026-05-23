package com.example.ZipMart.Entity;

import jakarta.persistence.*;

@Entity
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fullName;
    private String Address;
    private int no_of_products;
    private int rating;
    private String Gender;
    private String SellsWhat;
    private int mobileNumber;

    @OneToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

}
