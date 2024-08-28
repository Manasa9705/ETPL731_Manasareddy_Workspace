package com.evergent.corejava.interface1;

public class BookImpl3 implements Book ,NewBook{
	public void bookTitle() {
		System.out.println("core JAVA");
	}
	public void bookAuthor() {
		System.out.println("oracle crop:"+cname);
	}
	public void bookprice()
	{
		System.out.println("Rs 550");
	}
	public void show() {
		System.out.println("local method");
	}
	public void mynewbook() {
		System.out.println("new book info");
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			BookImpl3 book1=new BookImpl3();
			book1.bookTitle();
			book1.bookAuthor();
			book1.bookprice();
		//	book1.show();
			book1.mynewbook();
	}
}
