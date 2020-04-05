package com.erp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation 
{
public static String readdata(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("C:\\selenium programs\\practice programs\\ERP\\testdata\\userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	String s=w1.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	return s;
}
public static void writedata(String Sheetname,int rownum,int cellnum,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("C:\\selenium programs\\practice programs\\ERP\\testdata\\userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	w1.getSheet(Sheetname).createRow(rownum).createCell(cellnum).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("C:\\selenium programs\\practice programs\\ERP\\testdata\\userdata.xlsx");
	w1.write(fos);
}
}
