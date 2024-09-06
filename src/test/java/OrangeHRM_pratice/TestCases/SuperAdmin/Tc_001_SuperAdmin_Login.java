package OrangeHRM_pratice.TestCases.SuperAdmin;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import OrangeHRM_pratice.BusinesLogic.UILocators;
import OrangeHRM_pratice.Listener.SuiteListener;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;
import OrangeHRM_pratice.PageObjects.SuperAdmin.DashBoardPage;
import OrangeHRM_pratice.PageObjects.SuperAdmin.SuperAdmin_LoginPage;


@Listeners({TestListener.class, SuiteListener.class})
public class Tc_001_SuperAdmin_Login extends BaseClass{
	
	
	@Test
	public void SuperAdminLogin() throws Exception
	{
		
		
		LoginPageUI.OpenURL(prop.getProperty("url"));
		LoginPageUI.Enter_SuperAdminUsername(UILocators.or_LoginUserName,prop.getProperty("SuperAdmin_Username"));
		LoginPageUI.Enter_SuperAdminPassword(UILocators.or_LoginPassword,prop.getProperty("SuperAdmin_Password"));
		LoginPageUI.Click_Login(UILocators.or_LoginButton);
		DashBoardPageUI.NavigateTo_DashBoardPage(UILocators.or_DashBoardHeaderName, prop.getProperty("DashBoardText"));
		
		
		
	}

	
}
