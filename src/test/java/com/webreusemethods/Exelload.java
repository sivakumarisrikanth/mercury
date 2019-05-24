package com.webreusemethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
   
public class Exelload  {
	 public XSSFWorkbook xsw;
	 
	public Exelload() {
	File src=new File("E:\\srikanth\\Mercury\\TestDataFile\\exel sample.xlsx");
	try {
		FileInputStream fis=new FileInputStream(src);
		 xsw=new XSSFWorkbook(fis);
	
	} catch (IOException e) {
		System.out.println("file is not found"+e.getMessage());
	}

}
	public String getstringdata(String Sheetname,int rownum,int cellnum) {
		return xsw.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
	}
	public String getnumericdata(String Sheetname,int rownum,int cellnum) {
		return xsw.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
	}
}
