package com.evergent.corejava.Exceptionhandling;
public class ExceptionDemo4 {	
String name="null";
int k=0;
	public void myData() {
		try {
			System.out.println("one");
System.out.println(name.length());
int t=10/k;
System.out.println(t);
System.out.println("end");

	}
		catch(NullPointerException e) {
			System.out.println("I can handle"+e);
		}
		catch(ArithmeticException f) {
			System.out.println("I can handle"+f);
	}
	}
		public static void main(String[] args) {
	      ExceptionDemo4 ed2=new ExceptionDemo4();
			ed2.myData();
	}
}
