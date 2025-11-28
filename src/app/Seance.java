package app;

public class Seance {
    private int seance_ID;
    private String horaire;
    private int salle;
    private int capaciter;
    //private ArrayList<Spectateurs> lesSpectateurs = new ArrayList<>();
    public Seance(int seance_ID, String horaire, int salle, int capaciter){
        this.seance_ID = seance_ID;
        this.horaire = horaire;
        this.salle = salle;
        this.capaciter = capaciter;
    }

    public int getSeance_ID() {
        return seance_ID;
    }

    public void setSeance_ID(int seance_ID) {
        this.seance_ID = seance_ID;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public int getCapaciter() {
        return capaciter;
    }

    public void setCapaciter(int capaciter) {
        this.capaciter = capaciter;
    }
}
