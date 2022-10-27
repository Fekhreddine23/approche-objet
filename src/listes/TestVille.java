package listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Créez une ArrayList de villes contenant les villes suivantes :
		//ICI ARRAY LISTE PRENDRE LA CLASS VILLE POUR INSTANCIER LE OBJET
		ArrayList<Ville> villesPop = new ArrayList<Ville>();
		villesPop.add(new Ville("Nice", 343000));
		villesPop.add(new Ville("Carcassonne",47800));
		villesPop.add(new Ville("Narbonne",53400));
		villesPop.add(new Ville("Lyon",484000));
		villesPop.add(new Ville("Foix",9700));
		villesPop.add(new Ville("Pau",77200));
		villesPop.add(new Ville("Marseille",850700));
		villesPop.add(new Ville("Tarbes",40600));
		 
		 //Recherchez et affichez la ville la + peuplée
		Ville MaxPop = villesPop.stream().max((N1, N2) -> N1.getNombreHabitant() - N2.getNombreHabitant()).get();
		System.out.println(MaxPop.toString());
		
		//Recherchez et afficher la ville la - peuplée
		Ville MinPop = villesPop.stream().min((N1, N2) -> N1.getNombreHabitant() - N2.getNombreHabitant()).get();
		System.out.println(MinPop.toString());
		
		//Supprimez la ville la moins peuplée
		villesPop.remove(MinPop);
		
		//Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
	}

}
