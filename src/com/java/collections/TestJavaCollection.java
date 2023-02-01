package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection {
	public static void main(String args[]) {
		LinkedList<String> al=new LinkedList<>();
		al.add("Deekshi");
		al.add("Gagan");
		al.add("Appu");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		
	}

}
