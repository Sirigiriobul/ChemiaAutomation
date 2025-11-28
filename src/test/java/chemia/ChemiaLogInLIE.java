package chemia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChemiaLogInLIE {

	public static void main (String[]args){
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.106.100.234:9098/Chemia/login/cpl");
		driver.manage().window().maximize();
		driver.findElement(By.id("form2Example17")).sendKeys("ARD-TL1");
		driver.findElement(By.id("form2Example27")).sendKeys("Chemia@1234");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Lab Inventory and Equipment']"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("sidebar-toggle")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sidebar-toggle"))).click();
		
		
		//tagname[@id=value]
		
		
	}
}
