package com.evergent.corejava.oops;

public class MethodFlow {
	public void display() {
		System.out.println("hello");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public int data(int a,int b) {
		return (a*b);
	}
	public int mydata() {
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow f=new MethodFlow();
		f.display();
		f.add(10, 15);
		int t=f.data(5, 5);
		System.out.println(t);
		int k=f.mydata();
		System.out.println(k);

	}

}
