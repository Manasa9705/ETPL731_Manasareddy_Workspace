package com.evergent.corejava.Strings;

public class StringBuilderExample2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		System.out.println("Initial string:"+sb);
		sb.append(" world");
		System.out.println("After append:"+sb);
		sb.insert(6, " beautiful ");
		System.out.println("After insert:"+sb);
		sb.replace(0, 5, " hi");
		System.out.println("after replace:"+sb);
		sb.delete(0, 3);
		System.out.println("after delete:"+sb);
		sb.reverse();
		System.out.println("after reverse");
		System.out.println("capacity"+sb.capacity());
		System.out.println("Length:"+sb.length());
		
	}
}
