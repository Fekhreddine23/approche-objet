package fichier;

public class Ville {
	
	 
	private String nom;
	private String nomRegion;
	private String codeDepartement;
	private int popTotale;
	
	//constructor
	public  Ville(String nom,String nomRegion, String codeDepartement,int popTotale) {
		this.nom = nom;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.popTotale = popTotale;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}
     
	
	//methode
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement
				+ ", popTotale=" + popTotale + "]";
	}
	

}
