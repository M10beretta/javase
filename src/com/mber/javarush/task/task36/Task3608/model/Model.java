package com.mber.javarush.task.task36.Task3608.model;

public interface Model {

    ModelData getModelData();

    void loadUsers();

    void loadDeleteUsers();

    void loadUserById(long userId);
}
