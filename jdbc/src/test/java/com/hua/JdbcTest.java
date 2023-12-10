package com.hua;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.Date;

/**
 * @author Huauauaa
 */
class JdbcTest {

    static Connection connection;
    static PreparedStatement statement;
    static ResultSet resultSet;

    @BeforeAll
    static void setUp() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "123456");


    }

    @AfterAll
    static void tearDown() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    void testQuery() throws SQLException {
        statement = connection.prepareStatement("select * from t_book");
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }
    }

    @Test
    void testGenerateKeys() throws SQLException {
        statement = connection.prepareStatement("insert into t_book (name) values(?)", Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, String.valueOf(new Date()));

        statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();

        resultSet.next();
        System.out.println(resultSet.getInt(1));
    }
}