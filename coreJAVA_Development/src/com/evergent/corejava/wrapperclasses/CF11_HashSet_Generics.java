package com.evergent.corejava.wrapperclasses;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_HashSet_Generics {

	public static void main(String[] args) {
		HashSet<Integer> myset=new HashSet<Integer>();
		myset.add(100);
		myset.add(80);
		myset.add(35);
		myset.add(100);
		System.out.println(myset);
		Iterator i=myset.iterator();
		while(i.hasNext()) {	
			System.out.println(i.next());
		}
	}
}
