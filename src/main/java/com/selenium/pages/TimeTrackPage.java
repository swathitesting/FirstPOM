package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage
{   
	@FindBy(className="tasks")
	public WebElement tasksTab;
    @FindBy(className="reports")
	public WebElement reportsTab;
    @FindBy(className="users")
	public WebElement usersTab;
    @FindBy(className="userProfileLink ")
	private WebElement profileLink;
    @FindBy(id="logoutLink")
	private WebElement logoutLink;
	private WebDriver driver;
	    
	public TimeTrackPage(WebDriver driver) 
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
	
	public void clickUsersTab() 
	{
	  usersTab.click();
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
	
		
}
