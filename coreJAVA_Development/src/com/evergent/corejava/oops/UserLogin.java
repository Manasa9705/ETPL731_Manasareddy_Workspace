package com.evergent.corejava.oops;

public class UserLogin {
	public void loginData() {
		System.out.println("user info");
	}
	public void loginData(String name,String pass) {
		System.out.println("Name:"+name);
		System.out.println("password"+pass);
	}
	public void loginData(String name,String pass,String capcha) {
		System.out.println("Name:"+name);
		System.out.println("password"+pass);
		System.out.println("capcha"+capcha);
	}
	public void loginData(int mobile,String name) {
		System.out.println("number"+mobile);
		System.out.println("Name:"+name);
	}
	public void show() {
		System.out.println("show method");
	}
	public static void main(String args[]) {
		UserLogin u=new UserLogin();
		u.loginData();
		u.loginData("manu", "num");
		u.loginData("anu", "anu22", "xyz");
		u.loginData(987, "raji");
		u.show();
	}

}
