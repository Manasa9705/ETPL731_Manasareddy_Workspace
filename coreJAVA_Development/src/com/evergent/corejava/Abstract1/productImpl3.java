package com.evergent.corejava.Abstract1;

public class productImpl3 extends product2 {
	productImpl3(){
		System.out.println("subclasss constructor");
	}
public void newproduct() {
	System.out.println("my products");
}
public void show() {
	System.out.println("local method of  product Imp class");
}
	public static void main(String[] args) {
		product2 p1=new productImpl3();
		p1.allproducts();
		p1.newproduct();
	}
}
