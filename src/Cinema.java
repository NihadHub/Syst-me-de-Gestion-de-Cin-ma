import app.Film;
import app.FilmSeanceTicket;
import helper.Connexion;
import helper.retriver.Films;
import helper.retriver.GenerateQueries;

import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class Cinema {


    Scanner input;
    Statement statement;
    int filmId = 0;
    /*
        // -----MENU PRINCIPAL -----
        1 - Afficher les films

          filmID(ticketId)    ||Title     || Horaire       || Prix

          2                   ||Title     || Horaire       || Prix

         2- Reserver votre film preferer!
            - Entrer l'ID de film :
            - Entrer votre de Nom :
            - Entrer  votre Email :
         ---Voila votre ticket---
     */

    public Cinema() {
        statement = Connexion.initConnexion();
        input = new Scanner(System.in);
    }

    public void start() {
        int choix;
        do {
            System.out.println("---------------MENU PRINCIPAL---------------");
            System.out.println("1- Afficher les Films: ");
            System.out.println("2- Reserver votre film preferer!: ");
            System.out.println("0- Quitter: ");
            choix = input.nextInt();
            lesChoix(choix);
        } while (choix != 0);
    }

    public void lesChoix(int choix) {
        switch (choix) {
            case 1:
                List<FilmSeanceTicket> filmList = GenerateQueries.query(new Films(),
                        statement,
                        """
                                SELECT\s
                                    t.ticketId,
                                    f.titre,
                                    s.horaire,
                                    t.prix
                                FROM Film f
                                JOIN Seance s
                                    ON s.filmId = f.filmId
                                JOIN Ticket t
                                    ON t.seanceId = s.seanceId;
                                """);
                afficherLesFilms(filmList);
                break;
            case 2:
                reserverVotreFilm();
        }
    }

    public void afficherLesFilms(List<FilmSeanceTicket> filmSeanceTickets) {
        System.out.println("-------------------------------------");
        System.out.println("FilmID  Title    Horaire  Prix ");
        System.out.println("-------------------------------------");
        // Data of films.
        for (FilmSeanceTicket filmSeanceTicket : filmSeanceTickets) {
            System.out.println(" " + filmSeanceTicket.getTicketId() + "   " + filmSeanceTicket.getFilmTitre() + "    " + filmSeanceTicket.getHoraire() + "   " + filmSeanceTicket.getPrice() + " ");
            System.out.println("__________________________________________________");
        }
        System.out.println("Choisir votre film preferer par Numero : ");
        filmId = input.nextInt();
        System.out.println(filmId);

    }

    public void reserverVotreFilm() {
        if (filmId == 0) {
            System.out.println("Vous avez pas encore choisir le film...");
        }else {
            System.out.println("Entrer votre Nom : ");
            String nom = input.next();
            System.out.println("Entrer votre Email : ");
            String email = input.next();
            String requete = "INSERT INTO Spectateur (nom, email) VALUES ('" + nom + "', '" + email + "')";
            new Films().reservationDeFilm(statement, requete, filmId);

        }
    }

}
