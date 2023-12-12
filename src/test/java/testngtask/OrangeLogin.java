package testngtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeLogin {
	public WebDriver driver;
	 @BeforeClass
	   public void openapplication() {

	       driver=new ChromeDriver();
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");}

	 @Test
	 public void login() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	   }
	 
@AfterClass
public void close() {
	driver.quit();
}}

