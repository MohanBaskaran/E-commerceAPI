package com.mohancode.cart.controller;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Transactional
    public void updateUser() {
        System.out.println("updateUser");
    }
}
