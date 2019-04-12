package com.gmail.qa.mailsenderscreenplay.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "com.gmail.qa.mailsenderscreenplay.stepdefinitions" },
        snippets =  SnippetType.CAMELCASE
        ) 
public class MailSenderScreenplayRunner {

	

}
