package com.mber.dmdev.jdbc.starter.util;

/* утилитный класс */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    private static final String USERNAME_KEY = "db.username";
    private static final String PASSWORD_KEY = "db.password";
    private static final String URL_KEY = "db.url";


    static {

        /* LoadDriver для работы кода в версиях до java 1.8 .
        в старых версиях org.postgresql.Driver не подгружался самостоятельно */
        LoadDriver();
    }

    private ConnectionManager() {
    }

    public static Connection open() {
        try {
            return DriverManager.getConnection(
                    PropertiesUtil.get(URL_KEY),
                    PropertiesUtil.get(USERNAME_KEY),
                    PropertiesUtil.get(PASSWORD_KEY)
            );

        } catch (SQLException e) {
            System.out.println("да уж");
            throw new RuntimeException(e);
        }
    }

    private static void LoadDriver() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


