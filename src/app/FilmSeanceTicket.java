package app;

public class FilmSeanceTicket {

    private int ticketId;
    private String FilmTitre;
    private String horaire;
    private double prix;
    private String spectateurNom;

    public FilmSeanceTicket(String spectateurNom, int ticketId, String filmTitre, String horaire, double prix) {
        this.ticketId = ticketId;
        FilmTitre = filmTitre;
        this.horaire = horaire;
        this.prix = prix;
        this.spectateurNom = spectateurNom;
    }

    public FilmSeanceTicket(int ticketId, String filmTitre, String horaire, double prix) {
        this.ticketId = ticketId;
        FilmTitre = filmTitre;
        this.horaire = horaire;
        this.prix = prix;
        this.spectateurNom = spectateurNom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getSpectateurNom() {
        return spectateurNom;
    }

    public void setSpectateurNom(String spectateurNom) {
        this.spectateurNom = spectateurNom;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getFilmTitre() {
        return FilmTitre;
    }

    public void setFilmTitre(String filmTitre) {
        FilmTitre = filmTitre;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public double getPrice() {
        return prix;
    }

    public void setPrice(double price) {
        this.prix = price;
    }
}
