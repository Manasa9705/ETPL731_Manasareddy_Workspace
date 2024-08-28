package com.evergent.corejava.Exceptionhandling;

public class ExceptionDemo7throws2 {
	String name=null;

	public void myData()  throws NullPointerException {
		
			System.out.println("one");
System.out.println(name.length());
	}
	public void mychange() throws NullPointerException {
		myData();
		System.out.println("my change method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ExceptionDemo7throws2 e2=new ExceptionDemo7throws2();
		e2.mychange();
	}
		catch(NullPointerException e) {
			System.out.println("I can handle:" +e);
		}
	}

}

