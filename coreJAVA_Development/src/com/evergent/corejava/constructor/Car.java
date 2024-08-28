package com.evergent.corejava.constructor;

public class Car {
	String color;
	int maxspeed;
	Car(){
		color="white";
		maxspeed=120;
	}
	Car(String color,int maxspeed){
		this.color=color;
		this.maxspeed=maxspeed;
	}
	public void display() {
		System.out.println("color:"+color);
		System.out.println("speed:"+maxspeed);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car();
Car c2=new Car("yellow",150);
c1.display();
c2.display();
	}

}
