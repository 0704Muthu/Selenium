package com.controlstatement;

import java.util.Scanner;

public class Selection {



	private static void verify() {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your age");
		byte age = ref.nextByte();
		//True or false
		if(age>=18) {
			System.out.println("He is eligible to buy a movie ticket");	
		}
		else {
			System.out.println("He is not eligible to watch movie");

		}

	}



	private static void armySelection() {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your age");
		byte age = ref.nextByte();

		if (age!=18) {
			System.out.println("He is eligible to check height");
			System.out.println("Enter your height");
			float height = ref.nextFloat();
			if (height>=168.00) {
				System.out.println("you'r eligible to check weight");	
			} else {
				System.out.println("you'r not eligible to check weight");
			}

		} else {
			System.out.println("you'r not eligible");

		}
	}




	public static void main(String[] args) {
		String i="valid";

		while(!i.equals("valid")) {
			Scanner re = new Scanner(System.in);
			System.out.println("Enter the word");
			String wor = re.next();
			if (wor.equals("mob")) {
				System.out.println("cons");	
			}
			
		}

	}






}
