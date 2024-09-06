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
		
		
		LoginPageUI.OpenURL(ProFile.ReadData("url"));
		LoginPageUI.Enter_SuperAdminUsername(UILocators.or_LoginUserName,ProFile.ReadData("SuperAdmin_Username"));
		LoginPageUI.Enter_SuperAdminPassword(UILocators.or_LoginPassword,ProFile.ReadData("SuperAdmin_Password"));
		LoginPageUI.Click_Login(UILocators.or_LoginButton);
		
		
		DashBoardPageUI.NavigateTo_DashBoardPage(UILocators.or_DashBoardHeaderName, ProFile.ReadData("DashBoardText"));
		
		
		MainPageUI.Click_On_PIM_Menu(UILocators.or_PIM);
		
		
		PIMPageUI.NavigateTo_(UILocators.or_EmployeeList, ProFile.ReadData("EmployeeList"));
		PIMPageUI.Click_AddEmployee(UILocators.Or_AddEmployee);
		
		AddEmp_Page.Enter_EmployeeFirstName(UILocators.or_FirstName,"EmployeeFirst_Name" );
		AddEmp_Page.Enter_EmployeeMiddleName(UILocators.or_MiddleName, "EmployeeMiddle_Name");		
		AddEmp_Page.Enter_EmployeeLastName(UILocators.or_LastName, "EmployeeLast_Name");
		AddEmp_Page.GetEmployeeID(UILocators.or_EmployeeID, "Employee_ID");
		AddEmp_Page.click_CreateLoginDetails(UILocators.or_CreateLoginDetails);
		
		AddEmp_Page.Enter_EmployeeUserName(UILocators.or_Emp_UserName, "Employee_UserName");
		//AddEmp_Page.Select_Emp_Status(UILocators.or_Emp_EnabledStatus);
		AddEmp_Page.Enter_EmployeePassword(UILocators.Or_Emp_Password, "Employee_Password");
		AddEmp_Page.Enter_EmployeeConfirmPassword(UILocators.Or_Emp_ConfirmPassword,ProFile.ReadData("Employee_Password"));
		AddEmp_Page.click_saveButton(UILocators.or_Emp_SaveButton);
		
		
		
		
		
	}

	


}
