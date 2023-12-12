package testngtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AdactinTwoTestCases {
	public WebDriver driver;
	 public void openingtheapplication() {

	       driver=new ChromeDriver();
	       driver.get("https://adactinhotelapp.com/index.php");}

     @Test
     public void loginintoapplication() {
    	 driver.findElement(By.id("username")).sendKeys("mahesh23456");
         driver.findElement(By.id("password")).sendKeys("India@123");
         driver.findElement(By.id("login")).click();
     }
     @Test(priority=1)
     public void clickonBuild2() {
    	 driver.findElement(By.xpath("//li/a/strong[text()='Go to Build 2 ']")).click();
     }
     @AfterClass
     public void colsetheapplication() {
        
         driver.close();
     }

 }

	 
