import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class Film {
    private int filmId;
    private static int idCounter = 1;
    private String duree ;
    private String titr ;
    private String categorie;
    private List<Seance> seances ;
    private String sql  = "insert into film (id , titr , duree , categorie) values(?, ? ,?,?);";


    public Film(Connection con , String duree , String titr, String categorie) throws SQLException {
        this.filmId = idCounter++;
        this.titr = titr;
        this.duree = duree;
        this.categorie = categorie;
        seances = new ArrayList<>();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,5);
        ps.setString(2,titr);
        ps.setString(3,duree);
        ps.setString(4,categorie);
        ps.executeUpdate();

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

