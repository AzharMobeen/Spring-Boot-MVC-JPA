package com.az.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.az.model.User;
import com.az.model.UserAddress;
import com.az.repository.UserRepository;

import lombok.extern.java.Log;

@Log
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getAllUsers(){
       
        return userRepository.findAll();
    }

    @Transactional
    public void insertDummyData(){
        log.info("UserService insertDummyData method start");

        User user1 = new User();
        user1.setName("Malik");
        user1.setPhoneNumber("+923455081230");
        user1.setEmail("Malik@gmail.com");
        user1.setUserAddressList(new ArrayList<>());

        UserAddress userAddress = new UserAddress();
        userAddress.setCity("RWP");
        userAddress.setCountry("PK");
        user1.addUserAddress(userAddress);

        User user2 = new User();
        user2.setName("Shah");
        user2.setPhoneNumber("+92313599169");
        user2.setEmail("Shah@gmail.com");
        user2.setUserAddressList(new ArrayList<>());
        UserAddress userAddress2 = new UserAddress();
        userAddress2.setCity("RWP");
        userAddress2.setCountry("PK");
        user2.addUserAddress(userAddress2);

        User user3 = new User();
        user3.setName("Mughal");
        user3.setPhoneNumber("+92312522212");
        user3.setEmail("AdilQamar@hotmail.com");
        user3.setUserAddressList(new ArrayList<>());
        UserAddress userAddress3 = new UserAddress();
        userAddress3.setCity("RWP");
        userAddress3.setCountry("PK");
        user3.addUserAddress(userAddress3);

        User user4 = new User();
        user4.setName("Az");
        user4.setPhoneNumber("+923214014779");
        user4.setEmail("Malik@gmail.com");
        user4.setUserAddressList(new ArrayList<>());
        UserAddress userAddress4 = new UserAddress();
        userAddress4.setCity("RWP");
        userAddress4.setCountry("PK");
        user4.addUserAddress(userAddress4);

        UserAddress userAddress5 = new UserAddress();
        userAddress5.setCountry("UAE");
        userAddress5.setCity("DXB");
        user4.addUserAddress(userAddress5);

        List<User> userList = Arrays.asList(user1,user2,user3,user4);
        userRepository.saveAll(userList);
        log.info("UserService insertDummyData method start");
    }

}