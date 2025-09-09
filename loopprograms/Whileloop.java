package com.techmasters.loopprograms;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization
		int i=1;
		while(i<=5) {
			System.out.println(i);
			//unary 
			i++;
		}
		System.out.println("-----------1st while loop--------------");
		int num=1;
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		System.out.println("---------2nd while loop----------------");
		int dig=5;
		while(dig<=15) {
			System.out.println(dig);
			dig++;
		}
		System.out.println("-----------3rd while loop--------------");
		int digit=1;
		while(digit<10) {
			System.out.println(digit);
			digit++;
		}
		
		int even=1;
		while(even<=50) {
			if(even%2!=1) {
				System.out.print(even+" ");
			}
			even++;
		}

	}

}
