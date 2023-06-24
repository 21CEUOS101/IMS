package com.ddit.IMS.Models;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "orderInfo")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String date;

    @Column
    private String status;

    @ManyToMany(mappedBy = "orders")
    List<Product> products;

    @OneToOne
    WareHouse wareHouse;
    
}
