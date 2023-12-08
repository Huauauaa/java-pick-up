package com.hua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Huauauaa
 */
class JdbcTest {

    Connection connection;
    PreparedStatement statement;
    ResultSet resultSet;

    @BeforeEach
    void setUp() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "123456");


    }

    @AfterEach
    void tearDown() throws SQLException {
        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    void testQuery() throws SQLException {
        statement = connection.prepareStatement("select * from t_book");
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }
}
