package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.ExplicitWaitClass;
import UtilityClasses.GeneralUtilities;

public class HomePageClass {

	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();
	ExplicitWaitClass ew = new ExplicitWaitClass();

	public HomePageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[text()='End tour']")
	WebElement endTour;
	@FindBy(xpath="//h1[contains(text(),'Welcome Admin')]")
	WebElement welcomeAdminHeading;
	@FindBy(xpath = "//i[contains(@class,'fa fa-calculator fa-lg')]")
	WebElement calculator;
	@FindBy(xpath ="//div[contains(@class,'tooltip-inner')]")
	WebElement tooltip;
	@FindBy(xpath = "//span[contains(text(),'User Management')]")
	WebElement usermanagement;
	@FindBy(xpath = "//span[contains(text(),'Users')]")
	WebElement users;
	@FindBy(xpath = "//span[contains(text(),'Admin')]")
	WebElement adminbutton;
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	WebElement signout;
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement Login;
	@FindBy(xpath = "//span[starts-with(text(),'Products')]")
	WebElement product;
	@FindBy(xpath = "//a[contains(text(),'List Products')]")
	WebElement listproduct;
	@FindBy(xpath = "//a[contains(text(),'Add Product')]")
	WebElement addproductbutton;
	
	public void clickOnEndTour() {
		
		gl.clickOnElement(endTour);
	}
	public String getTextOfWelcomeAdmin() {
		return gl.getTextOfElement(welcomeAdminHeading);
	}
	
	public void mouseHoverOnCalculator()
	{
		gl.mouseHover(driver,calculator);
	}
	public String tooltipCalculator() {
		ew.presenceOfElementLocatedWaitXpath(driver,"//div[contains(@class,'tooltip-inner')]");
		return gl.getTextOfElement(tooltip);
		
	}
	public void clickOnUserManagement() {
		gl.clickOnElement(usermanagement);
	}
	public ManageUsersPageClass clickOnUsers() {
		gl.clickOnElement(users);
		return new ManageUsersPageClass(driver);
	}
	public void logout() {
		gl.clickOnElement(adminbutton);
		gl.clickOnElement(signout);	
	}
	public String verifylogout() {
		gl.elementIsDisplayed(Login);
		return null;
		
	}
	public ProductPageClass producttab()
	{
		gl.clickOnElement(product);
		gl.clickOnElement(listproduct);
		return new ProductPageClass(driver);
	}
	public ProductPageClass addproduct() {
		gl.clickOnElement(product);
		return new ProductPageClass(driver);
	}
}
