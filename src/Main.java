import helper.Connexion;

import java.sql.Statement;

public class Main {

    public static void main(String[] args){


        Statement statement =  Connexion.initConnexion();
        Connexion.executerUneRequete(statement,"  ");
    }
}