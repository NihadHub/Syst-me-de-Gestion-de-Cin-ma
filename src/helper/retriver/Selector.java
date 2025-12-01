package helper.retriver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

abstract public class Selector<T> {

    public abstract List<T> call(Statement statement, String requete);

    public static int executerUneRequete(Statement statement, String requete) {
        int numero =0;
        try {
            statement.executeUpdate(requete, Statement.RETURN_GENERATED_KEYS);
           ResultSet set =  statement.getGeneratedKeys();
            while (set.next()){
                numero = set.getInt(1);
            }
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return numero;
    }

}
