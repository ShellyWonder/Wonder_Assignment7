package com.coderscampus.arraylist;

public class CustomListApp {

	public static void main(String[] args) {
		CustomList<String> myCustomArrayList = new CustomArrayList<String>();

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
		
		System.out.println("\nOriginal List:");

		for (int i = 0; i < myCustomArrayList.getSize(); i++) {
			System.out.println(myCustomArrayList.get(i));
		}
		//Remove "CSS" and "Joe"
				for (int i = 0; i < myCustomArrayList.getSize(); i++) {
					String item = myCustomArrayList.get(i);
					if ("CSS".equals(item) || "Joe".equals(item)) {
						myCustomArrayList.remove(i);
						i--; // Decrease the index to ensure we don't skip any elements
					}
				}
				
				System.out.println("\nUpdated List:");
				for (int i = 0; i < myCustomArrayList.getSize(); i++) {
					System.out.println(myCustomArrayList.get(i));
				}
	}

}
