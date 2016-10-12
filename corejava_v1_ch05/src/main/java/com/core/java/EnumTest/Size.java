package com.core.java.EnumTest;

/**
 * Enum Size
 *
 * @author 	Lian
 * @date 	16/9/5
 * @since 	1.0
 */
enum Size {

	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

	private String abbreviation;

	private Size( String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}
}
