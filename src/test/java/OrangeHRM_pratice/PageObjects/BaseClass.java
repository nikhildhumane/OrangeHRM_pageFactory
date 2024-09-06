package OrangeHRM_pratice.PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import OrangeHRM_pratice.BusinesLogic.PropertiesFileReader;
import OrangeHRM_pratice.Listener.SuiteListener;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.SuperAdmin.PIM_AddEmployeePage;
import OrangeHRM_pratice.PageObjects.SuperAdmin.DashBoardPage;
import OrangeHRM_pratice.PageObjects.SuperAdmin.MainPage;

import OrangeHRM_pratice.PageObjects.SuperAdmin.PIMPage;
import OrangeHRM_pratice.PageObjects.SuperAdmin.SuperAdmin_LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners({TestListener.class, SuiteListener.class})
public class BaseClass {
	public String className = this.getClass().getSimpleName();
    public static WebDriver driver;
    public static WebDriverWait wait;
    
  //  public String methodName = this.getClass().getEnclosingMethod().getName();
    
    public static PropertiesFileReader ProFile;
    
   
    public static Logger log = LogManager.getLogger(BaseClass.class);
    
    public static SuperAdmin_LoginPage LoginPageUI;
    public static DashBoardPage DashBoardPageUI;
    public static MainPage MainPageUI;
    public static PIMPage PIMPageUI;
    public static PIM_AddEmployeePage AddEmp_Page;
    
    
    @BeforeSuite
    public void loadConfig()
    {
    	ProFile=new PropertiesFileReader();
		
		LoginPageUI=new SuperAdmin_LoginPage();
		DashBoardPageUI=new DashBoardPage();
		MainPageUI=new MainPage();
		PIMPageUI=new PIMPage();
		AddEmp_Page=new PIM_AddEmployeePage();
    }
    
    
    
    
    
    
    
    
    
    
    
    @BeforeClass
    public void SetUp()
    {    
    	  System.setProperty("logFilename", className);
    	  log= LogManager.getLogger("OrangeHRM");
    	  // pending , need to change methodname instead of classname , we can implemented after listnere 
          log.info("====================================="+className+"==================================================");
    	  WebDriverManager.chromedriver().setup();
    	  driver = new ChromeDriver();
    	  log.info("Open Browser :- Chrome");
    	  
    	 
    }
	
    
    @AfterClass
    public void tearDown() {
        
        if (driver != null) {
            driver.quit();
        }
    }
    
    
    public String capture(String name) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir") + "//Screenshots//"+ className +"  "+ name + ".png");
        String screenshotPath = dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, dest);
        return screenshotPath;
    }

    
//    
//    @AfterMethod
//    public void getReport(ITestResult result) {
//        try {
//            // Capture screenshot
//            String screenshotPath = capture(result.getName());
//
//            if (result.getStatus() == ITestResult.FAILURE) {                
//            	
//            } else if (result.getStatus() == ITestResult.SUCCESS) {
//               test.log(Status.PASS, "Test Case Passed: " + result.getName());
//                test.pass("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//            } else if (result.getStatus() == ITestResult.SKIP) {
//                test.log(Status.SKIP, "Test Case Skipped: " + result.getName());
//            }
//        } catch (Exception e) {
//            System.out.println("Report generation exception: " + e.getMessage());
//        }
//    }
//    
//    
//    
	
	
}
