package de.tools;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Tools {
	public static Date stringToDate(String stringDate) {
		Date date = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		try {
			date = (Date) formatter.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String dateToString(Date date){
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		return formatter.format(date);
	}
}
