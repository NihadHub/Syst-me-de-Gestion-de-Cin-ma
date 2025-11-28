package app;

import java.util.ArrayList;
import java.util.List;
public class Film {
    private int filmId;
    private static int idCounter = 1;
    private double duree ;
    private String titr ;
    private String categorie;
    private List<Seance> seances ;



    public Film (double duree , String titr, String categorie) {
        this.filmId = idCounter++;
        this.titr = titr;
        this.duree = duree;
        this.categorie = categorie;
        seances = new ArrayList<>();

    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getTitre() {
        return titr;
    }

    public void setTitre(String titre) {
        this.titr = titre;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}

