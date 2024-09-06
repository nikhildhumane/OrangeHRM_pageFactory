package OrangeHRM_pratice.PageObjects.SuperAdmin;




import OrangeHRM_pratice.BusinesLogic.Operations;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;
import junit.framework.Assert;

public class MainPage extends BaseClass{
	
	
	
	public  void Click_On_PIM_Menu(String xpath) {
	    try {
	        
	    	Operations.doubleClick(xpath);
	    	log.info("Click_On_PIM_Menu :-");
			TestListener.getExtentTest().pass("Click_On_PIM_Menu :");
	        
	    } catch (IllegalArgumentException e) {
	        
	    	 log.error("Click_On_PIM_Menu :- ===Exception===: " + e.getMessage());
			 TestListener.getExtentTest().fail("Click_On_PIM_Menu :   ===Exception===: -"  + e.getMessage());
		     Assert.assertTrue(false);
	  
	    } catch (Exception e) {
	   	    log.error("Click_On_PIM_Menu :- ===Exception===: " + e.getMessage());
		    TestListener.getExtentTest().fail("Click_On_PIM_Menu :   ===Exception===: -"  + e.getMessage());
	        Assert.assertTrue(false);
	    }
	}

}
