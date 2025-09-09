package com.techmasters.whileloopprograms;

import java.util.Scanner;

public class Factorialofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int factorial=1;
		//loop
		int i=1;
		while(i<=num) {
			factorial*=i;
			i++;
		}
		sc.close();
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
