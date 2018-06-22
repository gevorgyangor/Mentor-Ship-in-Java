package main.manager;

import main.db.DBConnectionProvider;

import java.sql.*;

public class OddManager {

    private Connection connection;

    public OddManager() {
        connection =  DBConnectionProvider.getInstance().getConnection();
    }

    public void addOddNumber(int number) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `odd`(odd) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, number);
        preparedStatement.executeUpdate();
    }

    public int getOddNumber() throws SQLException {
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM `odd`";

        ResultSet resultSet = statement.executeQuery(query);
        if (resultSet.next()) {
            int num = resultSet.getInt("odd");
            return num;
        }
        return 0;
    }
}
