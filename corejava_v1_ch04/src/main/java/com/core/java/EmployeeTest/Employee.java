package com.core.java.EmployeeTest;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Employee Class
 *
 * @author 	Lian
 * @date 	16/8/23
 * @since 	1.0
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
