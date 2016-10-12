package com.core.java.ManagerTest;

/**
 * This program demonstrates inheritance
 *
 * @author 	Lian
 * @date 	16/8/30
 * @since 	1.0
 */
public class ManagerTest {

	public static void main(String[] args) {

		// construct a Manager Object
		Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
		boss.setBonus(5000);

		// fill the staff array with Manager and Employee objects
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

		// print out information about all Employee objects
		for (Employee e : staff ) {
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		}
	}
}
