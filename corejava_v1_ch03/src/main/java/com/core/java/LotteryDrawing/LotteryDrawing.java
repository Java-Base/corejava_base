package com.core.java.LotteryDrawing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates array manipulation
 *
 * @author 	Lian
 * @date 	16/8/22
 * @since 	1.0
 */
public class LotteryDrawing {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers do you need to draw? ");
		int k = in.nextInt();

		System.out.print("What is the hightest number you can draw? ");
		int n = in.nextInt();


		// fill an array with number 1 2 3 ... n
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		// draw k numbers and put them into a second array
		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			// make a random index between 0 and n-1
			int r = (int) (Math.random() * n);

			// pick the element at the random location
			result[i] = numbers[r];

			// move the last element into the random loacation
			numbers[r] = numbers[n - 1];
			// reduce the length of array numbers
			n--;
		}

		// print the second array
		Arrays.sort(result);
		System.out.println("Bet the following combination. It'll make you rich!");
		for (int r : result) {
			System.out.println(r);
		}
	}
}
