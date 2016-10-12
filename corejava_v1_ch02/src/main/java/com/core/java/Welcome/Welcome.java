package com.core.java.Welcome;

/**
 * This program displays a greeting from the authors
 *
 * @author 	Lian
 * @date	2016年8月2日
 * @since 	1.0
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
