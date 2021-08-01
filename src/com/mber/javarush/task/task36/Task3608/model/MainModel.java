package com.mber.javarush.task.task36.Task3608.model;

import com.mber.javarush.task.task36.Task3608.bean.User;
import com.mber.javarush.task.task36.Task3608.model.service.UserService;
import com.mber.javarush.task.task36.Task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {
    private final ModelData modelData = new ModelData();
    private final UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(getAllUsers());
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

    @Override
    public void deleteUserById(long id) {
        userService.deleteUser(id);
        modelData.setUsers(getAllUsers());
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        userService.createOrUpdateUser(name, id, level);
        modelData.setUsers(getAllUsers());
    }

    private List<User> getAllUsers() {
        List<User> users = userService.getUsersBetweenLevels(1, 100);
        return userService.filterOnlyActiveUsers(users);
    }


}
