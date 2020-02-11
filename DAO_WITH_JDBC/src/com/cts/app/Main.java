package com.cts.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		
		LocalTime t= LocalTime.now();
		System.out.println(t);
		
		ZonedDateTime z= ZonedDateTime.now();
		System.out.println(z);
		
		String s="10-10-98";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		Date d3=  sdf.parse(s);
		System.out.println(d3);
		System.out.println(sdf.format(d3));
	//	LocalDate ld=new LocalDate(d3);
		
	}
	

}
