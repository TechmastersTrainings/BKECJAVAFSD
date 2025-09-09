package com.techmasters.whileloopprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n<=1) {
			isPrime=false;
		}else {
			int i=2;
			while(i*i<=n && isPrime) {
				if(n%i==0) {
					isPrime=false;
			}
			i++;
			}
		}
		System.out.println(n + (isPrime?" is Prime ":" not prime"));
	}
}