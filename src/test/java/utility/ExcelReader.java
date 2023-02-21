package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private static FileInputStream excelPath;
	private static Properties getPropertiesFromPropertyReader;
	private static 	XSSFWorkbook obj_XssfWorkbook;
  
	 public static XSSFSheet getSheetByName() {
		  getPropertiesFromPropertyReader=PropertyReader.getProperties("excel");
		 try {
			  excelPath=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//excelSheets//"+getPropertiesFromPropertyReader.getProperty("filename")+".xlsx");
		} catch (FileNotFoundException e) {
			 System.out.println(e);
		} 
	 
		try {
			  obj_XssfWorkbook=new XSSFWorkbook(excelPath);
		} catch (IOException e) {
			System.out.println(e);
		}
		return   obj_XssfWorkbook.getSheet(getPropertiesFromPropertyReader.getProperty("sheetname"));
	 }
	 
	 //calling by sheet id
	 public static XSSFSheet getSheetById() {
		 getPropertiesFromPropertyReader=PropertyReader.getProperties("excel");
		 try {
			FileInputStream excelPath=new FileInputStream(System.getProperty("user.dir")+"//srctest//resources//excelSheets//"+getPropertiesFromPropertyReader.getProperty("filename")+".xlsx");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} 
		 try {
			obj_XssfWorkbook=new XSSFWorkbook(excelPath);
		} catch (IOException e) {
			 System.out.println(e);
		}
		 
		 return obj_XssfWorkbook.getSheetAt(Integer.parseInt(getPropertiesFromPropertyReader.getProperty("sheetid")));
	 }
	 
	 public static int  getColumnCount(XSSFSheet sheet) {
		 return sheet.getRow(0).getLastCellNum();
	 }
	 
	 
	 
	 //to get row data
	 public static int getRowCount(XSSFSheet sheet) {
	 return sheet.getLastRowNum();
		 
	 }
//get single row data 
	 public static HashMap<String, String> getRowdata(XSSFSheet sheet,int rownNO) {
		 HashMap<String, String> rowData=new HashMap<String,String>();
		 for(int i=0;i<getColumnCount(sheet);i++) {
			 try {
				
				rowData.put(sheet.getRow(0).getCell(i).toString(),sheet.getRow(rownNO).getCell(i).toString()); 
			} catch (NullPointerException e) {
				System.out.println("data not available for the particular row"+rownNO);
			}
		 }
		return rowData; 
	 }
	 
	 //get all data
	 public static List<HashMap<String, String>> getExcelData(XSSFSheet sheet) {
		 
		List< HashMap<String, String>> data=new ArrayList<HashMap<String,String>>();
		for(int i=1;i<=getRowCount(sheet);i++)
		{	
			data.add(getRowdata(sheet, i));
		}
		return data;
	 }
	 
	 
	 //get key data
	 public static List<String> getHashKeys(XSSFSheet sheet) {
		 
		 List<String> keys=new ArrayList<String>();
		 for(int i=0;i<getColumnCount(sheet);i++)
		 {
			 keys.add(sheet.getRow(0).getCell(i).toString());
			 
		 }
		 return keys;
		}
	 
	 
}
