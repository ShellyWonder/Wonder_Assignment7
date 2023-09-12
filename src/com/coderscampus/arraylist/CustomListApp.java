package com.coderscampus.arraylist;

public class CustomListApp {

	public static void main(String[] args) {
		CustomList<String> myCustomArrayList = new CustomArrayList<String>();

	    
	    // Populate the list with initial items
	    GenerateList.addItemToList(myCustomArrayList);
		

		System.out.println("\nOriginal List:");
		GenerateList.printList(myCustomArrayList);

		// Remove "CSS" and "Joe"
		GenerateList.removeItemFromList(myCustomArrayList);

		System.out.println("\nUpdated List:");
		GenerateList.printList(myCustomArrayList);
		
		//implementing the overloaded method
		System.out.println("\nAdding items to the list:");
		GenerateList.addItemToList(myCustomArrayList, 9, "Dave");
		GenerateList.addItemToList(myCustomArrayList, 10, "Sri");
		GenerateList.printList(myCustomArrayList);

	}
}
