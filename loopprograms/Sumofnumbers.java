package com.techmasters.loopprograms;

public class Sumofnumbers {

	public static void main(String[] args) {
		int sum=1;
		for(int i=2; i<=10; i++) {
			//sum=sum-i; // 0+0 = sum= 0;
			 sum -=i; // sum +=i;
			/*
			 * sum=10 ; i=10;
			 * sum=i-sum;
			 * sum=10-10==> 0   i=10 ; 10--==>9
			 * sum=9-0===9; i=9; 9--===> 8
			 * sum=8-9==> -1; 8--==> 7;
			 * sum=7-(-1) ==> 8 ; i==7 ; 7--; 6
			 * sum=6-8 ==> -2 ; i=6; 6--; 5;
			 * sum=5-(2) ==> 7; i==5; 5---; 4
			 * sum=4-7=-3 ; i==4; 4--; 3
			 * sum=3-(-3)=6; i=3; 3--; 2
			 * sum=2-6=-4; i=2; 2--; 1
			 * sum 1-(-4) ==> 5 
			 * 
			 */
		}
		System.out.println(sum);
		}

}
