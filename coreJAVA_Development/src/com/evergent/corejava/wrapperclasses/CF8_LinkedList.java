package com.evergent.corejava.wrapperclasses;

import java.util.LinkedList;

public class CF8_LinkedList {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList();
		mylist.add("TATA");
		mylist.add("BMW");
		mylist.add("VOLVO");
		mylist.addFirst("Maruthi");
		mylist.addLast("Safari");
		mylist.remove(4);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);
	}
}
