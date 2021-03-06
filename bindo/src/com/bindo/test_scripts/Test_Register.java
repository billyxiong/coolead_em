package com.bindo.test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.bindo.modules.Driver_select;
import com.bindo.modules.Register;
import com.bindo.util.Constant;
import com.bindo.util.GetDriver;
public class Test_Register {
	WebDriver driver = Driver_select.getDriver();
//	WebDriver driver = GetDriver.getRemoteIEDriver();
	String baseUrl = Constant.url;	
	@Test
	public void register() throws Exception{
		//获取远程浏览器
//		driver=GetDriver.getRemoteChromedriver(Constant.remoteNodeUrl);
		driver.get(baseUrl + "/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
//		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
//			public Boolean apply(WebDriver d){
//				return	d.findElement(By.xpath("//b[contains(text(),'马上注册')]/parent::a")).isDisplayed();
//				
//			}	
//		});
		Thread.sleep(2000);
		Register.execute(driver);
	}	
}
