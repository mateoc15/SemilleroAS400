package MiPrimerScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SEMILLERO09\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SEMILLERO09\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.google.com.uy");
		//driver.close();
		//driver.findElement(By.name("q")).sendKeys("Selenium getScreenShot");
		//driver.findElement(By.name("btnK")).submit();
	}

}
