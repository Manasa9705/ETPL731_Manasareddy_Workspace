package com.evergent.corejava.Exceptionhandling;

public class StackOverflowErrorExample {
public static void recursivemethod() {
	recursivemethod();
}
	public static void main(String[] args) {
try {
	recursivemethod();
}
catch(StackOverflowError e) {
	System.out.println("StackOverFlow Error caught :"+e.getMessage());
}
	}
}
