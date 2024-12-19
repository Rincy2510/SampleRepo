package UtilityClasses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
		
		public void clickOnElement(WebElement element)
		{
			element.click();
		}
		public void enterValuesOnElement(WebElement element , String text)
		{
			element.sendKeys(text);
		}
		public void enterValuesOnElementnum(WebElement element ,int num)
		{
			element.sendKeys(String.valueOf(num));
		}
		public String getTextOfElement(WebElement element)
		{
			return element.getText();
		}
		public String getAttributeOfElement(WebElement element,String attribute)
		{
			return element.getAttribute(attribute);
		}
		public String getTitleOfThePage(WebDriver driver)
		{
		return driver.getTitle();
		}
		
		public void addThreadSleep() throws InterruptedException
		{
			Thread.sleep(3000);
		}
		public void scrollToFindAnElement(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
		}
		public void clickOnElement(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",element);
		}
		public String getTextOfAlertMessage(WebDriver driver)
		{
			return driver.switchTo().alert().getText();
		}
		public void acceptTheAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		public void dismissTheAlert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		public void sendValueTotheAlert(WebDriver driver,String value)
		{
			driver.switchTo().alert().sendKeys(value);
		}
		
		public void selectByIndexDorpDown(WebElement element, int index)
		{
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		public void selectByValue(WebElement element,String value)
		{
			Select select = new Select(element);
			select.selectByValue(value);
		}
		public void selectByVisibleText(WebElement element,String text)
		{
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}
		public void deselectByIndexDorpDown(WebElement element, int index)
		{
			Select select = new Select(element);
			select.deselectByIndex(index);
		}
		public void deselectByValue(WebElement element,String value)
		{
			Select select = new Select(element);
			select.deselectByValue(value);
		}
		public void deselectByVisibleText(WebElement element,String text)
		{
			Select select = new Select(element);
			select.deselectByVisibleText(text);
		}
		public void getFirstSelectedOption(WebElement element,String text)
		{
			Select select = new Select(element);
			WebElement selected = select.getFirstSelectedOption();
			selected.getText();
		}
		public void getAllSelectedOptions(WebElement element,int index,String value,String text)
		{
			Select select = new Select(element);
			select.selectByIndex(index);
			select.selectByValue(value);
			select.selectByVisibleText(text);
			List<WebElement>selected = select.getAllSelectedOptions();
			for(WebElement webelement:selected)
			{
				webelement.getText();
			}
		}
		public boolean multipleElementsAreSelected(WebElement element,int index,String value,String text)
		{
			Select select = new Select(element);
			select.selectByIndex(index);
			select.selectByValue(value);
			select.selectByVisibleText(text);
			List<WebElement>selected = select.getAllSelectedOptions();
			for(WebElement webelement:selected)
			{
				webelement.getText();
			}
			return select.isMultiple();
		}
		public boolean isEmpty(WebElement element,int index,String value,String text)
		{
			Select select = new Select(element);
			select.selectByIndex(index);
			select.selectByValue(value);
			select.selectByVisibleText(text);
			List<WebElement>selected = select.getAllSelectedOptions();
			for(WebElement webelement:selected)
			{
				webelement.getText();
			}
			select.deselectAll();
			return selected.isEmpty();		
		}
		public void pressEnterKey(WebDriver driver) {
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.ENTER).build().perform();
		}
		public void clearAll(WebElement element)
		{
		element.clear();
		}

		public String getCssValue(WebElement element,String value)
		{
			return element.getCssValue(value);
			
		}
		public boolean elementIsEnabled(WebElement element)
		{
			return element.isEnabled();
		}
		public boolean elementIsSelected(WebElement element)
		{
			return element.isSelected();
		}
		public boolean elementIsDisplayed(WebElement element)
		{
			return element.isDisplayed();
		}
		public void dragAndDrop(WebDriver driver,WebElement dragsource,WebElement droptarget)
		{
			Actions actions = new Actions(driver);
			actions.dragAndDrop(dragsource, droptarget).build().perform();		
		}
		public void mouseHover(WebDriver driver,WebElement element) {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
			actions.keyDown(element,Keys.ENTER).build().perform();
		}
			
		

	}


