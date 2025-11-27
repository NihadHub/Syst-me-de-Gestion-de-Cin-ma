import helper.Connexion;

import java.sql.Statement;

public class Main {

    public static void main(String[] args) {


        Statement statement = Connexion.initConnexion();

        /*
                Connexion.executerUneRequete(statement, " INSERT INTO Seance(horaire,salle,capaciter,filmId )" +
                "values('14:00',1, 150, 7 ), " +
                "('16:30',  2, 120, 9 )," +
                "('18:00',  3, 200, 11 )," +
                "('20:30',  1, 200, 8 )," +
                "('22:00',  4, 100, 7 )," +
                "('22:00',  2, 101, 10 )");
        */




    }
}