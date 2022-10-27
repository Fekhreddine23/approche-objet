package listes;
import org.apache.commons.lang3.builder.EqualsBuilder;

import fr.diginamic.testenumeration.Continent;

public class Ville {
	
	//Créez une classe Ville possédant 2 attributs : nom, nb d’habitants.
	private String nom;
	private int nombreHabitant;
	private Continent typeContinent;
	
	//constructor
	public  Ville(String nom, int nombreHabitant, Continent typeContinent) {
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
		this.typeContinent = typeContinent;
		}
    
	
	//FAIRE la methode to string
	public String toString() {
		   return "La Ville de " + this.getNom() + " par habitants " + this.getNombreHabitant()+ " le continent se situe en " + 
	 this.getTypeContinent();
			   
		}
	
	//TP N°1 – APPRENDRE A REDEFINIR EQUALS
	//Redefinir la methode EQUALS 
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Ville)) {
			return false;
		}
		//le cast ici
		Ville other = (Ville) obj;
		//equals pour tester les objets; et == pour les types primitifs
		return new EqualsBuilder().append(nom, other.getNom()).append(nombreHabitant, other.nombreHabitant).isEquals();
	}
	
	//getter et setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreHabitant() {
		return nombreHabitant;
	}

	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}


	public Continent getTypeContinent() {
		return typeContinent;
	}


	public void setTypeContinent(Continent typeContinent) {
		this.typeContinent = typeContinent;
	}


	
}
