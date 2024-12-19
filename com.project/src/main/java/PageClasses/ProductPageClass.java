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
@FindBy(xpath = "//button[contains(@class,'submit_product_form')]")
WebElement savebutton;


public String productpageVisible() {
	gl.elementIsDisplayed(productlisting);
	return null;
}
public void detailsOfProductAdding() {
	
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
	
}