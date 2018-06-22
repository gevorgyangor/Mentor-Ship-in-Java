package main.manager;

import main.db.DBConnectionProvider;

import java.sql.*;

public class EvenManager {

    private Connection connection;

    public EvenManager() {
        connection = DBConnectionProvider.getInstance().getConnection();
    }

    public void addEvenNumber(int number) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `even`(even) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, number);
        preparedStatement.executeUpdate();
    }

    public int getEvenNumber() throws SQLException {
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM `even`";

        ResultSet resultSet = statement.executeQuery(query);
        if (resultSet.next()) {
            int num = resultSet.getInt("even");
            return num;
        }
        return 0;
    }
}
