package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.FileUpload;
import UtilityClasses.GeneralUtilities;

public class ProductPageClass {
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();

public ProductPageClass(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//h1[starts-with(text(),'Products')]")
WebElement productlisting;
@FindBy(xpath = "//a[contains(@class,'btn-primary')]")
WebElement addbutton;
@FindBy(xpath = "//input[contains(@class,'form-')]")
WebElement productname;
@FindBy(xpath = "//input[contains(@id,'alert_quantity')]")
WebElement alertquantity;
@FindBy(xpath = "//div[contains(@class,'btn btn-primary btn-file')]")
WebElement imagebowsing;
@FindBy(xpath = "//input[contains(@name,'expiry_period')]")
WebElement expiresin;
@FindBy(xpath = "(//input[contains(@placeholder,'Exc. tax')])[1]")
WebElement exctax;
@FindBy(xpath = "(//input[contains(@placeholder,'Exc. tax')])[2]")
WebElement tax1;
@FindBy(xpath = "//button[@value='submit']")
WebElement savebutton;
@FindBy(xpath = "//input[contains(@class,'form-control input-sm')]")
WebElement search;
@FindBy(xpath = "//table[contains(@id,'product_table')]/tbody/tr[2]/td[12]")
WebElement actions;
//@FindBy(css = ("a.delete-product[href=\"https://qalegend.com/billing/public/products/2195\"]"))
//WebElement deleteButton;
//@FindBy(xpath = "//a[@class='delete-product']")
//WebElement deleteBtn;
@FindBy(xpath = "//button[text()='OK']")
WebElement OkayButton;
@FindBy(xpath="//table[contains(@id,'product_table')]/tbody/tr[2]/td[3]")
WebElement prodcutdeleted;




public String productpageVisible() {
	gl.elementIsDisplayed(productlisting);
	return null;
}
public void detailsOfProductAdding() {
	
	gl.clickOnElement(addbutton);
	gl.enterValuesOnElement(productname,"gloves");
	gl.enterValuesOnElementnum(alertquantity, 2);	
	gl.enterValuesOnElementnum(expiresin, 12);
	gl.clickOnElement(imagebowsing);
	FileUpload.uploadingfile(imagebowsing,System.getProperty("user.dir")+"\\com.project\\src\\main\\resources\\gloves.jpg");
	gl.scrollToFindAnElement(driver,exctax);
	gl.enterValuesOnElementnum(exctax, 100);
	gl.enterValuesOnElementnum(tax1, 200);
	gl.clickOnElement(savebutton);
	
}
public String productaddedconfirmation() {
	return gl.getTextOfElement(search);
}

public void deleteSavedProduct() {
	gl.clickOnElement(productlisting);
	gl.enterValuesOnElement(search,"gloves");
	gl.clickOnElement(actions);
	//gl.clickOnElement(deleteButton);
	gl.clickOnElement(OkayButton);
	
}
public String confirmingnorecords() {
	gl.elementIsDisplayed(prodcutdeleted);
	return null;
	
}
	
}