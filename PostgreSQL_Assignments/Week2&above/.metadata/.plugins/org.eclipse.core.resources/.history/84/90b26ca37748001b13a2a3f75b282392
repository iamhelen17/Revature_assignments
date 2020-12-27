package com.app.service.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	
	public static Date makeDate (String dateStr) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		
		try {
			date = formatter.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date;
	}

}
