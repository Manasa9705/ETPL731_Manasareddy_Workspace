package com.evergent.corejava.oops;
class Person{
	public void persondata() {
		System.out.println("Hello");
	}
}
class Human extends Person{
	public void show() {
		System.out.println("welcome");
	}
}
public class Multilevelinheritance  extends Human{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevelinheritance mi=new Multilevelinheritance();
		mi.show();
		mi.persondata();
	}

}
