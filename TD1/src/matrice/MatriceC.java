
package matrice;

import java.util.HashMap;

/**
 * Created by paul on 28/11/16.
 */
public class MatriceC {

    private HashMap<String, HashMap<Etat, Etat>> mat;
    private Etat etatDep;
    private Etat etatFin;

    //construct
    public MatriceC() {
        this.mat = new HashMap<>();
    }

    public Etat getEtatDep() {
        return etatDep;
    }

    protected void setEtatDep(Etat etatDep) {
        this.etatDep = etatDep;
    }

    public Etat getEtatFin() {
        return etatFin;
    }

    protected void setEtatFin(Etat etatFin) {
        this.etatFin = etatFin;
    }

    public void add(Etat dep, String key, Etat dest){
        key=key.toLowerCase();
        if(!this.mat.containsKey(key)){
            HashMap<Etat,Etat> tmp = new HashMap<>();
            tmp.put(dep,dest);
            this.mat.put(key,tmp) ;
        }else{
            HashMap<Etat,Etat> tmp = this.mat.get(key);
            tmp.put(dep,dest);
        }
    }

    public Etat get(String x, Etat y){
        x=x.toLowerCase();
        if(this.mat.containsKey(x)){
            HashMap<Etat, Etat> val = this.mat.get(x);
            if(val.containsKey(y)){
                return val.get(y);
            }
        }
        return Etat.ERREUR;
    }
}
