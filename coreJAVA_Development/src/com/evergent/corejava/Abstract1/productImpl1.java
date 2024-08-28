package com.evergent.corejava.Abstract1;

public class productImpl1 extends product {
public void newproduct() {
	System.out.println("my products");
}
	public static void main(String[] args) {
		productImpl1 p1=new productImpl1();
		p1.allproducts();
		p1.newproduct();
	}
}
