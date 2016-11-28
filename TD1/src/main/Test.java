package main;

import matrice.Etat;
import matrice.EtatC;
import matrice.Matrice;
import matrice.MatriceC;

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
	public static void test(MatriceC m, String text){
		EtatC etatCourant = m.getEtatDep();
		int i =0;
		while (!etatCourant.getName().equalsIgnoreCase("fin")
				&& !etatCourant.getName().equalsIgnoreCase("erreur") ) {
			if (i>=text.length()) {
				String c = "";
				EtatC etatNext = m.get(c+"", etatCourant);
				System.out.println(etatCourant+" "+c+" "+etatNext);
				etatCourant = etatNext;
				i++;
			}else{
				char c = text.charAt(i);

				EtatC etatNext = m.get(c+"", etatCourant);
				System.out.println(etatCourant+" "+c+" "+etatNext);
				etatCourant = etatNext;
				i++;
			}
		}
		if(!etatCourant.getName().equalsIgnoreCase("fin") || i<text.length()){
			System.out.println(text+" erreur");
		}else{
			System.out.println(text+" ok");
		}
	}
}
