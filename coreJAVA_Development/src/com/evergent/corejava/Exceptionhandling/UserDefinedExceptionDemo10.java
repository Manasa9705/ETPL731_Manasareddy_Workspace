package com.evergent.corejava.Exceptionhandling;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionDemo10 {
	public static void checkAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 (or) older");
		}
		else {
			System.out.println("Access granted");
		}
	}
public static void main(String args[]) {
	try {
		checkAge(11);
		
	}
	catch(InvalidAgeException e) {
		System.out.println("caught the exception:"+e.getMessage());
		System.out.println(e);
	}
}
}
