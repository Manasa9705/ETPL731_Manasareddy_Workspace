package com.evergent.corejava.static1;
//we can declare static as a variable and method
public class StaticDemo6 {
static  String name="raji";
int age=22;
 String cname="India";
  public void myData() {
	 name="welcome";
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("cName:"+cname);
		
		
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo6 s6=new StaticDemo6();
		System.out.println(s6.name);
		
		s6.myData();
		StaticDemo6 s61=new StaticDemo6();
		System.out.println(s61.name);
	}

}
