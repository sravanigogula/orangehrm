package testngpractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MeetMable {
	 public WebDriver driver;
	   //execution==alphabetical order ,so we give priorities 
	   @BeforeTest 
	   public void openApplication() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
			Thread.sleep(2000);
	       driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       driver.get("https://www.meetmable.com/sign-in");
	   }

		/*
		 * @Test(priority=1) public void Login() throws InterruptedException,
		 * IOException { Thread.sleep(2000);
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "sravanisivagogula@gmail.com");
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
		 * "Sravani@19");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * 
		 * }
		 */
		/*
		 * @Test(priority=2) public void title() {
		 * 
		 * String exp_res="Sign in | Mable"; String act_res=driver.getTitle();
		 * Assert.assertEquals(act_res,exp_res);//hard assert
		 * System.out.println(act_res); }
		 */
		/*
		 * @Test(priority=3) public void takescreenshot() throws IOException {
		 * //takescreenshot interface TakesScreenshot ts=(TakesScreenshot)driver;
		 * 
		 * File src=ts.getScreenshotAs(OutputType.FILE); File des=new File
		 * ("C:\\Users\\sravani\\eclipse-workspace\\Framework\\screenshot\\pic.png");
		 * FileUtils.copyFile(src,des); // method is part of the Apache Commons IO
		 * library, not directly related to Selenium WebDriver }
		 */
	   @Test(priority=1) public void Login() throws IOException {
	   FileInputStream fis=new FileInputStream("C:\\Users\\sravani\\eclipse-workspace\\Framework\\excelmeet\\Book2met.xlsx");
		//1.Enter into workbook
		XSSFWorkbook a=new XSSFWorkbook(fis);//interface
		XSSFSheet sheet=a.getSheet("Sheet1");
		//how many rows is available in the sheet
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		//how many cells is available in the sheet
		int cells=sheet.getRow(1).getLastCellNum();

		System.out.println(cells);
		for(int i=1;i<=rows;i++) {//rows             		

			//capture the rows
			XSSFRow row=sheet.getRow(i);

			for(int j=0;j<cells;j++) { //cells

				String value=row.getCell(j).toString();
				System.out.print(value+ " ");

			}

			System.out.println();
		}

		a.close();
		fis.close();




	}

}
		
		
		