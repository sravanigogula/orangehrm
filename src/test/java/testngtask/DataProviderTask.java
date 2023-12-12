package testngtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTask {
	public WebDriver driver;
	@BeforeTest 
	public void openApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
		Thread.sleep(2000);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(dataProvider="dp")
	public void Login(String user,String pwd) {

		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
	}
	@AfterTest
	public void closeApplication() {
		driver.close();
	}
	@DataProvider(name="Dp",indices= {0,1,2})
	String [][] logindata(){

		String data[][]={ 

				{"Admin","admin123"},
				{"siva","siva19"},
				{"admin","admin123"}


		};
		return data;

	}}
