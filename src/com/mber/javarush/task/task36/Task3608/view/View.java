package com.mber.javarush.task.task36.Task3608.view;

import com.mber.javarush.task.task36.Task3608.controller.Controller;
import com.mber.javarush.task.task36.Task3608.model.ModelData;

public interface View {

    void refresh(ModelData modelData);

    void setController(Controller controller);

}
