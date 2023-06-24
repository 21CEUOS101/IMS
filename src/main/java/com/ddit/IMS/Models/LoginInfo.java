package com.ddit.IMS.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class LoginInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @OneToOne(mappedBy = "loginInfo")
    private Admin admin;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String role;

    public LoginInfo() {
    }

    public LoginInfo(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
    
}
