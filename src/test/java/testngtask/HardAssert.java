package testngtask;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class HardAssert {

		public WebDriver driver;
		
		   @BeforeTest
		   public void openapplication() throws InterruptedException {
			   System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
				Thread.sleep(2000);
		       driver=new ChromeDriver();
		       driver.get("https://adactinhotelapp.com/SearchHotel.php");
		   }
		@Test
		   public void loginFuncionality() {

		       
		       
		       //hard assert
		       String exp_res="Adactin.com";
		       String act_res=driver.getTitle();
		       
		       Assert.assertEquals(act_res,exp_res);
		       
		       System.out.println("test case is success");
		       
		       driver.findElement(By.id("username")).sendKeys("mahesh23456");
		       driver.findElement(By.id("password")).sendKeys("India@123");
		       driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();   
		}

		@AfterTest
		   public void RegistrationFunctionality() {
			 driver.findElement(By.id("username")).sendKeys("mahesh23456");
			  driver.findElement(By.id("password")).sendKeys("India@123");

		   }
		
	}

