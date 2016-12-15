package com.core.java.CalendarTest;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Another way to complete the function
 *
 * @author 	Lian
 * @date 	2016/9/22
 * @since 	1.0
 */
public class TestCalendar {

	public static void main(String[] args) {

		// construct calendar as current date
		GregorianCalendar calendar = new GregorianCalendar();

		// get current day and month
		int today = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);
		System.out.println("today: " + today + "; month: " + month);

		// set calendar to start date of month
		calendar.set(Calendar.DAY_OF_MONTH, 1);

		// get the week of the start data of month
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("weekday: " + weekday);

		// get first day of week(Sunday in the U.S.)
		int firstDayOfWeek = calendar.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek: " + firstDayOfWeek);

		// determine the required indentation for the first line
		int indent = 0;
		while(weekday != firstDayOfWeek) {
			indent++;
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			weekday = calendar.get(Calendar.DAY_OF_WEEK);
		}
		System.out.println("indent: " + indent);

		// print weekday name
//		do {
//			System.out.printf("%4s\t", weekdayNames[weekday]);
//			calendar.add(Calendar.DAY_OF_MONTH, 1);
//			weekday = calendar.get(Calendar.DAY_OF_WEEK);
//		} while (weekday != firstDayOfWeek);
//		System.out.println();

		// print weekday name
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		for (int i=1;  i<weekdayNames.length; i++ ) {
			System.out.printf("%4s\t", weekdayNames[i]);
		}
		System.out.println();

		// print indent
		for (int i = 0; i < indent; i++) {
			System.out.printf("%3s \t", " ");
		}

		// reset calendar to start date of month
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		do {
			// print day
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// mark current day with *
			if(day == today) {
				System.out.printf("*\t");
			} else {
				System.out.printf(" \t");
			}

			// advanced calendar to the next day
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			weekday = calendar.get(Calendar.DAY_OF_WEEK);

			// start a new line at the start of the week
			if(weekday == firstDayOfWeek) {
				System.out.println();
			}
		} while (calendar.get(Calendar.MONTH) == month);

		// print final end of line if nessary
		if(weekday != firstDayOfWeek) {
			System.out.println();
		}
	}
}
