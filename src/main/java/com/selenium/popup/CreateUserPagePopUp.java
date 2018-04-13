package com.selenium.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUserPagePopUp 
{
  @FindBy(id="userDataLightBox_firstNameField")
  public WebElement firstNameTxtFd; 
  
  @FindBy(id="userDataLightBox_lastNameField")
  public WebElement lastNameTxtFd;
  
  @FindBy(id="userDataLightBox_emailField")
  public WebElement emailIdTxtFd;
  
  @FindBy(id="userDataLightBox_usernameField")
  public WebElement userNameTxtFd;
  
  @FindBy(id="userDataLightBox_passwordField")
  public WebElement passwordTxtFd;
  
  @FindBy(id="userDataLightBox_passwordCopyField")
  public WebElement retypePasswdTxtFd;
  
  @FindBy(id="userDataLightBox_commitBtn")
  public WebElement createUserBtn;
  
  
  public void enterFirstName(String firstname)
  {
	  firstNameTxtFd.sendKeys(firstname);
  }
  
  public void enterLastName(String lastname)
  {
	  lastNameTxtFd.sendKeys(lastname);
  }
  
  public void enterEmailId(String emailid)
  {
	  emailIdTxtFd.sendKeys(emailid);
  }
  
  public void enterUserName(String name)
  {
	  userNameTxtFd.sendKeys(name);
  }
  
  public void enterPassword(String password)
  {
	  passwordTxtFd.sendKeys(password);
  }
  
  public void enterRetypePassword(String password)
  {
	  retypePasswdTxtFd.sendKeys(password);
  }
  
  public void clickOnCreateUserBtn()
  {
	  createUserBtn.click();
  }
  
  
 
}
