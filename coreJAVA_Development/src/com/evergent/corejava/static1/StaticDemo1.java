package com.evergent.corejava.static1;
//we can declare static as a variable and method
public class StaticDemo1 {
static String cname="India";
 static public void myData() {
	 
		System.out.println("mydata");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();

	}

}
