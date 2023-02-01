package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceEx1 {
	public static void main(String[]args) {
		//Using ArrayList
		List<String> al = new ArrayList<>();
		/*al.add("Abhi");
		al.add("Isha");
		al.clear();
		al.add("Janu");
		al.add("krish");
		al.add(0,"Mahi");*/
		
		
		List<String> al1 = new ArrayList<>();
		al1.add("Anu");
		al1.add("Appu");
		al1.add("Veera");
		al1.add("Laskshmi");
		al1.addAll(1,al);
		al1.sort(String.CASE_INSENSITIVE_ORDER);
		

		
		ListIterator<String> itr = al1.listIterator();
		System.out.println("In forward direction ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("In backword direction ");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			System.out.println(al.equals(al1));
			System.out.println(al.isEmpty());
			System.out.println(al1.lastIndexOf("Veera"));

		/*for(String s:al) {
		System.out.println(s);
		
	}
	
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
			al1.forEach(a->{
				System.out.println(a);
				
			});*/

}
}
}

