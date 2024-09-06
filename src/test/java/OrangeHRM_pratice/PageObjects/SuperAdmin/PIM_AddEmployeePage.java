package OrangeHRM_pratice.PageObjects.SuperAdmin;

import java.util.Random;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebElement;

import OrangeHRM_pratice.BusinesLogic.Config;
import OrangeHRM_pratice.BusinesLogic.Operations;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;
import junit.framework.Assert;

public class PIM_AddEmployeePage extends BaseClass {
	
	
//======================================================================================================//	
	
	
	public void Enter_EmployeeFirstName(String xpath ,String text) throws Exception
	{
		
		  WebElement element = Config.Op.Wait_Element(xpath, 10);
	      String FirstName="George";
     	  Random rand = new Random();
          int randomNum = 100 + rand.nextInt(900); 
          String Sendvalue = FirstName.substring(0, FirstName.length() - 3) + randomNum;
          ProFile.WriteData(text,Sendvalue);
		
			try {
			       
			        
			             Thread.sleep(5000);
			             if (element == null ) {
			            	 log.error("Enter_EmployeeFirstName :- Element not found ===Exception===: ");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeFirstName :Element not found " +element);
			            	 Assert.assertTrue(false);  
			              } 
			             else if(Sendvalue==null || Sendvalue.isEmpty()) {
			            	 log.error("Enter_EmployeeFirstName :- Sendvalue is null or empty ==");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeFirstName :Sendvalue is null or empty ==" +Sendvalue);
			            	 Assert.assertTrue(false); 
			             }
			             else {
			            	 
			            	 
			                 
			            	 element.sendKeys(Sendvalue);
			                 log.info("Enter_EmployeeFirstName :-" +Sendvalue);
			                 TestListener.getExtentTest().pass("Enter_EmployeeFirstName :" +Sendvalue);
			                  }
			    } catch (IllegalArgumentException e) {
			    	  log.error("Enter_EmployeeFirstName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	  TestListener.getExtentTest().fail("Enter_EmployeeFirstName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false); 
			    } catch (Exception e) {
			    	log.error("Enter_EmployeeFirstName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	 TestListener.getExtentTest().fail("Enter_EmployeeFirstName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false);
			    }
	}
	
	
//======================================================================================================//		
	
	
	public void Enter_EmployeeMiddleName(String xpath ,String text) throws Exception
	{
		  WebElement element = Config.Op.Wait_Element(xpath, 10);
		  String MiddleName="Preston";
     	  Random rand = new Random();
          int randomNum = 100 + rand.nextInt(900); 
          String Sendvalue = MiddleName.substring(0, MiddleName.length() - 3) + randomNum;
          ProFile.WriteData(text,Sendvalue);
			try {
			       
			        
			             Thread.sleep(5000);
			             if (element == null ) {
			            	 log.error("Enter_EmployeeMiddleName :- Element not found ===Exception===: ");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeMiddleName :Element not found " +element);
			            	 Assert.assertTrue(false);  
			              } 
			             else if(Sendvalue==null || Sendvalue.isEmpty()) {
			            	 log.error("Enter_EmployeeMiddleName :- Sendvalue is null or empty ==");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeMiddleName :Sendvalue is null or empty ==" +Sendvalue);
			            	 Assert.assertTrue(false); 
			             }
			             else {
			            	
			            	 element.sendKeys(Sendvalue);
			                 log.info("Enter_EmployeeMiddleName :-" +Sendvalue);
			                 TestListener.getExtentTest().pass("Enter_EmployeeMiddleName :" +Sendvalue);
			                  }
			    } catch (IllegalArgumentException e) {
			    	  log.error("Enter_EmployeeMiddleName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	  TestListener.getExtentTest().fail("Enter_EmployeeMiddleName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false); 
			    } catch (Exception e) {
			    	log.error("Enter_EmployeeMiddleName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	 TestListener.getExtentTest().fail("Enter_EmployeeMiddleName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false);
			    }
	}
	
	
//======================================================================================================//		
	
	
	public void Enter_EmployeeLastName(String xpath ,String text) throws Exception
	{
		 WebElement element = Config.Op.Wait_Element(xpath, 10);
		 String LastName="Gates";
	     Random rand = new Random();
         int randomNum = 100 + rand.nextInt(900); 
         String Sendvalue = LastName.substring(0, LastName.length() - 3) + randomNum;
         ProFile.WriteData(text,Sendvalue);
		
			try {
			       
			        
			             Thread.sleep(5000);
			             if (element == null ) {
			            	 log.error("Enter_EmployeeLastName :- Element not found ===Exception===: ");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeLastName :Element not found " +element);
			            	 Assert.assertTrue(false);  
			              } 
			             else if(Sendvalue==null || Sendvalue.isEmpty()) {
			            	 log.error("Enter_EmployeeLastName :- Sendvalue is null or empty ==");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeLastName :Sendvalue is null or empty ==" +Sendvalue);
			            	 Assert.assertTrue(false); 
			             }
			             else {
			            	
			            	 element.sendKeys(Sendvalue);
			                 log.info("Enter_EmployeeLastName :-" +Sendvalue);
			                 TestListener.getExtentTest().pass("Enter_EmployeeLastName :" +Sendvalue);
			                  }
			    } catch (IllegalArgumentException e) {
			    	  log.error("Enter_EmployeeLastName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	  TestListener.getExtentTest().fail("Enter_EmployeeLastName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false); 
			    } catch (Exception e) {
			    	log.error("Enter_EmployeeLastName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	 TestListener.getExtentTest().fail("Enter_EmployeeLastName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false);
			    }
	}
//======================================================================================================//	
	
