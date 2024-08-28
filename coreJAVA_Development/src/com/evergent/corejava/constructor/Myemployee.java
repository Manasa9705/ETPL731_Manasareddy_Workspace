package com.evergent.corejava.constructor;
class employee6{
	int eno;
	employee6(){
	}
	
		employee6(int eno){
	
		System.out.println("employee:"+eno);
	}
}
public class Myemployee extends employee6 {
	String name;
	double sal;
	Myemployee(){
		
	}
Myemployee(int eno,String name,double sal){
	super(eno);
	this.name=name;
	this.sal=sal;
	this.eno=eno;
}
public void display() {
	System.out.println("employee no:"+eno);
	System.out.println("employee name:"+name);
	System.out.println("employee sal:"+sal);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myemployee my=new Myemployee(123,"anu",550000);
		my.display();

	}

}
