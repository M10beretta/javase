package com.mber.dmdev.jdbc.starter;

import com.mber.dmdev.jdbc.starter.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.SQLException;
import java.sql.Statement;

public class JdbsRunner {
    public static void main(String[] args) throws SQLException {
        Class<Driver> driverClass = Driver.class;

        String sql = """
                INSERT INTO info(data)
                VALUES 
                ('Test1'),
                ('Test2'),
                ('Test3'),
                ('Test4');
                """;

        try (var connection = ConnectionManager.open();
             var statement = connection.createStatement()) {
            System.out.println(connection.getSchema());
            System.out.println(connection.getTransactionIsolation());
            var executeResult = statement.execute(sql);
            System.out.println(executeResult);
            System.out.println(statement.getLargeUpdateCount());
        }
    }
}
