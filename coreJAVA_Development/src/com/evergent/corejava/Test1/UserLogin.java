package com.evergent.corejava.Test1;

public class UserLogin {
	public void logindetails() {
		System.out.println("login info");
	}
	public void logindetails(String uname,String pass) {
		System.out.println("Username:"+uname);
		System.out.println("Password"+pass);
	}
	public void logindetails(String uname,String pass,String capcha) {
		System.out.println("username:"+uname);
		System.out.println("Password:"+pass);
		System.out.println("Capcha:"+capcha);
	}
	public void logindetails(int mobile,String pass) {
		System.out.println("Mobile:"+mobile);
		System.out.println("Password:"+pass);
		
	}
	public void show() {
		System.out.println("method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin u=new UserLogin();
		u.logindetails();
		u.logindetails("anu", "a123");
		u.logindetails("raji", "a123", "yu65in");
		u.logindetails(98076543, "mnsihdffg");
		u.show();

	}

}
;