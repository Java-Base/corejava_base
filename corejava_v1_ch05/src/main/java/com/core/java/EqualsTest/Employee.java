package com.core.java.EqualsTest;

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

	@Override
	public boolean equals(Object otherObject) {
		// a quick test to see if the objects are identical
		if (this == otherObject) return true;

		// must return false if the explicit paramter is null
		if (otherObject == null) return false;

		// if the classes don't match, they can't be equal
		if(getClass() != otherObject.getClass()) return false;

		// now we now otherObject is a non-null Employee
		Employee other = (Employee) otherObject;

		// test whether the fields have identical values
		return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);
	}

	@Override
	public int hashCode() {
		return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireDay.hashCode();
	}

	@Override
	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}
}
