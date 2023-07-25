package uk.co.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/resources/featurefile/jobsearch.feature",
        glue = "uk/co/library",
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class TestRunner {

}
