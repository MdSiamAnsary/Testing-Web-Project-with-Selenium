package testpackage;

/*
 * Md Siam Ansary
 * ID 201103
 * MIT 22 BATCH IIT DU
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class LogInTests {

	private WebDriver driver;

	LogInTests() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8012/SportsCorner/");
		driver.manage().window().maximize();

	}

	@Test
	void testUserLogIn_TestCaseID577() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("");
		password.sendKeys("");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();

	}

	@Test
	void testUserLogIn_TestCaseID578() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();

	}

	@Test
	void testUserLogIn_TestCaseID579() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("arima@gmail.com");
		password.sendKeys("");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID580() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmailcom");
		password.sendKeys("");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID581() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("");
		password.sendKeys("q00005");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID582() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("q00005");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID583() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("arima@gmail.com");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID584() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmailcom");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID585() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID586() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID587() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("arima@gmail.com");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID588() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmailcom");
		password.sendKeys("ansary");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID589() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0023@gmail.com");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement logintext = driver.findElement(By.id("logintext"));
		assertNotEquals(null, logintext);
		driver.close();
	}

	@Test
	void testUserLogIn_TestCaseID590() throws Exception {

		WebElement email = driver.findElement(By.id("loginemail"));
		WebElement password = driver.findElement(By.id("loginpassword"));
		WebElement loginbutton = driver.findElement(By.id("btn-login"));

		email.sendKeys("us0024@gmail.com");
		password.sendKeys("q00006");
		loginbutton.click();
		Thread.sleep(2000);

		WebElement cruyffquote = driver.findElement(By.id("cruyffquoteid"));
		assertNotEquals(null, cruyffquote);
		driver.close();
	}

}
