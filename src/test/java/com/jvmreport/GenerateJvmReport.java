package com.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateJvmReport {

	
	
	public static void generatejvm (String jsonFile) {
		
		File reportDirectory = new File("C:\\Users\\DORABABU\\eclipse-workspace\\MyCucumberTags\\src\\test\\resources\\Reports");
		 
		
		Configuration configuration = new Configuration(reportDirectory,"Checking Functionalities of Applications");
		
		configuration.addClassifications("Os","Windows");
		configuration.addClassifications("Browser", "Chorme");
		configuration.addClassifications("BrowserVersion", "86");
		configuration.addClassifications("Sprint","522");
		
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}
}
