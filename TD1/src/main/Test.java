package main;

import matrice.*;

import java.util.Scanner;

/**
 * Created by paul on 15/11/2016.
 * @author paul
 * @version 1
 */
public class Test {

	//pour les enum
	public static void test(Matrice m, String text){
		Etat etatCourant = m.getFirstEtat();
		int i =0;
		while (etatCourant != Etat.FIN && etatCourant!= Etat.ERREUR) {
			if (i>=text.length()) {
				String c = "";
				Etat etatNext = m.get(c+"", etatCourant);
				System.out.println(etatCourant+" "+c+" "+etatNext);
				etatCourant = etatNext;
				i++;
			}else{
				char c = text.charAt(i);

				Etat etatNext = m.get(c+"", etatCourant);
				System.out.println(etatCourant+" "+c+" "+etatNext);
				etatCourant = etatNext;
				i++;
			}
		}
		if(etatCourant != Etat.FIN || i<text.length()){
			System.out.println(text+" erreur");
		}else{
			System.out.println(text+" ok");
		}
	}

	//pour les class
	public static EtatC get(IMatrice m, String c, EtatC etatCourant){

		if(m instanceof MatriceC){
			Object[] obj = m.get(c, etatCourant);
			System.out.println(etatCourant+" "+c+" "+obj[0]);
			return (EtatC)obj[0];
		}else if(m instanceof MatriceCMealy){
            Object[] obj = m.get(c, etatCourant);
            System.out.println(etatCourant+" "+c+"=>"+obj[1]+" "+obj[0]);
            return (EtatC)obj[0];
        }

		return null;
	}

	public static void test(IMatrice m, String text, boolean dyna){
		EtatC etatCourant = m.getEtatDep();
		int i =0;
        if(dyna){
            text="";
            Scanner sc = new Scanner(System.in);
            do {

                System.out.print("cmd > ");
                String s = sc.nextLine();
                text+=" "+s;
                etatCourant=get(m,s,etatCourant);

            }while(!etatCourant.getName().equalsIgnoreCase("fin") && !etatCourant.getName().equalsIgnoreCase("erreur"));

        }else{
            while (!etatCourant.getName().equalsIgnoreCase("fin") && !etatCourant.getName().equalsIgnoreCase("erreur") ) {
                if (i>=text.length()) {
                    String c = "";
                    etatCourant=get(m,c,etatCourant);
                    i++;
                }else{
                    char c = text.charAt(i);
                    etatCourant=get(m,c+"",etatCourant);
                    i++;
                }
            }
        }

		if(!etatCourant.getName().equalsIgnoreCase("fin") || i<text.length()){
			System.out.println(text+" =>erreur");
		}else{
			System.out.println(text+" =>ok");
		}
	}
}
