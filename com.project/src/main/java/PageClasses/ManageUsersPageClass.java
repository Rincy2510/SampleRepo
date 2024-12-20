package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.GeneralUtilities;

public class ManageUsersPageClass {
	
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();

public ManageUsersPageClass(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);

}
@FindBy(xpath = "//h3[contains(text(),'All users')]")
WebElement users;
@FindBy(xpath = "//a[contains(@class,'btn btn-block btn-primary')]")
WebElement addbutton;
@FindBy(xpath = "//input[contains(@id,'first_name')]")
WebElement firstName;
@FindBy(xpath = "//input[contains(@id,'email')]")
WebElement email;
@FindBy(name="password")
WebElement pswd;
@FindBy(id="confirm_password")
WebElement confirmPassword;
@FindBy(id="submit_user_button")
WebElement saveButton;
@FindBy(xpath = "//input[contains(@class,'form-control input-sm')]")
WebElement usersearch;
@FindBy(xpath="//table[contains(@id,'users_table')]/tbody/tr/td[2]")
WebElement searchresult;


public String manageUserPageOpened() {
	return gl.getTextOfElement(users);
}
public  void  addDetailsOfNewUser(String name,String mail,String psd,String cnfmpsd) {
	gl.clickOnElement(addbutton);
	gl.enterValuesOnElement(firstName, name);
	gl.enterValuesOnElement(email, mail);
	gl.enterValuesOnElement(pswd, psd);
	gl.enterValuesOnElement(confirmPassword, cnfmpsd);
	gl.clickOnElement(saveButton);	
}

public String searchSavedUser() {
	gl.enterValuesOnElement(usersearch,"Rincy" );
	gl.pressEnterKey(driver);
	return gl.getTextOfElement(searchresult);
}



}