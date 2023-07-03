package pageLayout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	WebDriver ldriver;
	public AddCustomer(WebDriver rdriver){
		 ldriver=rdriver;
		 PageFactory.initElements(ldriver, this);
	 }
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement NewCustomer;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	WebElement Male;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement Female;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement NameCustomer;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[2]")
	WebElement Reset;
	
	
	@FindBy(xpath="//*[@id=\"dob\"]")
	@CacheLookup
	WebElement DOB;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	@CacheLookup
	WebElement Address;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement City;

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	@CacheLookup
	WebElement State;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	@CacheLookup
	WebElement Pincode;

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	@CacheLookup
	WebElement MoblieNo;

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	@CacheLookup
	WebElement submit;
	
	public void Reset() {
		Reset.click();
		
	}
	
	public void Gender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			Male.click();
		}
		else {
			Female.click();
		}
	}
	 public void AddCustomer() {
		 NewCustomer.click();
		 
	 }
	 public void setCustomername(String username) {
		 NameCustomer.sendKeys(username);
	 }
	 public void setDOB(String mm,String dd,String yyyy) {
		 DOB.sendKeys(dd);
		 DOB.sendKeys(mm);
		 DOB.sendKeys(yyyy);
	 }
	 public void setAddress(String address1) {
		 Address.sendKeys(address1);
	 }
	 public void setCity(String username) {
		 City.sendKeys(username);
	 }
	 public void setState(String username) {
		 State.sendKeys(username);
	 }
	 public void setPincode(String string) {
		 Pincode.sendKeys(String.valueOf(string));
	 }
	 public void setMoblie(String username) {
		 MoblieNo.sendKeys(username);
	 }
	 public void setEmail(String username) {
		 Email.sendKeys(username);
	 }
	   public void setPassword(String username) {
		 password.sendKeys(username);
	 }
	 
	   public void clickSubmit() {
			 submit.click();
		 }
}
