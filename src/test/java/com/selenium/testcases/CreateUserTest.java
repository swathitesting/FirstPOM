package com.selenium.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.pages.LoginPage;
import com.selenium.pages.TimeTrackPage;
import com.selenium.pages.UsersPage;
import com.selenium.popup.CreateUserPagePopUp;

public class CreateUserTest 
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
	//driver.close();
    //driver.quit();
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
	LoginPage lp = new LoginPage(driver);
	lp.typeUserName("admin");
	lp.typePassword("manager");
	lp.clickOnLoginBtn();
	Thread.sleep(3000);
	TimeTrackPage ttp = new TimeTrackPage(driver);
	//Thread.sleep(2000);
	ttp.clickUsersTab();
	Thread.sleep(2000);
	UsersPage up = new UsersPage(driver);
	up.clickOnAddUserBtn();
	Thread.sleep(2000);
    CreateUserPagePopUp cupp = PageFactory.initElements(driver,CreateUserPagePopUp.class);	
	Thread.sleep(2000);
    cupp.enterFirstName("Nihar");
    cupp.enterLastName("seema");
    cupp.enterUserName("nihars");
    cupp.enterPassword("nihar");
    cupp.enterRetypePassword("nihar");
    cupp.clickOnCreateUserBtn();
	Thread.sleep(2000);
    ttp.clickLogoutLink();
	
}

}