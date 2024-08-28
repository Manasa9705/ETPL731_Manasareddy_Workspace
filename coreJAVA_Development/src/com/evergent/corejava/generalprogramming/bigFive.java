package com.evergent.corejava.generalprogramming;

public class bigFive {
public static void main(String args[]) {
	int a=60,b=80,c=70,d=20,e=40;
	if(a>b && a>c && a>d && a>e) {
		System.out.println("a is big");
	}
	else if(b>c && b>d && b>e) {
		System.out.println("b is big");
	}
	else if (c>d && c>e) {
		System.out.println("c is big");
	}
	else {
		System.out.println("d is big");
	}
}
}
