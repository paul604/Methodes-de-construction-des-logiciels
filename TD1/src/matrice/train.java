package matrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by paul on 28/11/16.
 */
public class train {

    public static IMatrice addFil(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));

        IMatrice m = new MatriceC();

        boolean mealy = false;

        if (sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("mealy")){
                mealy=true;
                m = new MatriceCMealy();
            }else if(s.equalsIgnoreCase("noramle")){
                mealy=false;
                m = new MatriceC();
            }else{
                System.out.println("erreur");
                return null;
            }
        }

        while (sc.hasNextLine()){
            String[] s = sc.nextLine().split("/-/");
            if(s[0].equalsIgnoreCase("first")){
                m.setEtatDep(new EtatC(s[1]));
            }else{
                if(!(s.length<=1)){
                    if(mealy){
                        m.add(new EtatC(s[0]),s[1],s[2],new EtatC(s[3]));
                    }else{
                        m.add(new EtatC(s[0]),s[1],new EtatC(s[2]));
                    }
                }
            }
        }
        return m;
    }

}
