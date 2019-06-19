package io.epicaracer.javastudy.generic;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
