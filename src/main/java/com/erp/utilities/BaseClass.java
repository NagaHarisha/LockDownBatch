package com.erp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
public static ChromeDriver driver;
public static Logger log;
FileInputStream fis;
Properties p1;
@BeforeTest
public void openBrowser() throws IOException
{
	log=Logger.getLogger(BaseClass.class);
	PropertyConfigurator.configure("log4j.properties");
	fis=new FileInputStream(System.getProperty("user.dir")+"//App.properties");
	p1=new Properties();
	p1.load(fis);
	System.setProperty("webdriver.chrome.driver","c://drivers//chromedriver.exe");
	driver=new ChromeDriver();
	log.info("**********browser opened**********");
	driver.get(p1.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	log.info("**********window maximized**********");
}
@AfterTest
public void closeBrowser()
{
	driver.close();
	log.info("**********browser closed**********");
}
@BeforeClass
public void testlogin()
{
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	log.info("*************actitime login successfulll*******");
}
@AfterClass
public void testLogout()
{
	driver.findElement(By.className("logoutImg")).click();
	log.info("**********actitime logout sucessfulll***********");
	
}
}
