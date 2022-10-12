package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class LocalDateDemo {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.now();
		System.out.println(d1);

		System.out.println(d1.minusDays(2));

		System.out.println(d1.plusDays(4));

		System.out.println(d1.getDayOfMonth());

//		/converting date int string

		String date1 = d1.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date1);

//		Local Time

		LocalTime t1 = LocalTime.now();

		System.out.println(t1);

		LocalDateTime y1 = LocalDateTime.now();

		System.out.println(y1);

		// formattng

//		DateTimeFormatter f1 = new DateTimeFormatter.ofPattern("dd-mm-yy", hh - mm - ss);

		// Calender
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(Calendar.WEEK_OF_YEAR);

	}
}
