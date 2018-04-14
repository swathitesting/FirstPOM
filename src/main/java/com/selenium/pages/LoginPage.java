package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{ 
  @FindBy(id="username")
  private WebElement userNameElement;
  @FindBy(name="pwd")
  private WebElement passwordElement;
  @FindBy(id="loginButton")
  private WebElement loginBtnElement;
  @FindBy(id="keepLoggedInCheckBox")
  private WebElement keepMeLoggedInCheckBox;
  @FindBy(id="headerContainer")
  private WebElement headerElement;
  
  public WebDriver driver;
    
  public LoginPage(WebDriver driver) 
  {
	this.driver = driver;
	PageFactory.initElements(driver,this);
  }

public void typeUserName(String name)
  {
	  userNameElement.sendKeys(name);
  }
  
  public void typePassword(String password)
  {
	  passwordElement.sendKeys(password);
  }
  
  public void clickOnLoginBtn()
  {
	  loginBtnElement.click();
  }
  
  public void clickOnCheckBox(boolean check)
  {
      if(check && !keepMeLoggedInCheckBox.isSelected())	 //assume if check is true
    	keepMeLoggedInCheckBox.click();
    else if(!check && keepMeLoggedInCheckBox.isSelected()) //assume not check
    	keepMeLoggedInCheckBox.click();
   	
  }
  
  public String getHearderText()
  {
	 return headerElement.getText();  
  }


}
