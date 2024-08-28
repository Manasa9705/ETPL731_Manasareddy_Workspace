package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeBean eb=new EmployeeBean();
		eb.setEno(10);
		eb.setEname("manasa");
		eb.setSal(55000.00);
		System.out.println("Employee no:"+eb.getEno());
		System.out.println("Employee name:"+eb.getEname());
		System.out.println("Employee sal:"+eb.getSal());

	}

}
