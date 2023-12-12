package testngtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//assert=terminates the test case executions, when assert condiotions doent meet
//hard assert ==stop exectn ,when requirements doent meet 
//soft assert==it will execute,regardless of condition
public class TaskSoftAssert {
	public WebDriver driver;
	   //
	   @BeforeTest
	   public void openapplication() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
			Thread.sleep(2000);
	       driver=new ChromeDriver();
	       driver.get("https://adactinhotelapp.com/SearchHotel.php");
	   }
	@Test
	   public void loginFuncionality() {

	       driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	       
	       String exp_res="Adactin.com - New User Registration1";
	       String act_res=driver.getTitle();
	       
	       SoftAssert sa=new SoftAssert();
	       sa.assertEquals(act_res,exp_res);
	       
	       System.out.println("test case is success");
	       
	       driver.findElement(By.id("username")).sendKeys("mahesh23456");
	   }
 
	@AfterTest
	   public void RegistrationFunctionality() {
		
		   driver.findElement(By.id("password")).sendKeys("India@123");

	   }
	

}

