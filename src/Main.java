import app.Film;
import helper.Connexion;
import helper.retriver.Films;
import helper.retriver.GenerateQueries;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        List<Film> filmList = new ArrayList<>();


        Statement statement = Connexion.initConnexion();

        /*
                Connexion.executerUneRequete(statement, " INSERT INTO Ticket(prix,seanceId)" +
                "values(140,1  ), (100,2  ), (110,3  ), (130,4  ), (101,5  ), (132,6  ) ");
        */


        // filmList = (List<Film>) GenerateQueries.query(new Films(),statement,"SELECT * from Film");

        //filmList =  GenerateQueries.query(new Films(),statement,"SELECT * from Film");

        //for (Film film : filmList){System.out.println(film.getTitre());}







    }
}