package com.evergent.corejava.Exceptionhandling;

 class ProductNotFoundException extends Exception {
public ProductNotFoundException(String message) {
	System.out.println("Hello:"+message);
}
 }
public class ProductImp1 {
	int pno=105;
	public void myData() throws ProductNotFoundException
	{
		if(pno>100) {
			throw new ProductNotFoundException("there is no products");
			
		}
		else {
			System.out.println("products are there");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ProductImp1 p=new ProductImp1();
		p.myData();
		}
		catch(ProductNotFoundException e) {
			System.out.println("I can handle:"+e);
		}
	}

}
