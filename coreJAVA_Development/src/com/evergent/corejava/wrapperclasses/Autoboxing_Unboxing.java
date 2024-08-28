package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		char ch1='a';
		Character ch2=new Character(ch1);
		char ch3=ch2.charValue();
		System.out.println(ch3);
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
