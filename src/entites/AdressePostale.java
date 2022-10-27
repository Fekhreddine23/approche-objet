package entites;

public class AdressePostale {
	
	//initialisation variable
	//elle doit avoir les 4 attributs suivants : numéro de rue, libellé de la rue, code postal et ville.
	 int numeroRue;
	 String libelleDeRue;
	 int codePostale;
	 String ville;
	 
	 public AdressePostale(int numeroRue, String libelleDeRue, int codePostale, String ville) {
		 
		 this.numeroRue = numeroRue;
		 this.libelleDeRue = libelleDeRue;
		 this.codePostale = codePostale;
		 this.ville = ville;
		
	}
	//rajouter getter et setters
	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleDeRue() {
		return libelleDeRue;
	}

	public void setLibelleDeRue(String libelleDeRue) {
		this.libelleDeRue = libelleDeRue;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
	
	
