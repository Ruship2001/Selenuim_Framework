package testCases;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageLayout.AddCustomer;
import pageLayout.LoginPage;
import testUtilities.XLUtils;

public class TC_AddCust_001 extends Baseclass{
@Test
public void test() throws InterruptedException, IOException {
	Logger demoLogger=LogManager.getLogger(TC_AddCust_001.class.getName());
	String path=System.getProperty("user.dir")+"/src/test/java/testData/AddCustomer.xlsx";
		XLUtils xlsd=new XLUtils();
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1", 1);
	LoginPage lp=new LoginPage(driver);
	lp.setUsername(username);
	lp.setPassword(password);
	lp.clickSubmit();
	Thread.sleep(2000);
	AddCustomer ac=new AddCustomer(driver);
	ac.AddCustomer();
	Thread.sleep(2000);String loginData[][] =new String[rowcount][colcount];
	for(int i=1;i<=rowcount;i++) {
		Thread.sleep(1000);
		
	ac.setCustomername(xlsd.getCellData(path,"Sheet1", i, 0));
	Thread.sleep(1000);
	ac.Gender(xlsd.getCellData(path,"Sheet1", i, 1));
	ac.setDOB(xlsd.getCellData(path,"Sheet1", i, 2),xlsd.getCellData(path,"Sheet1", i, 3),xlsd.getCellData(path,"Sheet1", i, 4));
	Thread.sleep(2000);
ac.setAddress(xlsd.getCellData(path,"Sheet1", i, 5));
ac.setCity(xlsd.getCellData(path,"Sheet1", i, 6));
ac.setState(xlsd.getCellData(path,"Sheet1", i, 7));
ac.setPincode(xlsd.getCellData(path,"Sheet1", i, 8));
ac.setMoblie(xlsd.getCellData(path,"Sheet1", i, 9));
ac.setEmail(randomstring()+"@gmail.com");

ac.setPassword(xlsd.getCellData(path,"Sheet1", i, 10));
ac.Reset();
//driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[14]/td/a")).click();
Thread.sleep(2000);
}}
public String randomstring()
{
String email=RandomStringUtils.randomAlphabetic(8);
return email;
}
}
