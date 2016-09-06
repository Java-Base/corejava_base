package com.core.java.CloneTest;

/**
 * This program demonstrates cloning.
 *
 * @auth Lian
 * @date 16/9/6
 */
public class CloneTest {

	public static void main(String[] args) {
		try {
			Employee original = new Employee("John Q. Public", 50000);
			original.setHireDay(2000, 1, 1);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2002, 12, 31);
			System.out.println("original=" + original.toString());
			System.out.println("copy=" + copy.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
