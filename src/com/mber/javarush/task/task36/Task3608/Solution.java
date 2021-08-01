package com.mber.javarush.task.task36.Task3608;

import com.mber.javarush.task.task36.Task3608.controller.Controller;
import com.mber.javarush.task.task36.Task3608.model.MainModel;
import com.mber.javarush.task.task36.Task3608.model.Model;
import com.mber.javarush.task.task36.Task3608.view.EditUserView;
import com.mber.javarush.task.task36.Task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        var usersView = new UsersView();
        var editUserView = new EditUserView();
        var controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);


        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("Hank", 123L, 3);
        usersView.fireEventShowDeletedUsers();

    }
}
