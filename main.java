package com.apnacollege;

public class main {

	public static void main(String[] args) 
	{
		// there are two type of data type in java one is primitive and other is non primitive
		// primitive data type
		//byte,boolean -1 byte[-128 to 127],
		//short,char -2 byte,
		//int,float-4 byte,
		//long,double-8bye,
		byte age=30;
		int phone=1234567890;
		long phone2=12345678900L;
		float pi=3.14F;
		char letter='@';
		boolean isAdult=false;
		
		System.out.println("Hello Java I am learning please help me to remember");
	    System.out.println("Hello world");
	    System.out.println("Hello Java");
	    System.out.println(age);
	    System.out.println(phone);
	    System.out.println(phone2);
	    System.out.println(pi);
	    System.out.println(letter);
	    System.out.println(isAdult);
	    
	 // Non-primitive data type
	    String name ="Aditya kumar Ojha";
	    String name1=new String("Aditya");
	    String friend=new String("Pritam");
	    System.out.println(name);
	    System.out.println(name1);
	    System.out.println(friend);
	    //Strings Operation
	    //concatenate
	    String FirstName="Aditya";
	    String MiddleName=" Kumar";
	    String LastName=" Ojha";
	    String FullName=FirstName+MiddleName+LastName+" And Father Name: Baliram Ojha";
	    System.out.println(FullName);
	    
	    //length of the string 
	    
	    
	    //charAt
	    String FullName1="Aditya Kumar Ojha";
	    System.out.println(FullName1.charAt(15));
	    //.length()
	    System.out.println(FullName1.length());
	    //replace
	    String name2="Aditya";
	    String NewName=name2.replace('a', 'b');
	    System.out.println(NewName);
	    //substring
	    String name3="Aditya and Pritam";
	    System.out.println(name3.substring(0, 6));
	    

	} 

}
