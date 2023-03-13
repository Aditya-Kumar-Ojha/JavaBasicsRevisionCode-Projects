package com.apnacollege;

public class CastingInJava {

	public static void main(String[] args) {
		// casting in java is two type one is implicit casting and second is explicit casting
		//implicit casting 
		double price=100.00;
		double finalprice=price+18;
		
		System.out.println(finalprice);
		
		int p=100;
		int fp=(int) (p+18.00);
		int fp1=p+(int)18.99;
		System.out.println(fp);
		System.out.println(fp1);
		
		//constants
		
		final float PI=3.14F;
//		 PI=1.1F;
		System.out.println(PI);

	}

}
