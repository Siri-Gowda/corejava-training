package com.java.enumclass;

public class EnumDemo {
	public static void main(String args[]) {
		new EnumDemo().getWeekDetails();
		EnumDemo emDemo=new EnumDemo();
		emDemo.checkEnumMethodDetails();
		
	}
	public void getWeekDetails() {
		System.out.println("First day in the week::"+Week.MONDAY);
		System.out.println("Second day in the week::"+Week.TUESDAY);
		System.out.println("Third day in the week::"+Week.WEDNESDAY);
		System.out.println("Fourth day in the week::"+Week.THURSDAY);
		System.out.println("Fifth day in the week::"+Week.FRIDAY);
		System.out.println("Sixth the day in the week::"+Week.SATURDAY);
		System.out.println("Seventh day in the week::"+Week.SUNDAY);
	}
	public void checkEnumMethodDetails() {
		System.out.println("ValueOf Method::"+Week.valueOf("TUESDAY"));
	

	}
	}
	
	
	


