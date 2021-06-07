package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Exception.FrameworkException;
import com.Exception.InvalidpathexcelException;
import com.frameworkconstant.Config;




/**
 * 
 * Utility class to read from excel file. This class store a map of rows and
 * columns combination.<br>
 * For e.g.,<br>
 * - firstRow + secondRow<br>
 * - firstRow + thirdRow<br>
 * and so on. Considering firstRow as key and other rows as values <br>
 * Class is final to avoid extend. <br>
 * <br>
 * Apr 7, 2021
 * @author User1
 * @version 1.0
 *
 */
public final class ExcelUtils {
	/**
	 * Private constructor to avoid external instantiation
	 * <br>
	 * Apr 7, 2021
	 */
	private ExcelUtils() {
	}

	/**
	 * To read data from excel file
	 * <br>
	 * Apr 7, 2021
	 * @param excelFilePath Path of the excel file.
	 * @param sheetName Sheet name from where data needs to be extracted.
	 * @return List
	 * @throws InvalidFormatException 
	 *
	 */
	public static List<Map<String, String>> getDataDeatils(String sheetname)  {
		List<Map<String, String>> list = null;
	     Workbook workBook;
		try(FileInputStream excelToRead= new FileInputStream(Config.getExcel())) {
			workBook=WorkbookFactory.create(excelToRead);
			Sheet sheet = workBook.getSheet(sheetname);
//			Sheet sheet = workBook.getSheetAt(number);
			DataFormatter formatter = new DataFormatter();
			Map<String, String> map = null;
			list = new ArrayList<Map<String, String>>();
			int lastRowNum = sheet.getLastRowNum();
			int lastColNum = sheet.getRow(0).getLastCellNum();
			for (int i = 1; i <= lastRowNum; i++) {
				map = new HashMap<String,String>();
				for (int j = 0; j < lastColNum; j++) {
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					System.out.println(key);
//					String value=sheet.getRow(i).getCell(j).getStringCellValue();
					String value=formatter.formatCellValue(sheet.getRow(i).getCell(j));
					System.out.println(value);
					map.put(key, value);
				}
				list.add(map);
			}
		} catch (FileNotFoundException e) {
			throw new InvalidpathexcelException("excel file not found");
		} catch (IOException e) {
			throw new FrameworkException("some io exception happen while reading excel file");
		} 
		return list;
	}
}