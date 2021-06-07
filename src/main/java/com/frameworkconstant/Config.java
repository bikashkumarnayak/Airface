package com.frameworkconstant;

import com.enam.ConfigProperty;
import com.property.PropetyFile;

public final class Config {
	
	private Config() {
		
	}
	
	private final static String RESOURCEPATH=System.getProperty("user.dir");
	private final static String PROJECTMAINPATH=RESOURCEPATH.concat("\\src\\main\\java");
	private final static String PROPERTYFILEPATH=PROJECTMAINPATH.concat("\\commonfile\\data.Properties");
	private final static String JSONFILEPATH=PROJECTMAINPATH.concat("\\commonfile\\new.json");
	private final static String ARGUMENTS="use-fake-ui-for-media-stream";
	private final static String SILENTOUTPUT="webdriver.chrome.silentOutput";
	private final static String TRUE="true";
	private final static String CHROME="webdriver.chrome.driver";
	private final static String CHROMEPATH=RESOURCEPATH.concat("\\Driver\\chromedriver.exe");
	private final static String CHROMEBROWSER="chrome";
	private final static String FIREFOXBROWSER="firefox";
	private final static String FIREFOX="webdriver.gecko.driver";
	private final static String FIREFOXPATH=PROJECTMAINPATH.concat("\\Driver\\geckodriver.exe");
	private final static String EXCEL=PROJECTMAINPATH.concat("\\ExcelData\\Testdata.xlsx");
	
	

	private final static int IMPLICITYWAIT=15;
	private final static int EXPLICITYWAIT=15;
	private final static int MAXRETRYCOUNTER=2;
	private static final String YES = "yes";
	private static final String NO = "no";
	private static final String REPORT_NAME = "Airface test report";
	private static final String REPORT_TITLE = "Test Report";
	private static final String UTF8_ENCODING = "UTF-8";
	public static final String DATETIME_FORMAT1 = "dd_MM_yyyy_hh_mm_ss";
	private static final String DATETIME_FORMAT2 = "dd/MM/yyyy HH:mm:ss";
	private static final String OS_PLATFORM = System.getProperty("os.name");
	private static final String OS_VERSION = System.getProperty("os.version");
	private static final String OS_ARCH = System.getProperty("os.arch");
	private static final String JSONREPORT="old-report-data.json";
	private static final String REPORT_FOLDER = RESOURCEPATH.concat("\\Reports");
	private static String extentreportpath="";
	private static final String SCREENSHOTPATH=RESOURCEPATH.concat("\\Screen\\Screenshot");
	private static final String SCREENSHOTFORMAT="ScreenShot.png";
	private static final String SHEETSNAME="TestRunner";
	private static final String SHEETSNAME1="DATA";
	
	
	
	
	public static int getExplicitywait() {
		return EXPLICITYWAIT;
	}
	public static String getExcel() {
		return EXCEL;
	}
	
	public static String getExtentreportpath() {
		if(extentreportpath.isEmpty()) {
			try {
				extentreportpath=getReportFolder();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return extentreportpath;
	}


	
	public static int getImplicitywait() {
		return IMPLICITYWAIT;
	}


	public static int getMaxretrycounter() {
		return MAXRETRYCOUNTER;
	}


	public static String getYes() {
		return YES;
	}


	public static String getNo() {
		return NO;
	}


	public static String getReportName() {
		return REPORT_NAME;
	}


	public static String getReportTitle() {
		return REPORT_TITLE;
	}


	public static String getUtf8Encoding() {
		return UTF8_ENCODING;
	}


	public static String getDatetimeFormat1() {
		return DATETIME_FORMAT1;
	}


	public static String getDatetimeFormat2() {
		return DATETIME_FORMAT2;
	}


	public static String getOsPlatform() {
		return OS_PLATFORM;
	}


	public static String getOsVersion() {
		return OS_VERSION;
	}


	public static String getOsArch() {
		return OS_ARCH;
	}


	public static String getJsonreport() {
		return JSONREPORT;
	}


	public static String getReportFolder() {
		if(PropetyFile.get(ConfigProperty.OVERRIDEREPORTS).equalsIgnoreCase(Config.getYes())) {
			return REPORT_FOLDER+"/"+System.currentTimeMillis()+"index.html";
		}
		else {
			return REPORT_FOLDER+"/"+"index.html";
		}
	}


	public static String getScreenshotpath() {
		return SCREENSHOTPATH;
	}


	public static String getScreenshotformat() {
		return SCREENSHOTFORMAT;
	}


	public static String getSheetsname() {
		return SHEETSNAME;
	}


	public static String getSheetsname1() {
		return SHEETSNAME1;
	}


	public static String getFirefoxbrowser() {
		return FIREFOXBROWSER;
	}


	public static String getFirefox() {
		return FIREFOX;
	}


	public static String getFirefoxpath() {
		return FIREFOXPATH;
	}


	public static String getChromebrowser() {
		return CHROMEBROWSER;
	}


	public static String getArguments() {
		return ARGUMENTS;
	}

	public static String getSilentoutput() {
		return SILENTOUTPUT;
	}

	public static String getTrue() {
		return TRUE;
	}

	public static String getChrome() {
		return CHROME;
	}

	public static String getChromepath() {
		return CHROMEPATH;
	}

	public static String getJsonfilepath() {
		return JSONFILEPATH;
	}

	public static String getPropertyfilepath() {
		return PROPERTYFILEPATH;
	}

}
