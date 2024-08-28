package com.evergent.corejava.Exceptionhandling;

public class Myoutofmemory {

	public static void main(String[] args) throws Exception {
		Integer[] array=new Integer[10000*10000];
		System.out.println(array);
	}
}
