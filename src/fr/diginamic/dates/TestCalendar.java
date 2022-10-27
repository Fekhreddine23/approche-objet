package fr.diginamic.dates;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public TestCalendar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// créer une instance de Date à la date du 19 mai 2016 à 23h59 et 30 secondes et affichez-la au format suivant :
		// jour/mois/année
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016,4,19,23,59,30);
		//System.out.println(calendar);
		
		
		//Utilisez la classe java.util.Calendar pour créer une instance de Date à la date du jour.
		java.util.Date calendar1 = calendar.getTime();
		 
		//Affichez l’instance ainsi créée au format suivant :
		//année/mois/jour heure:minute:seconde 
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		System.out.println(format.format(calendar1));
		
		  
		//en français, russe, chinois et allemand.
		
		Locale franceLocale = new Locale("fr","FRANCE");
		Locale russeLocale = new Locale("ru", "RU");
		Locale chineLocale = new Locale("zh", "CN");
		
		//année/mois/jour heure:minute:seconde
		SimpleDateFormat formatFr = new SimpleDateFormat("EEEE MMMM yyyy HH:mm:ss", franceLocale);
		SimpleDateFormat formatRu = new SimpleDateFormat("EEEE MMMM yyyy HH:mm:ss", russeLocale);
		SimpleDateFormat formatCh = new SimpleDateFormat("EEEE MMMM yyyy HH:mm:ss", chineLocale); 
		
		//Affichez la même instance avec le nom des jours et des mois en 
		//français, russe, chinois et allemand.
		System.out.println(formatFr.format(calendar1));
		System.out.println(formatRu.format(calendar1));
		System.out.println(formatCh.format(calendar1));
	}

	

}
