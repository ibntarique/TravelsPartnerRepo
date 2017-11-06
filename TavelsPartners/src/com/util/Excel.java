package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
	
	public void data() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		FileInputStream fis = new FileInputStream(".//Excel.xlsx");
		
		WorkbookFactory wf = new WorkbookFactory();

		Workbook wb = wf.create(fis);
		
		Sheet s = wb.getSheet("LoginTest");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(1);
		
		
	}

}
