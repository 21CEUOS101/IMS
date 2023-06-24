package com.ddit.IMS.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "productsInfo")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Column(length = 1000)
    private String description;

    private String category;

    private String brand;

    private String color;

    private String size;

    private String price;

    private String quantity;

    @ManyToOne
    private WareHouse wareHouse;

}
