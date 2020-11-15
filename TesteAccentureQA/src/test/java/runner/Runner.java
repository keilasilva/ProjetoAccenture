package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		monochrome = true,
		features = {"src/test/resources/features/"}, 
					glue = { "steps/" }, 
					plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, 
					 snippets = SnippetType.CAMELCASE,strict = false)
public class Runner {
	
}