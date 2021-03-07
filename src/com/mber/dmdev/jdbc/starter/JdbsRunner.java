package com.mber.dmdev.jdbc.starter;

import com.mber.dmdev.jdbc.starter.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.SQLException;

public class JdbsRunner {
    public static void main(String[] args) throws SQLException {

        try (var connection = ConnectionManager.open()) {
            System.out.println(connection.getTransactionIsolation());
        }
    }
}
