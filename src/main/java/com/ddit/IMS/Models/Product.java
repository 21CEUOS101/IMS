package com.ddit.IMS.Models;
import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column(length = 1000)
    private String description;
    @Column
    private String category;
    @Column
    private String brand;
    @Column
    private String color;
    @Column
    private String size;
    @Column
    private String price;

    @Column
    private String quantity;
    
    @ManyToMany
    private List<WareHouse> wareHouses;

    @ManyToMany
    private List<Order> orders;

}
