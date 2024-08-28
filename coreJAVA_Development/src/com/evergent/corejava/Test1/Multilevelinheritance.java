package com.evergent.corejava.Test1;

class Person{
	public void persondata() {
		System.out.println("manasa");
	}
}
	class myperson extends Person{
		public void personinfo() {
			System.out.println("hyderabad");
		}
	}
public class Multilevelinheritance extends myperson
{
	public void show() {
		System.out.println("local method");
	}

	public static void main (String args[]) {
Multilevelinheritance m1=new Multilevelinheritance();
m1.personinfo();
m1.persondata();
m1.show();
}
}

