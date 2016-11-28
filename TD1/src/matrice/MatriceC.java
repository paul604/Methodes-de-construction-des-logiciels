package matrice;

import java.util.HashMap;

/**
 * Created by paul on 28/11/16.
 */
public class MatriceC {

    private HashMap<String, HashMap<EtatC, EtatC>> mat;
    private EtatC etatDep;
    private EtatC etatFin;

    //construct
    public MatriceC() {
        this.mat = new HashMap<>();
    }

    public EtatC getEtatDep() {
        return etatDep;
    }

    protected void setEtatDep(EtatC etatDep) {
        this.etatDep = etatDep;
    }

    public EtatC getEtatFin() {
        return etatFin;
    }

    protected void setEtatFin(EtatC etatFin) {
        this.etatFin = etatFin;
    }

    public void add(EtatC dep, String key, EtatC dest){
        key=key.toLowerCase();
        if(!this.mat.containsKey(key)){
            HashMap<EtatC,EtatC> tmp = new HashMap<>();
            tmp.put(dep,dest);
            this.mat.put(key,tmp) ;
        }else{
            HashMap<EtatC,EtatC> tmp = this.mat.get(key);
            tmp.put(dep,dest);
        }
    }

    public EtatC get(String x, EtatC y){
        x=x.toLowerCase();
        if(this.mat.containsKey(x)){
            HashMap<EtatC, EtatC> val = this.mat.get(x);
            if(val.containsKey(y)){
                return val.get(y);
            }
        }
        return new EtatC("Erreur");
    }
}
