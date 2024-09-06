package OrangeHRM_pratice.BusinesLogic;

public class UILocators {
	
	public static String or_LoginUserName="//input[@placeholder='Username']";
	public static String or_LoginPassword="//input[@placeholder='Password']";
	public static String or_LoginButton="//button[normalize-space()='Login']";
	
	
	//=================================Dashboard==============================================================//
	
	public static String or_DashBoardHeaderName="//h6[normalize-space()='Dashboard']";
	
	
	
	
	//==============================main page ===============================================================//
	
	public static String or_PIM="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']";
	
	
//================================= pim=======================================================================//
	
	public static String or_EmployeeList="//a[normalize-space()='Employee List']";
	public static String Or_AddEmployee="//a[normalize-space()='Add Employee']";
	
	
	
//==================================Add Employee ==========================================================//
	
	public static String or_FirstName="//input[@placeholder='First Name']";
	public static String or_MiddleName="//input[@placeholder='Middle Name']";
	public static String or_LastName="//input[@placeholder='Last Name']";
	public static String or_EmployeeID="//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//input";
	public static String or_CreateLoginDetails="//div[@class='oxd-switch-wrapper']//label//span";
	public static String or_Emp_UserName="(//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2])[2]//input";
	public static String Or_Emp_Password="(//input[@type='password'])[1]";
	public static String Or_Emp_ConfirmPassword="(//input[@type='password'])[2]";
	public static String or_Emp_EnabledStatus="//input[@value='1']";
	public static String or_Emp_DisableStatus="//input[@value='2']";
	public static String or_Emp_SaveButton="//button[normalize-space()='Save']";
	
	
	
	
	
	

}
