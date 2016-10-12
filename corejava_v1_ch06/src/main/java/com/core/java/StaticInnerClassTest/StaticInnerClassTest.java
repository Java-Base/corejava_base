package com.core.java.StaticInnerClassTest;

/**
 * This program demonstrates the uses of static inner classes
 *
 * @author 	Lian
 * @date 	16/9/7
 * @since 	1.0
 */
public class StaticInnerClassTest {

	public static void main(String[] args) {
		double[] d = new double[20];
		for (int i = 0; i < d.length; i++) {
			d[i] = 100 * Math.random();
		}

		ArrayAlg.Pair p = ArrayAlg.minmax(d);

		System.out.println("min=" + p.getFirst());
		System.out.println("max=" + p.getSecond());
	}
}
