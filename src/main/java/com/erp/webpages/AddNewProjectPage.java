package com.erp.webpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.erp.utilities.BaseClass;
import com.erp.utilities.ExcelOperation;

public class AddNewProjectPage
{
	@FindBy(name="customerId")
	private WebElement CustomerNamedropdown;
	
	@FindBy(name="name")
	private WebElement ProjectNameTextField;
	
	@FindBy(name="description")
	private WebElement ProjectDescriptionTextArea;
	
	@FindBy(name="createProjectSubmit")
	private WebElement CreateProjectButton;
	
	public AddNewProjectPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void selectcustomernamefromdropdown(String customername) throws EncryptedDocumentException, IOException
	{
		Select s1=new Select(CustomerNamedropdown);
		s1.selectByVisibleText(customername);
	}
	
	public void enterprojectnameTextField(String projectname) throws EncryptedDocumentException, IOException
	{
		ProjectNameTextField.sendKeys(projectname);
	}
	
	public void enterprojectdescriptiontextarea(String description) throws EncryptedDocumentException, IOException
	{
		ProjectDescriptionTextArea.sendKeys(description);
	}
	
	public void clickonCreateProjectButton()
	{
		CreateProjectButton.click();
	}
}

