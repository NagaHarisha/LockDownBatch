package com.erp.customer_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.erp.utilities.BaseClass;
import com.erp.utilities.ExcelOperation;
import com.erp.webpages.ActiveProjectsandCustomersPage;
import com.erp.webpages.AddNewCustomerPage;
import com.erp.webpages.OpenTaskPage;

public class CreateCustomer extends BaseClass
{
	@Test
public void testcreateCustomer() throws EncryptedDocumentException, IOException
{
	String customername=ExcelOperation.readdata("Sheet1",1,2);
	String description=ExcelOperation.readdata("Sheet1",4,2);
	
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickonProjectsandCustomersLink();
	log.info("**********clicked projects and customers links**********");
	ActiveProjectsandCustomersPage apcp=new ActiveProjectsandCustomersPage();
	apcp.clickonAddNewCustomerButton();
	log.info("**********add new customer button clicked**********");
	AddNewCustomerPage ancp=new AddNewCustomerPage();
	ancp.entercustomernameintextfield(customername);
	log.info("**********customer name entered**********");
	ancp.entercustomerDescriptionTextarea(description);
	log.info("**********customer description entered**********");
	ancp.clickoncreateCustomerButton();
	log.info("**********created customer button clicked**********");
	String s=apcp.retriveSuccessmsg();
	System.out.println(s);
	log.info("**********success message retrived**********");
}

}
