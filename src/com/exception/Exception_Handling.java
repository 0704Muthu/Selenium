package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) throws FileNotFoundException {
	
//		File ref = new File("\"C:\\DocumentsBackUp\\Excersise1.txt\"");
//		FileReader f = new FileReader(ref);
		String a = "123";
		System.out.println(a);
		throw new RuntimeException();
	}

	
	
	
	
	
}
