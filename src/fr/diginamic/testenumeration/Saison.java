package fr.diginamic.testenumeration;

//plus de class mais enum
public enum Saison {

	// creation enumeration de saison
	PRINTEMPS("printemps", 1), ETE("été", 2), AUTOMNE("automne", 3), HIVER("hiver", 4);

	private String libelle;
	private int numOrdre;

	// creation du construct avec libelle et numOrdre
	Saison(String libelle, int numOrdre) {

		this.libelle = libelle;
		this.numOrdre = numOrdre;

	}

	// methode static Permet de rechercher une Saison à partir de son libellé
	public static Saison valueOfLibelle(String libelle) {
		Saison[] saisons = Saison.values(); // affiche les val du tableau
		for (Saison saison : saisons) {
			if (saison.getLibelle().equals(libelle)) {
				return saison; // si le libelle est egale a ce qui est en parametre
			}
		}
		return null;
	}

	// getters et setters
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}

	@Override
	public String toString() {
		return numOrdre + ". " + libelle;
	}

}
