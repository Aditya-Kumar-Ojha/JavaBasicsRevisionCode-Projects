package com.apnacollege;

import java.util.Scanner;

public class TakeInputInJava {

	public static void main(String[] args) {
		// take input from user
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Input your Friend Name");
		String FriendName=sc.nextLine();
		System.out.println(FriendName);
		
		
		System.out.println("Input your AdityaAge:");
		
		int AdityaAge=sc.nextInt();
		
		System.out.println(AdityaAge);
		
		System.out.println("Input your AdityaName:");
		
		String AdityaName=sc.next();
		
		System.out.println(AdityaName);
		
		
		System.out.println("Input your pritamAge:");
		float pritamAge=sc.nextFloat();
		System.out.println(pritamAge);
		
		System.out.println("Input your Friend Name");
		String PritamName=sc.next();
		System.out.println(PritamName);
		
		

	}

}
