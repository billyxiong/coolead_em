package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.*;
import com.coolead.util.Constant;

public class Test_Total {
	WebDriver driver = Driver_select.getDriver();  
	String baseUrl = Constant.Url;
	  @BeforeMethod
	  public void login() throws Exception{
		  Thread.sleep(1000);
		  driver.get(baseUrl + "/");
		  driver.manage().window().maximize();
		  Login_Action.execute(driver, Constant.username, Constant.password);
	  }
	  @Test
	  public void Add_Org() throws Exception {
		  Add_Organization.delete(driver);
		  Add_Organization.execute(driver);		  
	  }	  
	  @Test
	  public void Add_User() throws Exception {
		  Add_User.delete();
		  Add_User.add(driver);
	  }	  
	  @Test
	  public void Add_Dictionary() throws Exception{
		  Add_Dictionary.execute(driver);
	  }
	  @Test
	  public void Add_Subject() throws Exception{
		  Add_Dictionary_Subject.delete();
		  Add_Dictionary_Subject.execute(driver);
	  }
	  @Test
	  public void Add_Project() throws Exception{
		  Add_Project.delete();
		  Add_Project.add(driver);		  
	  }
	  @Test
	  public void Project_Authority() throws Exception{
		  Project_Authoriy.add(driver);
	  }
	  @Test
	  public void Add_Meeting() throws Exception{
		  Add_Meeting.execute(driver);
	  }
	  @Test
	  public void Add_Plan() throws Exception{
		  Add_Plan.delete();
		  Add_Plan.add(driver);
	  }
	  @Test
	  public void Add_Task() throws Exception{
		  Add_Task.execute(driver);		   
	  }
	  @Test
	  public void Add_Draft() throws Exception{
		  Add_Draft.execute(driver);
	  }
	  @Test
	  public void Add_Report() throws Exception{
		  Login_Action.execute(driver, Constant.user_name, Constant.password);
		  Add_OwnerProgress_Report.add(driver);
	  }
	  @Test
	  public void Add_Visa() throws Exception{
		  Add_Visa.execute(driver);
	  }
	  @Test
	  public void Reback_Owner_Progress() throws Exception{
		  Login_Action.execute(driver, Constant.user_name, Constant.password);
		  RebackOwnerProgressReport.execute(driver);
	  }		
	  @Test
	  public void Report_Delete() throws Exception{
		  Login_Action.execute(driver, Constant.user_name, Constant.password);
		  Del_Report.execute(driver);
	  }	  
	  @Test
	  public void Doc() throws Exception{
		  Doc_Manage.add_folder(driver);
		  Doc_Manage.upload_file(driver);
		  Doc_Manage.del_file(driver);
		  Doc_Manage.del_foler(driver);
	  }	  
	  @Test
	  public void Service_Push() throws Exception{
		  Service_Push.execute(driver);
	  }
	  @Test
	  public void User_Set() throws Exception{
		  User_Set.execute(driver);
	  }
	  @Test
	  public void Task_Search() throws Exception{
		  Task_Search.execute(driver);
	  }
	  @Test
	  public void Change_Search() throws Exception{
		  Change_Search.execute(driver);
	  }

	  @Test
	  public void Personal_Task() throws Exception{
		  Login_Action.execute(driver, Constant.user_name, Constant.password);
		  Personer_Task.execute(driver);
	  }
}
