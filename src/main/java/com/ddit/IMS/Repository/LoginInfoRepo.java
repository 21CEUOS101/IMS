package com.ddit.IMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddit.IMS.Models.LoginInfo;

public interface LoginInfoRepo extends JpaRepository<LoginInfo, Integer>{
    
}
