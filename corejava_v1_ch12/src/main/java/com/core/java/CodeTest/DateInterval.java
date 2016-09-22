package com.core.java.CodeTest;

import java.util.Date;

/**
 * @auth Lian
 * @date 2016/9/22
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
