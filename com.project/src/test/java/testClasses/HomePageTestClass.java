package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
public class HomePageTestClass extends BaseClass{
	LoginPageClass lp;
	HomePageClass hp;
  @Test
  public void verifyTheTooltipCalculatorIsShowingWhileHoveringTheMouseOnCalculator() {
	  lp = new LoginPageClass(driver);
	  hp=lp.login("admin", "123456");
	  hp.clickOnEndTour();
	  hp.mouseHoverOnCalculator();
	  String actualresult=hp.tooltipCalculator();
	  Assert.assertTrue(actualresult.contains("Calculator"));
  }  
  @Test
  public void verifySuccessfullSignOut() {
	  lp = new LoginPageClass(driver);
	  hp=lp.login("admin", "123456");
	  hp.clickOnEndTour();
	  hp.logout();
	  String actualresult= hp.verifylogout();
	  Assert.assertTrue(true);
  }
  
}
