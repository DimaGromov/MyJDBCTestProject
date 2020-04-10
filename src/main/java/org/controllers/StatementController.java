package org.controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementController {

  public static Statement getNewStatement(Connection connection) throws SQLException {
      return connection.createStatement();
  }
}
