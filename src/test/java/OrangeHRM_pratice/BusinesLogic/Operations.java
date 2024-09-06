package OrangeHRM_pratice.BusinesLogic;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import OrangeHRM_pratice.PageObjects.BaseClass;

public class Operations extends BaseClass {
	
	
	public void URL(String name) throws Exception
	{
		if(name ==null || name.isEmpty())
	  {
		 throw new IllegalArgumentException("url is null or empty");
	  }
	   else if(driver ==null )
	 {
	 	 throw new IllegalArgumentException("driver is null");
	 }
	   else {
	    Thread.sleep(8000);
        driver.get(name);
	}
		
		
	}
	
	
	

	public static WebElement Wait_Element(String xpath, int timeoutSeconds) throws TimeoutException {
	    // Validate inputs
	    if (xpath == null || xpath.isEmpty()) {
	        throw new IllegalArgumentException("XPath is null or empty");
	    }
	    if (timeoutSeconds <= 0) {
	        throw new IllegalArgumentException("Timeout must be greater than zero");
	    }

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	    WebElement element;

	    try {
	        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	    } catch (NoSuchElementException e) {
	        throw new RuntimeException("Element located by XPath: " + xpath + " does not exist");
	    } catch (Exception e) {
	        throw new RuntimeException("Unexpected error occurred while waiting for element: " + e.getMessage());
	    }

	    return element;
	}
	
	
	
	
	
	public void VerifyText(String xpath,String Exptitle) throws Exception
	{
		
		WebElement el;
		 if (xpath == null || xpath.isEmpty()) {
		        throw new IllegalArgumentException("XPath is null or empty");
		    }
		 else if (Exptitle == null || Exptitle.isEmpty()) {
		        throw new IllegalArgumentException("Exptitle is null or empty");
		    }
		 else {
		 
			   el=Wait_Element(xpath,10);
				el.isDisplayed();
				String Text =el.getText();
				
			   if(Text.equals(Exptitle))
			   {
				   Assert.assertTrue(true);
			   }
			   else
			   {
				   Assert.assertTrue(false);
			   }
		 }
		   
		
	}
	
	
	
	
	
public static void doubleClick(String xpath) {
	    
	    if (xpath == null || xpath.isEmpty()) {
	        throw new IllegalArgumentException("XPath is null or empty");
	    }

	    WebElement element;
	    try {
	       
	        element = Wait_Element(xpath, 10);
	    } catch (Exception e) {
	        throw new RuntimeException("Failed locate or wait  XPath: " + xpath, e);
	    }

	    try {
	        
	        Actions actions = new Actions(driver);
	        actions.doubleClick(element).perform();
	    } catch (Exception e) {
	        throw new RuntimeException("Failed double-click action: " + xpath, e);
	    }
	}


	
	
	

}
