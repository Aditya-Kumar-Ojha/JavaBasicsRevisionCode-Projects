package com.apnacollege;

import java.util.Scanner;

public class MiniProject2 {

	public static void main(String[] args) {
		// Mini Project
		Scanner sc=new Scanner(System.in);
		int MyNumber=(int)(Math.random()*100);
		int UserNumber=0;
		do {
			System.out.println("Guess my number(1-100):");
			 UserNumber=sc.nextInt();
			
			if (UserNumber==MyNumber) {
				System.out.println("WOOHOO.....COrrect Number!!");
				break;
			}
			else if (UserNumber>MyNumber) {
				System.out.println("you number is too Large");
				
			}
			else {
				System.out.println("your Number is too small");
			}
		} while(UserNumber>=0);
		
		System.out.print("My Number was :" + MyNumber);
		System.out.println(" ");

	}

}
