package fr.Diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class TestDates {

	public static void main(String[] args) {
//avec Objet Date
		// creation de la date
		Date date = new Date();
		date.getTime();
		System.out.println("date sans formatage : " + date);
		// formatage de la date generée
		SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formatage.format(date);
		System.out.println("date avec formatage : " + dateFormatee);

		// création de la date et ajout de l'heure
		Date date2 = new Date();
		date2.setHours(23);
		date2.setMinutes(30);
		date2.setSeconds(59);
		System.out.println(date2);
		// formatage de la date generée
		SimpleDateFormat formatage2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dateFormatee2 = formatage2.format(date);
		System.out.println(dateFormatee2);

//avec Objet Calendar

		// Creation de la date et formatage
		Calendar cal = Calendar.getInstance();
		Date dt = cal.getTime();
		System.out.println(dt);
		String calFormatee = formatage.format(dt);
		System.out.println(calFormatee);
		// ajout heure min et sec
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 59);
		dt = cal.getTime();
		System.out.println(dt);
		SimpleDateFormat simpleCalFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String calFormatee2 = simpleCalFormat.format(dt);
		System.out.println(calFormatee2);
	}

}