	public void GetEmployeeID(String xpath,String text) throws Exception
	{
		 String textName = null;
		
		try {
		WebElement element = Config.Op.Wait_Element(xpath, 20);
		 Thread.sleep(5000);
		 if (element == null) {
	        	log.error("GetEmployeeID :-" +textName+ " Element not found ===Exception===: " );
	        	TestListener.getExtentTest().fail("GetEmployeeID :-" +textName+ " Element not found ===Exception===: " );
	        	 Assert.assertTrue(false); 
	        }
		 else if(Operations.GetNumber(xpath)==null ||Operations.GetNumber(xpath).isEmpty())
		 {
			 log.error("GetEmployeeID :-" +textName+ " Element not found ===Exception===: " );
	         TestListener.getExtentTest().fail("GetEmployeeID :-" +textName+ " Element not found ===Exception===: " );
	         Assert.assertTrue(false); 
		 }
		 else {
			    textName= Operations.GetNumber(xpath);
		        ProFile.WriteData(text,textName);
	            log.info("GetEmployeeID :-"+textName);
	            TestListener.getExtentTest().pass("GetEmployeeID :" +textName);
	        }
		
		}catch (IllegalArgumentException e) {
	    	log.error("GetEmployeeID :-" +textName+ " Element not found ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("GetEmployeeID :-" +text+ " Element not found ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false); 
	    }
		 catch (Exception e) {
		    	log.error("GetEmployeeID :-" +textName+ " Element not found ===Exception===: " + e.getMessage());
		    	TestListener.getExtentTest().fail("GetEmployeeID :-" +text+ " Element not found ===Exception===: " + e.getMessage() );
		        Assert.assertTrue(false);
		    }
	}
	
	
//======================================================================================================//			
	
