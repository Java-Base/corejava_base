package com.core.java.Welcome;

/**
 * This program displays a greeting from the authors
 *
 * @author 	Lian
 * @time	2016年8月2日
 *
 */
public class Welcome {

	public static void main(String[] args) {
		String[] greeting = new String[3];
		greeting[0] = "Welcom to Core Java";
		greeting[1] = "by Cay Horstmann";
		greeting[2] = "and Gary Cornell";

		for(String str : greeting) {
			System.out.println(str);
		}
	}
}
