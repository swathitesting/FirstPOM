package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.pages.LoginPage;
import com.selenium.pages.TimeTrackPage;

public class ClickingOnTabs 
{
WebDriver driver;
    
    @BeforeClass
    public void openBrowser()
    {
    	System.out.println("@BeforeClass .... Openeing Browser");
    	System.setProperty("webdriver.chrome.driver", "driver_exefiles\\chromedriver.exe");
	    driver = new ChromeDriver();
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
  public void openApplication()
  {
	  System.out.println("BeforeMthod--- Opening Application ");
	  driver.get("http://localhost/login.do");
  }

 
  @Test
  public void clickOnTabs() throws InterruptedException
  {
	LoginPage lp = new LoginPage(driver);
	lp.typeUserName("admin");
	lp.typePassword("manager");
	lp.clickOnLoginBtn();
	Thread.sleep(3000);

	TimeTrackPage ttp = new TimeTrackPage(driver);
	ttp.clickTasksTab();
	Thread.sleep(2000);
	ttp.clickReportsTab();
	Thread.sleep(2000);
	ttp.clickUsersTab();
	Thread.sleep(2000);
	String profileLinkTxt = ttp.getProfileLinkText();
	System.out.println("Profile link text :"+profileLinkTxt);
	Thread.sleep(2000);
	ttp.clickLogoutLink();
  }	

}
