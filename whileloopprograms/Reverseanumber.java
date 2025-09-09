package com.techmasters.whileloopprograms;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int reversed=0;
		System.out.println("Entered number is: "+num);
		//while loop
		while(num!=0) {
			int digit=num%10; // last digit of a number
			reversed=reversed*10+digit; // update the reverse
			num=num/10;// update the number
		}
		sc.close();
		System.out.println("Given number reversed: "+ reversed);

	}

}
