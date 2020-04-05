package com.erp.project_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.erp.utilities.BaseClass;
import com.erp.utilities.ExcelOperation;
import com.erp.webpages.ActiveProjectsandCustomersPage;
import com.erp.webpages.AddNewProjectPage;
import com.erp.webpages.OpenTaskPage;

public class CreateProject extends BaseClass
{
	@Test
public void testCreateProject() throws EncryptedDocumentException, IOException
{
	String customername=ExcelOperation.readdata("Sheet1",4,2);
	String projectname=ExcelOperation.readdata("Sheet1",2,2);
	String description=ExcelOperation.readdata("Sheet1",3,2); 
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickonProjectsandCustomersLink();
	log.info("**********clicked projects and customers links**********");
	ActiveProjectsandCustomersPage apcp=new ActiveProjectsandCustomersPage();
	apcp.clickonAddNewProjectButton();
	log.info("**********add new project button clicked**********");
	AddNewProjectPage anpp=new AddNewProjectPage();
	anpp.selectcustomernamefromdropdown(customername);
	log.info("**********customer name clicked from dropdown**********");
	anpp.enterprojectnameTextField(projectname);
	log.info("**********project name entered**********");
	anpp.enterprojectdescriptiontextarea(description);
	log.info("**********project description entered**********");
	anpp.clickonCreateProjectButton();
	log.info("**********created project button clicked**********");
	String s=apcp.retriveSuccessmsg();
	System.out.println(s);
	log.info("**********success message retrived**********");
}
}
