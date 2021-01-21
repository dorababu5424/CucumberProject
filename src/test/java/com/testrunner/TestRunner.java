package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.jvmreport.GenerateJvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",monochrome=true,snippets=SnippetType.CAMELCASE,strict=true,plugin= {"pretty","json:src\\test\\resources\\Reports\\Cucumber.json"},dryRun=false,tags={"not @smoke"})
public class TestRunner {
	
	
	@AfterClass
	public static void afterclass() {
		// TODO Auto-generated method stub
		GenerateJvmReport.generatejvm("C:\\Users\\DORABABU\\eclipse-workspace\\MyCucumberTags\\src\\test\\resources\\Reports//cucumber.json");
	}


}
