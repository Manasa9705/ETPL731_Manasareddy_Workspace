package com.evergent.corejava.studentapplication;

import java.util.ArrayList;

public class BookDAO {
	
	                       //  100  corejava 250   c
	public int addBook(StudentBean bookBean)
	{
		try{
			ArrayList bookList=new ArrayList();
			bookList.add(bookBean.getsId());
			bookList.add(bookBean.getSname());
			bookList.add(bookBean.getMarks());
			bookList.add(bookBean.getGrade());	
			
			System.out.println(bookList);
			
			System.out.println("Book ID :"+bookBean.getsId());
			System.out.println("Book Title :"+bookBean.getSname());
			System.out.println("Book Price :"+bookBean.getMarks());
			System.out.println("Book Grade :"+bookBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
