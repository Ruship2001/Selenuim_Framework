package pageLayout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		 ldriver=rdriver;
		 PageFactory.initElements(ldriver, this);
	 }
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement logout;
	
	 @FindBy(name="uid")
	 @CacheLookup
	 WebElement userName;
	 
	 @FindBy(name="password")
	 @CacheLookup
	 WebElement password;
	 
	 @FindBy(name="btnLogin")
	 @CacheLookup
	 WebElement submit;
	 
	 public void clickLogout() {
		 logout.click();
	 }
	 public void setUsername(String username) {
		 userName.sendKeys(username);
	 }
	 public void setPassword(String pass) {
		 password.sendKeys(pass);
	 }
	 public void clickSubmit() {
		 submit.click();
	 }
}
