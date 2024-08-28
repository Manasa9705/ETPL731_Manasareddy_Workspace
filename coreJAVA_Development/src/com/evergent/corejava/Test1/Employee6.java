package com.evergent.corejava.Test1;
class employee{
	int eno;
	employee()
	{
		
	}
	employee(int eno){
		this.eno=eno;
		System.out.println("Employee no:"+eno);
		
		
	}
}
public class Employee6  extends employee{
	String name;
	double sal;
	Employee6(){
		System.out.println("Default cnostructor");
	}

	Employee6( int eno,String name,double sal){
		super(eno);
		this.name=name;
		this.sal=sal;
		
		
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("salary:"+sal);
	}
	
	public static void main(String[] args) {
		new Employee6();
		Employee6 e6=new Employee6(1243,"manu",60000);
		e6.display();

	}

}
