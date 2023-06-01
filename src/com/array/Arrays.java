package com.array;

import java.util.Scanner;

public class Arrays {

	
	/**
	 * Array--->Symbol--->[]-->Non Primtive Data Types
	 * Its Support group of values
	 * Array has two types 
	 * Array Index Based
	 * Index starts with 0
	 * Index=length-1
	 * Syntax:
	 * Datatype[] ref = new Datatype[length];
	 * 1.Single Dimensional
	 * 2.Multi Dimensional
	 */
	
	private static void singleDimensional() {
		int[] a= {10,20};
		//a[10,20]
		//length  2
		//Index=1
		//         0  1
		System.out.println(a[1]);
		int[] ref = new int[3];
		ref[0]=10;
		ref[1]=20;
		ref[2]=30;
		System.out.println(ref[3]);
		
	}
	private static void multiDimensional() {
		int[][] ref = new int[2][2];
		//                 0,1   0,1
		//                   row column
		ref[0][0]=20;
		ref[0][1]=50;
		ref[1][0]=500;
		ref[1][1]=120;
		System.out.println(ref[1][0]);
	}
	public static void main(String[] args) {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your name");
		char charAt = ref.next().charAt(3);
		System.out.println(charAt);
	}
	
	
}
