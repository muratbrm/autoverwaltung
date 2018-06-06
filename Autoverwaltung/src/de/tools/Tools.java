package de.tools;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Tools {
	public static Date stringToDate(String stringDate) {
		java.sql.Date date = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		try {
			java.util.Date utilStartDate = formatter.parse(stringDate);
			date = new java.sql.Date(utilStartDate.getTime());
//			date = (Date) formatter.parse(stringDate);
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
