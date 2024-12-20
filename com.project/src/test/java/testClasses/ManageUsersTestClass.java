package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import PageClasses.ManageUsersPageClass;

public class ManageUsersTestClass extends BaseClass{
	LoginPageClass lp;
	HomePageClass hp;
	ManageUsersPageClass mp;
	
	
  @Test
  public void verifyTheManageUsersPageIsOpenWhileClickingOnUsers() {
	  lp = new LoginPageClass(driver);
	  hp=lp.login("admin", "123456");
	  hp.clickOnEndTour();
	  hp.clickOnUserManagement();
      mp=hp.clickOnUsers();
      String actualresult=mp.manageUserPageOpened();
      Assert.assertEquals(actualresult,"All users");
  }    
      @Test
      public void verifyTheAddedUserIsVisibleInTheAllUserList() {
    	  lp = new LoginPageClass(driver);
    	  hp=lp.login("admin", "123456");
    	  hp.clickOnEndTour();
    	  hp.clickOnUserManagement();
          mp=hp.clickOnUsers();
	      mp.addDetailsOfNewUser("Rincy", "RincyBabu@gmail.com", "RinBab", "RinBab");
          String actualresult=mp.searchSavedUser();
          Assert.assertEquals(actualresult, "Rincy");
          
      }
}
