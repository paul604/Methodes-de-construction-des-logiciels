package main;

import java.util.HashMap;

/**
 * Created by paul on 15/11/2016.
 */
public enum Matrice {

    M1("tmp",new HashMap<String, HashMap<String, String>>()){

       // private HashMap<String, HashMap<String, String>> mat = new HashMap<>();

        @Override
        public void creeat() {
            //L1

        }

    }
    ;

    protected String nom;
    protected HashMap<String, HashMap<String, String>> mat;

    Matrice(String nom, HashMap<String, HashMap<String, String>> mat){
        this.nom=nom;
        this.mat=mat;
        this.creeat();
    }

    public abstract void creeat();

    //TODO créer get(x,y)
}
