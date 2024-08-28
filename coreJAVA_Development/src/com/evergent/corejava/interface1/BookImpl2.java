package com.evergent.corejava.interface1;

public class BookImpl2 implements Book {
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
	
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			BookImpl2 book1=new BookImpl2();
			book1.bookTitle();
			book1.bookAuthor();
			book1.bookprice();

	}

}
