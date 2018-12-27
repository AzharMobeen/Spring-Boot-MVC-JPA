package com.az;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.az.service.UserService;

import lombok.extern.java.Log;

@Log
@Component
public class CustomeApplicationRunner  implements ApplicationRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        log.info("CustomInitiatorApp run method ...");
        userService.insertDummyData();
        log.info("CustomInitiatorApp run method end");
    }
}