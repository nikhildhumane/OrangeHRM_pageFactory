package OrangeHRM_pratice.PageObjects.SuperAdmin;

import OrangeHRM_pratice.BusinesLogic.Config;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;
import junit.framework.Assert;

public class DashBoardPage extends BaseClass{
	

		

//======================================================================================================//	
		public void NavigateTo_DashBoardPage(String xpath,String exptitle) throws Exception
		{ try {
			
			Thread.sleep(5000);
			Config.Op.VerifyText(xpath, exptitle);
		    log.info("NavigateTo_DashBoardPage :-" +exptitle);
			TestListener.getExtentTest().pass("NavigateTo_DashBoardPage :" +exptitle);
			
		 }catch (IllegalArgumentException e) {
			   log.error("NavigateTo_DashBoardPage :-"+ exptitle +" ===Exception===: " + e.getMessage());
			   TestListener.getExtentTest().fail("NavigateTo_DashBoardPage :"+ exptitle +   " ===Exception===: - " + e.getMessage());
		        Assert.assertTrue(false);
		 } catch (Exception e) {
			 log.error("NavigateTo_DashBoardPage :-"+ exptitle +" ===Exception===: " + e.getMessage());
			 TestListener.getExtentTest().fail("NavigateTo_DashBoardPage :"+ exptitle +   " ===Exception===: - " + e.getMessage());
		      Assert.assertTrue(false);
		 }
		
		
//======================================================================================================//			
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
