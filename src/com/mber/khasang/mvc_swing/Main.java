package com.mber.khasang.mvc_swing;

import com.mber.khasang.mvc_swing.controller.UserController;
import com.mber.khasang.mvc_swing.model.User;
import com.mber.khasang.mvc_swing.view.UserView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        var user = new User();
        var userController = new UserController(user);
        var userView = new UserView(userController);
        SwingUtilities.invokeLater(userView::init);
    }
}
