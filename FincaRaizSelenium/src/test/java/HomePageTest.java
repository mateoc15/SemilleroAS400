import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sophos.clases.DepartamentoMap;
import com.sophos.clases.HomePage;
import com.sophos.clases.ListResult;
import com.sophos.clases.ResultPage;
import com.sophos.clases.SearchModel;
import com.sophos.clases.WebDriverConfig;

public class HomePageTest {
SearchModel search = new SearchModel();
WebDriverConfig driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		driver = new WebDriverConfig("https://www.fincaraiz.com.co");
	}

	@After
	public void tearDown() throws Exception {
		driver.close();

	}

	@Test
	public void randomTest() {
		HomePage homePage = new HomePage(driver);
		search = homePage.randomSearch();
		DepartamentoMap depMap = new DepartamentoMap(driver);
		search = depMap.checkPage(search);
		ListResult listResult = new ListResult(driver);
		System.out.println(listResult.searchWithResults());
		if(listResult.searchWithResults()) {
			listResult.getFirstResult();
			assertTrue("Se encontró al menos un resultado",true);
		}else {
			assertTrue("No se encontraron resultados",false);
		}	
	}
	
	@Test
	public void customTest() {
		SearchModel customSearch = new SearchModel("Vivienda","Apartamento","Arriendo","Medellín");
		HomePage homePage = new HomePage(driver);
		homePage.customSearch(customSearch);
		ListResult listResult = new ListResult(driver);
		if(listResult.searchWithResults()) {
			listResult.getRandomResult();
			ResultPage rp = new ResultPage(driver);
			boolean v=rp.checkMatch(customSearch);
			System.out.println(v);
			assertTrue("El resultado seleccionado coincide con los parametros ingresados",v);
		}else {
			assertTrue("No se encontraron resultados",false);
		}	
	}

}
