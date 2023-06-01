package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	
	public static void locators_Functions() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("John");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("K@123443");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
	}
	
	public static void locatorsXpath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		

		//tagname[@attributename='attributevalue']
		driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
		
		/*  //tagname[text()='Fulltext']       */
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();

	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		locatorsXpath();
	}
	
	
	
	
}
