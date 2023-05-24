package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/resources/java/Features/background.feature",
				 glue = {"stepdefinitions"},
				 dryRun = false,
				 monochrome = true,
				// tags ="@regression",
				 plugin = {"pretty","json:target/Json/cucumber.json"},
				 snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Runner {

}
