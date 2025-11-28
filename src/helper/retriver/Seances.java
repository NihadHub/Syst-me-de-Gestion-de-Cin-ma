package helper.retriver;

import app.Film;
import app.Seance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Seances extends Selector<Seance>{
    @Override
    public List<Seance> call(Statement statement, String requete) {
        List<Seance> seanceList = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(requete);
            while (resultSet.next()){
                int seanceId = resultSet.getInt("seanceId");
                String horaire = resultSet.getString("horaire");
                int salle = resultSet.getInt("salle");
                int capaciter = resultSet.getInt("capaciter");
                seanceList.add(new Seance(seanceId,horaire,salle,capaciter));
            }
        } catch (SQLException error) {
            error.printStackTrace();
        }
        return seanceList;
    }
}
