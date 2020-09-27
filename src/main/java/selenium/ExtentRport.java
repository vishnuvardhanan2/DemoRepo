package selenium;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRport {

	ExtentHtmlReporter reporter= new ExtentHtmlReporter("C:\\Users\\vishnu\\vishnu_eclipse_workspace\\Selenium\\Reports\\firstreport.html");
	ExtentReports extent= new ExtentReports();
	
	
	@Test
	public void login()
	{
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("login");
		logger.log(Status.INFO,"login to website");
		extent.flush();
	}
	@Test
	public void homepage() 
	{
		ExtentTest logger2=extent.createTest("homepage");
		logger2.log(Status.FAIL,"Homepage entry");
		extent.flush();
	}
	@Test
	public void memcreation()
	{
		ExtentTest logger3=extent.createTest("MemberCreation");
		logger3.log(Status.INFO,"add a member");
		extent.flush();
	}
	@Test
	public void logoff()
	{
		ExtentTest logger3=extent.createTest("Logoff");
		logger3.log(Status.INFO,"signing off");
		extent.flush();	
	}
}
