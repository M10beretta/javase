package com.mber.javarush.task.task36.Task3608.model;

import com.mber.javarush.task.task36.Task3608.bean.User;
import com.mber.javarush.task.task36.Task3608.model.service.UserService;
import com.mber.javarush.task.task36.Task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {
    private final ModelData modelData = new ModelData();
    private final UserService userService = new UserServiceImpl();

    @Override
    public void loadUsers() {
        List<User> users = userService.getUsersBetweenLevels(1, 100);
        modelData.setUsers(users);
    }

    @Override
    public void loadDeleteUsers() {
        List<User> users = userService.getAllDeletedUsers();
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }
}
