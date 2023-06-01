package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Robot {

	

	private static void moveToElementAction() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demoqa.com/droppable");
		driver.get("https://demoqa.com/dragabble");
		WebElement drag = driver.findElement(By.id("dragBox"));
		//WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		act.dragAndDropBy(drag, 100, 100).perform();
	}
	private static void windowsHandling() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		/**
		 * Mouse action--->In webpage
		 * 
		 * We need Actions class 
		 * 
		 * 	Syntax:
		 * 			Actions reference = new Actions(webdriver);
		 * 
		 * RightClick--->ContextClick(webelement)
		 */

		Actions act = new Actions(driver);
		act.contextClick(mobile).perform();

		/*
		 * Keyborad control
		 * 
		 * Robot class is used control the keyboard options
		 * 
		 * 	Syntax:
		 * 			Robot reference = new Robot();
		 */
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);

		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(electronics).perform();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		WebElement newRelease = driver.findElement(By.xpath("//a[text()='New Releases']"));
		act.contextClick(newRelease).perform();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);

		WebElement deals = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		act.contextClick(deals).perform();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);



	}

	public static void main(String[] args) throws AWTException {
		moveToElementAction();
	}

}
