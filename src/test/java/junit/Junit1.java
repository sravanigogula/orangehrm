package junit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Junit1 {
	//j unit it is only used for unit testing only
	public static WebDriver driver;
	   
	   //@Before
	   public void openapplication() {
	       driver=new ChromeDriver();
	       
	   driver.get("https://adactinhotelapp.com/index.php");}
	      
	       @Test //testcase
	       public void LoginFunctionality() {
	           driver.findElement(By.id("username")).sendKeys("mahesh23456");
	           
	           driver.findElement(By.id("password")).sendKeys("India@123");
	           
	           driver.findElement(By.id("login")).click();
	       }
	       @Test
	       public void Registrationfunctionality() {
	           System.out.println("testing");
	       }
	       @After
	       public void closeapplication() {
	           driver.close();
	       }

	    }



