package com.core.java.CloneTest;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Employee Class implements Cloneable interface
 *
 * @author 	Lian
 * @date 	16/9/6
 * @since 	1.0
 */
class Employee implements Cloneable {

	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.hireDay = new Date();
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		// call Object.clone()
		Employee cloned = (Employee) super.clone();

		// clone mutable fields
		cloned.hireDay = (Date) hireDay.clone();

		return cloned;
	}

	/**
	 * Set the hire day to a given date
	 *
	 * @param year
	 * @param month
	 * @param day
	 */
	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

		// Example of instance field mutation
		hireDay.setTime(newHireDay.getTime());
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public String toString() {
		return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay;
	}
}
