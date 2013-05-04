package com.armandorv.easytravel.web.util;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListAdapter<T, C> extends AbstractList<T> implements List<T> {

	private Collection<T> collection;

	public ListAdapter(Collection<T> collection) {
		super();
		this.collection = collection;
	}

	@Override
	public int size() {
		return collection.size();
	}

	@Override
	public boolean isEmpty() {
		return collection.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return collection.contains(o);
	}

	@Override
	public Iterator<T> iterator() {
		return collection.iterator();
	}

	@Override
	public Object[] toArray() {

		return null;
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] a) {
		return collection.toArray(a);
	}

	@Override
	public boolean add(T e) {
		return collection.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return collection.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return collection.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		return collection.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		return collection.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return collection.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return collection.removeAll(c);
	}

	@Override
	public void clear() {
		collection.clear();
	}

	@Override
	public T get(int index) {

		if (index < 0) {
			throw new IndexOutOfBoundsException("Index was less than zero.");
		}

		if (index > size()) {
			throw new IndexOutOfBoundsException("Index was " + index
					+ " ad size is " + size());
		}

		int i = 0;
		Iterator<T> it = collection.iterator();

		while (it.hasNext() && i <= index) {
			T element = it.next();

			if (i == index)
				return element;

			i++;
		}

		return null;
	}

	@Override
	public T set(int index, T element) {
		return super.set(index, element);
	}

	@Override
	public void add(int index, T element) {
		super.add(index, element);
	}

	@Override
	public T remove(int index) {
		return super.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return super.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return lastIndexOf(o);
	}

	@Override
	public ListIterator<T> listIterator() {
		return super.listIterator();
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return super.listIterator();
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return super.subList(fromIndex, toIndex);
	}

}
