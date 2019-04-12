import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.com.linio.ListResult;
import co.com.linio.WebDriverConfig;
import co.com.linio.buscar;

public class HomeTest {
	WebDriverConfig driver;
	String url = "http://www.linio.com.co";
	buscar home;
	String busqueda = "zapatos";
	
	
	@Before
	public void setUp() throws Exception {
		driver = new WebDriverConfig(url);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		home = new buscar(driver);
		ListResult list = new ListResult(driver);
		home.writeSearch(busqueda);
		home.submitSearch();
		list.selectResult();
	}

}
