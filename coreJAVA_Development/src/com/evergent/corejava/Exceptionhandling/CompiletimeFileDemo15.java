package com.evergent.corejava.Exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CompiletimeFileDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File file=new File("c:/mydata/myd.txt");
	Scanner sc=new Scanner(file);
	while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
}
catch(FileNotFoundException e) {
	System.out.println("file not found:"+e.getMessage());
	e.printStackTrace();
	}
	}
}
