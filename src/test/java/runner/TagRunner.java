package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


// SADECE SMOKE TAG İNE SAHİP OLAN SENARYOLARI CALISTIRAN RUNNER
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
        glue ="stepdefinition",
        tags = "@smoke",
        dryRun = false
)



public class TagRunner {



}