	public void click_CreateLoginDetails(String xpath) throws Exception {
	    try {
	        WebElement element = Config.Op.Wait_Element(xpath, 20);
	        Thread.sleep(5000);
	        if (element == null) {
	        	log.error("click_CreateLoginDetails :- Element not found ===Exception===: " );
	        	TestListener.getExtentTest().fail("click_CreateLoginDetails :- Element not found ===Exception===: " );
	        	Assert.assertTrue(false); 
	        } else {
	           
	            element.click();
	            Operations.Js_scroll_Down();
	            log.info("click_CreateLoginDetails :-");
	            TestListener.getExtentTest().pass("click_CreateLoginDetails :" );
	        }
	     } catch (IllegalArgumentException e) {
	    	log.error("click_CreateLoginDetails :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("click_CreateLoginDetails :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false); 
	    } catch (Exception e) {
	    	log.error("click_CreateLoginDetails :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("click_CreateLoginDetails :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false);
	    }
	}


//======================================================================================================//			
	public void Enter_EmployeeUserName(String xpath ,String text) throws Exception
	{
		 WebElement element = Config.Op.Wait_Element(xpath, 10);
		 String LastName="EmpUserName";
	     Random rand = new Random();
         int randomNum = 100 + rand.nextInt(900); 
         String Sendvalue = LastName.substring(0, LastName.length() - 3) + randomNum;
         ProFile.WriteData(text,Sendvalue);
		
			try {
			       
			        
			             Thread.sleep(5000);
			             if (element == null ) {
			            	 log.error("Enter_EmployeeUserName :- Element not found ===Exception===: ");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeUserName :Element not found " +element);
			            	 Assert.assertTrue(false);  
			              } 
			             else if(Sendvalue==null || Sendvalue.isEmpty()) {
			            	 log.error("Enter_EmployeeUserName :- Sendvalue is null or empty ==");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeUserName :Sendvalue is null or empty ==" +Sendvalue);
			            	 Assert.assertTrue(false); 
			             }
			             else {
			            	
			            	 element.sendKeys(Sendvalue);
			                 log.info("Enter_EmployeeUserName :-" +Sendvalue);
			                 TestListener.getExtentTest().pass("Enter_EmployeeUserName :" +Sendvalue);
			                  }
			    } catch (IllegalArgumentException e) {
			    	  log.error("Enter_EmployeeUserName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	  TestListener.getExtentTest().fail("Enter_EmployeeUserName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false); 
			    } catch (Exception e) {
			    	log.error("Enter_EmployeeUserName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	 TestListener.getExtentTest().fail("Enter_EmployeeUserName :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false);
			    }
	}

//======================================================================================================//		
	
