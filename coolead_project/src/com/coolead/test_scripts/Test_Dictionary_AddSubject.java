﻿package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.coolead.modules.Add_Dictionary_Subject;
import com.coolead.modules.Add_User;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;

public class Test_Dictionary_AddSubject {
	WebDriver driver = Driver_select.getDriver();  
	String baseUrl = Constant.Url;
  @Test
  public void f() throws Exception {
	  Add_Dictionary_Subject.execute(driver);
  }
  
  @BeforeMethod
  public void login() throws Exception{	
	  driver.get(baseUrl + "/");
	  	driver.manage().window().maximize();
	  	Login_Action.execute(driver, Constant.username, Constant.password);
	  	Add_Dictionary_Subject.delete();
  }
  
  @AfterMethod
  public void clear() throws Exception{
	  driver.quit();
  }
  	 
}
