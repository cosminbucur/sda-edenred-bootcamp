package com.sda.patterns.behavioral.iterator.challenge;

public interface ItemIterator<T> {

	boolean hasNext();

	T next();
}