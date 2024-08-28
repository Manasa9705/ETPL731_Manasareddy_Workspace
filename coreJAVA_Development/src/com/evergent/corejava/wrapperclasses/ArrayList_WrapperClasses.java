package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class ArrayList_WrapperClasses {

	public static void main(String[] args) {
		int a=10;
		Integer b=new Integer(a);
		ArrayList mylist=new ArrayList();
		mylist.add(b);
		Integer c=new Integer(100);
mylist.add(c);
mylist.add(new Integer(200));
System.out.println(mylist);
//JDK 1.5
ArrayList mylist1=new ArrayList();
mylist1.add(100);
System.out.println(mylist1.get(0));
	}
}
