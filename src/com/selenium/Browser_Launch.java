package com.selenium;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Launch {

	
	
	static String url="https://demoqa.com/";
	
	
	private static void webdriver_Methods() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//up casting
		driver.manage().window().maximize();//Maximize the window
		driver.get("https://www.youtube.com");//Launch the URL
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().to("https://www.instagram.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();//It will close the current tab or window
		driver.quit();//It will close the entire browser
	}
	private static void launch_Browser() {
		/**
		 * Step 1:
		 * System.setProperty(key,value);
		 * key--->webdriver.gecko.driver
		 * value-->chromedriverPath
		 * Step 2:
		 * WebDriver reference = new TypesOfDriver();
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//up casting
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor) driver;//narrowing typecasting
		WebElement china = driver.findElement(By.xpath("//a[text()='China']"));
		js.executeScript("arguments[0].scrollIntoView();", china);
		js.executeScript("arguments[0].click();", china);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(ch);//up casting
		
		driver.get(url);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("(//div[@class=\"card-body\"])[2]")).click();
		
		}
	
}
