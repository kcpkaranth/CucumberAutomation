package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\selenium progs\\FbloginCucum\\src\\test\\java\\features\\login.feature", 
				glue= {"stepDefination"}, 
				format= {"pretty","html:test-outout"})
public class TestRunner {

}
