package com.evergent.corejava.interface1;
//4.If any class implements  interface the class should 
//override all interface methods otherwise the class will
//be showing compile time error
public class BookImpl implements Book {
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
		public static void main(String[] args) {
			Book book1=new BookImpl();
			book1.bookTitle();
			book1.bookAuthor();
			book1.bookprice();
		//	book1.show();
	}
}
