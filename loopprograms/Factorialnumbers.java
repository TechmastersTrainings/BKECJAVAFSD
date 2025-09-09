package com.techmasters.loopprograms;

import java.util.Scanner;

public class Factorialnumbers {

	public static void main(String[] args) {
		//Dynamic input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		
		int factorial=1;
		
		for(int i=1;i<=num;i++) {
			factorial *=i;
		}
		System.out.println("Factorial of given number: "+factorial);
	}
}