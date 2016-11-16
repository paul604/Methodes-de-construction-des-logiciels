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
			if (i>=text.length()) {break;}
			char c = text.charAt(i);
			System.out.println(etatCourant+" "+c);
			etatCourant = m.get(c+"", etatCourant);
			i++;
		}
		if(etatCourant == Etat.FIN){
			System.out.println(text+" ok");
		}else{
			System.out.println(text+" erreur");
		}
	}
}
