package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebelement {

	
	private static void findeElements() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Mobiles")).click();
		WebElement oneplus = driver.findElement(By.linkText("OnePlus"));
		oneplus.click();
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		
		//get ALL Title from The Webelemets
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
		//Store a Particular Title in String
		String charger="OnePlus Warp Charge Type-C Cable (100cm, Red)";
		
		//Select Paticular Webelement
		for (WebElement webElement : findElements) {
			if(webElement.getText().equals(charger)) {
				webElement.click();
			}
		}
	}
	
	public static void main(String[] args) {
		findeElements();
	}
	
	
}
