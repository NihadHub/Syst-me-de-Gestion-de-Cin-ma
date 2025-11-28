package helper.retriver;

import java.sql.Statement;
import java.util.List;

public class GenerateQueries {

    public static List query(Selector selector, Statement statement, String requete){
        return selector.call(statement,requete);
    }

}
