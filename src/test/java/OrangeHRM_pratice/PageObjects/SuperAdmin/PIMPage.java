package OrangeHRM_pratice.PageObjects.SuperAdmin;

import org.openqa.selenium.WebElement;

import OrangeHRM_pratice.BusinesLogic.Config;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;
import junit.framework.Assert;

public class PIMPage extends BaseClass {
	
	
	
	public void NavigateTo_(String xpath,String exptitle) throws Exception
	{ 
	try {	
		Thread.sleep(5000);
		Config.Op.VerifyText(xpath, exptitle);
	    log.info("NavigateTo_ :-" +exptitle);
		TestListener.getExtentTest().pass("NavigateTo_ :" +exptitle);
		
	 }catch (IllegalArgumentException e) {
		   log.error("NavigateTo_ :-"+ exptitle +" ===Exception===: " + e.getMessage());
		   TestListener.getExtentTest().fail("NavigateTo_ :"+ exptitle +   " ===Exception===: - " + e.getMessage());
	        Assert.assertTrue(false);
	 } catch (Exception e) {
		 log.error("NavigateTo_ :-"+ exptitle +" ===Exception===: " + e.getMessage());
		 TestListener.getExtentTest().fail("NavigateTo_ :"+ exptitle +   " ===Exception===: - " + e.getMessage());
	     Assert.assertTrue(false);
	 }
	
   }
	
	
//================================================================================================================================//
	
	
	public void Click_AddEmployee(String xpath) throws Exception {
	    try {
	        WebElement element = Config.Op.Wait_Element(xpath, 10);
	        Thread.sleep(5000);
	        if (element == null) {
	        	log.error("Click_AddEmployee :- Element not found ===Exception===: " );
	        	TestListener.getExtentTest().fail("Click_AddEmployee :- Element not found ===Exception===: " );
	        	 Assert.assertTrue(false); 
	        } else {
	           
	            element.click();
	            log.info("Click_AddEmployee :-");
	            TestListener.getExtentTest().pass("Click_AddEmployee :" );
	        }
	    } catch (IllegalArgumentException e) {
	    	log.error("Click_AddEmployee :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("Click_AddEmployee :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false); 
	    } catch (Exception e) {
	    	log.error("Click_AddEmployee :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("Click_AddEmployee :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false);
	    }
	}

	
	
	
}
