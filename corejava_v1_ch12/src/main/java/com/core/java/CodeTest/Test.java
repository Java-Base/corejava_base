package com.core.java.CodeTest;

import java.util.Date;

/**
 * Test
 *
 * @author 	Lian
 * @date 	2016/9/22
 * @since 	1.0
 */
public class Test {

	public static void main(String[] args) {
		DateInterval interval = new DateInterval();
		Pair<Date> pair = interval;
		pair.setFirst(new Date());
		pair.setSecond(new Date());
	}
}
