package com.core.java.PairTest3;

/**
 * PairAlg
 *
 * @author 	Lian
 * @date 	16/9/12
 * @since 	1.0
 */
class PairAlg {

	public static boolean hasNulls(Pair<?> p) {
		return p.getFirst() == null || p.getSecond() == null;

	}

	public static void swap(Pair<?> p) {
		swapHelper(p);
	}

	public static <T> void swapHelper(Pair<T> p) {
		T t = p.getFirst();
		p.setFirst(p.getSecond());
		p.setSecond(t);
	}
}
