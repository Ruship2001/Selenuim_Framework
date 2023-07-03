package testCases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageLayout.LoginPage;
import testUtilities.XLUtils;

public class TC_Login_DDT_002 extends Baseclass {
	
	@Test(dataProvider = "LoginData")
	public void LoginDDT(String user, String pass) throws IOException {
		Logger demoLogger=LogManager.getLogger(TC_Login_DDT_002.class.getName());

		LoginPage lp=new LoginPage(driver);
		lp.setUsername(user);
		lp.setPassword(pass);
		lp.clickSubmit();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		String tName="LoginFailed"+timeStamp;
		boolean lgp=isAlertPresent();
		if(lgp==true) {
			driver.switchTo().alert().accept();
		demoLogger.warn("login failed");
			captureScreen(driver,tName);
		}
		else {
			lp.clickLogout();
			driver.switchTo().alert().accept();
	demoLogger.info("login pass");
		}
		
	}
	public boolean isAlertPresent() {
		try {
		driver.switchTo().alert();
		return true;
	}
	catch(Exception e){
		return false;
		
	}	
		}
	@DataProvider(name="LoginData")
    String[][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"/src/test/java/testData/LoginData.xlsx";
	//	XLUtils xlsd=new XLUtils();
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1", 1);
	String loginData[][] =new String[rowcount][colcount];
	for(int i=1;i<=rowcount;i++) {
		for(int j=0;j<colcount;j++) {
		loginData[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
		
		}
	}
	return loginData;
	}
}
