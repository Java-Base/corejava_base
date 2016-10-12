package com.core.java.PairTest1;

/**
 * PairTest1
 *
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
public class PairTest1 {

	public static void main(String[] args) {
		String[] words = { "Mary", "had", "a", "little", "lamb" };
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());
	}
}
