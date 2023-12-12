package testngtask;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyOwnListenerTask implements ITestListener{
	public ExtentSparkReporter reporter; //UI of the report
	public ExtentReports extent;//common information (host name,tester name,operating ,system)
	public ExtentTest test; ///test entities

	public void onStart(ITestContext context) {

		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\myreport1.html");

		//provide the document information

		reporter.config().setDocumentTitle("Automation Testing Report");//document title
		reporter.config().setReportName("Functional Testing");//report name
		reporter.config().setTheme(Theme.STANDARD);

		extent=new ExtentReports();
		extent.attachReporter(reporter);

		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Kiran");
		extent.setSystemInfo("OS", "Windows10");
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
		extent.flush();

}}
