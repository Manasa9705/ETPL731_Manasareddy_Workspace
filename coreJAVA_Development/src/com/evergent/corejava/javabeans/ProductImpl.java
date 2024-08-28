package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductBean p=new ProductBean(20,"Laptop",85000);
System.out.println("produrct no:"+p.getPno());
System.out.println("product name:"+p.getPname());
System.out.println("product price:"+p.getPrice());
	}

}
