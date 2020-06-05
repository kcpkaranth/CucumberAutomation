package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\selenium progs\\MagentoCucumDemo\\src\\test\\java\\features\\tags.feature",
				glue="stepDefinations",
				monochrome=true,
				tags= {"~@RegressionTest"})
public class TagTestRunner {

}
