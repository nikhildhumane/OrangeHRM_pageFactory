package OrangeHRM_pratice.TestCases.SuperAdmin;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import OrangeHRM_pratice.BusinesLogic.UILocators;
import OrangeHRM_pratice.Listener.SuiteListener;
import OrangeHRM_pratice.Listener.TestListener;
import OrangeHRM_pratice.PageObjects.BaseClass;
import OrangeHRM_pratice.PageObjects.SuperAdmin.DashBoardPage;
import OrangeHRM_pratice.PageObjects.SuperAdmin.MainPage;
import OrangeHRM_pratice.PageObjects.SuperAdmin.PIMPage;
import OrangeHRM_pratice.PageObjects.SuperAdmin.SuperAdmin_LoginPage;



@Listeners({TestListener.class, SuiteListener.class})
public class Tc_002_Add_New_Employee extends BaseClass {
	
	@Test
	public void create_New_Acc_by_clicking_on_Add_Employee_button() throws Exception
	{
		
		
		LoginPageUI.OpenURL(prop.getProperty("url"));
		LoginPageUI.Enter_SuperAdminUsername(UILocators.or_LoginUserName,prop.getProperty("SuperAdmin_Username"));
		LoginPageUI.Enter_SuperAdminPassword(UILocators.or_LoginPassword,prop.getProperty("SuperAdmin_Password"));
		LoginPageUI.Click_Login(UILocators.or_LoginButton);
		
		
		DashBoardPageUI.NavigateTo_DashBoardPage(UILocators.or_DashBoardHeaderName, prop.getProperty("DashBoardText"));
		
		
		MainPageUI.Click_On_PIM_Menu(UILocators.or_PIM);
		
		
		PIMPageUI.NavigateTo_(UILocators.or_EmployeeList, prop.getProperty("EmployeeList"));
		PIMPageUI.Click_AddEmployee(UILocators.Or_AddEmployee);
		
				
		
		
		
		
	}

	


}
