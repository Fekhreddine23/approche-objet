package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Créez une map nommée mapSalaires et qui permet de stocker les informations de salaire (valeur)
		//en fonction du prénom de la personne (clé).
		// Une fois la map créée, affichez sa taille
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Paul", 1750);
		map.put("Hicham", 1825);
		map.put("Yu", 2250);
		map.put("Ingrid", 2015);
		map.put("Chantal", 2418);
		
		System.out.println("Taille: " + map.size());

	}

}
