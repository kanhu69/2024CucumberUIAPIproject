package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},tags="@kanhu",   // Path to the feature files
        glue = {"stepdefinitions"},            // Path to the step definitions
        plugin = {"pretty", "html:target/cucumber-reports.xml"}, // Report options
        monochrome = true                   // For better console output
)

public class TestRunner {

}
