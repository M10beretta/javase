package com.mber.javarush.task.task36.Task3608.controller;

import com.mber.javarush.task.task36.Task3608.model.Model;
import com.mber.javarush.task.task36.Task3608.view.UsersView;

public class Controller {
    private Model model;
    private UsersView usersView;

    public void onShowAllUsers(){
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void onShowAllDeletedUsers() {
        model.loadDeleteUsers();
    }
}
