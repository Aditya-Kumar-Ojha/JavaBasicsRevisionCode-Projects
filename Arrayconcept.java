package com.apnacollege;

import java.util.Arrays;

public class Arrayconcept {


	public static void main(String[] args) {
		
		//array initialization;
		int[] marks=new int[5];
		marks[0]=98;
		marks[1]=97;
		marks[2]=93;
		marks[3]=95;
		marks[4]=96;
		
		int [] physics= {16,15,13,14,10,9};
		
		for(int i=0;i<=5;i++)
		{
			System.out.print(physics[i]+" ");
		}
		System.out.println("");
		System.out.println(marks[2]);
		System.out.println(physics[0]);
		System.out.println(physics[1]);
		//length of array
		System.out.println(physics.length);
		//Shorting in array
		
		Arrays.sort(physics);
		
		for(int i=0;i<=5;i++)
		{
			System.out.print(physics[i]+" ");
		}
		System.out.println();
	//2-D array
		int [][]Studentmarks= {{95,99,98,96,92,94},{92,99,97,91,90,99}};
		
//		System.out.print(Studentmarks[0][0]+" ");
//		System.out.print(Studentmarks[0][1]+" ");
//		System.out.print(Studentmarks[0][2]+" ");
//		System.out.print(Studentmarks[0][3]+" ");
//		System.out.print(Studentmarks[0][4]+" ");
//		System.out.print(Studentmarks[0][5]+" ");
//		
//		System.out.println();
//		
//		System.out.print(Studentmarks[1][0]+" ");
//		System.out.print(Studentmarks[1][1]+" ");
//		System.out.print(Studentmarks[1][2]+" ");
//		System.out.print(Studentmarks[1][3]+" ");
//		System.out.print(Studentmarks[1][4]+" ");
//		System.out.print(Studentmarks[1][5]+" ");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print(Studentmarks[i][j]+" ");
			}
		}
	}

}
