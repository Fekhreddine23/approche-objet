package fr.diginamic.testenumeration;

import java.util.ArrayList;

import listes.Ville;

public class TestContinentAvecEnum {

	public TestContinentAvecEnum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Créez une liste de villes avec tous les paramètres attendus dont le continent :
		
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("New-York", 500000, Continent.AMERIQUE));
		villes.add(new Ville("Londres", 100000, Continent.EUROPE));
		villes.add(new Ville("Pekin", 110000, Continent.ASIE));
		villes.add(new Ville("Seoul", 230000, Continent.ASIE));
		villes.add(new Ville("Berlin", 40000, Continent.EUROPE));
		villes.add(new Ville("Sao Paulo", 230000, Continent.AMERIQUEDUSUD));
		villes.add(new Ville("Bamako", 80000, Continent.AFRIQUE));
	
    //Réalisez une boucle qui affiche l’ensemble des villes avec leur continent respectif
	for(Ville ville: villes) {
		System.out.println(ville);
	}
	
 }	
}
