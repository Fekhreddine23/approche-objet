package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Créez une ArrayList et remplissez là avec l’ensemble des villes du TP précédent

		ArrayList<Ville> villesPop = new ArrayList<Ville>();
		villesPop.add(new Ville("Nice", 343000));
		villesPop.add(new Ville("Carcassonne",47800));
		villesPop.add(new Ville("Narbonne",53400));
		villesPop.add(new Ville("Lyon",484000));
		villesPop.add(new Ville("Foix",9700));
		villesPop.add(new Ville("Pau",77200));
		villesPop.add(new Ville("Marseille",850700));
		villesPop.add(new Ville("Tarbes",40600));
		
		
//// Triez la liste par ordre alphabetiques
		Collections.sort(villesPop);	
			for (var ville : villesPop)
			{
				System.out.println(ville.getNom());
			}
		
			
           ///Triez l’ArrayList
            // Affichez le résultat pour vérifier que la liste des villes est correctement triée.
			//// avec compareTo nom ou nbHabitant dans Ville
			System.out.println("Comparé par habitants:");
			villesPop.sort(new ComparateurHabitant());
			

			///tri en implementant le comparator
			System.out.println("Tri par nombre d'habitant ");
			
        //Avec new Comparator
		Collections.sort(villesPop, new ComparateurHabitant());
		for (Ville element : villesPop) {
 			System.out.println(element.getNom()+" => "+ element.getNombreHabitant()+" habitants;");
 		}
		
		
		//Avec new Comparator
		System.out.println("Tri par nom de ville ");
		Collections.sort(villesPop, new ComparateurNom());
		for (Ville element : villesPop) {
 			System.out.println(element.getNom()+" => "+ element.getNombreHabitant()+" habitants;");
 		}		
			
			
			
	}
	


}
