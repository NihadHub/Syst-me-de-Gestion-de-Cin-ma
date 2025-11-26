import java.util.ArrayList;
import java.util.List;

class Spectateur {

    private int spectateurId;
    private String nom;
    private String email;
    private List<Ticket> tickets;

    public Spectateur(int spectateurId, String email, String nom) {
        this.spectateurId = spectateurId;
        this.email = email;
        this.nom = nom;
        this.tickets = new ArrayList<>();
    }

    public int getSpectateurId() {
        return spectateurId;
    }

    public void setSpectateurId(int spectateurId) {
        this.spectateurId = spectateurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}