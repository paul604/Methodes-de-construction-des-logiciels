package matrice;

import java.util.HashMap;

/**
 * Created by paul on 08/12/2016.
 */
public class MatriceCMealy implements IMatrice{

    private HashMap<transition, HashMap<EtatC, EtatC>> mat;
    private EtatC etatDep;
    private EtatC etatFin;

    //construct
    public MatriceCMealy() {
        this.mat = new HashMap<>();
    }

    @Override
    public EtatC getEtatDep() {
        return etatDep;
    }

    @Override
    public void setEtatDep(EtatC etatDep) {
        this.etatDep=etatDep;
    }

    @Override
    public EtatC getEtatFin() {
        return etatFin;
    }

    @Override
    public void setEtatFin(EtatC etatFin) {
        this.etatFin=etatFin;
    }

    @Override
    public void add(EtatC dep, String key, String out, EtatC dest){
        key=key.toLowerCase();
        out=out.toLowerCase();
        transition tab = new transition(key,out);
        if(!this.mat.containsKey(tab)){
            HashMap<EtatC,EtatC> tmp = new HashMap<>();
            tmp.put(dep,dest);
            this.mat.put(tab ,tmp) ;
        }else{
            HashMap<EtatC,EtatC> tmp = this.mat.get(tab);
            tmp.put(dep,dest);
        }
    }

    @Override
    public Object[] get(String x, EtatC y) {
        x=x.toLowerCase();
        transition t= new transition(x,"");
        if(this.mat.containsKey(t)){
            String out = this.mat.keySet().stream().filter(a -> a.equals(t)).reduce((a,b) -> a.equals(t)? a:null).get().getOut();
            HashMap<EtatC, EtatC> val = this.mat.get(t);
            if(val.containsKey(y)){
                return new Object[]{val.get(y), out};
            }
        }
        return  new Object[]{ new EtatC("Erreur"), null};
    }
}
