package com.evergent.corejava.Test1;

public class Person6 {
static String name="manasa";
int age=33;
String address="hyd";
public void display() {
	name="welcome";
		System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Address:"+address);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Person6 p6=new Person6();
System.out.println(p6.name);
p6.display();
Person6 p2=new Person6();
System.out.println(p2.name);

	}

}
