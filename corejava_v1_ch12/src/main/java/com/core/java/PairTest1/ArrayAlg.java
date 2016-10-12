package com.core.java.PairTest1;

/**
 * ArrayAlg
 *
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
class ArrayAlg {

	/**
	 * Gets the minimum and maximum of an array of strings.
	 * @param a
	 * @return
	 */
	public static Pair<String> minmax(String[] a) {
		if(a==null || a.length == 0) {
			return null;
		}

		String min = a[0];
		String max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) min = a[i];
			if (min.compareTo(a[i]) < 0) max = a[i];
		}

		return new Pair<>(min, max);
	}
}
