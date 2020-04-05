package com.erp.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.utilities.BaseClass;

public class ActiveProjectsandCustomersPage
{
	@FindBy(xpath="//input[@value='Add New Customer']")
 private WebElement AddNewCustomerButton;
 
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement AddNewProjectButton;
	
	@FindBy(className="successmsg")
	private WebElement SucessMsg;
	
 public ActiveProjectsandCustomersPage()
 {
	 PageFactory.initElements(BaseClass.driver,this);
 }
 
 public void clickonAddNewCustomerButton()
 {
	 AddNewCustomerButton.click();
 }
 
 public void clickonAddNewProjectButton()
 {
	 AddNewProjectButton.click();
 }
 
 public String retriveSuccessmsg()
 {
	String s= SucessMsg.getText();
	return s;
 }
}
