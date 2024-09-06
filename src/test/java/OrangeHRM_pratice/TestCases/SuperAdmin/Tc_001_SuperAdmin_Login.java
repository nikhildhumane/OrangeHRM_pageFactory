package OrangeHRM_pratice.TestCases.SuperAdmin;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import OrangeHRM_pratice.BusinesLogic.UILocators;
import OrangeHRM_pratice.Listener.SuiteListener;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;


@Listeners({TestListener.class, SuiteListener.class})
public class Tc_001_SuperAdmin_Login extends BaseClass{
	
	
	@Test
	public void SuperAdminLogin() throws Exception
	{
		
		
		LoginPageUI.OpenURL(ProFile.ReadData("url"));
		LoginPageUI.Enter_SuperAdminUsername(UILocators.or_LoginUserName,ProFile.ReadData("SuperAdmin_Username"));
		LoginPageUI.Enter_SuperAdminPassword(UILocators.or_LoginPassword,ProFile.ReadData("SuperAdmin_Password"));
		LoginPageUI.Click_Login(UILocators.or_LoginButton);
		DashBoardPageUI.NavigateTo_DashBoardPage(UILocators.or_DashBoardHeaderName, ProFile.ReadData("DashBoardText"));
		
		
		
	}

	
}
