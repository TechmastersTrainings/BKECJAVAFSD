package com.techmasters.loops.coreprogramming;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * there are three types of loops in the java
		 * 1. for loop
		 * 2. while loop
		 * 3. do while loop.
		 * 
		 */
	
		// Unary Operator : 
		//1.  pre increment and post increment
		// 2. pre decement and post decrement. 
		
	/*	int i=0;
		++i; // pre increment   ---> ++0 --> 1
		i++; // post increment.  --> ++1  --> 2
		System.out.println(i);
		i++; // 2++ = 3
		i++; // 3++= 4
		System.out.println(i);
		++i; //5
		++i; //6
		++i; //7
		System.out.println(i);
		System.out.println(+i);
		System.out.println(++i); //8 
		System.out.println("--------------------");
		System.out.println(i++);// 8++ ==> 9
		System.out.println(i);
		System.out.println(++i); // 10
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println("-------------------");
		System.out.println(i);
		System.out.println(i--); // 14-- : 13
		System.out.println(--i); //  12
		System.out.println(i++); // 12++ 
		System.out.println(i); // 13
		System.out.println(--i);
		System.out.println(--i);
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i);
		
		
		System.out.println("---------------"); */
		
		
		/*for(Initialization;condition;unaryOpeator  ++/--) {
		
		//for loop body.
	} */
			//step1   step2  step4
 		for(int i=0;i<=10;i++) {
 			
 			//step 3
 			System.out.println(i); // 0 // 1
			//for loop body.
		}
 		System.out.println("--------------");
 		for(int i=1;i<10;i++) {
 			
 			//step 3
 			System.out.println(i); // 0 // 1
			//for loop body.
		}
		System.out.println("Even numbers from 1 to 50");
 		for(int i=1;i<=25;i++) {
 			if(i%2==0) {
 				System.out.print(i + " ");
 			}
		}
 		System.out.println(); // newline
 		System.out.println("Odd number from 1 to 50");
 		for(int i=1;i<=25;i++) {
 			if(i%2==1) {
 				System.out.print(i + " ");
 			}
 		}
	}

}
