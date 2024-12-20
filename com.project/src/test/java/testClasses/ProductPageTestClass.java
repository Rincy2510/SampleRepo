package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageClasses.HomePageClass;
import PageClasses.LoginPageClass;
import PageClasses.ManageUsersPageClass;
import PageClasses.ProductPageClass;

public class ProductPageTestClass extends BaseClass {
	LoginPageClass lp;
	HomePageClass hp;
	ManageUsersPageClass mp;
	ProductPageClass pp;
  @Test
  public void verifyProductsPageIsOpenWhileClickingOnListProducts() {
	  lp = new LoginPageClass(driver);
	  hp=lp.login("admin", "123456");
	  hp.clickOnEndTour();
	  pp=hp.producttab();
	  String actualresult=pp.productpageVisible();
	  Assert.assertTrue(true);
  }
  @Test
  public void verifyToCreateANewProduct() {
	  lp = new LoginPageClass(driver);
	  hp=lp.login("admin", "123456");
	  hp.clickOnEndTour();
	  pp=hp.producttab();
	  pp.detailsOfProductAdding();
	  String actualresult=pp.productaddedconfirmation();
	  Assert.assertTrue(actualresult.contains("gloves"));
  }
  @Test
  public void verifyToDeleteAddedProduct() {
	  lp = new LoginPageClass(driver);
	  hp=lp.login("admin", "123456");
	  hp.clickOnEndTour();
	  pp=hp.producttab();
	  pp.deleteSavedProduct();
	  String actualresult=pp.confirmingnorecords();
	  Assert.assertFalse(true);
	 
  }
}
