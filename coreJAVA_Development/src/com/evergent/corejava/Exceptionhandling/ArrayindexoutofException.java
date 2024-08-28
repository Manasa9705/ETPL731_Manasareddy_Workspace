package com.evergent.corejava.Exceptionhandling;

public class ArrayindexoutofException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,4,5};
try {
	System.out.println("accessing elements at index 10"+num[10]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("caught an exception"+e.getMessage());
	System.out.println(e);
}
System.out.println("program continues");
	}

}
