package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	
	public double nbreJoursTravail;
	public double montantJournalier;
	
	//constructor
	public Pigiste(String nom, String prenom, double nbreJoursTravail,double montantJournalier) {
		super(nom,prenom);
		this.nbreJoursTravail = nbreJoursTravail;
		this.montantJournalier = montantJournalier;
	}

	@Override
	public double getSalaire() {
		return nbreJoursTravail*montantJournalier;
	}
	
	@Override
	public String getStatut() {
		return "pigiste";
	}

}
