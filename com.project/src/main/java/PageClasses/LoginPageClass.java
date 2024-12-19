package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.GeneralUtilities;

public class LoginPageClass {
	
WebDriver driver;
GeneralUtilities gl = new GeneralUtilities();


public LoginPageClass(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(id="username") 
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(css="button[type='submit']")
WebElement login;

@FindBy(name = "remember")
WebElement rememberme;

@FindBy(xpath="//a[contains(@href,'https://qalegend.com/billing/public/password/reset')]")
WebElement forgetpassword;

@FindBy(xpath ="//div[contains(text(),'Reset Password')]")
WebElement resetpassword;

@FindBy(xpath = "//strong[contains(text(),'These credentials do not match')]")
WebElement unsuccessloginerrormessage;


public HomePageClass login(String nm,String pswd)
{
	gl.enterValuesOnElement(username,nm);
	gl.enterValuesOnElement(password, pswd);
	gl.clickOnElement(login);
	return new HomePageClass(driver);
}
public boolean rememberCheckbox() {
	return gl.elementIsSelected(rememberme);
	
}
public void forgotpassword() {
	gl.clickOnElement(forgetpassword);
	
}
public boolean resetpassword() {
	return gl.elementIsDisplayed(resetpassword);
	
}
public String errorMessageInUnSuccessfullLogin() {
	return gl.getTextOfElement(unsuccessloginerrormessage);
}


}
