package com.evergent.corejava.Exceptionhandling;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException (String message) {
		super(message);
	}
}
public class UserDefinedExceptionfunds11 {
public static  void withdraw(double amount) throws InsufficientFundsException{
	 double balance=500;
	if(amount>balance) {
		throw new InsufficientFundsException("Insufficient funds for withdrawal");
	}
	else {
		System.out.println("withdrawal successful");
	}
}
	public static void main(String[] args) {
try {
	withdraw(600.00);
}
catch( InsufficientFundsException e) {
	System.out.println("caught InsufficientFundsException:"+e.getMessage());
	System.out.println(e);
}
System.out.println("program continues after handling the exception");
	}
}