	public void Enter_EmployeePassword(String xpath ,String text) throws Exception
	{
		 WebElement element = Config.Op.Wait_Element(xpath, 10);
		 String LastName="EmpPassword";
	     Random rand = new Random();
         int randomNum = 100 + rand.nextInt(900); 
         String symbol="@";
         String Sendvalue = LastName.substring(0, LastName.length() - 3) + randomNum +symbol;
         ProFile.WriteData(text,Sendvalue);
		
			try {
			       
			        
			             Thread.sleep(5000);
			             if (element == null ) {
			            	 log.error("Enter_EmployeePassword :- Element not found ===Exception===: ");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeUserName :Element not found " +element);
			            	 Assert.assertTrue(false);  
			              } 
			             else if(Sendvalue==null || Sendvalue.isEmpty()) {
			            	 log.error("Enter_EmployeePassword :- Sendvalue is null or empty ==");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeUserName :Sendvalue is null or empty ==" +Sendvalue);
			            	 Assert.assertTrue(false); 
			             }
			             else {
			            	
			            	 element.sendKeys(Sendvalue);
			                 log.info("Enter_EmployeePassword :-" +Sendvalue);
			                 TestListener.getExtentTest().pass("Enter_EmployeePassword :" +Sendvalue);
			                  }
			    } catch (IllegalArgumentException e) {
			    	  log.error("Enter_EmployeePassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	  TestListener.getExtentTest().fail("Enter_EmployeePassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false); 
			    } catch (Exception e) {
			    	log.error("Enter_EmployeePassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	 TestListener.getExtentTest().fail("Enter_EmployeePassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false);
			    }
	}
	
//======================================================================================================//				
	
	
	public void Enter_EmployeeConfirmPassword(String xpath ,String Sendvalue) throws Exception
	{
		
		
			try {
				 WebElement element = Config.Op.Wait_Element(xpath, 10);
			        
			             Thread.sleep(5000);
			             if (element == null ) {
			            	 log.error("Enter_EmployeeConfirmPassword :- Element not found ===Exception===: ");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeConfirmPassword :Element not found " +element);
			            	 Assert.assertTrue(false);  
			              } 
			             else if(Sendvalue==null || Sendvalue.isEmpty()) {
			            	 log.error("Enter_EmployeeConfirmPassword :- Sendvalue is null or empty ==");
			            	 TestListener.getExtentTest().fail("Enter_EmployeeConfirmPassword :Sendvalue is null or empty ==" +Sendvalue);
			            	 Assert.assertTrue(false); 
			             }
			             else {
			            	
			            	 element.sendKeys(Sendvalue);
			                 log.info("Enter_EmployeeConfirmPassword :-" +Sendvalue);
			                 TestListener.getExtentTest().pass("Enter_EmployeeConfirmPassword :" +Sendvalue);
			                  }
			    } catch (IllegalArgumentException e) {
			    	  log.error("Enter_EmployeeConfirmPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	  TestListener.getExtentTest().fail("Enter_EmployeeConfirmPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false); 
			    } catch (Exception e) {
			    	log.error("Enter_EmployeeConfirmPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			    	 TestListener.getExtentTest().fail("Enter_EmployeeConfirmPassword :-"+ Sendvalue +" ===Exception===: " + e.getMessage());
			         Assert.assertTrue(false);
			    }
	}
//======================================================================================================//		
	

	public void Select_Emp_Status(String xpath) throws Exception {
		
        String text = null;
	    try {
	    	WebElement element = Config.Op.Wait_Element(xpath, 20);
	        Thread.sleep(5000); 
	        if (element == null) {
	        	log.error("Select_Emp_Status :- " +text+"  Element not found ===Exception===: " );
	        	TestListener.getExtentTest().fail("Select_Emp_Status :- " +text+"  Element not found ===Exception===: ");
	        	Assert.assertTrue(false); 
	        } else {
	        	text=element.getText();
	            element.click();
	            Operations.Js_scroll_Down();
	            log.info("Select_Emp_Status :-"+text);
	            TestListener.getExtentTest().pass("Select_Emp_Status :"+text );
	        }
	     } catch (IllegalArgumentException e) {
	    	log.error("Select_Emp_Status :-" +text+" ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("Select_Emp_Status :-" +text+" ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false); 
	    } catch (Exception e) {
	    	log.error("Select_Emp_Status :- " +text+"===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("Select_Emp_Status :-" +text+" ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false);
	    }
	}

	
//======================================================================================================//		

	

	public void click_saveButton(String xpath) throws Exception {
	    try {
	        WebElement element = Config.Op.Wait_Element(xpath, 20);
	        Thread.sleep(5000);
	        if (element == null) {
	        	log.error("click_saveButton :- Element not found ===Exception===: " );
	        	TestListener.getExtentTest().fail("click_saveButton :- Element not found ===Exception===: " );
	        	Assert.assertTrue(false); 
	        } else {
	           
	            element.click();
	            Operations.Js_scroll_Down();
	            log.info("click_saveButton :-");
	            TestListener.getExtentTest().pass("click_saveButton :" );
	        }
	     } catch (IllegalArgumentException e) {
	    	log.error("click_saveButton :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("click_saveButton :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false); 
	    } catch (Exception e) {
	    	log.error("click_saveButton :- ===Exception===: " + e.getMessage());
	    	TestListener.getExtentTest().fail("click_saveButton :- ===Exception===: " + e.getMessage() );
	        Assert.assertTrue(false);
	    }
	}
	
	
//======================================================================================================//		
	
	
	
	
}
