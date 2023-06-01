package com.scanner;

import java.util.Scanner;

public class LogIn {

	
	public LogIn(long password) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your Password");
		String next = ref.next();
		System.out.println("The current user Password:"+next);
	}
	public LogIn(String user) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter your name");
		String next = ref.next();
		System.out.println("The current user name is:"+next);
	}
	
	/**
	 * 1.what are the oops concept?
	 * 2.Difference between Constructor and Method Overloading?
	 * 3.What is Constructor?
	 * 4.Types of Constructor?
	 * 5.In Real scenarion which place constructor will help?
	 * 6.Difference between Abstract class and Interface?
	 * 7.Difference between StaticBinding and  DynmaicBinding?
	 * 8.What is the use of Scanner class?
	 * Its used to get the input user in runtime
	 * 9.Explain Inheritance?
	 * 
	 * 
	 */
	
}
