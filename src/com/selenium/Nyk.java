package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nyk {
	
		public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		WebElement findElement = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(findElement).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Face Wash')])[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
			 String next = iterator.next();
			 driver.switchTo().window(next);
		}
		driver.findElement(By.xpath("(//img[@class='css-11gn9r6'])[1]")).click();
		}
}
