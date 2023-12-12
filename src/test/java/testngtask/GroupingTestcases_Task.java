package testngtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupingTestcases_Task {
	public  WebDriver driver;

	@Test(priority=1,groups= {"regression"})
	public void open_application() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
	Thread.sleep(2000);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2,groups= {"smoke"})
	public void loginfunction()
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=3,groups= {"smoke"})
	public void clicklogout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}

	
	@Test(priority=4,groups= {"regression"})
	 public void RegistrationFunctionality()
	 {
	       
	      driver.quit();
	  
	 }

}

