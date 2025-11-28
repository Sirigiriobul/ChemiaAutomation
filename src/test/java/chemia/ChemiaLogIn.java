package chemia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChemiaLogIn {
public static void main(String[] args) throws InterruptedException {


WebDriver driver=new ChromeDriver();
     driver.get("http://10.106.100.234:9098/Chemia/company");
driver.manage().window().maximize();

   
   driver.findElement(By.name("compShortName")).sendKeys("cpl");
   driver.findElement(By.xpath("//*[@type='submit']")).click();
   
   Thread.sleep(2000);
   driver.findElement(By.id("form2Example17")).sendKeys("ARD-TL1");
   driver.findElement(By.id("form2Example27")).sendKeys("Chemia@1234");
   
   driver.findElement(By.xpath("//*[@type='submit']")).click();
   Thread.sleep(2000);
   
   //driver.findElement(By.className("img-fluid rounded-start")).click();
   driver.findElement(By.xpath("//h5[text()='Lab Inventory and Equipment']")).click();    // Lab Inventory module name
   Thread.sleep(5000);

driver.findElement(By.id("sidebar-toggle")).click();      //Menu bar
driver.findElement(By.id("menuImgId")).click();          //Inv Master Data
driver.findElement(By.id("subMenuId")).click();          //Materials

driver.findElement(By.id("sidebar-toggle")).click();      //Menu bar
driver.findElement(By.xpath("//span[text()='Equip Master Data']")).click();  //Equip Master data
driver.findElement(By.xpath("//span[text()=' Equipment Type ']")).click();   // Equip Type

driver.findElement(By.id("sidebar-toggle")).click();   //Menu bar
driver.findElement(By.xpath("//span[text()='Inventory Batches']")).click();  //Inventory batch
driver.findElement(By.xpath("//span[text()=' Available Stock ']")).click();    //Available stock

driver.findElement(By.id("sidebar-toggle")).click();   //Menu bar
driver.findElement(By.xpath("//span[text()='Equipment Catalogue']")).click();    //Equipment Catalogue
driver.findElement(By.xpath("//span[text()=' Equipment Catalogue ']")).click();   //Equipment Catalogue

driver.findElement(By.id("sidebar-toggle")).click();   //Menu bar
driver.findElement(By.xpath("//span[text()='Reporting']")).click();   //Reporting
driver.findElement(By.xpath("//span[text()=' Chemical Consumption Report ']")).click();  //Chemical Consumption Report



   Thread.sleep(2000);
     driver.close();
}
}
	