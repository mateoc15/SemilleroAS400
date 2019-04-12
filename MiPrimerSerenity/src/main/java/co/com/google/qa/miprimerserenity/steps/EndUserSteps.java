package co.com.google.qa.miprimerserenity.steps;

import co.com.google.qa.miprimerserenity.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;


public class EndUserSteps {
	
    GoogleHomePage googlePage;

    @Step
    public void enters(String keyword) {
        googlePage.enterKeywords(keyword);
    }

    @Step
    public void startsSearch() {
    	googlePage.lookupTerms();
    
    }


    @Step
    public void is_the_home_page() {
        googlePage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    
    }
}

