package com.ddit.IMS.Models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productsInfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
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
