package com.controlstatement;

import java.util.Scanner;

public class Cale {


	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your Day");
		String day = ref.next();
		switch (day) {
		case "Jan":
			
			System.out.println("first month");
			break;
		case "1":
			System.out.println("first month");
			break;

		default:
			System.out.println("Invalid");
			break;
		}
	}


}
