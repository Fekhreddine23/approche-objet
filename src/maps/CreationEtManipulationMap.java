package maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class CreationEtManipulationMap {
	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		//Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		// Récupérer les valeurs et les clés
        for (Entry<Integer, String> entry : mapVilles.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Clé: " + key + ", Valeur: " + value);
        }
        
        //taille map

System.out.println("Taille après ajout des éléments: " + mapVilles.size());

	}
}