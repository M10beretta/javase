package com.mber.javarush.task.task36.Task3608;

import com.mber.javarush.task.task36.Task3608.bean.User;

public final class Util {
    public static final String DELETED_MARKER = " (deleted)";

    public static boolean isUserDeleted(User user) {
        return user.getName().endsWith(DELETED_MARKER);
    }

    public static void markDeleted(User user) {
        if (User.NULL_USER != user && !Util.isUserDeleted(user)) {
            user.setName(user.getName() + DELETED_MARKER);
        }
    }
}