package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//déclarez une variable de type chaine de caractères qui contient un nombre entier.
		String chaine = "12";
		
		//Utilisez une méthode de la classe java.lang.Integer qui 
		//permet de convertir une chaîne de caractères en entier.
		 int finale =  Integer.parseInt(chaine);
		 
		 
		 //Déclarez maintenant 2 variables de type int a et b
		 int a = 45;
		 int b = 89;
		 
		 
             //Utilisez une méthode de la classe Integer qui calcule le nombre maximum entre a et b.
			System.out.println(Integer.max(a, b));
	}

}
