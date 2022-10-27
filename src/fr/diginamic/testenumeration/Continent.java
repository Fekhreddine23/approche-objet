package fr.diginamic.testenumeration;

public enum Continent {
	//creation enumeration de saison
	AFRIQUE("afrique"),
	ASIE("asie"),
	AMERIQUE("amerique"),
	AMERIQUEDUSUD("amerique du syd"),
	EUROPE("europe");
	
	
	//creation du construct avec libelle
	private String libelle;
	Continent(String libelle) {
		// TODO Auto-generated constructor stub
		this.setLibelle(libelle);
	}
	
	
	@Override
	public String toString() {
		return  libelle;
	}

	
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
