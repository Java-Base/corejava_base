package com.core.java.CircularArrayQueueTest;

import java.util.AbstractQueue;
import java.util.Iterator;

/**
 * A first-in, first-out bounded collection.
 *
 * @auth Lian
 * @date 16/9/13
 */
class CircularArrayQueue<E> extends AbstractQueue<E> {

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean offer(E e) {
		return false;
	}

	@Override
	public E poll() {
		return null;
	}

	@Override
	public E peek() {
		return null;
	}
}
