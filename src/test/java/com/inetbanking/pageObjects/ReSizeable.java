package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReSizeable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
    Actions act=new Actions(driver);
  //*[@id="resizable"]/div[3]
   WebElement reSizeable=driver.findElement(By.xpath("//*[@id='resizable']"));
    act.moveToElement(reSizeable).dragAndDropBy(reSizeable, 100, 100).build().perform();
    
}
}
