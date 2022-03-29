package com.Runneable.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vidhun ck\\eclipse-workspace\\Adactin\\src\\test\\java\\feathur\\file.Feature", glue = "stepdefine", monochrome = true, plugin = {
		"pretty", "html:Report/html_report", "json:Report/json_report" })

public class Adactin {
	

}
