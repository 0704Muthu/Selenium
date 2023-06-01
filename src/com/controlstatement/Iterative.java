package com.controlstatement;

public class Iterative {

	/**
	 * 
	 * 
	 */
	/**
	 * int i=0    --->Intialization
	 * i<=10;       -->Condition checking
	 * i++,i--  =====>Increment.decrement
	 */
	public static void main(String[] args) {
		
		
		//ForEach
		
		for (int i = 1; i <=3; i++) {
			for (int j = 3; j >=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	//1
	//12
	//121
	
	//54321
	//5432
	//543
	//54
	//5
	
	
	
}
