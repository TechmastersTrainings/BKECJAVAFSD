package com.techmasters.loopprograms;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//system input 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		// System input in terms of integer.
		int num=sc.nextInt(); //12345, 34567, 87,098,34567,98765
		System.out.println("Given number : "+ num);
		int reversed=0;
		// num=456 ==> 654
		// 
		for(int i=0; num!=0;i++) {
			int digit=num%10;  // 456%10==> 6; 45%10=> 5; 4%10=> 4
			num=num/10; // 456/10=> 45 // 45/10==> 4 ; 4/10=> 0
			reversed= reversed*10+digit; //0+6=> 6 // 65; ; 650+4=654
	}
		
		
		System.out.println("Reversed order: " + reversed);


	}
}