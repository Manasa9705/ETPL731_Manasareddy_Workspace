package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double sal;
Employee5(int eno){
	this.eno=eno;
}
Employee5(int eno,String name ,double sal1 ){
	this(eno);
	this.ename=name;
	this.sal=sal1;
	
}
public void display() {
	System.out.println("employee name:"+ename);
	System.out.println("employee no:"+eno);
	System.out.println("salary:"+sal);
}
		// TODO Auto-generated method stub





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 emp2=new Employee5(12,"manu",55000);
		emp2.display();
			}
	}


