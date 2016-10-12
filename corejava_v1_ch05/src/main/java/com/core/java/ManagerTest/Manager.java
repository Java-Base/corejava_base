package com.core.java.ManagerTest;

/**
 * Manager Class
 *
 * @author 	Lian
 * @date 	16/8/30
 * @since 	1.0
 */
class Manager extends Employee {

	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.bonus = 0;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
