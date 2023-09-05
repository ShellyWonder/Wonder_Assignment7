package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
	//Test-Driven Development Methodology
	//Step 1: Write a failing test;
	//Step 2: Write the business logic for a passing test;
	//Step 3: Re-factor the code;
    
	//Arrange-- set up, 
	//Act--invoke the code,
	//Assert-- test expected to pass,
    private CustomArrayList<Integer> customArrayList;

    @BeforeEach
    public void init() {
        customArrayList = new CustomArrayList<>();
    }

    @Test
    public void testAddMethod() {
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);

        assertEquals(3, customArrayList.getSize());
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
    public void testArrayResize() {
        for (int i = 0; i < 11; i++) {
            customArrayList.add(i);
        }

        assertEquals(11, customArrayList.getSize());
        assertEquals(10, customArrayList.get(10));
    }
}
