package testngpractise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ExtentReportsExamplesTestcase {
	  public WebDriver driver;
	   
	   @BeforeTest 
	   public void openApplication() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
			Thread.sleep(2000);
	       driver=new ChromeDriver();
	       driver.get("https://adactinhotelapp.com");
	   }
	   
	   @Test
	   public void Login() {
	       
	       
	       driver.findElement(By.id("username")).sendKeys("mahesh23456");
	       driver.findElement(By.id("password")).sendKeys("India@123");
	       
	       driver.findElement(By.id("login")).click();
	       
	       String Exp_title="Adactin.com - Search Hotel";
	       String Act_title=driver.getTitle();
	       
	       Assert.assertEquals(Act_title, Exp_title);
	   
	   }
	   @AfterTest
	   public void closeApplication() {
	      // driver.quit();
	   }

	}

