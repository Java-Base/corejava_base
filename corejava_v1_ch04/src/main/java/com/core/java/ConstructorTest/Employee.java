package com.core.java.ConstructorTest;

import java.util.Random;

/**
 * Employee Class
 *
 * @auth Lian
 * @date 16/8/29
 */
class Employee {

	private static int nextId;

	private int id;
	/**
	 * instance field initialization
	 */
	private String name = "";
	private double salary;

	/**
	 * The default constructor
	 */
	public Employee() {

		// name initialized to "" -- see below
		// salary not explicitly set -- initialized to 0
		// id initialized in initialization block
	}

	public Employee(double salary) {
		// calls the Employee(String, double) constructor
		this("Employee #" + nextId, salary);
	}

	/**
	 * Three overloaded constructors
	 *
	 * @param name
	 * @param salary
	 */
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

	public int getId() {
		return id;
	}

	// static initialization block
	static {
		Random generator = new Random();
		// set nextId to a random number between 0 and 999
		nextId = generator.nextInt(10000);
	}

	// object initialization block
	{
		id = nextId;
		nextId ++;
	}
}
