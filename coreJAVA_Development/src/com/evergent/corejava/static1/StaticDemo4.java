package com.evergent.corejava.static1;
// Non static methods can access  static variables and methods
public class StaticDemo4 {
static String cname="India";
 static public void myData() {
	 //myshow();
		System.out.println("mydata");
}
 public void myshow() {
	 myData();
	 System.out.println("non static");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();
		StaticDemo4 s4=new StaticDemo4();
		s4.myshow();

	}

}
