package matrice;


import java.util.HashMap;

/**
 * Created by paul on 15/11/2016.
 * @author paul
 * @version 1
 */
public enum Matrice {

    M1("exo1",Etat.E0,new HashMap<String, HashMap<Etat, Etat>>()){

        @Override
        public void creeat() {
        	
            //C1 C2
        	HashMap<Etat, Etat> c1 = new HashMap<>();
        	c1.put(Etat.E0, Etat.H1);
        	c1.put(Etat.H1, Etat.H);
        	c1.put(Etat.H2, Etat.H);
        	c1.put(Etat.H, Etat.ERREUR);
        	c1.put(Etat.M1, Etat.M2);
        	c1.put(Etat.M2, Etat.FIN);
        	this.mat.put("0",c1);
        	this.mat.put("1",c1);
        	
        	//c3
        	HashMap<Etat, Etat> c3 = new HashMap<>();
        	c3.put(Etat.E0, Etat.H1);
        	c3.put(Etat.H1, Etat.H);
        	c3.put(Etat.H2, Etat.H);
        	c3.put(Etat.H, Etat.ERREUR);
        	c3.put(Etat.M1, Etat.M2);
        	c3.put(Etat.M2, Etat.FIN);
        	this.mat.put("2",c3);
        	
        	//c4
        	HashMap<Etat, Etat> c4 = new HashMap<>();
        	c4.put(Etat.E0, Etat.ERREUR);
        	c4.put(Etat.H1, Etat.H);
        	c4.put(Etat.H2, Etat.H);
        	c4.put(Etat.H, Etat.ERREUR);
        	c4.put(Etat.M1, Etat.M2);
        	c4.put(Etat.M2, Etat.FIN);
        	this.mat.put("3",c4);
        	
        	//c5 c6
        	HashMap<Etat, Etat> c5 = new HashMap<>();
        	c5.put(Etat.E0, Etat.ERREUR);
        	c5.put(Etat.H1, Etat.H);
        	c5.put(Etat.H2, Etat.ERREUR);
        	c5.put(Etat.H, Etat.ERREUR);
        	c5.put(Etat.M1, Etat.M2);
        	c5.put(Etat.M2, Etat.FIN);
        	this.mat.put("4",c5);
        	this.mat.put("5",c5);
        	
        	//c7 c8 c9 c10
        	HashMap<Etat, Etat> c7 = new HashMap<>();
        	c7.put(Etat.E0, Etat.ERREUR);
        	c7.put(Etat.H1, Etat.H);
        	c7.put(Etat.H2, Etat.ERREUR);
        	c7.put(Etat.H, Etat.ERREUR);
        	c7.put(Etat.M1, Etat.ERREUR);
        	c7.put(Etat.M2, Etat.FIN);
        	this.mat.put("6",c7);
        	this.mat.put("7",c7);
        	this.mat.put("8",c7);
        	this.mat.put("9",c7);
        	
        	//c11
        	HashMap<Etat, Etat> c11 = new HashMap<>();
        	c11.put(Etat.E0, Etat.ERREUR);
        	c11.put(Etat.H1, Etat.ERREUR);
        	c11.put(Etat.H2, Etat.ERREUR);
        	c11.put(Etat.H, Etat.M1);
        	c11.put(Etat.M1, Etat.ERREUR);
        	c11.put(Etat.M2, Etat.ERREUR);
        	this.mat.put(":",c11);
        }

    },
    M2("exo2",Etat.E0,new HashMap<String, HashMap<Etat, Etat>>()){

		@Override
		public void creeat() {
        	
            //C1
        	HashMap<Etat, Etat> c1 = new HashMap<>();
        	c1.put(Etat.E0, Etat.E1);
        	c1.put(Etat.E1, Etat.ERREUR);
        	c1.put(Etat.E2, Etat.ERREUR);
        	c1.put(Etat.E3, Etat.ERREUR);
        	this.mat.put(":",c1);
        	
            //c2
        	HashMap<Etat, Etat> c2 = new HashMap<>();
        	c2.put(Etat.E0, Etat.E2);
        	c2.put(Etat.E1, Etat.ERREUR);
        	c2.put(Etat.E2, Etat.ERREUR);
        	c2.put(Etat.E3, Etat.ERREUR);
        	this.mat.put(";",c2);
        	
            //c3
        	HashMap<Etat, Etat> c3 = new HashMap<>();
        	c3.put(Etat.E0, Etat.ERREUR);
        	c3.put(Etat.E1, Etat.E3);
        	c3.put(Etat.E2, Etat.E3);
        	c3.put(Etat.E3, Etat.ERREUR);
        	this.mat.put("-",c3);
        	
            //C4
        	HashMap<Etat, Etat> C4 = new HashMap<>();
        	C4.put(Etat.E0, Etat.ERREUR);
        	C4.put(Etat.E1, Etat.E3);
        	C4.put(Etat.E2, Etat.ERREUR);
        	C4.put(Etat.E3, Etat.ERREUR);
        	this.mat.put("-",C4);
        	
            //c5 c6
        	HashMap<Etat, Etat> c5 = new HashMap<>();
        	c5.put(Etat.E0, Etat.ERREUR);
        	c5.put(Etat.E1, Etat.ERREUR);
        	c5.put(Etat.E2, Etat.ERREUR);
        	c5.put(Etat.E3, Etat.FIN);
        	this.mat.put("(",c5);
        	this.mat.put(")", c5);
			
		}
    	
    },
    M3("exo3",Etat.E0,new HashMap<String, HashMap<Etat, Etat>>()){

		@Override
		public void creeat() {
			// TODO Auto-generated method stub
			
		}
    	
    }
    ;

    private final String nom;
    private final Etat etat;
    protected HashMap<String, HashMap<Etat, Etat>> mat;

    Matrice(String nom,Etat etat, HashMap<String, HashMap<Etat, Etat>> mat){
        this.nom=nom;
        this.etat=etat;
        this.mat=mat;
        this.creeat();
    }

    public abstract void creeat();
    
    public final Etat getFirstEtat(){
    	return this.etat;
    }

    public final Etat get(String x, Etat y){
    	if(this.mat.containsKey(x)){
        	HashMap<Etat, Etat> val = this.mat.get(x);
    		if(val.containsKey(y)){
    			return val.get(y);
    		}
    	}
		return Etat.ERREUR;
    }
}
