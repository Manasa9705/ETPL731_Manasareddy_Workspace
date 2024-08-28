package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		HashSet myset=new HashSet();
		myset.add(100);
		myset.add("hello");
		myset.add(35.5);
		myset.add(100);
		Iterator i=myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
