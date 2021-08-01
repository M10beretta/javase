package com.mber.javarush.task.task36.Task3608.controller;

import com.mber.javarush.task.task36.Task3608.model.Model;
import com.mber.javarush.task.task36.Task3608.view.EditUserView;
import com.mber.javarush.task.task36.Task3608.view.UsersView;

public class Controller {
    private Model model;
    private UsersView usersView;
    private EditUserView editUserView;

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void setEditUserView(EditUserView editUserView) {
        this.editUserView = editUserView;
    }

    public void onShowAllDeletedUsers() {
        model.loadDeleteUsers();
    }

    public void onOpenUserEditForm(long userId) {
        model.loadUserById(userId);
        editUserView.refresh(model.getModelData());
    }

    public void onUserDeleted(long id) {
        model.deleteUserById(id);
        usersView.refresh(model.getModelData());
    }

    public void onUseChange(String name, long id, int level) {
        model.changeUserData(name, id, level);
        usersView.refresh(model.getModelData());
    }
}
