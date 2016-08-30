package com.core.java.PersonTest;

/**
 * This program demonstrates abstract classes
 *
 * @auth Lian
 * @date 16/8/30
 */
public class PersonTest {

	public static void main(String[] args) {
		Person[] people = new Person[2];

		// fill the people array with Student and Employee objects
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");

		// print out names and description of all Person objects
		for (Person p : people) {
			System.out.println(p.getName() + ", " + p.getDescription());
		}
	}
}
