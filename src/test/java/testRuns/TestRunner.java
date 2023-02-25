package testRuns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		//features= {"src/test/resources/features/feature9.feature","src/test/resources/features/feature99.feature"}, 
		features= {"src/test/resources/features/datadriven_Feature1.feature"},
		//features= {"src/test/resources/features/datadrivennormal.feature"},
		glue= {"stepDefinitions","hooks"},
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false,
		monochrome=true
		
		
		
		
		)


public class TestRunner {

}
