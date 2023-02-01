package com.java.enumclass;

public class Student {
	public static void main(String args[]) {
		new Student().getStudentNames();
		
	}
	public void getStudentNames() {
		System.out.println("First student name::"+StudentNames.APARNA);
		System.out.println("Second student name::"+StudentNames.ANUSHA);
		System.out.println("Third student name::"+StudentNames.SHIREESHA);
	}
	}


