package com.evergent.corejava.Test1;

public class StringBuilderExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println("Intial string:"+sb);
		sb.append(" world");
		System.out.println("after append:"+sb);
		sb.insert(6, " beautiful ");
		System.out.println("After insert:"+sb);
		sb.replace(0, 5, "hi");
		System.out.println("after replce:"+sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);
		sb.delete(0, 3);
		System.out.println("After delete:"+sb);
		

	}

}
