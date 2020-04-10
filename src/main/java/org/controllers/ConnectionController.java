package org.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionController {


    public static Connection getNewConnection (String URL) throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
