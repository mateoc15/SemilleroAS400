package com.bing.qa.serenitybing.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "com.bing.qa.serenitybing.stepsdefinitios" },
        snippets =  SnippetType.CAMELCASE
        )  
public class BusquedaEnBingRunner {

}
