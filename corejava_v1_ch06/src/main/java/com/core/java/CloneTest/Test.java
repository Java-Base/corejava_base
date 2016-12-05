package com.core.java.CloneTest;

/**
 *
 *
 * @author	Lian
 * @time	2016年9月6日
 * @since	1.0
 */
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		// compile error : The method clone() from the type Object is not visible
//		Object obj = new Object();
//		obj.clone();

		// compile ok
		Test test = new Test();
		Test copy = (Test) test.clone();
	}
}
