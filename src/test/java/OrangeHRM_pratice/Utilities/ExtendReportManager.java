package OrangeHRM_pratice.Utilities;

import org.testng.ISuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportManager {
	


    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;
    private static String suiteName;

    // Private constructor to prevent instantiation
    private ExtendReportManager() {}

    // Method to initialize the ExtentReports with the suite name
    public static void initialize(String suite) {
        suiteName = suite;

        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\HTMLReport\\" + suiteName + ".html");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle(suiteName +" :html report");
        sparkReporter.config().setReportName(suiteName);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        
        extent.setSystemInfo("HostName", "Production");
		extent.setSystemInfo("ProjectName", "OrangeHRM");
		extent.setSystemInfo("Tester", "Nikhil");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
    }

    public static ExtentReports getExtentReports() {
        if (extent == null) {
            throw new IllegalStateException("ExtentReports has not been initialized. Call initialize() first.");
        }
        return extent;
    }
}
