package matrice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	//jj/mm/aaaa
    M3("exo3",Etat.E0,new HashMap<String, HashMap<Etat, Etat>>()){

		@Override
		public void creeat() {

            //c1
            HashMap<Etat, Etat> c1 = new HashMap<>();
            c1.put(Etat.E0, Etat.J1);
            c1.put(Etat.J2, Etat.J4);
            c1.put(Etat.J3, Etat.J30);
            c1.put(Etat.M1, Etat.M2);
            c1.put(Etat.M10, Etat.M6);
            c1.put(Etat.M11, Etat.M4);
            c1.put(Etat.A1, Etat.A2);
            c1.put(Etat.A2, Etat.A3);
            c1.put(Etat.A3, Etat.A4);
            c1.put(Etat.A4, Etat.FIN);
            for (Etat t: new Etat[]{Etat.J1,Etat.J30,Etat.J31,Etat.J4,Etat.M4,Etat.M6,Etat.M8}) {
                c1.put(t, Etat.ERREUR);
            }
            for (Etat t: new Etat[]{Etat.M2,Etat.M3,Etat.M5,Etat.M7}) {
                c1.put(t, Etat.M8);
            }
            this.mat.put("0",c1);

            //C2
            HashMap<Etat, Etat> c2 = new HashMap<>();
            c2.put(Etat.E0, Etat.J2);
            c2.put(Etat.J1, Etat.J4);
            c2.put(Etat.J2, Etat.J4);
            c2.put(Etat.J3, Etat.J31);
            c2.put(Etat.M1, Etat.M3);
            c2.put(Etat.M10, Etat.M7);
            c2.put(Etat.M11, Etat.M5);
            c2.put(Etat.A1, Etat.A2);
            c2.put(Etat.A2, Etat.A3);
            c2.put(Etat.A3, Etat.A4);
            c2.put(Etat.A4, Etat.FIN);
            for (Etat t: new Etat[]{Etat.J30,Etat.J31,Etat.J4,Etat.M5,Etat.M8}) {
                c2.put(t, Etat.ERREUR);
            }
            for (Etat t: new Etat[]{Etat.M2,Etat.M3,Etat.M4,Etat.M7,Etat.M6}) {
                c2.put(t, Etat.M8);
            }
            this.mat.put("1",c2);

            //C3
            HashMap<Etat, Etat> c3 = new HashMap<>();
            c3.put(Etat.E0, Etat.J2);
            c3.put(Etat.J1, Etat.J4);
            c3.put(Etat.J2, Etat.J4);
            c3.put(Etat.A1, Etat.A2);
            c3.put(Etat.A2, Etat.A3);
            c3.put(Etat.A3, Etat.A4);
            c3.put(Etat.A4, Etat.FIN);
            for (Etat t: new Etat[]{Etat.J3,Etat.J30,Etat.J31,Etat.J4,Etat.M1,Etat.M10,Etat.M11,Etat.M8,Etat.M4,Etat.M6}) {
                c3.put(t, Etat.ERREUR);
            }
            for (Etat t: new Etat[]{Etat.M2,Etat.M3,Etat.M7,Etat.M5}) {
                c3.put(t, Etat.M8);
            }
            this.mat.put("2",c3);

            //C4
            HashMap<Etat, Etat> c4 = new HashMap<>();
            c4.put(Etat.E0, Etat.J3);
            c4.put(Etat.J1, Etat.J4);
            c4.put(Etat.J2, Etat.J4);
            c4.put(Etat.A1, Etat.A2);
            c4.put(Etat.A2, Etat.A3);
            c4.put(Etat.A3, Etat.A4);
            c4.put(Etat.A4, Etat.FIN);
            for (Etat t: new Etat[]{Etat.J3,Etat.J30,Etat.J31,Etat.J4,Etat.M1,Etat.M10,Etat.M11,Etat.M8,Etat.M3,Etat.M5,Etat.M7}) {
                c4.put(t, Etat.ERREUR);
            }
            for (Etat t: new Etat[]{Etat.M2,Etat.M4,Etat.M6}) {
                c4.put(t, Etat.M8);
            }
            this.mat.put("3",c4);

            //C5 c7 c10
            HashMap<Etat, Etat> c5 = new HashMap<>();
            c2.put(Etat.J1, Etat.J4);
            c2.put(Etat.J2, Etat.J4);
            c2.put(Etat.A1, Etat.A2);
            c2.put(Etat.A2, Etat.A3);
            c2.put(Etat.A3, Etat.A4);
            c5.put(Etat.A4, Etat.FIN);
            for (Etat t: new Etat[]{Etat.J3,Etat.J30,Etat.J31,Etat.J4,Etat.M1,Etat.M10,Etat.M11,Etat.M8,Etat.M3,Etat.M5,Etat.M7,Etat.E0,Etat.M4}) {
                c5.put(t, Etat.ERREUR);
            }
            for (Etat t: new Etat[]{Etat.M2,Etat.M6}) {
                c5.put(t, Etat.M8);
            }
            this.mat.put("4",c5);
            this.mat.put("6",c5);
            this.mat.put("9",c5);

            //C6 c8 c9
            HashMap<Etat, Etat> c6 = new HashMap<>();
            c6.put(Etat.J1, Etat.J4);
            c6.put(Etat.J2, Etat.J4);
            c6.put(Etat.A1, Etat.A2);
            c6.put(Etat.A2, Etat.A3);
            c6.put(Etat.A3, Etat.A4);
            c6.put(Etat.A4, Etat.FIN);
            for (Etat t: new Etat[]{Etat.J3,Etat.J30,Etat.J31,Etat.J4,Etat.M1,Etat.M10,Etat.M11,Etat.M8,Etat.M3,Etat.M5,Etat.M7,Etat.E0}) {
                c6.put(t, Etat.ERREUR);
            }
            for (Etat t: new Etat[]{Etat.M2,Etat.M6,Etat.M4}) {
                c6.put(t, Etat.M8);
            }
            this.mat.put("5",c6);
            this.mat.put("7",c6);
            this.mat.put("8",c6);

            //C11
            HashMap<Etat, Etat> c11 = new HashMap<>();
            c11.put(Etat.J30, Etat.M10);
            c11.put(Etat.J31, Etat.M11);
            c11.put(Etat.J4, Etat.M1);
            c11.put(Etat.M8, Etat.A1);

            c11.put(Etat.A3, Etat.A4);
            c11.put(Etat.A4, Etat.FIN);
            for (Etat t: new Etat[]{Etat.M6,Etat.M2,Etat.J3,Etat.M1,Etat.M10,Etat.M11,Etat.M3,Etat.M5,Etat.M7,Etat.E0,Etat.J1,
                    Etat.J2,Etat.M4,Etat.A1,Etat.A2,Etat.A3,Etat.A4}) {
                c11.put(t, Etat.ERREUR);
            }
            this.mat.put("/",c11);
		}
    	
    },
    //HH/MM/SS
    M4("exo3",Etat.E0,new HashMap<String, HashMap<Etat, Etat>>()){

        @Override
        public void creeat() {

            //C1 C2
            HashMap<Etat, Etat> c1 = new HashMap<>();
            c1.put(Etat.E0, Etat.H1);
            c1.put(Etat.H1, Etat.H);
            c1.put(Etat.H2, Etat.H);
            c1.put(Etat.H, Etat.ERREUR);
            c1.put(Etat.M1, Etat.M2);
            c1.put(Etat.M2, Etat.M);
            c1.put(Etat.M, Etat.ERREUR);
            c1.put(Etat.S1, Etat.S2);
            c1.put(Etat.S2, Etat.FIN);
            this.mat.put("0",c1);
            this.mat.put("1",c1);

            //c3
            HashMap<Etat, Etat> c3 = new HashMap<>();
            c3.put(Etat.E0, Etat.H1);
            c3.put(Etat.H1, Etat.H);
            c3.put(Etat.H2, Etat.H);
            c3.put(Etat.H, Etat.ERREUR);
            c3.put(Etat.M1, Etat.M2);
            c3.put(Etat.M2, Etat.M);
            c3.put(Etat.M, Etat.ERREUR);
            c3.put(Etat.S1, Etat.S2);
            c3.put(Etat.S2, Etat.FIN);
            this.mat.put("2",c3);

            //c4
            HashMap<Etat, Etat> c4 = new HashMap<>();
            c4.put(Etat.E0, Etat.ERREUR);
            c4.put(Etat.H1, Etat.H);
            c4.put(Etat.H2, Etat.H);
            c4.put(Etat.H, Etat.ERREUR);
            c4.put(Etat.M1, Etat.M2);
            c4.put(Etat.M2, Etat.M);
            c4.put(Etat.M, Etat.ERREUR);
            c4.put(Etat.S1, Etat.S2);
            c4.put(Etat.S2, Etat.FIN);
            this.mat.put("3",c4);

            //c5 c6
            HashMap<Etat, Etat> c5 = new HashMap<>();
            c5.put(Etat.E0, Etat.ERREUR);
            c5.put(Etat.H1, Etat.H);
            c5.put(Etat.H2, Etat.ERREUR);
            c5.put(Etat.H, Etat.ERREUR);
            c5.put(Etat.M1, Etat.M2);
            c5.put(Etat.M2, Etat.M);
            c5.put(Etat.M, Etat.ERREUR);
            c5.put(Etat.S1, Etat.S2);
            c5.put(Etat.S2, Etat.FIN);
            this.mat.put("4",c5);
            this.mat.put("5",c5);

            //c7 c8 c9 c10
            HashMap<Etat, Etat> c7 = new HashMap<>();
            c7.put(Etat.E0, Etat.ERREUR);
            c7.put(Etat.H1, Etat.H);
            c7.put(Etat.H2, Etat.ERREUR);
            c7.put(Etat.H, Etat.ERREUR);
            c7.put(Etat.M1, Etat.ERREUR);
            c7.put(Etat.M2, Etat.M);
            c7.put(Etat.M, Etat.ERREUR);
            c7.put(Etat.S1, Etat.ERREUR);
            c7.put(Etat.S2, Etat.FIN);
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
            c11.put(Etat.M, Etat.S1);
            c11.put(Etat.S1, Etat.ERREUR);
            c11.put(Etat.S2, Etat.ERREUR);
            this.mat.put(":",c11);
        }

    },
    M5("exo 4",Etat.E0,new HashMap<String, HashMap<Etat, Etat>>()){
        //ArrayList<String> a = new ArrayList<>();

        @Override
        public void creeat() {
            String[] s = "a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9 . @".split(" ");

          //  a.addAll(Arrays.stream(s).collect(Collectors.toList()));

            //System.out.println(a);

            //C1 a à z
            for (String e:s){
                if(!e.equals("@") || !e.equals(".")){
                    HashMap<Etat, Etat> c1 = new HashMap<>();
                    c1.put(Etat.E0, Etat.E1);
                    c1.put(Etat.E1, Etat.E1);
                    c1.put(Etat.E2, Etat.E3);
                    c1.put(Etat.E3, Etat.E3);
                    c1.put(Etat.E4, Etat.E5);
                    c1.put(Etat.E5, Etat.E5);
                    this.mat.put(e,c1);
                }
            }

            //C2 .
            HashMap<Etat, Etat> c2 = new HashMap<>();
            c2.put(Etat.E0, Etat.ERREUR);
            c2.put(Etat.E1, Etat.E2);
            c2.put(Etat.E2, Etat.ERREUR);
            c2.put(Etat.E3, Etat.ERREUR);
            c2.put(Etat.E4, Etat.ERREUR);
            c2.put(Etat.E5, Etat.ERREUR);
            this.mat.put(".",c2);

            //C3 @
            HashMap<Etat, Etat> c3 = new HashMap<>();
            c3.put(Etat.E0, Etat.ERREUR);
            c3.put(Etat.E1, Etat.E4);
            c3.put(Etat.E2, Etat.ERREUR);
            c3.put(Etat.E3, Etat.E4);
            c3.put(Etat.E4, Etat.ERREUR);
            c3.put(Etat.E5, Etat.ERREUR);
            this.mat.put("@",c3);

            //C4 ;
            HashMap<Etat, Etat> c4 = new HashMap<>();
            c4.put(Etat.E0, Etat.ERREUR);
            c4.put(Etat.E1, Etat.ERREUR);
            c4.put(Etat.E2, Etat.ERREUR);
            c4.put(Etat.E3, Etat.ERREUR);
            c4.put(Etat.E4, Etat.ERREUR);
            c4.put(Etat.E5, Etat.E0);
            this.mat.put(";",c4);

            //C5 ""
            HashMap<Etat, Etat> c5 = new HashMap<>();
            c5.put(Etat.E0, Etat.ERREUR);
            c5.put(Etat.E1, Etat.ERREUR);
            c5.put(Etat.E2, Etat.ERREUR);
            c5.put(Etat.E3, Etat.ERREUR);
            c5.put(Etat.E4, Etat.ERREUR);
            c5.put(Etat.E5, Etat.FIN);
            this.mat.put("",c5);

        }
    };

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
