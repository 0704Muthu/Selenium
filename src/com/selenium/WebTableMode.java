package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableMode {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		//String l = driver.findElement(By.xpath("(//table)[1]")).getText();
		//System.out.println(l);

		//Print Header
		//String l = driver.findElement(By.xpath("(//table)[1]//thead")).getText();
		//System.out.println(l);

		/*
		 * Print a Particular column header in a row
		 */
		//		String l = driver.findElement(By.xpath("(//table)[1]//thead//tr/th[8]")).getText();
		//		System.out.println(l);

		/*
		 * Print a Particular row data
		 */
//		String l = driver.findElement(By.xpath("((//table)[1]//tbody//tr)[7]")).getText();
//		System.out.println(l);
		driver.findElement(By.cssSelector("[href=\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\"]")).click();

	}
}
