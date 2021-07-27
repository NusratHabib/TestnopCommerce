package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Login.feature",
        glue = "stepDefinitions",
        plugin = {"pretty","html:test-output.html"}
)

public class TestRunner {

}