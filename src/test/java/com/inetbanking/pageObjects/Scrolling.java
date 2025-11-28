package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	driver.manage().window().maximize();
	
//1)Scroll by using Pixel	
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,10000)");
	
//2)Scroll to particular element	 
	//*[@id="content"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[2]
//   WebElement	indiaFlag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[2]"));
//   System.out.println(indiaFlag);
//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",indiaFlag);
//	
	//3)Scroll to end point
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}

