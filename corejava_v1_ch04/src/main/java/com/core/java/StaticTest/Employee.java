package com.core.java.StaticTest;

/**
 * Employee Class
 *
 * @auth Lian
 * @date 16/8/23
 */
public class Employee {

	private String name;
	private double salary;
	private int id;
	private static int nextId = 1;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = 0;
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

	public void setId() {
		id = nextId; // set id to next available id
		nextId++;
	}

	public static int getNextId() {
		return nextId; // returns static field
	}

	public static void main(String[] args) // unit test
	{
		Employee e = new Employee("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
