package com.core.java.PersonTest;

/**
 * @auth Lian
 * @date 16/8/30
 */
abstract  class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public abstract String getDescription();

	public String getName() {
		return name;
	}

}
