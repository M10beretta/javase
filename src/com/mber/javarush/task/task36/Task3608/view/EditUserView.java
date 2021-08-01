package com.mber.javarush.task.task36.Task3608.view;

import com.mber.javarush.task.task36.Task3608.controller.Controller;
import com.mber.javarush.task.task36.Task3608.model.ModelData;

public class EditUserView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited: ");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("==================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventUserDeleted(long id) {
        controller.onUserDeleted(id);
    }

    public void fireEventUserChanged(String name, long id, int level) {
        controller.onUseChange(name, id, level);
    }
}
