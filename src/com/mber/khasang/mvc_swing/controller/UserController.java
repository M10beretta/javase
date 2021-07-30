package com.mber.khasang.mvc_swing.controller;

import com.mber.khasang.mvc_swing.model.User;

public class UserController {
    private User user;

    public UserController(User user) {
        this.user = user;
    }

    public boolean checkPin(int pin) {
        return user.getPin() == pin;
    }
}
