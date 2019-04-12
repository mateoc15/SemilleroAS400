package co.com.google.qa.cucumberfincaraiz.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
			glue = { "co.com.google.qa.cucumberfincaraiz.stepdefinitions" },
			snippets = SnippetType.CAMELCASE,
			plugin = {"pretty", "html:target/cucumber", "json:target/cucumber/cucumber.json"})
public class BuscarEnGoogleRunner {


}
