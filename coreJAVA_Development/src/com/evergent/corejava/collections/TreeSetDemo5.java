package com.evergent.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo5 {

	public static void main(String[] args) {
		TreeSet myset=new TreeSet();
          myset.add(100);
          myset.add(50);
          myset.add(150);
      System.out.println(myset);
      Iterator i=myset.iterator();
      while(i.hasNext()) {
	System.out.println(i.next());
}
	}
}
