package com.evergent.corejava.immutable;

public final class Personimmutable {
private final String name;
 private final int age;
Personimmutable(String name,int age){
	this.name=name;
	this.age=age;
}
public String myName() {
	return name;
}
public int myAge() {
	return age;
}

}
