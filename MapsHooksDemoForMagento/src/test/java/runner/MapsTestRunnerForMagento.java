package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\selenium progs\\MapsDemoForMagento\\src\\test\\java\\features\\mapsForMagento.feature",
				glue="stepDefinations",
				format= {"pretty", "html:test-output"},
				dryRun=false,
				monochrome=true,
				strict=true)

public class MapsTestRunnerForMagento {

}
