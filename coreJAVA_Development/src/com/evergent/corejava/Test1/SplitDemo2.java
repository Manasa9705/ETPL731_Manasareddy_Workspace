package com.evergent.corejava.Test1;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is a powerful programming language";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
			
		}
		for(String w:words) {
			System.out.println(w);
		}

	}

}
