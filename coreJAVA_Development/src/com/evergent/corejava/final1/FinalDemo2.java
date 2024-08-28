package com.evergent.corejava.final1;
//final method cannot be modified
class myclass{
	final public void myproducts() {
		System.out.println(" products");
	}
}
public class FinalDemo2  extends myclass{
final String cname="India";
  public void myproducts1() {
	//cname="australi";
	System.out.println("all products");
	System.out.println(cname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalDemo2 fd=new FinalDemo2();
fd.myproducts();
fd.myproducts1();

	}

}
