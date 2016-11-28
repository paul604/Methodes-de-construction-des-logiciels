package main;

import matrice.Etat;
import matrice.Matrice;

/**
 * Created by paul on 15/11/2016.
 * @author paul
 * @version 1
 */
public class Test {

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
}
