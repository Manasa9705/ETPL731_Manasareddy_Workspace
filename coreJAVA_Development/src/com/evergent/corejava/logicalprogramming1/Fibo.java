package com.evergent.corejava.logicalprogramming1;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		System.out.println(n1+","+n2);
		int n3=0;
		for(int i=2;i<10;i++) {
			
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
