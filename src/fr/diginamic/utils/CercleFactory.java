package fr.diginamic.utils;

import fr.diginamic.Cercle;

public class CercleFactory {
	 
	

    //cette classe a une méthode de classe (static) 
	//qui prend en paramètre un double et retourne un Cercle
    public static Cercle afficherCercle(double rayon)
    {
    	return new Cercle(rayon);
    }

}
