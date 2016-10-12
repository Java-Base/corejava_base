package com.core.java.PersonTest;

/**
 * Student Class
 *
 * @author 	Lian
 * @date 	16/8/30
 * @since 	1.0
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
