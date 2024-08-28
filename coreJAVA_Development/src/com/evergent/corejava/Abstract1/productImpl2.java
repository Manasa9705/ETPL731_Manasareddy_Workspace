package com.evergent.corejava.Abstract1;

public class productImpl2 extends product {
public void newproduct() {
	System.out.println("my products");
}
public void show() {
	System.out.println("local method of  product Imp class");
}
	public static void main(String[] args) {
		product p1=new productImpl2();
		p1.allproducts();
		p1.newproduct();
	}
}
