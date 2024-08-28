package com.evergent.corejava.Abstract1;

public class StudentData  extends Student{
	public void studentInfo() {
		System.out.println("student address");
	}
	 public void branch() {
		 System.out.println("cse");
	 }
	 public void show() {
		 System.out.println("local method");
	 }
	public static void main(String[] args) {
		StudentData s1=new StudentData();
		s1.branch();
		s1.stuId();
		s1.details();
		s1.studentInfo();
		
		
	}

}
