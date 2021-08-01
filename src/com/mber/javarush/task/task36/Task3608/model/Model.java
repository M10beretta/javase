package com.mber.javarush.task.task36.Task3608.model;

public interface Model {

    ModelData getModelData();

    void loadUsers();

    void loadDeleteUsers();

    void loadUserById(long userId);

    void deleteUserById(long id);

    void changeUserData(String name, long id, int level);
}
