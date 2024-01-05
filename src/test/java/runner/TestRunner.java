package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                 glue={"stepdefinations","Hooks"},
                 publish=true,
                 plugin={"pretty","html:target/CucumberReports/CucumberReport.html",
                		 "rerun:target/failedScenarios.txt"})

public class TestRunner {

}
