package UtilityClasses;

import org.openqa.selenium.WebElement;

public class FileUpload {

	public static void uploadingfile(WebElement element, String filepath)
	{
		element.sendKeys(filepath);
	}
}
