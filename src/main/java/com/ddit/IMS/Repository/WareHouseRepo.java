package com.ddit.IMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddit.IMS.Models.WareHouse;

public interface WareHouseRepo extends JpaRepository<WareHouse, Integer>{
    
}
