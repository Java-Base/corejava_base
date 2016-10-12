package com.core.java.PersonTest;

/**
 * Abstract Class Person
 *
 * @auth 	Lian
 * @date 	16/8/30
 * @since 	1.0
 */
abstract class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public abstract String getDescription();

	public String getName() {
		return name;
	}

}
