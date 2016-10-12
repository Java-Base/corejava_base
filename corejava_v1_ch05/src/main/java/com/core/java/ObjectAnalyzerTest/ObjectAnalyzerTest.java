package com.core.java.ObjectAnalyzerTest;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects
 *
 * @author 	Lian
 * @date 	16/9/5
 * @since 	1.0
 */
public class ObjectAnalyzerTest {

	public static void main(String[] args) {

		ArrayList<Integer> squares = new ArrayList<Integer>();
		for (int i = 0; i <= 5; i++) {
			squares.add(i * i);
		}
		System.out.println(new ObjectAnalyzer().toString(squares));
	}

}
