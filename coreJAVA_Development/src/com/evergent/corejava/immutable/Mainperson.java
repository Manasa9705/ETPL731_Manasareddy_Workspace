package com.evergent.corejava.immutable;

public class Mainperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personimmutable person=new Personimmutable("manu",22);
		System.out.println(person);
		System.out.println(person.myName());
		System.out.println(person.myAge());
	}

}
