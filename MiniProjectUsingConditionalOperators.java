/*the price of the pen is 10rs and noteBook price is 40rs take the input from the buyer or ask them how much amount he has based on that
 * tell the user if he is buy pen
 * or he can buy only notebook
 * or he can buy both
 * or he can't buy anything */
package com.apnacollege;

import java.util.Scanner;

public class MiniProjectUsingConditionalOperators {

	public static void main(String[] args) {
		
//		int pen=10;
//		int NoteBook=40;
//		System.out.println("Price of pen:"+pen);
//		System.out.println("Price of NoteBook:"+NoteBook);
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Please tell How much rupee you have");
//		
//		int rupee=sc.nextInt();
//		
//		if(rupee>10 && rupee<40)
//		{
//			System.out.println("User can buy pen Only");
//		}
//		
//		if(rupee>=40) {
//			
//			if(rupee>40 && rupee<50)
//			{
//				System.out.println("User can buy NoteBook only");
//			}
//			if(rupee>=50) {
//				System.out.println("User can buy both Pen & NoteBook");
//			}
//				
//		}
//			else {
//				System.out.println("user can't buy anything");
//			}
/* take the input from the user and print the value using do while loop till user can't provide negative number*/
		
//		Scanner sc=new Scanner(System.in);
//		
//		int number=0;
//		do {
//			
//			System.out.println("Take the input from the user:");
//			number=sc.nextInt();
//			System.out.print("Here is your number:");
//			System.out.println(number);
//		}while(number>=0);
//		
//		System.out.println("THE END");
	/* use of break and continue statement in java*/
		
		int i=0;
		
		while(true)
		{
			if(i==3) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;;
			
			
			if(i>5) {
				break;
			}
		}
		
		}

	}
