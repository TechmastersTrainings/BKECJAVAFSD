package com.techmasters.whileloopprograms;

import java.util.Scanner;

public class Palindromesequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static		
		//int num=123454321;  // 145 <-- 541 
		
		//dynamic
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt(); // 121
		int copy=n; //121
		int reversed=0;
		//Reverse the number using a while loop
		while(n!=0) { // 121 ---> 121 
			int digit=n%10; //121%10===> 1 ; 12%10==> 2 ; 1%10==> 1
			reversed=reversed*10+digit;// 1// 12 ; 120+1==> 121
			n/=10; // n=n/10 // 121/10==> 12 ; 12/10=> 1; 1/10==> 0
		}
		//compare the number and the reversed number
		if(copy==reversed) { // 0==121
			System.out.println(copy + " is a palindrome.");
		}else {
			System.out.println(copy + " is not a palindrome");
		}
		sc.close();
	}
}