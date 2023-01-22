package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinations"},
        plugin= {"pretty","html:target/site/cucumber-pretty.html","json:target/cucumber/cucumber.json"}
)

public class _02_TestRunnerMasterReport extends AbstractTestNGCucumberTests {


}
