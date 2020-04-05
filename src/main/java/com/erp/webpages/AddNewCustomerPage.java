package com.erp.webpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.utilities.BaseClass;
import com.erp.utilities.ExcelOperation;

public class AddNewCustomerPage 
{
	@FindBy(name="name")
private WebElement CustomerNameTextField;
	
@FindBy(name="description")
private WebElement CustomerDescriptionTextArea;

@FindBy(name="createCustomerSubmit")
private WebElement createCustomerButton;

public AddNewCustomerPage()
{
	PageFactory.initElements(BaseClass.driver,this);
}

public void entercustomernameintextfield(String customername) throws EncryptedDocumentException, IOException
{
		CustomerNameTextField.sendKeys(customername);
}

public void entercustomerDescriptionTextarea(String description) throws EncryptedDocumentException, IOException
{
		CustomerDescriptionTextArea.sendKeys(description);
}

public void clickoncreateCustomerButton()
{
	createCustomerButton.click();
}
}
