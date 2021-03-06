﻿package com.coolead.test_scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.coolead.modules.Add_Organization;
import com.coolead.modules.Driver_select;
import com.coolead.modules.Login_Action;
import com.coolead.util.Constant;
import com.coolead.modules.Add_Draft;

public class Test_AddDraft {
	WebDriver driver = Driver_select.getDriver();    
	String baseUrl = Constant.Url;
	
  @Test
  public void f() throws Exception {
	  Add_Draft.execute(driver);
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  driver.get(baseUrl + "/");
	  	driver.manage().window().maximize();
		Thread.sleep(1000);
		Login_Action.execute(driver, Constant.username, Constant.password);
		Thread.sleep(1000);	
  }
 

  @AfterMethod
  public void afterMethod() throws Exception {
	  	driver.quit();
  }
}
