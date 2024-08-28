package com.evergent.corejava.static1;
//we can declare static as a variable and method
public class StaticDemo5 {
	static {
		System.out.println("Static block");
	}
static String cname="India";
 static public void myData() {
	 
		System.out.println("mydata");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();

	}

}
