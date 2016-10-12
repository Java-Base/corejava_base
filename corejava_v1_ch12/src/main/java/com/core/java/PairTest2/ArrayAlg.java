package com.core.java.PairTest2;


/**
 * 定义带有类型参数的简单方法.
 * 		类型变量放在修饰符的后面, 返回类型的前面。
 * 		泛型方法可以定义在普通类中, 也可以定义在泛型类中。
 * 		当调用一个泛型方法时, 在方法名前的尖括号中放入具体的类型
 *
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
class ArrayAlg {

	/**
	 * Gets the minimum and maximum of an array of objects of type T.
	 *
	 * @param a		an array of objects of type T
	 * @param <T>	type
	 * @return		a pair with min and max value, or null if a is null or empty.
	 */
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}

		T min = a[0];
		T max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) {
				min = a[i];
			}

			if (min.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}

		return new Pair<>(min, max);
	}
}
