package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Frame {

	
	private  static void alert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.id("alertButton")).click();
//		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		
//		driver.findElement(By.id("confirmButton")).click();
//		driver.switchTo().alert().dismiss();
		
//		driver.findElement(By.id("promtButton")).click();
//		driver.switchTo().alert().sendKeys("Today");
//		driver.switchTo().alert().accept();
//		
		
	}
	//wait
	private static void frame() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
//		driver.switchTo().frame(1);
//		String frame1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
//		System.out.println(frame1);
//		
//		driver.switchTo().frame(0);
//		String frame2 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
//		System.out.println(frame2);
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		frame();
	}
	
}
