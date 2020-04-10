package org.database;


import org.entity.Product;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class Database implements Crud<Integer, Product> {
    private final Connection connection;
    private final String table;

    @Override
    public Integer create(Product object) {
        return null;
    }

    @Override
    public Product read(Integer key) {
        return null;
    }

    @Override
    public void update(Integer key, Product object) {

    }

    @Override
    public void delete(Integer key) {

    }

    public Database(Connection connection, String table) throws SQLException {
        this.connection = connection;
        this.table = table;

        try(Statement statement = this.connection.createStatement()) {
            String createComand = "CREATE TABLE table_name (column_name column_type attributes)";
            statement.execute(createComand);
        }
    }
}
