package com.mber.javarush.task.task36.Task3608.view;

import com.mber.javarush.task.task36.Task3608.controller.Controller;
import com.mber.javarush.task.task36.Task3608.model.ModelData;

public class UsersView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users: ");
        modelData.getUsers().forEach(x -> System.out.println("\t" + x));
        System.out.println("==================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

//    @Override
    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

//    @Override
    public void fireEventDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
}
