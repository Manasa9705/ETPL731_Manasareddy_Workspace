package com.evergent.corejava.final1;
//final variable cannot be modified
public class FinalDemo1 {
final String cname="India";
public void myData() {
	//cname="australi";
	System.out.println(cname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalDemo1 fd=new FinalDemo1();
fd.myData();
	}

}
