package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {


	/**
	 * TakesScreenShot ----->Interface class
	 * we need the connect the takesscreenshot in to webdriver
	 * 
	 * TakesScreenshot ts=driver;
	 * @throws IOException 
	 */


	private static void captureScreenShot(String name)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		TakesScreenshot ts =(TakesScreenshot) driver;//narrowing type casting
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\Screenshot\\"+name+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}





	public static void main(String[] args)  {
		ScreenShot ref = new ScreenShot();
		System.out.println(ref instanceof ScreenShot);
	}



}
