package com.ddit.IMS.Models;

import java.util.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class WareHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String zip;
    
    @ManyToMany(mappedBy = "wareHouses")
    private List<Product> products;

    @OneToOne(mappedBy = "wareHouse")
    private Order order;

    public WareHouse() {
    }

    public WareHouse(String name, String address, String city, String state, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }
    
}
