package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\selenium progs\\MagentoCucumDemo\\src\\test\\java\\features\\magentotest.feature",//a=used to enter address of feature file
				glue="stepDefinations",//used to enter the address of step definations code
				format= {"pretty", "html:test-output"},
				dryRun=false,//if dryRun=true, it will not execute the runner class rather it will do maping
				monochrome=true,//to get the output in more readable format
				strict=true)//to stop test execution, if any step is not having step defination
public class MagentoTestRunner {
}
