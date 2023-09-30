package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("data/CreateLead.xlsx");
		
		XSSFSheet sheet = wb.getSheetAt(0);
		//total rows
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total Number of Rows"+rowcount);
		//total columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total Number of Columns"+columnCount);
		
		//for loop to get all data from excel
		
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String cellValue = row.getCell(j).getStringCellValue();
				System.out.println(cellValue);
			}
			
		}
	}

}
