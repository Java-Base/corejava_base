package com.core.java.InputTest;

import java.util.Scanner;

/**
 * This program demonstrates console input.
 *
 * @author 	Lian
 * @date 	2016年8月16日
 * @since 	1.0
 */
public class InputTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// get first input
		System.out.println("What is your name?");
		String name = in.nextLine();

		// get second input
		System.out.println("How old are you?");
		int age = in.nextInt();

		// display output on console
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
	}
}
