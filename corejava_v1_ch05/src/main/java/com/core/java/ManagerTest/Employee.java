package com.core.java.ManagerTest;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Employee Class
 *
 * @auth Lian
 * @date 16/8/30
 */
class Employee {

	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		this.hireDay = calendar.getTime();
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