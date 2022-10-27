package fr.diginamic.essais;

import fr.diginamic.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Créez une instance de Theatre et appelez plusieurs fois la méthode jusqu’à obtention du message d’erreur
    	o Affichez le total de clients inscrits
		o Affichez la recette totale de l’établissement
		 * 
		 * 
		 * 
		 * **/
		
		Theatre th1 = new Theatre("opera", 2000, 1500, 89000);
		th1.inscrire(550, 20);
		
		//o Affichez le total de clients inscrits
		th1.getTotalClients();
		
		//o Affichez la recette totale de l’établissement
		th1.getRecetteTotal();

	}

}
