package helper.retriver;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app.*;

public class Films extends Selector<FilmSeanceTicket> {
    @Override
    public List<FilmSeanceTicket> call(Statement statement, String requete) {
        List<FilmSeanceTicket> filmSeanceTickets = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(requete);
            while (resultSet.next()) {
                int ticketId = resultSet.getInt("ticketId");
                String filmTitre = resultSet.getString("titre");
                String horaire = resultSet.getString("horaire");
                double price = resultSet.getDouble("prix");

                filmSeanceTickets.add(new FilmSeanceTicket(ticketId,filmTitre,horaire,price));
            }

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return filmSeanceTickets;
    }

    public void reservationDeFilm(Statement statement, String requete,int filmId){
        // Add the spectateur
        int spectateurId = executerUneRequete(statement,requete);

        // Adding the spectateur id as a foreign key in Ticket table
        String ticketRequete = "UPDATE Ticket SET spectateurId = " + spectateurId
                + " WHERE ticketId = " + filmId;
     int  ticketId = executerUneRequete(statement, ticketRequete);

       List<FilmSeanceTicket> filmSeanceTickets = GenerateQueries.query(new Films(),
                statement,
                " SELECT s.spectateur, t.ticketId, f.titre, s.horaire, t.prix FROM Film f JOIN Seance s ON s.filmId = f.filmId JOIN Ticket t ON t.seanceId = s.seanceId JOIN Spectateur s ON t.spectateur = '"+spectateurId+"' ");
        FilmSeanceTicket filmSeanceTicket = filmSeanceTickets.getFirst();
        System.out.println(" ----------------  Parfait, Votre film a été reservé ---------------- ");

        System.out.println("-------------------------------------");
        System.out.println("Nom  Title    Horaire  Prix ");
        System.out.println("-------------------------------------");
        System.out.println(" " + filmSeanceTicket.getSpectateurNom() + "   " + filmSeanceTicket.getFilmTitre() + "    " + filmSeanceTicket.getHoraire() + "   " + filmSeanceTicket.getPrice() + " ");






    }

}
