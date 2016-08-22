package com.core.java.CalendarTest;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This program demonstrates the use of Calendar
 *
 * @auth Lian
 * @date 16/8/22
 */
public class CalendarTest {

	public static void main(String[] args) {
		// construct calendar as current date
		GregorianCalendar calendar = new GregorianCalendar();

		int today = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);

		// set calendar to start date of month
		calendar.set(Calendar.DAY_OF_MONTH, 1);

		int weekday = calendar.get(Calendar.DAY_OF_WEEK);

		// get first day of week(Sunday in the U.S.)
		int firstDayOfWeek = calendar.getFirstDayOfWeek();

		// determine the required indentation for the first line
		int indent = 0;
		while (weekday != firstDayOfWeek) {
			indent++;
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			weekday = calendar.get(Calendar.DAY_OF_WEEK);
		}

		// print weekday names
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do {
			System.out.printf("%4s", weekdayNames[weekday]);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			weekday = calendar.get(Calendar.DAY_OF_WEEK);
		} while (weekday != firstDayOfWeek);
		System.out.println();

		for (int i = 0; i <= indent; i++) {
			System.out.print("    ");
		}

		calendar.set(Calendar.DAY_OF_MONTH, 1);
		do {
			// print day
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// mark current day with *
			if (day == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}

			// advanced calendar to the next day
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			weekday = calendar.get(Calendar.DAY_OF_WEEK);

			// start a new line at the start of the week
			if (weekday == firstDayOfWeek) {
				System.out.println();
			}
		} while (calendar.get(Calendar.MONTH) == month);
		// the loop exits when calendar is day 1 of the next month

		// print final end of line if necessary
		if (weekday != firstDayOfWeek) {
			System.out.println();
		}
	}
}
