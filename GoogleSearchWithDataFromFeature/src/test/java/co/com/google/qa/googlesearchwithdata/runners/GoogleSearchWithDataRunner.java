package co.com.google.qa.googlesearchwithdata.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features",
			glue = { "co.com.google.qa.googlesearchwithdata.stepsdefinitions" },
			snippets = SnippetType.CAMELCASE,
			plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json"})
public class GoogleSearchWithDataRunner {


}
