package testngtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Paramterization {
	public WebDriver driver;
	   
	   @Parameters ("browser")
	   @BeforeTest 
	   public void openapplication(String br) throws InterruptedException 
	   
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
			Thread.sleep(2000);
		   if(br.equals("chrome"))
		   {
			   driver=new ChromeDriver();  
		   }
		   else 
		   {
			   driver=new EdgeDriver();
		   }
	    
	      driver.get("https://adactinhotelapp.com/index.php");
	   }
	@Test
	   public void loginFuncionality() {

	       driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	       
	       //hard assert
	       String exp_res="Adactin.com - New User Registration1";
	       String act_res=driver.getTitle();
	       
	     
	      Assert.assertEquals(act_res, exp_res);
	       
	       System.out.println("test case is success");
	       
	       driver.findElement(By.id("username")).sendKeys("mahesh23456");
	   }

	@AfterTest
	   public void RegistrationFunctionality() {
		
		   driver.findElement(By.id("password")).sendKeys("India@123");

	   }

}

