package OrangeHRM_pratice.PageObjects.SuperAdmin;

import org.openqa.selenium.WebElement;
import OrangeHRM_pratice.BusinesLogic.Config;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;
import junit.framework.Assert;

public class SuperAdmin_LoginPage extends BaseClass {

	
//	@FindBy(xpath="//input[@placeholder='Username']")
//	WebElement AdminUsername;
//	
//	@FindBy(xpath="//input[@placeholder='Password']")
//	WebElement AdminPassword;
//	
//	@FindBy(xpath="//button[normalize-space()='Login']")
//	WebElement LoginButton;
	
//======================================================================================================//	
	public void OpenURL(String url) throws Exception
	{ try {
		
		Thread.sleep(5000);
		Config.Op.URL(url);
		log.info("OpenURL :-" +url);
		TestListener.getExtentTest().pass("OpenURL :" +url);
		
	 }catch (IllegalArgumentException e) {
		   log.error("OpenURL :-"+ url +" ===Exception===: " + e.getMessage());
		   TestListener.getExtentTest().fail("OpenURL :"+ url +   " ===Exception===: - " + e.getMessage());
	        Assert.assertTrue(false);
	 } catch (Exception e) {
		 log.error("OpenURL :-"+ url +" ===Exception===: " + e.getMessage());
		 TestListener.getExtentTest().fail("OpenURL :"+ url +   " ===Exception===: - " + e.getMessage());
	      Assert.assertTrue(false);
	 }
		 
	}
	
	
//===================================================================================================//
	
	
	
	public void Enter_SuperAdminUsername(String xpath, String Sendvalue) throws Exception {
	try {
	        WebElement element = Config.Op.Wait_Element(xpath, 10);
	        
	             Thread.sleep(5000);
	             if (element == null ) {
	            	 log.error("Enter_SuperAdminUsername :- Element not found ===Exception===: ");
	            	 TestListener.getExtentTest().fail("Enter_SuperAdminUsername :Element not found " +element);
	            	 Assert.assertTrue(false);  
	              } 
	             else if(Sendvalue==null || Sendvalue.isEmpty()) {
	            	 log.error("Enter_SuperAdminUsername :- Sendvalue is null or empty ==");
	            	 TestListener.getExtentTest().fail("Enter_SuperAdminUsername :Sendvalue is null or empty ==" +Sendvalue);
	            	 Assert.assertTrue(false); 
	             }
	             else {
	            	 element.sendKeys(Sendvalue);
	                 log.info("Enter_SuperAdminUsername :-" +Sendvalue);
	                 TestListener.getExtentTest().pass("Enter_SuperAdminUsername :" +Sendvalue);
	                  }
	    } catch (IllegalArgumentException e) {
	    	  log.error("Enter_SuperAdminUsername :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	    	  TestListener.getExtentTest().fail("Enter_SuperAdminUsername :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	         Assert.assertTrue(false); 
	    } catch (Exception e) {
	    	log.error("Enter_SuperAdminUsername :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	    	 TestListener.getExtentTest().fail("Enter_SuperAdminUsername :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	         Assert.assertTrue(false);
	    }
	}

	

	
//===================================================================================================//	
	
	public void Enter_SuperAdminPassword(String xpath,String Sendvalue) throws Exception
	{
		try {
			WebElement element=Config.Op.Wait_Element(xpath, 10);
			  Thread.sleep(5000);
			  if (element == null ) {
	            	 log.error("Enter_SuperAdminPassword :- Element not found ===Exception===: ");
	            	 TestListener.getExtentTest().fail("Enter_SuperAdminPassword :Element not found " +element);
	            	 Assert.assertTrue(false);  
	              } 
	             else if(Sendvalue==null || Sendvalue.isEmpty()) {
	            	 log.error("Enter_SuperAdminPassword :- Sendvalue is null or empty ==");
	            	 TestListener.getExtentTest().fail("Enter_SuperAdminPassword :Element not found " +element);
	            	 Assert.assertTrue(false); 
	             }
	             else {
	            	 element.sendKeys(Sendvalue);
	                 log.info("Enter_SuperAdminPassword :-" +Sendvalue);
	                 TestListener.getExtentTest().pass("Enter_SuperAdminPassword :" +Sendvalue);
	                  }
	    } catch (IllegalArgumentException e) {
	    	log.error("Enter_SuperAdminPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	    	 TestListener.getExtentTest().fail("Enter_SuperAdminPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	         Assert.assertTrue(false); 
	    } catch (Exception e) {
	    	log.error("Enter_SuperAdminPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	    	 TestListener.getExtentTest().fail("Enter_SuperAdminPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
	         Assert.assertTrue(false);
	    }
	}
	
	
//===================================================================================================//	
	
	public void Click_Login(String xpath) throws Exception {
	    try {
	        WebElement element = Config.Op.Wait_Element(xpath, 10);
	        Thread.sleep(5000);
	        if (element == null) {
	        	log.error("Click_Login :- Element not found ===Exception===: " );
	        	TestListener.getExtentTest().fail("Click_Login :- Element not found ===Exception===: " );
	        	 Assert.assertTrue(false); 
	        } else {
	           
	            element.click();
	            log.info("Click_Login :-");
	            TestListener.getExtentTest().pass("Click_Login :" );
	        }
	    } catch (IllegalArgumentException e) {
	    	log.error("Click_Login :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("Click_Login :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false); 
	    } catch (Exception e) {
	    	log.error("Click_Login :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("Click_Login :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false);
	    }
	}

	
//===================================================================================================//	
	
	
}
