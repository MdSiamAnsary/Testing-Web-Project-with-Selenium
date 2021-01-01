package testpackage;

/*
 * Md Siam Ansary
 * ID 201103
 * MIT 22 BATCH IIT DU
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NavigationAngLogOutTests {

	private WebDriver driver;

	NavigationAngLogOutTests() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8012/SportsCorner/");
		driver.manage().window().maximize();
	}

	@Test
	void testNavigation_TestCaseID591() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement home = driver.findElement(By.id("navl1"));
		home.click();
		Thread.sleep(1500);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);

		driver.close();
	}

	@Test
	void testLogOut_TestCaseID592() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

		Thread.sleep(1500);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID593() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement descriptionlaliga = driver.findElement(By.id("leaguedescription1"));
		assertNotEquals(null, descriptionlaliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID594() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement descriptionepl = driver.findElement(By.id("leaguedescription2"));
		assertNotEquals(null, descriptionepl);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID595() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement descriptionbundesliga = driver.findElement(By.id("leaguedescription3"));
		assertNotEquals(null, descriptionbundesliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID596() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement descriptionligue1 = driver.findElement(By.id("leaguedescription4"));
		assertNotEquals(null, descriptionligue1);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID597() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement descriptionseriea = driver.findElement(By.id("leaguedescription5"));
		assertNotEquals(null, descriptionseriea);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID598() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement home = driver.findElement(By.id("navl1"));
		home.click();
		Thread.sleep(1500);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);

		driver.close();
	}

	@Test
	void testLogOut_TestCaseID599() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

		Thread.sleep(1500);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID600() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement descriptionlaliga = driver.findElement(By.id("leaguedescription1"));
		assertNotEquals(null, descriptionlaliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID601() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement descriptionepl = driver.findElement(By.id("leaguedescription2"));
		assertNotEquals(null, descriptionepl);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID602() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement descriptionbundesliga = driver.findElement(By.id("leaguedescription3"));
		assertNotEquals(null, descriptionbundesliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID603() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement descriptionligue1 = driver.findElement(By.id("leaguedescription4"));
		assertNotEquals(null, descriptionligue1);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID604() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement descriptionseriea = driver.findElement(By.id("leaguedescription5"));
		assertNotEquals(null, descriptionseriea);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID605() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement home = driver.findElement(By.id("navl1"));
		home.click();
		Thread.sleep(1500);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);

		driver.close();
	}

	@Test
	void testLogOut_TestCaseID606() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

		Thread.sleep(1500);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID607() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement descriptionlaliga = driver.findElement(By.id("leaguedescription1"));
		assertNotEquals(null, descriptionlaliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID608() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement descriptionepl = driver.findElement(By.id("leaguedescription2"));
		assertNotEquals(null, descriptionepl);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID609() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement descriptionbundesliga = driver.findElement(By.id("leaguedescription3"));
		assertNotEquals(null, descriptionbundesliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID610() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement descriptionligue1 = driver.findElement(By.id("leaguedescription4"));
		assertNotEquals(null, descriptionligue1);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID611() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement descriptionseriea = driver.findElement(By.id("leaguedescription5"));
		assertNotEquals(null, descriptionseriea);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID612() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement home = driver.findElement(By.id("navl1"));
		home.click();
		Thread.sleep(1500);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);

		driver.close();
	}

	@Test
	void testLogOut_TestCaseID613() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

		Thread.sleep(1500);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);

		driver.close();
	}

	@Test
	void testNavigation_testNavigation_TestCaseID614() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement descriptionlaliga = driver.findElement(By.id("leaguedescription1"));
		assertNotEquals(null, descriptionlaliga);

		driver.close();
	}

	@Test
	void testNavigation_testNavigation_TestCaseID615() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement descriptionepl = driver.findElement(By.id("leaguedescription2"));
		assertNotEquals(null, descriptionepl);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID616() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement descriptionbundesliga = driver.findElement(By.id("leaguedescription3"));
		assertNotEquals(null, descriptionbundesliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID617() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement descriptionligue1 = driver.findElement(By.id("leaguedescription4"));
		assertNotEquals(null, descriptionligue1);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID618() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement descriptionseriea = driver.findElement(By.id("leaguedescription5"));
		assertNotEquals(null, descriptionseriea);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID619() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement home = driver.findElement(By.id("navl1"));
		home.click();
		Thread.sleep(1500);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);

		driver.close();
	}

	@Test
	void testLogOut_TestCaseID620() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

		Thread.sleep(1500);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID621() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement descriptionlaliga = driver.findElement(By.id("leaguedescription1"));
		assertNotEquals(null, descriptionlaliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID622() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement descriptionepl = driver.findElement(By.id("leaguedescription2"));
		assertNotEquals(null, descriptionepl);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID623() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement descriptionbundesliga = driver.findElement(By.id("leaguedescription3"));
		assertNotEquals(null, descriptionbundesliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID624() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement descriptionligue1 = driver.findElement(By.id("leaguedescription4"));
		assertNotEquals(null, descriptionligue1);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID625() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement descriptionseriea = driver.findElement(By.id("leaguedescription5"));
		assertNotEquals(null, descriptionseriea);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID626() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement home = driver.findElement(By.id("navl1"));
		home.click();
		Thread.sleep(1500);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);

		driver.close();
	}

	@Test
	void testLogOut_TestCaseID627() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

		Thread.sleep(1500);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID628() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement laliga = driver.findElement(By.id("navl2"));
		laliga.click();
		Thread.sleep(1500);

		WebElement descriptionlaliga = driver.findElement(By.id("leaguedescription1"));
		assertNotEquals(null, descriptionlaliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID629() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement epl = driver.findElement(By.id("navl3"));
		epl.click();
		Thread.sleep(1500);

		WebElement descriptionepl = driver.findElement(By.id("leaguedescription2"));
		assertNotEquals(null, descriptionepl);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID630() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement bundesliga = driver.findElement(By.id("navl4"));
		bundesliga.click();
		Thread.sleep(1500);

		WebElement descriptionbundesliga = driver.findElement(By.id("leaguedescription3"));
		assertNotEquals(null, descriptionbundesliga);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID631() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement ligue1 = driver.findElement(By.id("navl5"));
		ligue1.click();
		Thread.sleep(1500);

		WebElement descriptionligue1 = driver.findElement(By.id("leaguedescription4"));
		assertNotEquals(null, descriptionligue1);

		driver.close();
	}

	@Test
	void testNavigation_TestCaseID632() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");
		loginbutton.click();
		Thread.sleep(1500);

		WebElement seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		seriea = driver.findElement(By.id("navl6"));
		seriea.click();
		Thread.sleep(1500);

		WebElement descriptionseriea = driver.findElement(By.id("leaguedescription5"));
		assertNotEquals(null, descriptionseriea);

		driver.close();
	}

}
