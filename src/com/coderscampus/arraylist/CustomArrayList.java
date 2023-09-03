package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	int size = 0;

	@Override
	public boolean add(T item) {
		// Check if the current size of the items array is equal to the array length. If
		// the array is full, resize the array
		if (size == items.length) {
			resizeArray();
		}
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}

		@SuppressWarnings("unchecked")
		T result = (T) items[index];
		return result;
	}

	// Create a private helper method `resizeArray()` to handle the array resizing
	
	private void resizeArray() {
		Object[] newItems = new Object[items.length * 2];
		
		// System.arraycopy copies the items from the old array to the new array.
		System.arraycopy(items, 0, newItems, 0, items.length);
		items = newItems;

	}

}
