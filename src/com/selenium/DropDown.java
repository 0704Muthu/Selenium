package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	private static void singleDropdown() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement categories = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
	
		/**
		 * 
		 * Select ----->pre definded class----->Selenium
		 * 
		 * Its used to handle the dropdowns
		 * 
		 * Syntax:
		 * 			Select reference = new Select(webelement);
		 * 
		 * 
		 * SelectByValue
		 * SelectByIndex
		 * SelectByVisibleText
		 * 
		 * getOptions()--->get All elements size,text--->Return type is List<Webelement>
		 * 
		 * isMultiple()--->Return type is boolean(only worked in multiple dropdown)
		 * 
		 * getAllSelectedOptions()--->Return type is List<Webelement>(only worked in multiple dropdown)
		 * 
		 * 
		 * getFirstSelectedOption()--->Return type is Webelement
		 * 
		 */
	
		Select select = new Select(categories);
		select.selectByValue("search-alias=baby");
		
		select.selectByVisibleText("Computers & Accessories");
		
	
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

	private static void multipleDropdown() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmuth\\eclipse-workspace\\Sele7PM\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.id("cars"));
	
		
		Select drop = new Select(cars);
		drop.selectByVisibleText("Volvo");
		drop.selectByValue("saab");
		
		boolean multiple = drop.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> allSelectedOptions = drop.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
	}
	public static void main(String[] args) {
		multipleDropdown();
	}

}
