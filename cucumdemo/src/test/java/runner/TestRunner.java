package runner;

import org.junit.runner.RunWith;
//import org.junit.runners.Suite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\selenium progs\\cucumdemo\\src\\test\\java\\features\\test.feature",glue= {"seleniumGluecode"})
public class TestRunner {
}

