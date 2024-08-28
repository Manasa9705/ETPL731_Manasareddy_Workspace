package com.evergent.corejava.Test1;

public class BookImpl3 implements Book,Newbook {
public void bookTitle() {
	System.out.println("core java");
}
public void bookAuthor() {
	System.out.println("oracle ");
}
public void bookPrice() {
	System.out.println("rs 550");
}
public void mynewbook() {
	System.out.println("book data");
}
public void show() {
	System.out.println("local method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl3 book=new BookImpl3();
		book.bookAuthor();
		book.bookPrice();
		book.bookTitle();
		book.mynewbook();
		book.show();

	}

}
