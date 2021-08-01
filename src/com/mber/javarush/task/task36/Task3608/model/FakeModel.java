package com.mber.javarush.task.task36.Task3608.model;

import com.mber.javarush.task.task36.Task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Tom", 1L, 1));
        users.add(new User("Mike", 2L, 1));
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeleteUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }
}
