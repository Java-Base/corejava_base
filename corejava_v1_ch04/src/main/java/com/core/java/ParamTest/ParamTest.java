package com.core.java.ParamTest;

/**
 * This demonstrates parameter passing in Java
 *
 * @author 	Lian
 * @date 	16/8/29
 * @since 	1.0
 */
public class ParamTest {

	public static void main(String[] args) {

		/**
		 * CustomCalendarTest 1: Method can't modify numeric parameters
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent=" + percent);
		tripleValue(percent);
		System.out.println("After: percent=" + percent);

		/**
		 * CustomCalendarTest 2: Method can change the state of object parameters
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee harry = new Employee("Harry", 50000);
		System.out.println("Before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary=" + harry.getSalary());


		/**
		 * CustomCalendarTest 3: Methods can't attach new objects to object parameters
		 */
		System.out.println("\nTesting swap:");
		Employee a = new Employee("Alice", 70000);
		Employee b = new Employee("Bob", 60000);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());

	}

	/**
	 * Doesn't work
	 * @param x
	 */
	public static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}

	/**
	 * Works
	 * @param x
	 */
	public static void tripleSalary(Employee x) {
		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
	}

	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
	}
}

