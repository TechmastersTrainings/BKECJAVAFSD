package com.techmasters.operators.coreprogramming;

public class Operators {

	public static void main(String[] args) {
		//operators
		/* int number1=89;
		int number2=56;
		//addition : +
		int add=number1+number2; //89 + 56 ==> 145
		System.out.println("adding 89 and 56 is : " + add);
		int add1=number2+number1;
		System.out.println("adding 56 and 89 is : " + add1);
		int sub=number1-number2;
		System.out.println("Subtracting 89 and 56 is : " + sub);
		int sub1=number2-number1;
		System.out.println("Subtracting 56 and 89 is : " + sub1);
		int mul=number1*number2;
		System.out.println("multiplying 89 and 56 is : " + mul);
		int mul1=number2*number1;
		System.out.println("multiplying 56 and 89 is : " + mul1);
		float num1=10; // 10.0
		float num2=2; // 2.0  10.0/2.0 == 5.0
		float divide=num1/num2;
		System.out.println("dividing 10 with 2 is : " + divide);
		int value1=6;
		int value2=8;
		float div=value1/value2;
		System.out.println(div);
		int value3=16;
		int value4=78;
		double divid=value1/value2;
		System.out.println(divid);
		
		System.out.println("Relational Operator/Comparision");
		// equals to ==
		
		int a=9; int b=6;
		// relation operators will always  
		//gives an output in terms of boolean passion.
		
		// boolean statement1=true;
		// boolean statement2=false;
	
	/// a=9 b=6
		System.out.println(a==b); // 9==6 : false
		System.out.println(a!=b); // 9!=6 : true
		System.out.println(a<b); // 9<6 : false
		System.out.println(a>b); // 9>6 : true
		System.out.println(a<=b); // 9<=6 : false
		System.out.println(a>=b); // 9>=6 > true
		
		byte number=127; // -128--0--127
		short n=32767; // -32768 -- 0 -- 32767
		int nu=1234567891;
		
		int n1=564; 
		System.out.println(n1);
		n1=89; 
		System.out.println(n1);
		n1=n1+n1;
		System.out.println(n1);
		int n2;
		n2=n1+n1+n1;
		System.out.println(n2);
		int n3;
		n3=n2+n1;
		System.out.println(n3);
		n3=n1-n2+n3-n2-n1+n3;
		System.out.println(n3);
		System.out.println("==================");
		System.out.println("Logical Operator");
		
		boolean state1=true;
		boolean state2=false;
		System.out.println("Logical AND: true && false =>"+(state1&&state2));
		boolean state3=false;
		boolean state4=true;
		System.out.println("Logical AND: flase && true =>"+(state3&&state4));
		boolean state5=false;
		boolean state6=false;
		System.out.println("Logical AND: false && false =>"+(state5&&state6));
		boolean state7=true;
		boolean state8=true;
		System.out.println("Logical AND: true && true => "+(state7&&state8));
		
		int h=56; int g=78;
		boolean result=((h==g) && (h<g));
		System.out.println("Logical operator with realational operator "+result);
	
		System.out.println("LOGICAL OR operator ||");
		boolean st=false;
		boolean st1=true;
		System.out.println(st || st1);
		boolean st2=true;
		boolean st3=false;
		System.out.println(st2 || st3);
		boolean st4=true;
		boolean st5=true;
		System.out.println(st4 || st5);
		boolean st6=false;
		boolean st7=false;
		System.out.println(st6 || st7);
		System.out.println(st1||st7);
		System.out.println(st2||st5);
		System.out.println(!st3||st2);
		  
		int c=6; int d=7;
		boolean expression=((c==d)||(d<c));
		System.out.println(expression);
		
		boolean check=false;
		System.out.println(!(check));
		int i=23;
		int check1 = 45;
		System.out.println(check1!=56 || i!=23 && i==23 || check1!=56);
		System.out.println(!check);//!false == true
		
		System.out.println("bitswie operator");
		/*
		 * 1. Bitwise and operator -- &
		 * 2. Bitwise or operator  -- |
		 * 3. Bitwise not operator ~
		 * 4. Bitwise left shift <<
		 * 5. bitwise right shift >>
		 */
		/* int x=10; // 00001010
		System.out.println(x<<2);
		System.out.println(x<<3);
		System.out.println(x<<4);
		System.out.println(x<<1);
		System.out.println("Right shift");
		System.out.println(x>>2);// 00001010 >> 2
		System.out.println(x>>3);
		System.out.println(x>>4);
		System.out.println(x>>1); */
		
		// Assignment Operator : =
				/*+=
				-=
				*=
				/=
				%=
				*/
		int num=5;
		num +=9; // num=num+9;
				//	num=5+9;
			//	num=14;
		num -=5;
		// num=num-5
		// num = 14-5 ===> 9
		num *=3;// num=num*3
		num/=27;//num=num/27
		num %=27;//num=num%27
		
		System.out.println(num);
		
		System.out.println("Ternary Operator");
		
		//d.t variable = experession1 ? statement1:statement2;
		
		int exp1=5;
		int exp2=9;
		
		int max =(exp1>exp2)? exp1:exp2;
		System.out.println("between 5 and 9, max  is: "+max);
		int min =(exp1<exp2)? exp1:exp2;
		System.out.println("between 5 and 9, min  is: "+min);
		
		int res=(exp1<exp2)?(exp1*exp2):(exp1-exp2);
		res=(exp1>exp2)?(exp1*exp2):(exp1-exp2);
		System.out.println(res);
		res=(exp1<=exp2)?(exp1+exp2):(3%exp2);
		System.out.println(res);
		res=(exp1>=exp2)?(exp1/exp2):(exp1%exp2);
		System.out.println(res);
		res=(exp1!=exp2)?(exp1*23):(exp1-5);
		System.out.println(res);
	
	
	
	
	}
}