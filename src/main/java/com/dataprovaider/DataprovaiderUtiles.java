package com.dataprovaider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.frameworkconstant.Config;
import com.utility.ExcelUtils;

public final class DataprovaiderUtiles {

	private DataprovaiderUtiles(){
		
	}
	
	
	private static List<Map<String , String>> list=new ArrayList<>();
 @DataProvider(name="getLocattiondata")
	public static Object[] getLocationData(Method m)  {
		String testname = m.getName();
		if(list.isEmpty()) {
		 list = ExcelUtils.getDataDeatils("EMPLOYEELOC");
		}
		List<Map<String, String>> smalllist = new ArrayList<>();
		System.out.println(smalllist);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get("testname").equalsIgnoreCase(testname) 
					&& list.get(i).get("execute").equalsIgnoreCase(Config.getYes())) {
					smalllist.add(list.get(i));	
			}
		}

		
		return smalllist.toArray();
	}
 
	@DataProvider(name="EmployeeData")
	public static Object[] getEmployeeData(Method m) {
		String testname = m.getName();
		if(list.isEmpty()) {
		 list = ExcelUtils.getDataDeatils("Employee");
		}
		List<Map<String, String>> smalllist = new ArrayList<>();
		System.out.println(smalllist);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get("testname").equalsIgnoreCase(testname) 
					&& list.get(i).get("execute").equalsIgnoreCase(Config.getYes())) {
					smalllist.add(list.get(i));	
			}
		}
		
		return smalllist.toArray();
		
	}
		

	
	}


