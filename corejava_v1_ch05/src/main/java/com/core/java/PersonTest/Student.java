package com.core.java.PersonTest;

/**
 * Student Class
 *
 * @auth Lian
 * @date 16/8/30
 */
class Student extends Person {

	private String major;

	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return "a student major in " + major;
	}
}
