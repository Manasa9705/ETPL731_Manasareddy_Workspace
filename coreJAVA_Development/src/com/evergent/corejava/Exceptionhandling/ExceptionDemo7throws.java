package com.evergent.corejava.Exceptionhandling;

public class ExceptionDemo7throws {
	String name=null;

	public void myData()  throws NullPointerException {
		
			System.out.println("one");
System.out.println(name.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ExceptionDemo7throws e2=new ExceptionDemo7throws();
		e2.myData();
	}
		catch(NullPointerException e) {
			System.out.println("I can handle:" +e);
		}
	}

}

