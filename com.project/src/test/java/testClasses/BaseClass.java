package testClasses;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import UtilityClasses.ScreenshotClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseClass {
  public static WebDriver driver;
  static Properties p;
  
  
 
  
  	public static void readproperty() throws IOException {
  		p= new Properties();
  		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\configuration.properties");
  		p.load(fs);
  		
  	}
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  readproperty(); 
	  driver.get(p.getProperty("base_url"));
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
  }
  @BeforeClass
  public void beforeclass()
  {
	  driver=new ChromeDriver();
  }
  

  @AfterMethod
	public void afterMethod(ITestResult itr) throws IOException {

		//if (itr.getStatus() == ITestResult.FAILURE) {

			//ScreenshotClass.takeScreenshot(driver, itr.getName());

		//}
	  driver.quit();
  }
  @BeforeSuite(alwaysRun = true)
  public void createReport(final ITestContext testContext)
  {
	  extentReport.ExtentManager.createInstance();
  }
  @AfterSuite
  public void aftersuit() {
	  System.out.println("********Execution completed******");
  }

}
