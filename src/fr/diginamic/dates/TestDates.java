package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Créez une instance de la classe java.util.Date à la date du jour 
		//en utilisant un de ses constructeurs
		Date date = new Date();
		// display time and date using toString()
	      System.out.println(date.toString());
	      
	    //Affichez l’instance ainsi créée au format suivant :
	    // jour/mois/année (sans la partie heure)
	      String pattern = "MM-dd-yyyy";
	      SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	      String date1 = simpleDateFormat.format(new Date());
	      System.out.println(date1);
	      
	      
	      Date date2 = new Date(116, 04, 19, 23, 59, 30);
	      String pattern2 = "yyyy/MM/dd HH:mm:ss";
	      SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
	   
			System.out.println(date2);

	}

}
