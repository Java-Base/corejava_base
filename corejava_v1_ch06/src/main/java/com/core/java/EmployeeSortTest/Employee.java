package com.core.java.EmployeeSortTest;

import java.util.Comparator;

/**
 * Class Employee implements Comparable
 *
 * @auth Lian
 * @date 16/9/6
 */
class Employee implements Comparable<Employee> {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	/**
	 * Compares employees by salary
	 *
	 * @param other		another Employee object
	 * @return			a negative value if this employee has a lower salary than otherObject
	 * 0 if the salaries are the same, a positive value otherwise
	 */
	@Override
	public int compareTo(Employee other) {

		if (salary < other.salary) return -1;

		if (salary > other.salary) return 1;

		return 0;
	}
}
