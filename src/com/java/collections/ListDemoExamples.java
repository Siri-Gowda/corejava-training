package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemoExamples {
	public static void main(String args[]) {
		new ListDemoExamples().printlistOfName();
		new ListDemoExamples().getListOfNames();
	}
	//instance method
	public void printlistOfName() {
		List<String> listOfName= new ArrayList<>();
		listOfName.add("Veera");
		listOfName.add("Lakshmi");
		listOfName.add("Aparna");
		System.out.println("listOfName::"+listOfName);
		
	}
	public void getListOfNames() {
		List<String> listOfName = new ArrayList<>();
		listOfName.add("Shireesha");
		listOfName.add("Anusha");
		System.out.println("listOfName::"+listOfName);
	}

}
