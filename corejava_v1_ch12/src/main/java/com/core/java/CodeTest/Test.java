package com.core.java.CodeTest;

import java.util.Date;

/**
 * @auth Lian
 * @date 2016/9/22
 */
public class Test {

	public static void main(String[] args) {
		DateInterval interval = new DateInterval();
		Pair<Date> pair = interval;
		pair.setFirst(new Date());
		pair.setSecond(new Date());
	}
}
