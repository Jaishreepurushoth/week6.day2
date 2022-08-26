package week6.day2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {

	
	//@Test
	
	public static String[][] readData(String excelFileName) throws IOException  {
		
		XSSFWorkbook wbook = new XSSFWorkbook("data/"+excelFileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		short colCount = sheet.getRow(0).getLastCellNum();
		 System.err.println("rowcount "+rowCount);
		 System.err.println("cououmncount "+colCount);
		 
		 XSSFRow firstdatarow = sheet.getRow(1);
		 XSSFCell CompanyName = firstdatarow.getCell(0);
		 
		 String[][] data=new String[3][3];
		 for (int i = 1; i <= rowCount ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount ; j++) {
				XSSFCell cell = row.getCell(j);
				String val = cell.getStringCellValue();
			data[i-1][j]=val;
				System.out.println(cell.getStringCellValue());
			}
		}
	return data;
		
			
		}
		 
	}

