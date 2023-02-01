package com.java.collections;

import java.util.*;
//import java.util.List;

public class ArrayListExamples {
	public static void main(String args[]) {
	ArrayListExamples bn = new ArrayListExamples();
	bn.setBookNames();
	
	
		
	}
	//instance method or non static method
	public void setBookNames() {
		//creating the list of Books using List Interface and ArrayList class
		List<String> bn = new ArrayList<>();
		bn.add("Java Book");
		bn.add("Spring Book");
		bn.add("Spring Boot");
		bn.add("Spring Rest API Book");
		bn.add("Micro Service Book");
		System.out.println("Books of List object::"+bn);

		
	}

}
