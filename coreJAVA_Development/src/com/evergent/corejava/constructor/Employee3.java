package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
Employee3(){
	System.out.println("Default constructor");
}
Employee3(int no,String name ,double sal1 ){
	this.eno=no;
	this.ename=name;
	this.sal=sal1;
	
}
public void display() {
	System.out.println("employee name:"+ename);
	System.out.println("employee no:"+eno);
	System.out.println("salary:"+sal);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Employee3();
Employee3 emp2=new Employee3(12,"manu",55000);
emp2.display();
	}

}
