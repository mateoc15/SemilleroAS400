package com.sophos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimeraPruebaUnitaria {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SEMILLERO09\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	//@DisplayName("Add...")
	public void test() {
		driver.get("https://www.google.com.co/");
		driver.findElement(By.name("q")).sendKeys("Selenium get screenshot java");
		driver.findElement(By.name("btnK")).submit();
		//Assert.assertThat("1234", is("Buscar con Google"));
	}

	
}
