package com.core.java.PairTest2;


/**
 * @auth Lian
 * @date 16/9/8
 */
class ArrayAlg {

	/**
	 * Gets the minimum and maximum of an array of strings.
	 *
	 * @param a
	 * @return
	 */
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}

		T min = a[0];
		T max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) min = a[i];
			if (min.compareTo(a[i]) < 0) max = a[i];
		}

		return new Pair<T>(min, max);
	}
}
