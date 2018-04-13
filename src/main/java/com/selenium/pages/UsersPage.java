package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UsersPage 
{
	private WebElement tasksTab;  
	private WebElement reportsTab;
	private WebElement timeTrackTab;
	private WebElement profileLink;
	private WebElement logoutLink;
	
	private WebElement headerElement;
	private WebElement addUserBtnElement;
	private WebElement userLinkElement;
	private WebElement userAccountsLeftElement;
	private WebDriver driver;
    
	public UsersPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	
	public void clickTasksTab() 
	{
	  tasksTab.click();
	}
	public void clickReportsTab() 
	{
		reportsTab.click();
	}
	
	public void clickTimeTrackTab() 
	{
		timeTrackTab.click();
	}
	
	public void clickProfileLink() 
	{
	  profileLink.click();
	}
	
	public String getProfileLinkText() 
	{
	  return profileLink.getText().trim();
	}
	
	public void clickLogoutLink() 
	{
	  logoutLink.click();
	}
	
    public String getHeaderText()
    {
    	return headerElement.getText().trim();
    }
    
    public void clickOnAddUserBtn()
    {
    	addUserBtnElement.click();
    }
    
    public void clickOnUserLink()
    {
    	userLinkElement.click();
    }

    public String getUserAccountsLeftText()
    {
    	return userAccountsLeftElement.getText().trim();
    }
}
