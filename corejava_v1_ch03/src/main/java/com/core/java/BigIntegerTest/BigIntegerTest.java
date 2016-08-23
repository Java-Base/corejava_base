package com.core.java.BigIntegerTest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 *
 * @author Lian
 * @time 2016年8月2日
 */
public class BigIntegerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers do you need to draw? ");
		int k = in.nextInt();

		System.out.print("What is the highest number you can draw? ");
		int n = in.nextInt();


		/**
		 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*....*k)
		 */
		BigInteger lotteryOdds = BigInteger.valueOf(1);

		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		}

		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}
}
