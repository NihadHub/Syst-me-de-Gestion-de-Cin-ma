package helper;

import java.sql.*;

public class Connexion {
    static final String USER = "root";
    static final String PASS = "";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/cinemaDB";
    public Statement statement;

    public void initConnexion() {
        try {

            Connection connection = DriverManager.getConnection(
                    DB_URL,
                    USER,
                    PASS
            );
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executerUneRequete(String requete) {
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(requete);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
