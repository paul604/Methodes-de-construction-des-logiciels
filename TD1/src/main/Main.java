package main;

import matrice.Etat;
import matrice.EtatC;
import matrice.Matrice;
import matrice.train;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by paul on 15/11/2016.
 * @author paul
 * @version 1
 */
public class Main {
	
	public static void main(String... args) throws InterruptedException, FileNotFoundException {
		//I 5)
		/*System.out.println("-- exo 1 q°5 --");
		Test.test(Matrice.M1, "10:01");
		System.out.println("--");
		Test.test(Matrice.M1, "50:00");

		//II 4)
		System.out.println("-- exo 2 q°5 --");
		Test.test(Matrice.M2, ":-)");
		System.out.println("--");
		Test.test(Matrice.M2, ";=)");

		//III 2)
		System.out.println("-- exo 3 q°2 --");
		Test.test(Matrice.M3, "10/01/2016");
		System.out.println("--");
		Test.test(Matrice.M3, "61/02/2016");

		//II 2)
		System.out.println("-- exo exo 3 q°2 --");
		Test.test(Matrice.M4, "10:01:59");
		System.out.println("--");
		Test.test(Matrice.M4, "10:20:105");

        //IV 4)
        System.out.println("-- exo 4  q°4 --");
        Test.test(Matrice.M5, "a.B@e;a.b@e");
        System.out.println("--");
        Test.test(Matrice.M5, "e.A@e;a.##@e");
*/

        //System.out.println(train.addFil("data/test.matrice").get("int",new EtatC("e0"))[1]);
        Test.test(train.addFil("data/test.matrice"),"",true);

    }

}
