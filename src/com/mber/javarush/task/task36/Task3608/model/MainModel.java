package com.mber.javarush.task.task36.Task3608.model;

import com.mber.javarush.task.task36.Task3608.model.service.UserService;
import com.mber.javarush.task.task36.Task3608.model.service.UserServiceImpl;

public class MainModel implements Model {
    private final ModelData modelData = new ModelData();
    private final UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeleteUsers() {
        modelData.setUsers(userService.getAllDeletedUsers());
        modelData.setDisplayDeletedUserList(true);
    }

    @Override
    public void loadUserById(long userId) {
        modelData.setActiveUser(userService.getUsersById(userId));
    }
}
