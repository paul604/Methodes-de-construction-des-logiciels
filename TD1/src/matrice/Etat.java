package matrice;

/**
 * Created by paul on 15/11/2016.
 * @author paul
 * @version 1
 */
public enum Etat {
	
	E0("E0"),
	E1("E1"),
	E2("E2"),
	E3("E3"),
	H1("H1"),
	H2("H2"),
	H("H"),
	J1("j1"),
	J2("j2"),
	J3("j3"),
	J4("j4"),
	J30("j30"),
	J31("j31"),
	M("m"),
	M1("M1"),
	M10("M10"),
	M11("M11"),
	M2("M2"),
	M3("M3"),
	M4("M4"),
	M5("M5"),
	M6("M6"),
	M7("M7"),
	M8("M8"),
	A1("A1"),
	A2("A2"),
	A3("A3"),
	A4("A4"),
	S1("s1"),
	S2("s2"),
	FIN("Fin"),
	ERREUR("ERREUR");
	
	private String etat;
	
	Etat(String etat){
		this.etat=etat;
	}
	
	public final String getEtat(){
		return this.etat;
	}

}
