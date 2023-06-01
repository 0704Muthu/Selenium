package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	private static void windowsHandling() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act = new Actions(driver);
		act.contextClick(mobile).perform();

		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);

		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(electronics).perform();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		

		

		
		Set<String> allwindowID=driver.getWindowHandles();
		
		for (String singleWindowId : allwindowID) {
			String title2 = driver.switchTo().window(singleWindowId).getTitle();
			System.out.println(title2);
		}
		
		String elec="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		for (String singleWindowId : allwindowID) {
			if(driver.switchTo().window(singleWindowId).getTitle().equals(elec)) {
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Accessories']")).click();
		


	}
	
	public static void main(String[] args) throws AWTException{
		windowsHandling();
	}
}
