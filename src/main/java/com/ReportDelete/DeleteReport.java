package com.ReportDelete;

import java.io.File;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.commons.lang3.time.DateUtils;

import com.enam.ConfigProperty;
import com.frameworkconstant.Config;
import com.property.PropetyFile;



/**
 * 
 * RemoveOldReports removes all the reports older than X days. User can set the
 * decision to delete the files in properties file. <br>
 * Class is final to avoid extend. <br>
 * <br>
 * Apr 7, 2021
 * 
 * @author User1
 * @version 1.0
 * 
 */
public class DeleteReport {
    
		/**
		 * 
		 * Private constructor to avoid external instantiation <br>
		 * Apr 7, 2021
		 */
		private DeleteReport() {
		}

		/**
		 * deleteOldReports method deletes all the X days older reports. <br>
		 * Apr 7, 2021
		 * @throws Exception 
		 * @throws NumberFormatException 
		 *
		 */
		public static void deleteOldReports() {
			try {
				if (PropetyFile.get(ConfigProperty.DELETEOLDREPORTS).equals(Config.getYes())) {
					int days = Integer.parseInt(PropetyFile.get(ConfigProperty.NUMBEROFDAYS));
					Date oldestAllowedFileDate = DateUtils.addDays(new Date(), days);
					// To delete html test reports
					if (new File(Config.getReportFolder()).exists()) {
						File targetDir = new File(Config.getReportFolder());
						Iterator<File> filesToDelete = FileUtils.iterateFiles(targetDir,
								new AgeFileFilter(oldestAllowedFileDate), null);
						while (filesToDelete.hasNext()) {
							FileUtils.deleteQuietly(filesToDelete.next());
						}
					}

					// To delete generated videos
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
