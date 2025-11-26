public class Ticket {
    private int ticket ;
    private double prix;
    private Seance seanceid;
    private Spectateur spectateurid;


    public Ticket(int ticket, double prix, Seance seanceid, Spectateur spectateurid) {
        this.ticket = ticket;
        this.prix = prix;
        this.seanceid = seanceid;
        this.spectateurid = spectateurid;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Seance getSeanceid() {
        return seanceid;
    }

    public void setSeanceid(Seance seanceid) {
        this.seanceid = seanceid;
    }

    public Spectateur getSpectateurid() {
        return spectateurid;
    }

    public void setSpectateurid(Spectateur spectateurid) {
        this.spectateurid = spectateurid;
    }
}