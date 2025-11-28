package com.inetbanking.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureLinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@text()='10']")).sendKeys("Ramba");
		
//	   List <WebElement>	links=driver.findElements(By.linkText("a"));
//         int count=links.size();
//         System.out.println(count);
//		
//         for(int i=0;i<count;i++)
//         {
//        WebElement	element =links.get(i);
//        String url=element.getAttribute("href");
//        
//         }
	}

}
