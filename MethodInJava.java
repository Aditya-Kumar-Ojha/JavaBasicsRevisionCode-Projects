package com.apnacollege;

public class MethodInJava {
	
	public static void printjava()
	{
		System.out.println("Hello Java in Side method");
	}
	 public static void printName(String name) {
		 System.out.println(name);
	 }
	 
	 public static void printSum(int a,int b) {
		 int sum=a+b;
		 System.out.println(sum);
	 }
	public static void main(String[]args) {
		printjava();
		printjava();
		printjava();
		printjava();
		printjava();
		printName("Aditya Kumar Ojha");
		printSum(4,6);
		
	}

}
