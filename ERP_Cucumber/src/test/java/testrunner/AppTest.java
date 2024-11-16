package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true,glue= {"Stepdefinitions"},
tags=("@supplier,@customer"),
plugin= {"pretty","html:target/reporter/cucumber","junit:target/reporter/cucumber.xml","json:target/reporter/cucumber.json"})

public class AppTest extends AbstractTestNGCucumberTests{

}
