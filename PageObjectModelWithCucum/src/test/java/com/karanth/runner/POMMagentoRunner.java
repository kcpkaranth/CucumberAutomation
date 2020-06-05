package com.karanth.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\selenium progs\\PageObjectModelWithCucum\\src\\test\\java\\com\\karanth\\features\\pomMagentoScenario.feature",
				glue="com.karanth.stepdefinitions",
				format= {"pretty", "html:test-output"},
				dryRun=false,
				monochrome=true,
				strict=true)

public class POMMagentoRunner {

}
