package helper.retriver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app.*;

public class Films extends Selector<Film> {
    @Override
    public List<Film> call(Statement statement, String requete) {
        List<Film> filmList = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(requete);
            while (resultSet.next()) {

                String titre = resultSet.getString("titre");
                double duree = Double.parseDouble(resultSet.getString("duree"));
                String categorie = resultSet.getString("categorie");

                filmList.add(new Film(duree,titre,categorie));
            }

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return filmList;
    }

}
