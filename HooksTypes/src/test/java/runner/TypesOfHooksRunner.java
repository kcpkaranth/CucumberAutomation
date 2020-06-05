package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\selenium progs\\HooksTypes\\src\\test\\java\\features\\typesofhooks.feature",
				glue="stepDefinitions",
				format= {"pretty", "html:test-output"},
				dryRun=false,
				monochrome=true,
				strict=true)

public class TypesOfHooksRunner {

}
