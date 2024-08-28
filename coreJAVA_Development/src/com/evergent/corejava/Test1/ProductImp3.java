package com.evergent.corejava.Test1;

public class ProductImp3 extends Product3 {
 public ProductImp3(){
	System.out.println("productimpl3 constructor");
}
  public void myproduct() {
	  System.out.println("my products");
  }
  public void show() {
	  System.out.println("local method");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ProductImp3 p3=new ProductImp3();
p3.myproduct();
p3.show();
p3.allproducts();
	}

}
