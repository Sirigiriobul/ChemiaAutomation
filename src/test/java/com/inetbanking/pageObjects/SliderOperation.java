package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
    Actions act=new Actions(driver);
	WebElement slider=driver.findElement(By.xpath("//*[@id='slider']"));
	act.moveToElement(slider).dragAndDropBy(slider, 20, 0).build().perform();
	
	
	
}
}
