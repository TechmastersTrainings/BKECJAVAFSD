package com.techmasters.whileloopprograms;

public class Nestedwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		//loop
		while(i<=10) {
			//inner loop 
			int j=1;
			while(j<=15) {
				System.out.print(i*j+ " ");
				j++;
			}
			System.out.println();//nextline
			i++;
		}
	}
}
