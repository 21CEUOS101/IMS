package com.ddit.IMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddit.IMS.Models.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{
    
}
