package automationPractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/features",
            tags ="@Regression",
            format = "html:target/CucumberHTMLReports")
    public class TestRunner {
    }
