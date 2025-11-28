package com.inetbanking.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingPractice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions act=new Actions(driver);
	WebElement name=driver.findElement(By.id("name"));
	   name.sendKeys("Sirigiri Obulesh");
    WebElement emailAddress=driver.findElement(By.id("email"));
	   emailAddress.sendKeys("obul123@gmail.com");
    WebElement phoneNumber=driver.findElement(By.id("phone"));
       phoneNumber.sendKeys("8309771493");
    WebElement address=driver.findElement(By.id("textarea"));   
       address.sendKeys("Flat No.103, Shangrila Plaza, Banjara Hills, Pincode:-500036");
    WebElement gender=driver.findElement(By.className("form-check-label"));   
       gender.click();
       Thread.sleep(2000);
       ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,268)");
    WebElement selectingDay=driver.findElement(By.id("monday"));   
       selectingDay.click();
    WebElement country=driver.findElement(By.id("country"));  
    Select se=new Select(country);
    se.selectByVisibleText("India");
    
   WebElement colorSelection=driver.findElement(By.id("colors"));
         Select se2=new Select(colorSelection);
         se2.selectByIndex(0);
   WebElement  searchbox=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        searchbox.sendKeys("Obul"); 
   WebElement searchButton=driver.findElement(By.className("wikipedia-search-button"));    
    searchButton.click();
  
 
   WebElement draggable=driver.findElement(By.id("draggable"));
   WebElement droppable=driver.findElement(By.id("droppable"));
   
   act.dragAndDrop(draggable, droppable).build().perform();
   
   WebElement slider=driver.findElement(By.xpath("//*[@id='slider']"));
  act.moveToElement(slider).dragAndDropBy(slider, 50, 0).build().perform();
  
  driver.switchTo().frame(0);
   WebElement secondName=driver.findElement(By.name("RESULT_TextField-0"));
       secondName.sendKeys("Asim ");
  
 
     WebElement  date=driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']"));
    	date.sendKeys("19/01/2024");	  
    WebElement	roleSelection=driver.findElement(By.id("RESULT_RadioButton-3"));
    	
    	Select se3=new Select(roleSelection);
    	se3.selectByIndex(1);
    	((JavascriptExecutor)driver).executeScript("window.scrollTo(0, 750)");
    	
  WebElement  rightClick=driver.findElement(By.className("title"));
  System.out.println(rightClick);
    act.contextClick(rightClick).build().perform();
   Thread.sleep(3000);
  //*[@id="HTML9"]/div[1]/button[2]
   
}
}
