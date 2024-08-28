package com.evergent.corejava.final1;
//final class cannot be modified
 final class Myclass1{
	final public void myproducts() {
		System.out.println(" products");
	}
}
public class FinalDemo3  {
final String cname="India";
  public void myproducts1() {
	//cname="australi";
	System.out.println("all products");
	System.out.println(cname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalDemo3 fd=new FinalDemo3();

fd.myproducts1();
Myclass1 m=new Myclass1();//HAS_A realationship
m.myproducts();

	}

}
