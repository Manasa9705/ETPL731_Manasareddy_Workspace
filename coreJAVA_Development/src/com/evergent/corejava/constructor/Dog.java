package com.evergent.corejava.constructor;
class Animal{
	private String name;
	private int age;
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
public class Dog extends Animal {
	private String breed;
Dog(String name,int age,String breed){
	super(name,age);
	this.breed=breed;
}
public void display() {
	super.display();
	System.out.println("breed:"+breed);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("pupppy",6,"lab");
		d.display();

	}

}
