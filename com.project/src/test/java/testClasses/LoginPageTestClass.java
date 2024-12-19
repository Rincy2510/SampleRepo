package testClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import UtilityClasses.ExcelReadClass;

public class LoginPageTestClass extends BaseClass {
	LoginPageClass lp;
	HomePageClass hp;
	
  @Test
  public void verifySuccessfullLogin() throws IOException {
	  lp = new LoginPageClass(driver);
	  hp=lp.login(ExcelReadClass.getStringdata(0, 0),ExcelReadClass.getIntegerdata(0, 1));
	  hp.clickOnEndTour();
	  String actualresult = hp.getTextOfWelcomeAdmin();
	  Assert.assertTrue(actualresult.contains(ExcelReadClass.getStringdata(4, 0)));
	  
  }
  @Test(dataProviderClass = DataProviderTestClass.class,dataProvider="unsuccessfullLogin")
  public void verifyUnSuccessfullLogin(String uname,String passw)
  {	  
	  lp = new LoginPageClass(driver);
	  hp=lp.login(uname,passw);
	   String actualresult=lp.errorMessageInUnSuccessfullLogin();
	  Assert.assertTrue(actualresult.contains("do not match our records."));
  }
  
  @Test
  public void verifyTheRememberMeCheckBoxIsSelectedByDefault()
  {
	  lp= new LoginPageClass(driver);
	  boolean actualresult=lp.rememberCheckbox();
	  Assert.assertFalse(actualresult);  
  }

  @Test
  public void verifyResetPasswordPageComingWhileClickingOnForgotPassword()
  
  {
	  
	  lp=new LoginPageClass(driver);
	  lp.forgotpassword();
	  boolean actualresult=lp.resetpassword();
	  Assert.assertTrue(actualresult);

  }
  
}
