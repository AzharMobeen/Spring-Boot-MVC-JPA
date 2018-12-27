package com.az.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phoneNumber;
    private String email;
    
    @JsonManagedReference
    @OneToMany( mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<UserAddress> userAddressList;


    public UserAddress addUserAddress(UserAddress userAddress){
        this.getUserAddressList().add(userAddress);
        userAddress.setUser(this);
        return userAddress;
    }
}