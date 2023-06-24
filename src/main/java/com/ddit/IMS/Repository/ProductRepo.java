package com.ddit.IMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ddit.IMS.Models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
