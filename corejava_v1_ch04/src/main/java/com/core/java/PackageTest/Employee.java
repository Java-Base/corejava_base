// the classes in this file are part of this package
package com.core.java.PackageTest;

// import statements come after the package statement

import java.util.*;

/**
 * Employee Class
 *
 * @auth Lian
 * @date 16/8/29
 */
class Employee {

	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		// GregorianCalendar uses 0 for January
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
