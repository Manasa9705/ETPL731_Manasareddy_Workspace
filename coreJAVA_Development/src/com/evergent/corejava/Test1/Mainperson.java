package com.evergent.corejava.Test1;

public class Mainperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable pi=new PersonImmutable ("manasa",22);
		System.out.println("name:"+pi.myname());
		System.out.println("Age:"+pi.myage());
	}

}
