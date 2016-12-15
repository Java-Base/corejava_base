package com.core.java;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 自己重新做的当月日历
 *
 * @author 	Lian
 * @date 	2016/12/15
 * @since 	1.0
 */
public class CustomCalendarTest {

	public static void main(String[] args) {

		GregorianCalendar calendar = new GregorianCalendar();
		int today = calendar.get(Calendar.DAY_OF_MONTH);
		int month = calendar.get(Calendar.MONTH);

		printWeekdayNames();

		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		printIndent(weekday);

		printDay(calendar, today, month);
	}

	/**
	 * 打印周日到周一
	 */
	private static void printWeekdayNames() {
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		for (int i=1; i<weekdayNames.length; i++) {
			System.out.printf("%4s\t", weekdayNames[i]);
		}
		System.out.println();
	}

	/**
	 * 打印缩进。
	 * eg：当月的第一天为周四，周日到周三要缩进
	 */
	private static void printIndent(int weekday) {
		for (int i=0; i<weekday - 1; i++) {
			System.out.printf("%3s \t", " ");
		}
	}

	/**
	 * 打印天数
	 * @param calendar
	 */
	private static void printDay(GregorianCalendar calendar, int today, int month) {

		int firstDayOfWeek = calendar.getFirstDayOfWeek();

		do {
			// 打印日期
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			// 把今日标记为*
			if (day == today) {
				System.out.print("*\t");
			} else {
				System.out.print(" \t");
			}

			// 天数加1
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			int weekday = calendar.get(Calendar.DAY_OF_WEEK);

			if (weekday == firstDayOfWeek) {
				System.out.println();
			}
		} while(calendar.get(Calendar.MONTH) == month);
	}
}
