package com.mber.javarush.task.task36.Task3608;

import com.mber.javarush.task.task36.Task3608.controller.Controller;
import com.mber.javarush.task.task36.Task3608.model.MainModel;
import com.mber.javarush.task.task36.Task3608.model.Model;
import com.mber.javarush.task.task36.Task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventDeletedUsers();


    }
}
