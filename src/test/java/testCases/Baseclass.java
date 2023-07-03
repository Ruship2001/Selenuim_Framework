package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testUtilities.Readconfig;



public class Baseclass {
	Readconfig rc=new Readconfig();
		
public String baseURL=rc.getApplicationURL();
public String username=rc.getUsername();
public String password=rc.getPassword();
public static WebDriver driver;

public static Logger logger;

@BeforeClass
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RUSHIKESH PAWAR\\eclipse-workspace\\FirstMav1\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseURL);
	
}
@AfterClass
public void teardown() {
	driver.quit();
}
public void captureScreen(WebDriver driver,String tName) throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+ "/screenShot/" + tName + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
	
}
}
