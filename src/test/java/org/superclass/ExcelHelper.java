package org.superclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	public static String readData(String Filename ,String SheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\ExcelSheets\\"+Filename+".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fin);
		Sheet sh = bk.getSheet(SheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String input = "";
		if (type == 1) {
			input = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MMM-dd-yyy");
			input = sim.format(da);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			input = String.valueOf(l);
		}
		return input;
	}
//1
	public static void newExcelFile(String newfileName, String newSheetName) throws IOException {	
		File a = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\ExcelSheets\\" + newfileName + ".xlsx");
		Workbook b = new XSSFWorkbook();
		Sheet sh1 = b.createSheet(newSheetName);
		FileOutputStream fs = new FileOutputStream(a);
		b.write(fs);
	}
//2
	public static void newSheetroces(String fileName, String NewSheetName, int Newrowno, int NewCellno, String value)
			throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\ExcelSheets\\" + fileName + ".xlsx");
		FileInputStream fn = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fn);
		Sheet sh = bk.createSheet(NewSheetName);
		Row r = sh.createRow(Newrowno);
		Cell c = r.createCell(NewCellno);
		c.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		bk.write(fs);
	}
//3
	public static void existingSheetonly(String fileName, String ExeSheetName, int Newrowno, int NewCellno,
			String value) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\ExcelSheets\\" + fileName + ".xlsx");
		FileInputStream fn = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fn);
		Sheet sh = bk.getSheet(ExeSheetName);
		Row r = sh.createRow(Newrowno);
		Cell c = r.createCell(NewCellno);
		c.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		bk.write(fs);
	}
//4
	public static void newCellOnly(String fileName, String SheetName, int rowno, int NewCellno, String value)
			throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\ExcelSheets\\" + fileName + ".xlsx");
		FileInputStream fn = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fn);
		Sheet sh = bk.getSheet(SheetName);
		Row r = sh.getRow(rowno);
		Cell c = r.createCell(NewCellno);
		c.setCellValue(value);
		FileOutputStream fs = new FileOutputStream(f);
		bk.write(fs);
	}
	//5
		public static void valueUpdate(String fileName, String SheetName, int rowno, int NewCellno, String value)
				throws IOException {
			File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\ExcelSheets\\" + fileName + ".xlsx");
			FileInputStream fn = new FileInputStream(f);
			Workbook bk = new XSSFWorkbook(fn);
			Sheet sh = bk.getSheet(SheetName);
			Row r = sh.getRow(rowno);
			Cell c = r.getCell(NewCellno);
			c.setCellValue(value);
			FileOutputStream fs = new FileOutputStream(f);
			bk.write(fs);
}
		
		
		
		
		
		
		
		
		
}