package com.evergent.corejava.Test1;

class Animal{
	 private String name;
	 private int age;
	
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void displayInfo() {
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
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Breed:"+breed);
		
	}
public static void main(String args[]){
	Dog d=new Dog("buddy",6,"lab");
	d.displayInfo();
}
}
