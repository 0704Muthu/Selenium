package com.controlstatement;

public class PalendromeProgram {

	//121


	public static void main(String[] args) {
		int number=123;
		int temp=number;//temp=reverse
		int reverse=0;

		while(number>0) {
			//121>0-->true
			//12>0-->true
			//1>0-->true
			//0>0-->false
			int reminder=number%10;//reminder
			//121%10=1
			//12%10=2
			//1%10=1
			reverse=reverse*10+reminder;
			//      0*10=0+1=1 
			//	    1*10=10+2=12
			//	    12*10=120+1=121
			number=number/10;//quotient
			//121/10=12
			//12/10=1
			//1/10=0

		}
		System.out.println(number);
		System.out.println(temp);
		System.out.println(reverse);
		
		if (temp==reverse) {
			System.out.println("Its a Palendrome");
		} else {
			System.out.println("Not a Palendrome");
		}

	}

}

