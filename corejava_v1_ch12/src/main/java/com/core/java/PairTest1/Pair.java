package com.core.java.PairTest1;

/**
 * 泛型类(generic class)就是具有一个或多个类型变量的类。
 * 类定义中的类型变量可以指定方法的返回类型以及域和局部变量的类型。
 *
 * @author 	Lian
 * @date 	16/9/8
 * @since 	1.0
 */
class Pair<T> {

	private T first;
	private T second;

	public Pair() {
		first = null;
		second = null;
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
}
