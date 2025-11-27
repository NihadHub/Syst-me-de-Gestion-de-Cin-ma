package helper;

import java.sql.*;

public class Connexion {
    static final String USER = "root";
    static final String PASS = "admin";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/cenimadb";

    public static Statement initConnexion() {
        Statement statement = null;
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

        return statement;
    }


    public static void executerUneRequete(Statement statement, String requete) {
        try {
            int isCreated = statement.executeUpdate(requete);
            System.out.println(isCreated);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
