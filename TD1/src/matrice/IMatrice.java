package matrice;

import java.util.HashMap;

/**
 * Created by paul on 29/11/16.
 */
public interface IMatrice {

    HashMap<String, HashMap<EtatC, EtatC>> mat = null;
    EtatC etatDep=null;
    EtatC etatFin = null;

    default EtatC getEtatDep() {
        return etatDep;
    }

    default void setEtatDep(EtatC etatDep) {
        etatDep = etatDep;
    }

    default EtatC getEtatFin() {
        return etatFin;
    }

    default void setEtatFin(EtatC etatFin) {
        etatFin = etatFin;
    }
}
