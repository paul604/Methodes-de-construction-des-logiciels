package main;

import matrice.Etat;
import matrice.Matrice;

/**
 * Created by paul on 15/11/2016.
 * @author paul
 * @version 1
 */
public class Main {
	
	public static void main(String... args) throws InterruptedException {
		long sleep = (long) 10;
		//I 5)
		System.out.println("-- exo 1 q°5 --");
		Test.test(Matrice.M1, "10:01");
		Thread.sleep(sleep);
		System.out.println("--");
		Test.test(Matrice.M1, "0 :00");
		Thread.sleep(sleep);
		
		//II 4)
		System.out.println("-- exo 1 q°5 --");
		Test.test(Matrice.M2, ":-)");
		Thread.sleep(sleep);
		System.out.println("--");
		Test.test(Matrice.M2, ";=)");
		Thread.sleep(sleep);
	}

}
