package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFileNew"
		,glue= {"StepDefinition"}
		,format= {"pretty", "html:target/Destination"}
		,tags= {}
		)
public class TestRunnerClass {

}
