package com.apnacollege;

public class ExceptionHandInJava {

	public static void main(String[] args) {
		// ExceptionHanding in java
		
		int[] StudentMarks= {97,95,98,99};
		
		try {
		System.out.println(StudentMarks[5]);
		}
		catch(Exception exception) {
			// do something after catching
		}
		
		System.out.println("Hello I am trying to learn exception handing in java");

	}

}
