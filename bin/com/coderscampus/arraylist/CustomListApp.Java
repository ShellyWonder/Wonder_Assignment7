package com.coderscampus.arraylist;

public class CustomListApp {

	public static void main(String[] args) {
		CustomList<String> myCustomArrayList = new CustomArrayList<String>();

		myCustomArrayList.add("People");
		myCustomArrayList.add("Michael");
		myCustomArrayList.add("Cat");
		myCustomArrayList.add("BumRush");
		myCustomArrayList.add("Friends");
		myCustomArrayList.add("Andrew");
		myCustomArrayList.add("Brandon");
		myCustomArrayList.add("Tyler");
		myCustomArrayList.add("Jed");
		myCustomArrayList.add("NickPayne");
		myCustomArrayList.add("Nick Syler");
		myCustomArrayList.add("Joe");
		myCustomArrayList.add("Trey");
		myCustomArrayList.add("Lukas");
		myCustomArrayList.add("Karen");
		myCustomArrayList.add("Antonio");
		myCustomArrayList.add("Language");
		myCustomArrayList.add("C#");
		myCustomArrayList.add("Java");
		myCustomArrayList.add("CSS");
		myCustomArrayList.add("HTML");
		myCustomArrayList.add("JavaScript");
		
		for (int i = 0; i < myCustomArrayList.getSize(); i++) {
			System.out.println(myCustomArrayList.get(i));
}
	}

}
