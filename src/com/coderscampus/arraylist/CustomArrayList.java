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
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		 if (index < 0 || index > size) {  
			 
		        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		    }

		    // Check if array needs resizing
		    if (size == items.length) {
		        resizeArray();
		    }

		    // If the item is not being added at the end, shift items to the right to make space
		    if (index != size) {
		        System.arraycopy(items, index, items, index + 1, size - index);
		    }
		    
            items[index] = item;
            size++;
            return true;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}

		@SuppressWarnings("unchecked")
		T result = (T) items[index];
		return result;
	}

	// handles the array resizing

	private void resizeArray() {
		Object[] newItems = new Object[items.length * 2];

		// System.arraycopy copies the items from the old array to the new array.
		System.arraycopy(items, 0, newItems, 0, items.length);
		items = newItems;

	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}

		@SuppressWarnings("unchecked")
		T removedItem = (T) items[index];

		// Shift elements to the left to fill the gap
		System.arraycopy(items, index + 1, items, index, size - index - 1);

		// Decrease size
		size--;

		// Nullify the last element to remove any object reference
		items[size] = null;

		return removedItem;
	}

}
