package com.techmasters.conditionalstatements;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(<condition>){
		 * 
		 * 	//if body/block;
		 *  		logic 
		 * 
		 * }
		 */
		
		 boolean state=true;
		if(state) {
			System.out.println("if block executed.");
		}
		System.out.println("If block executes onlyfor true scenario");
		int number=44;
		//if block -- logic
		if(number%2==0) {
			//statement
			System.out.print("if expression is true");
			System.out.println("Hence we can expect");
			System.out.print("The result and ");
			System.out.println(number + " is even number.");
		}  
		System.out.println("nested if statement");
		if(true) {
			System.out.println("1st if block");
			if(true) {
				System.out.println("2nd if blcok");
				if(true) {
					System.out.println("3rd if blcok");
					if(true) {
						System.out.println("4th if blcok");
						if(true) {
							System.out.println("5th if blcok");
							if(true) {
								System.out.println("6th if blcok");
								if(true) {
									System.out.println("Nested if blocked accomplished");
								}
								
							}
						}
					}
				}
			}
		 }
		
	System.out.println("if and else block");
		long numb=1750511757051L;
		if(numb%2==0) {
			//if block -- logic resides -- 
			System.out.println("Given expression is true");
			System.out.println("If block");
			System.out.println(numb+" is a even number.");
			
		}else {
			// else block will not take any condition.
			System.out.println("Given expression is false");
			System.out.println("else block");
			System.out.println(numb+" is a odd number.");
			
		}
		int age=32;
		if(age<18) {
			System.out.println("Minor! You're not eligible to vote.");
		}
		// else if block <-- I can take another condition.
		else if(age>=18 && age<=45) {
			System.out.println("adult, You're eligible to vote");
		}
		else if(age>=46 && age<=60) {
			System.out.println("Middle age, You're eligible to vote.");
			
		}
		else if(age >=60 && age<=80) {
			System.out.println("Older age, You're eligible to vote");
		}
		else if(age==100){
			System.out.println("You're a masterpiece, enjoy your life.");
		}
		else {
			System.out.println("thank you very much.");
			System.out.println("your vote was valid these years");
			System.out.println("Please find the place in graveyard");
			System.out.println("Rest in Peace.");
			System.out.println("DOT .");
		}
		byte b=7;
		short st=98;
		int n=89;
		boolean stt=true;
		float f=45.67f;
		double d=987.90;
		long lg=123456790L;
		//dynamic input =====> Scanner class
		// className objectName=new ClassName();
		
		System.out.println("Operation to perform additon.");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int n1=obj.nextInt();
		System.out.println("Enter second number: ");
		int n2=obj.nextInt();
		int res=n1+n2;
		System.out.println("Adding " + n1 + " and " + n2 + " is: " + res);
		obj.close();
	}
}
