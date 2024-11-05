package qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/qa.features/hover.feature",
glue= {"qa.stepDefinitions"}, monochrome = true , dryRun = false)
public class hoverRunner {

}
