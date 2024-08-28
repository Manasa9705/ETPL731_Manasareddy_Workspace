package com.evergent.corejava.constructor;

public class Employee2 {
	int eno;
	String ename;
	double sal;
Employee2(){
	System.out.println("Default constructor");
}
Employee2(int no,String name ,double sal ){
	this.eno=no;
	this.ename=name;
	sal=sal;
	
}
public void display() {
	System.out.println("employee name:"+ename);
	System.out.println("employee no:"+eno);
	System.out.println("salary:"+sal);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Employee2();
Employee2 emp2=new Employee2(12,"manu",55000);
emp2.display();
	}

}
