package maps;

import java.util.ArrayList;
import java.util.HashMap;

import listes.Ville;

public class mapVilles {
	
	public static void main(String[] args)
	{
		var villes = new ArrayList<Ville>();
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
		
		
		//Dans cette classe, créez une map permettant de stocker les instances de villes (valeur) 
		//en fonction de leur nom (clé).
		HashMap<String,Ville> map = new HashMap<String,Ville>();
		
		for (var ville : villes)
		{
			map.put(ville.getNom(),ville);
		}
		
		
		//Recherchez et supprimez la ville qui a le moins d’habitants
		Ville villeSup = map.remove(map.values().stream().min((v1, v2) -> v1.getNombreHabitant() - v2.getNombreHabitant()).get().getNom());

		//Affichez l’ensemble des villes restantes.
		System.out.println(villeSup.toString());
	}
}
