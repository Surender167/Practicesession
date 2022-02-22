package StepDefintions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Which test to run
//what is ur feature file and what is ur glue code 
//options (tags and reports) - html, json, junit, xml
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = {"StepDefinitions"},
monochrome = true, 
plugin = {"pretty", "html:target/reports"},
//plugin = { "pretty", "json:target/reports/cucumber.json"}
//plugin = { "pretty", "json:target/reports/cucumber.json"}
tags= {"@RegressionTest"})
// these methods are used to print in different ways to get a reports
//plugin = { "pretty", "html:target/reports"}
//plugin = { "pretty", "json:target/reports/cucumber.json"}
//plugin = { "pretty",  "junit:target/reports/cucumber.xml"}

public class TestRunner {

}