package com.coderscampus.arraylist;

public class GenerateList {
	
	public static void addItemToList(CustomList<String> myCustomArrayList) {
		
		myCustomArrayList.add("People:");
		myCustomArrayList.add("Michael");
		myCustomArrayList.add("Cat:");
		myCustomArrayList.add("BumRush");
		myCustomArrayList.add("Friends:");
		myCustomArrayList.add("Andrew");
		myCustomArrayList.add("Brandon");
		myCustomArrayList.add("Tyler");
		myCustomArrayList.add("Jed");
		myCustomArrayList.add("Nick Payne");
		myCustomArrayList.add("Nick Syler");
		myCustomArrayList.add("Joe");
		myCustomArrayList.add("Trey");
		myCustomArrayList.add("Lukas");
		myCustomArrayList.add("Karen");
		myCustomArrayList.add("Teacher:");
		myCustomArrayList.add("Antonio");
		myCustomArrayList.add("Pete");
		myCustomArrayList.add("Language:");
		myCustomArrayList.add("C#");
		myCustomArrayList.add("Java");
		myCustomArrayList.add("CSS");
		myCustomArrayList.add("HTML");
		myCustomArrayList.add("JavaScript");
 
	}
	
	public static void removeItemFromList(CustomList<String> myCustomArrayList) {
		for (int i = 0; i < myCustomArrayList.getSize(); i++) {
			String item = myCustomArrayList.get(i);
			if ("CSS".equals(item) || "Joe".equals(item)) {
				myCustomArrayList.remove(i);
				i--; // Decrease the index 
			}
		}
	}
	public static void printList(CustomList<String> myCustomArrayList) {
		for (int i = 0; i < myCustomArrayList.getSize(); i++) {
			System.out.println(myCustomArrayList.get(i));
		}
	}
}
