package matrice;

import java.util.HashMap;

/**
 * Created by paul on 29/11/16.
 */
public interface IMatrice {

    HashMap<String, HashMap<EtatC, EtatC>> mat = null;
    EtatC etatDep=null;
    EtatC etatFin = null;

    default EtatC getEtatDep(){
        throw new UnsupportedOperationException();
    }

    void setEtatDep(EtatC etatDep);

    EtatC getEtatFin();

    void setEtatFin(EtatC etatFin);

    default void add(EtatC dep, String key, EtatC dest){
        throw new UnsupportedOperationException();
    }

    default void add(EtatC dep, String key, String out, EtatC dest){
        throw new UnsupportedOperationException();
    }

    default Object[] get(String x, EtatC y){
        throw new UnsupportedOperationException();
    }
}
