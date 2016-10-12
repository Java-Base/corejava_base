package com.core.java.CodeTest;

import java.util.Date;

/**
 * Date Interval
 *
 * @author 	Lian
 * @date 	2016/9/22
 * @since 	1.0
 */
public class DateInterval extends Pair<Date> {

	public void setSecond(Date second) {
		if(second.compareTo(getFirst()) >= 0) {
			super.setSecond(second);
		}
	}

	public Date getSecond() {
		return (Date) super.getSecond().clone();
	}

}
