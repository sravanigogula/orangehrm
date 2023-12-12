package testngtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Invocation {
	public  WebDriver driver;

	@BeforeTest
	public void open_application() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
		Thread.sleep(2000);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(invocationCount=5)
	public void loginfunction()
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		 driver.findElement(By.xpath("//li[@class='--active oxd-userdropdown']//ul/li[4]")).click();
	}
}
