package BUSINESSNEXT.NBOG7.COMMON;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BUSINESSNEXT.SBCGOLD8.REPOSITORY.*;

public class TestDataFromExcel implements Properties {
	
	public static String Password;
	public static String SSO;
	public static String Checker;
	public static String Authorizer ;
	public static String ComplianceMaker	;
	public static String ComplianceChecker;
	





public static void DataRead() throws IOException {

//public static void main (String [] args) throws IOException{

FileInputStream fs = new FileInputStream(ExcelInputPath);
//Creating a workbook
XSSFWorkbook workbook = new XSSFWorkbook(fs);
XSSFSheet sheet = workbook.getSheetAt(0);



Password=sheet.getRow(0).getCell(1).getStringCellValue();
SSO=sheet.getRow(1).getCell(1).getStringCellValue();
Checker=sheet.getRow(2).getCell(1).getStringCellValue();
Authorizer=sheet.getRow(3).getCell(1).getStringCellValue();
ComplianceMaker=sheet.getRow(4).getCell(1).getStringCellValue();
ComplianceChecker=sheet.getRow(5).getCell(1).getStringCellValue();


Row row1 = sheet.getRow(1);
Cell cell1 = row1.getCell(1);
System.out.println(sheet.getRow(0).getCell(1));
Row row2 = sheet.getRow(1);
Cell cell2 = row2.getCell(1);
System.out.println(sheet.getRow(1).getCell(0));
Row row3 = sheet.getRow(1);
Cell cell3 = row3.getCell(1);
System.out.println(SSO);
System.out.println(Password);




	}

}
