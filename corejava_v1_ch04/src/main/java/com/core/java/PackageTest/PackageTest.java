// the Employee class is defined in that package
package com.core.java.PackageTest;

import static java.lang.System.*;

/**
 * This program demonstrates the use of package
 *
 * @author 	Lian
 * @date 	16/8/29
 * @since 	1.0
 */
public class PackageTest {

	public static void main(String[] args) {
		// because of the import statement, we don't have to use com.core.java.PackageTest.Employee here
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

		harry.raiseSalary(5);

		// because of the static import statement, we don't have to use System.out.println here
		out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
	}
}
