package com.core.java.StaticInnerClassTest;

/**
 * ArrayAlg Class has a static inner class(called nested class)
 *
 * @auth Lian
 * @date 16/9/7
 */
class ArrayAlg {

	/**
	 * A pair of floating-point numbers
	 */
	public static class Pair {

		private double first;
		private double second;

		/**
		 * Constructs a pair from two floating-point numbers
		 *
		 * @param first		the first number
		 * @param second	the second number
		 */
		public Pair(double first, double second) {
			this.first = first;
			this.second = second;
		}

		/**
		 * Returns the first number of the pair
		 *
		 * @return
		 */
		public double getFirst() {
			return first;
		}

		/**
		 * Returns the second number of the pa
		 *
		 * @return
		 */
		public double getSecond() {
			return second;
		}
	}

	public static Pair minmax(double[] values) {

		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;

		for (double v : values ) {
			if(min > v) min = v;
			if(max < v) max = v;
		}

		return new Pair(min, max);
	}
}
