package testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class DependsOnMethods {

	public WebDriver driver;

	@BeforeClass
	public void openapplication() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
		Thread.sleep(2000); 
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();}

	@Test(priority=1)
	public void loginfunctionality() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();

	}
	
	@Test(priority=2,dependsOnMethods= {"loginfunctionality"})
	

	public void Registrationfunctionality() throws InterruptedException {
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();

		Thread.sleep(2000); 
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}
	
	@AfterClass

	public void closeApplication() throws InterruptedException {
		Thread.sleep(2000); 
		driver.quit();
	}

}
