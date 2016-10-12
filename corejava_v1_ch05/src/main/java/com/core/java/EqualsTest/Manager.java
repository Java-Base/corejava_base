package com.core.java.EqualsTest;

/**
 * Manager Clas
 *
 * @author 	Lian
 * @date 	16/8/30
 * @since 	1.0
 */
class Manager extends Employee {

	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}

	@Override
	public boolean equals(Object otherObject) {
		// super.equals checked that this and other belong to the same class
		if (!super.equals(otherObject)) return false;

		Manager other = (Manager) otherObject;

		return bonus == other.bonus;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 17 * new Double(bonus).hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}
}
