package com.gmail.mailsenderscreenplay.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.gmail.com")
public class GmailLoginPage extends PageObject{
	public static final Target EMAIL_FIELD = Target.the("the email field")    		
            .located(By.name("identifier"));
	
	public static final Target NEXT_BUTTON = Target.the("the next button ")    		
			.located(By.className("RveJvd snByac"));

}
