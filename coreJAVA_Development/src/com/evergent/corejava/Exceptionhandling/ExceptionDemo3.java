package com.evergent.corejava.Exceptionhandling;
public class ExceptionDemo3 {	
String name=null;
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
			// TODO Auto-generated method stub
			ExceptionDemo3 ed2=new ExceptionDemo3();
			ed2.myData();
	}
}
