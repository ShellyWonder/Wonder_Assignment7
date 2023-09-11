package com.coderscampus.arraylist;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
	// Test-Driven Development Methodology
	// Step 1: Write a failing test;
	// Step 2: Write the business logic for a passing test;
	// Step 3: Re-factor the code;

	// Arrange-- set up,
	// Act--invoke the code,
	// Assert-- test expected to pass,
	private CustomArrayList<Integer> customArrayList;
	private CustomArrayList<String> customArrayList2;

	@BeforeEach
	public void init() {
		customArrayList = new CustomArrayList<>();
		customArrayList2 = new CustomArrayList<>();
	}

	@Test
	public void testAddMethod() {
		customArrayList.add(1);
		customArrayList.add(2);
		customArrayList.add(3);

		assertEquals(3, customArrayList.getSize());
	}

	@Test
	public void testAddAtIndexAndItem() {

		// Test adding a specific item at the beginning
		customArrayList2.add(0, "Start");
		assertEquals(1, customArrayList2.getSize());
		assertEquals("Start", customArrayList2.get(0));

		// Test adding a specific item in the middle
		customArrayList2.add("A");
		customArrayList2.add("B");
		customArrayList2.add(2, "Middle");
		assertEquals(4, customArrayList2.getSize());
		assertEquals("Middle", customArrayList2.get(2));

		// Test adding a specific item at the end
		customArrayList2.add(customArrayList2.getSize(), "End");
		assertEquals(5, customArrayList2.getSize());
		assertEquals("End", customArrayList2.get(customArrayList2.getSize() - 1));

		// Test adding a null item
		customArrayList2.add(3, null);
		assertEquals(6, customArrayList2.getSize());
		assertNull(customArrayList2.get(3));
	}

	@Test
	public void testAddAtIndexOutOfBounds() {
		// Test with negative index
		assertThrows(IndexOutOfBoundsException.class, () -> {
			customArrayList2.add(-1, "Z");
		});

		// Test with index greater than size
		assertThrows(IndexOutOfBoundsException.class, () -> {
			customArrayList2.add(2, "Z");
		});
	}

	@Test
	public void testGetSizeMethod() {
		assertEquals(0, customArrayList.getSize());

		customArrayList.add(1);

		assertEquals(1, customArrayList.getSize());
	}

	@Test
	public void testGetMethod() {
		customArrayList.add(1);
		customArrayList.add(2);
		customArrayList.add(3);

		assertEquals(1, customArrayList.get(0));
		assertEquals(2, customArrayList.get(1));
		assertEquals(3, customArrayList.get(2));
	}

	@Test
	public void testGetMethodThrowsExceptionForInvalidIndex() {
		assertThrows(IndexOutOfBoundsException.class, () -> customArrayList.get(0));
		assertThrows(IndexOutOfBoundsException.class, () -> customArrayList.get(-1));
	}

	@Test
	public void testRemoveMiddleElement() {
		customArrayList.add(1);
		customArrayList.add(2);
		customArrayList.add(3);
		int removedItem = customArrayList.remove(1);

		assertEquals(2, removedItem);
		assertEquals(2, customArrayList.getSize());
		assertEquals(1, customArrayList.get(0));
		assertEquals(3, customArrayList.get(1));
	}

	@Test
	public void testRemoveFirstElement() {
		customArrayList.add(1);
		customArrayList.add(2);
		customArrayList.add(3);
		int removedItem = customArrayList.remove(0);

		assertEquals(1, removedItem);
		assertEquals(2, customArrayList.getSize());
		assertEquals(2, customArrayList.get(0));
		assertEquals(3, customArrayList.get(1));
	}

	@Test
	public void testRemoveLastElement() {
		customArrayList.add(1);
		customArrayList.add(2);
		customArrayList.add(3);
		int removedItem = customArrayList.remove(2);

		assertEquals(3, removedItem);
		assertEquals(2, customArrayList.getSize());
		assertEquals(1, customArrayList.get(0));
		assertEquals(2, customArrayList.get(1));
	}

	@Test
	public void testRemoveThrowsException() {
		customArrayList.add(1);
		assertThrows(IndexOutOfBoundsException.class, () -> customArrayList.remove(1));
		assertThrows(IndexOutOfBoundsException.class, () -> customArrayList.remove(-1));
	}

	@Test
	public void testArrayResize() {
		for (int i = 0; i < 11; i++) {
			customArrayList.add(i);
		}

		assertEquals(11, customArrayList.getSize());
		assertEquals(10, customArrayList.get(10));
	}
}
