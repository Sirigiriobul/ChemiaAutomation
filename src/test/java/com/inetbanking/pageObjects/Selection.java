package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selection {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("obulesh");
     	WebElement	email=driver.findElement(By.id("email"));
     	email.sendKeys("obul123@gmail.com");
        WebElement	phonenumber=driver.findElement(By.id("phone"));
     	phonenumber.sendKeys("12345");
        WebElement	address=driver.findElement(By.id("textarea"));
     	address.sendKeys("Flat No.103,Shangrila plaza, Banjara Hills, Hyderabad");
 	    WebElement  gender=driver.findElement(By.name("gender"));
 	    gender.click();
 	    WebElement monday=driver.findElement(By.id("monday"));
	    monday.click();
	   WebElement searchBar=driver.findElement(By.className("wikipedia-search-input"));
	    searchBar.sendKeys("obul");
	   WebElement searchButton=driver.findElement(By.className("wikipedia-search-button"));
	   searchButton.click();
	  
       ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,367)");
       
      WebElement   countrydropdown=driver.findElement(By.id("country"));
      Select se=new Select(countrydropdown);
      se.selectByValue("brazil");
   //   se.selectByValue("India");
      
    //  se.selectByIndex(0);
    //*[@id="HTML2"]
        WebElement  source=driver.findElement(By.xpath("//*[@id='draggable']/p"));
       String   sourceTextData=source.getText();
    System.out.println(sourceTextData);
    
     WebElement  target=driver.findElement(By.xpath("//*[@id='droppable']"));
    String targetText=target.getText();
    System.out.println(targetText);
    
    Actions act=new Actions(driver);
    act.dragAndDrop(source, target).build().perform();
    Thread.sleep(2000);
 //    act.clickAndHold(source).moveToElement(target).release().build().perform();
//      driver.switchTo().frame(frameblock);     

//    WebElement  draggable=driver.findElement(By.id("draggable"));
//   String draggableText=draggable.getText();
//   System.out.println(draggableText);
////    
//    WebElement droppable=driver.findElement(By.id("droppable"));
//     
//     Actions act=new Actions(driver);
//     act.dragAndDrop(draggable, droppable).build().perform();    
	   System.out.println("Success");
	driver.quit();
	}

}
