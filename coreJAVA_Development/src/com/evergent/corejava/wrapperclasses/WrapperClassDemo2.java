package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		float f1=45.5f;
		Float f2=new Float(f1);
	Float f3=f2.floatValue();
	double d1=50.5;
	Double d2=new Double(d1);
	Double d3=d2.doubleValue();
	byte b1=10;
	Byte b2=new Byte(b1);
	byte b3=b2.byteValue();
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	}

}
