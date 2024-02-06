package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedScenarios.txt",
                 glue={"stepdefinations","Hooks"},
                 publish=true,
                 plugin={"pretty","html:target/CucumberReports/CucumberReport.html"})


public class RerunTestRunner {

}
