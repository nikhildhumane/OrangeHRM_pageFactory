package OrangeHRM_pratice.Listener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;

import OrangeHRM_pratice.PageObjects.BaseClass;
import OrangeHRM_pratice.Utilities.ExtendReportManager;



public class TestListener implements ITestListener {

	 private static ExtentTest test;
	 

	    public static ExtentTest getExtentTest() {
	       
			return test;
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        test = ExtendReportManager.getExtentReports().createTest(result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.pass("Test passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.fail(result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.skip("Test skipped");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	    	ExtendReportManager.getExtentReports().flush();  // Save the report
	    }
}
