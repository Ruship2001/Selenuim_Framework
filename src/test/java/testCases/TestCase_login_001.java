package testCases;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageLayout.LoginPage;
import org.apache.logging.log4j.*;
public class TestCase_login_001 extends Baseclass {
	
	@Test
	public void LoginTest() throws IOException {
		Logger demoLogger=LogManager.getLogger(TestCase_login_001.class.getName());
		demoLogger.info("click succesful");
		demoLogger.error("hii");
		demoLogger.debug("debug");
		
	
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equalsIgnoreCase("guru99 ank Manager homepage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"LoginTest");
			
			//Assert.assertTrue(false);
		}
	}

}
