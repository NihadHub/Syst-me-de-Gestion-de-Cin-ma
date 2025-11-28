package helper.retriver;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

abstract public class Selector<T> {

    public abstract List<T> call(Statement statement, String requete);

}
