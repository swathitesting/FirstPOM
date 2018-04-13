package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.pages.LoginPage;
import com.selenium.pages.TimeTrackPage;

public class LoginAndLogoutTestCase 
{
	WebDriver driver;
    
    @BeforeClass
    public void openBrowser()
    {
    	System.out.println("@BeforeClass .... Openeing Browser");
    	System.setProperty("webdriver.chrome.driver", "driver_exefiles\\chromedriver.exe");
	    driver = new ChromeDriver();
//    	System.setProperty("webdriver.gecko.driver", "driver_exefiles\\geckodriver.exe");
//        driver = new FirefoxDriver();
	  
		driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


    }
 
  @AfterClass
    public void closeBrowser()
    {
    	driver.close();
        driver.quit();
    	System.out.println("@AfterClass....Closing Browser");

    }
  
  @BeforeMethod
  public void openApplication() throws InterruptedException
  {
	  System.out.println("BeforeMthod--- Opening Application ");
	  driver.get("http://localhost/login.do");
	  Thread.sleep(2000);
  }

 
  @Test
  public void loginAndLogout() throws InterruptedException
  {
	//driver pointing to login page  
	LoginPage lp = new LoginPage(driver);
	lp.typeUserName("admin");
	lp.typePassword("manager");
	lp.clickOnLoginBtn();
	Thread.sleep(2000);

	
	//now driver pointing to time track page
	TimeTrackPage ttp = new TimeTrackPage(driver);
	Thread.sleep(3000);
	ttp.clickLogoutLink();
	
  }


}
