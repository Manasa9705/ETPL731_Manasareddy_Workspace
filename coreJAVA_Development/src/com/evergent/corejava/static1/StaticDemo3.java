package com.evergent.corejava.static1;
//static methods can't access non static variables and methods
public class StaticDemo3 {
static String cname="India";
 static public void myData() {
	 //myshow();
		System.out.println("mydata");
}
 public void myshow() {
	 System.out.println("non static");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();

	}

}
