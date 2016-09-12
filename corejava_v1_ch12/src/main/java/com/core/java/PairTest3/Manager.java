package com.core.java.PairTest3;

/**
 * @auth Lian
 * @date 16/9/12
 */
class Manager extends Employee {

	private double bonus;

	/**
	 * @param name     	the employee's name
	 * @param salary    the salary
	 * @param year  	the hire year
	 * @param month 	the hire month
	 * @param day   	the hire day
	 */
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.bonus = 0;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}

	public double getBonus() {
		return bonus;
	}
}
