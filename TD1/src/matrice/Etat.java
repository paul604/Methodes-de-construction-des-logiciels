package matrice;

/**
 * Created by paul on 15/11/2016.
 * @author paul
 * @version 1
 */
public enum Etat {
	
	E0("E0"),
	H1("H1"),
	H2("H2"),
	H("H"),
	M1("M1"),
	M2("M2"),
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
