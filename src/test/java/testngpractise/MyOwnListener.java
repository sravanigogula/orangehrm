package testngpractise;

import com.aventstack.extentreports.Status;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyOwnListener implements ITestListener {
//it is one of supporting file 
	//listener class is applicable to all test cases ,we can use this class multiple time (REUSABILITY) BY USING TESTNG.XML FILE

	public ExtentSparkReporter reporter; //UI of the report
	public ExtentReports extent;//common information (host name,tester name,operating ,system)
	public ExtentTest test; ///test entities

	public void onStart(ITestContext context) {

		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\myreport.html");

		//provide the document information

		reporter.config().setDocumentTitle("Automation Testing Report");//document title
		reporter.config().setReportName("Functional Testing");//report name
		reporter.config().setTheme(Theme.STANDARD);
        //common information
		extent=new ExtentReports();
		extent.attachReporter(reporter);

		extent.setSystemInfo("Hostname", "LocalHost");//who is host
		extent.setSystemInfo("Environment", "QA");//what is the environment
		extent.setSystemInfo("Tester", "Kiran");//who is tester
		extent.setSystemInfo("OS", "Windows10");//operating system
		extent.setSystemInfo("Browsername", "chrome,edge,firefox");

	}

	public void onTestSuccess(ITestResult tr) {

		test=extent.createTest(tr.getName());
		test.log(Status.PASS, "testcase is success"+tr.getName());
	}

	public void onTestFailure(ITestResult tr) {

		test=extent.createTest(tr.getName());
		test.log(Status.FAIL, "testcase is failed" + tr.getName());
		test.log(Status.FAIL, "testcase is failed"+ tr.getThrowable());
	}
	public void onTestSkipped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, "testcase is skipped" + tr.getName());
	}

	public void onFinish(ITestContext context)
	{
		extent.flush();//to remove unwanted data
	}
}
