package com.evergent.corejava.Exceptionhandling;
class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserDefinedCheckedExceptionDemo12 {
public  static void validatescore(int score) {
	if(score<0 || score>100) {
		throw new InvalidScoreException("Score must be b/w 0 & 100");
	}
	else {
		System.out.println("score is valid");
	}
}
	public static void main(String[] args) {
try {
	validatescore(105);
}
catch(InvalidScoreException e) {
	System.out.println("caught the exception :"+e.getMessage());
	System.out.println(e);
}
System.out.println("program continues after handling the exception");
	}
}
