package matrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by paul on 28/11/16.
 */
public class train {

    public static MatriceC addFil(String path) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(path));

        MatriceC m = new MatriceC();

        while (sc.hasNextLine()){
            String[] s = sc.nextLine().split("/-/");
            if(s[0].equalsIgnoreCase("first")){
                m.setEtatDep(new EtatC(s[1]));
            }else{
                m.add(new EtatC(s[0]),s[1],new EtatC(s[2]));
            }
        }
        return m;
    }

}
