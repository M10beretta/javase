package com.mber.javarush.task.task36.Task3608;

import com.mber.javarush.task.task36.Task3608.controller.Controller;
import com.mber.javarush.task.task36.Task3608.model.FakeModel;
import com.mber.javarush.task.task36.Task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        FakeModel model = new FakeModel();
        UsersView view = new UsersView();
        Controller controller = new Controller();

        view.setController(controller);
        controller.setModel(model);
        controller.setUsersView(view);

        view.fireEventShowAllUsers();
    }
}
