﻿package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.modules.Personer_Task;
import com.coolead.util.Constant;

public class Test_PersonerTask {
	public class Test_TaskAdd {
		WebDriver driver = Driver_select.getDriver();  
		String baseUrl = Constant.Url;
	  @Test
	  public void f() throws Exception {
		  Personer_Task.execute(driver);
	  }
	  
	  @BeforeMethod
	  public void login() throws Exception{	
		  driver.get(baseUrl + "/");
		  	driver.manage().window().maximize();
		  	Login_Action.execute(driver, Constant.user_name, Constant.password);
		  	Thread.sleep(1000);
	  }
	  
	  @AfterMethod
	  public void clear() throws Exception{
		//   Add_User.delete();
//		   driver.navigate().refresh();
	//	   driver.quit();
	  }
	  	 
}
	}