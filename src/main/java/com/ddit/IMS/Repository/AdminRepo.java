package com.ddit.IMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddit.IMS.Models.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{
    
}
