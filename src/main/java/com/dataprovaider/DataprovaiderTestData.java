package com.dataprovaider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.frameworkconstant.Config;



public class DataprovaiderTestData {
	
	
	
	@Test(dataProvider ="DataWithTable" )
	public void TestData(Map<String,String> map) {
		System.out.println(map);
		
	}
	@DataProvider(name="DataWithTable")
	public Object[] getDataWithTable() throws IOException {
		File file=new File(Config.getExcel());
		FileInputStream fs = new FileInputStream(file);
		Workbook wb =WorkbookFactory.create(fs);
		Sheet sheet = wb.getSheetAt(2);
		
		int rownum=sheet.getLastRowNum();
		int cellnum=sheet.getRow(0).getLastCellNum();
		
		Object[] data = new Object[sheet.getLastRowNum()];
		DataFormatter formatter = new DataFormatter();
		Map<String,String> map;
		
		for(int i=1; i<=rownum; i++) {
			map = new HashMap<>();
			for(int j=0; j<cellnum;j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				System.out.println(key);
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				map.put(key, value);
				data[i-1] = map;
			}
		}
		return data;
	}
	@DataProvider
	public Object[][] getData() throws IOException {
		
		File file=new File(Config.getExcel());
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=1; i<=sheet.getLastRowNum(); i++) {
			for(int j=0; j<sheet.getRow(0).getLastCellNum();j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	@DataProvider(name="AirfaceData")
	public Object[][] getAirfacedata(Method m){
		if(m.getName().equalsIgnoreCase("loginpage")) {
		return new Object[][] {{"BIKASH","55"}};	
	}
		else if(m.getName().equalsIgnoreCase("loginpage2ndData")){
			return new Object[][] {{"sumeet.thakur@abstechno.in",""}};
		}
		else if(m.getName().equalsIgnoreCase("loginpage3rddata")) {
	
		return new Object[][] {{"kumarnayak9178@gmail.com","Bikash07@"}};
		
	}
		return null;
	}
}
