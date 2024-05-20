package com.anmv.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    private Connection connection;

    public Connection getConnection() throws SQLException, IOException {
        // Check connection chưa tồn tại hoặc đóng rồi thì mới thực hiện mở kết nối
        if (connection == null || connection.isClosed()){
            Properties properties = new Properties();
            FileInputStream fileConfig = new FileInputStream("src/main/resources/database.properties");
            properties.load(fileConfig);

            String dbUrl = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");

            connection = DriverManager.getConnection(dbUrl, user, password);
        }
        return connection;
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()){
            connection.close();
        }
    }
}
