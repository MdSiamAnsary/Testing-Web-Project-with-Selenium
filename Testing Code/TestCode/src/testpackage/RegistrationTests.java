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

class RegistrationTests {

	private WebDriver driver;

	public RegistrationTests() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8012/SportsCorner/");
		driver.manage().window().maximize();
	}

	@Test
	void testUserRegistration_TestCaseID001() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID002() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID003() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID004() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siamansary.cse@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID005() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siamansary.cse@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID006() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siamansary.cse@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID007() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siamansary@gmaildotcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID008() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID009() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID010() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID011() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID012() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID013() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID014() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID015() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID016() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID017() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID018() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID019() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID020() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID021() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID022() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID023() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID024() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID025() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID026() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID027() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID028() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID029() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID030() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID031() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID032() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID033() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID034() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID035() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID036() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID037() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID038() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID039() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID040() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID041() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID042() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID043() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID044() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID045() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID046() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID047() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID048() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID049() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID050() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID051() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID052() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID053() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID054() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID055() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID056() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID057() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID058() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID059() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID060() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID061() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID062() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID063() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID064() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID065() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID066() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID067() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID068() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID069() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID070() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID071() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID072() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID073() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID074() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID075() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID076() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siamansary.cse@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID077() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siamansary.cse@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID078() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siamansary.cse@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID079() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siamansary@gmaildotcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID080() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID081() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID082() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID083() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID084() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID085() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID086() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID087() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID088() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID089() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID090() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmaildotcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID091() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID092() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID093() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID094() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID095() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID096() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID097() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID098() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID099() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID100() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID101() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID102() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID103() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID104() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID105() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID106() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID107() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID108() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID109() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID110() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID111() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID112() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID113() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID114() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID115() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID116() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID117() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID118() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID119() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID120() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID121() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID122() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID123() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID124() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID125() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID126() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID127() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID128() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID129() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID130() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID131() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID132() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID133() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID134() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID135() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID136() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID137() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID138() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID139() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID140() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID141() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID142() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID143() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID144() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("Faiza");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID145() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0001");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID146() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0002");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID147() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0003");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID148() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0004");
		email.sendKeys("us0004@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID149() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0005");
		email.sendKeys("us0005@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID150() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0006");
		email.sendKeys("us0006@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID151() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0007");
		email.sendKeys("us0007@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID152() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0008");
		email.sendKeys("us0008@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID153() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0009");
		email.sendKeys("us0009@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID154() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0010");
		email.sendKeys("");
		password.sendKeys("p0001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID155() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0011");
		email.sendKeys("");
		password.sendKeys("p0002");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID156() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0012");
		email.sendKeys("");
		password.sendKeys("p0003");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID157() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0013");
		email.sendKeys("us0013@gmail.com");
		password.sendKeys("p0004");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID158() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0014");
		email.sendKeys("us0014@gmail.com");
		password.sendKeys("p0005");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID159() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0015");
		email.sendKeys("us0015@gmail.com");
		password.sendKeys("p0006");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID160() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0016");
		email.sendKeys("us0016@gmailcom");
		password.sendKeys("p0007");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID161() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0017");
		email.sendKeys("us0017@gmailcom");
		password.sendKeys("p0008");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID162() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0018");
		email.sendKeys("us0018@gmailcom");
		password.sendKeys("p0009");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID163() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0019");
		email.sendKeys("");
		password.sendKeys("q00001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID164() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0020");
		email.sendKeys("");
		password.sendKeys("q00002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID165() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0021");
		email.sendKeys("");
		password.sendKeys("q00003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID166() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0022");
		email.sendKeys("us0022@gmail.com");
		password.sendKeys("q00004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID167() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0023");
		email.sendKeys("us0023@gmail.com");
		password.sendKeys("q00005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID168() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0024");
		email.sendKeys("us0024@gmail.com");
		password.sendKeys("q00006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID169() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0025");
		email.sendKeys("us0025@gmailcom");
		password.sendKeys("q00007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID170() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0026");
		email.sendKeys("us0026@gmailcom");
		password.sendKeys("q00008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID171() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0027");
		email.sendKeys("us0027@gmailcom");
		password.sendKeys("q00009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID172() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0028");
		email.sendKeys("");
		password.sendKeys("r010001");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID173() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0029");
		email.sendKeys("");
		password.sendKeys("r010002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID174() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0030");
		email.sendKeys("");
		password.sendKeys("r010003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID175() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0031");
		email.sendKeys("us0031@gmail.com");
		password.sendKeys("r010004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID176() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0032");
		email.sendKeys("us0032@gmail.com");
		password.sendKeys("r010005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID177() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0033");
		email.sendKeys("us0033@gmail.com");
		password.sendKeys("r010006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID178() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0034");
		email.sendKeys("us0034@gmailcom");
		password.sendKeys("r010007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID179() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0035");
		email.sendKeys("us0035@gmailcom");
		password.sendKeys("r010008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID180() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0036");
		email.sendKeys("us0036@gmailcom");
		password.sendKeys("r010009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID181() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0037");
		email.sendKeys("");
		password.sendKeys("s0123451");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID182() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0038");
		email.sendKeys("");
		password.sendKeys("s0123452");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID183() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0039");
		email.sendKeys("");
		password.sendKeys("s0123453");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID184() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0040");
		email.sendKeys("us0040@gmail.com");
		password.sendKeys("s0123454");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID185() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0041");
		email.sendKeys("us0041@gmail.com");
		password.sendKeys("s0123455");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID186() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0042");
		email.sendKeys("us0042@gmail.com");
		password.sendKeys("s0123456");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID187() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0043");
		email.sendKeys("us0043@gmailcom");
		password.sendKeys("s0123457");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID188() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0044");
		email.sendKeys("us0044@gmailcom");
		password.sendKeys("s0123458");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID189() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0045");
		email.sendKeys("us0045@gmailcom");
		password.sendKeys("s0123459");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID190() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0046");
		email.sendKeys("");
		password.sendKeys("t01222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID191() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0047");
		email.sendKeys("");
		password.sendKeys("t01222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID192() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0048");
		email.sendKeys("");
		password.sendKeys("t01222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID193() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0049");
		email.sendKeys("us0049@gmail.com");
		password.sendKeys("t01222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID194() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0050");
		email.sendKeys("us0050@gmail.com");
		password.sendKeys("t01222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID195() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0051");
		email.sendKeys("us0051@gmail.com");
		password.sendKeys("t01222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID196() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0052");
		email.sendKeys("us0052@gmailcom");
		password.sendKeys("t01222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID197() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0053");
		email.sendKeys("us0053@gmailcom");
		password.sendKeys("t01222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID198() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0054");
		email.sendKeys("us0054@gmailcom");
		password.sendKeys("t01222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID199() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0055");
		email.sendKeys("");
		password.sendKeys("u011222231");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID200() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0056");
		email.sendKeys("");
		password.sendKeys("u011222232");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID201() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0057");
		email.sendKeys("");
		password.sendKeys("u011222233");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID202() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0058");
		email.sendKeys("us0058@gmail.com");
		password.sendKeys("u011222234");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID203() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0059");
		email.sendKeys("us0059@gmail.com");
		password.sendKeys("u011222235");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID204() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0060");
		email.sendKeys("us0060@gmail.com");
		password.sendKeys("u011222236");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID205() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0061");
		email.sendKeys("us0061@gmailcom");
		password.sendKeys("u011222237");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID206() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0062");
		email.sendKeys("us0062@gmailcom");
		password.sendKeys("u011222238");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID207() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0063");
		email.sendKeys("us0063@gmailcom");
		password.sendKeys("u011222239");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID208() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0064");
		email.sendKeys("");
		password.sendKeys("v0112222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID209() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0065");
		email.sendKeys("");
		password.sendKeys("v0112222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID210() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0066");
		email.sendKeys("");
		password.sendKeys("v0112222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID211() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0067");
		email.sendKeys("us0067@gmail.com");
		password.sendKeys("v0112222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID212() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0068");
		email.sendKeys("us0068@gmail.com");
		password.sendKeys("v0112222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID213() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0069");
		email.sendKeys("us0069@gmail.com");
		password.sendKeys("v0112222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID214() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0070");
		email.sendKeys("us0070@gmailcom");
		password.sendKeys("v0112222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID215() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0071");
		email.sendKeys("us0071@gmailcom");
		password.sendKeys("v0112222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID216() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("us0072");
		email.sendKeys("us0072@gmailcom");
		password.sendKeys("v0112222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID217() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1001");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID218() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1002");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID219() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1003");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID220() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1004");
		email.sendKeys("usr1004@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID221() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1005");
		email.sendKeys("usr1005@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID222() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1006");
		email.sendKeys("usr1006@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID223() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1007");
		email.sendKeys("usr1007@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID224() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1008");
		email.sendKeys("usr1008@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID225() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1009");
		email.sendKeys("usr1009@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID226() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1010");
		email.sendKeys("");
		password.sendKeys("p1001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID227() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1011");
		email.sendKeys("");
		password.sendKeys("p1002");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID228() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1012");
		email.sendKeys("");
		password.sendKeys("p1003");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID229() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1013");
		email.sendKeys("usr1013@gmail.com");
		password.sendKeys("p1004");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID230() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1014");
		email.sendKeys("usr1014@gmail.com");
		password.sendKeys("p1005");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID231() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1015");
		email.sendKeys("usr1015@gmail.com");
		password.sendKeys("p1006");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID232() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1016");
		email.sendKeys("usr1016@gmailcom");
		password.sendKeys("p1007");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID233() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1017");
		email.sendKeys("usr1017@gmailcom");
		password.sendKeys("p1008");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID234() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1018");
		email.sendKeys("usr1018@gmailcom");
		password.sendKeys("p1009");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID235() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1019");
		email.sendKeys("");
		password.sendKeys("q10001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID236() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1020");
		email.sendKeys("");
		password.sendKeys("q10002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID237() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1021");
		email.sendKeys("");
		password.sendKeys("q10003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID238() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1022");
		email.sendKeys("usr1022@gmail.com");
		password.sendKeys("q10004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID239() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1023");
		email.sendKeys("usr1023@gmail.com");
		password.sendKeys("q10005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID240() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1024");
		email.sendKeys("usr1024@gmail.com");
		password.sendKeys("q10006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID241() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1025");
		email.sendKeys("usr1025@gmailcom");
		password.sendKeys("q10007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID242() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1026");
		email.sendKeys("usr1026@gmailcom");
		password.sendKeys("q10008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID243() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1027");
		email.sendKeys("usr1027@gmailcom");
		password.sendKeys("q10009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID244() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1028");
		email.sendKeys("");
		password.sendKeys("r110001");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID245() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1029");
		email.sendKeys("");
		password.sendKeys("r110002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID246() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1030");
		email.sendKeys("");
		password.sendKeys("r110003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID247() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1031");
		email.sendKeys("usr1031@gmail.com");
		password.sendKeys("r110004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID248() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1032");
		email.sendKeys("usr1032@gmail.com");
		password.sendKeys("r110005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID249() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1033");
		email.sendKeys("usr1033@gmail.com");
		password.sendKeys("r110006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID250() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1034");
		email.sendKeys("usr1034@gmailcom");
		password.sendKeys("r110007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID251() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1035");
		email.sendKeys("usr1035@gmailcom");
		password.sendKeys("r110008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID252() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1036");
		email.sendKeys("usr1036@gmailcom");
		password.sendKeys("r110009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID253() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1037");
		email.sendKeys("");
		password.sendKeys("s1123451");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID254() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1038");
		email.sendKeys("");
		password.sendKeys("s1123452");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID255() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1039");
		email.sendKeys("");
		password.sendKeys("s1123453");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID256() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1040");
		email.sendKeys("usr1040@gmail.com");
		password.sendKeys("s1123454");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID257() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1041");
		email.sendKeys("usr1041@gmail.com");
		password.sendKeys("s1123455");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID258() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1042");
		email.sendKeys("usr1042@gmail.com");
		password.sendKeys("s1123456");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID259() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1043");
		email.sendKeys("usr1043@gmailcom");
		password.sendKeys("s1123457");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID260() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1044");
		email.sendKeys("usr1044@gmailcom");
		password.sendKeys("s1123458");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID261() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1045");
		email.sendKeys("usr1045@gmailcom");
		password.sendKeys("s1123459");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID262() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1046");
		email.sendKeys("");
		password.sendKeys("t11222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID263() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1047");
		email.sendKeys("");
		password.sendKeys("t11222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID264() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1048");
		email.sendKeys("");
		password.sendKeys("t11222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID265() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1049");
		email.sendKeys("usr1049@gmail.com");
		password.sendKeys("t11222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID266() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1050");
		email.sendKeys("usr1050@gmail.com");
		password.sendKeys("t11222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID267() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1051");
		email.sendKeys("usr1051@gmail.com");
		password.sendKeys("t11222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID268() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1052");
		email.sendKeys("usr1052@gmailcom");
		password.sendKeys("t11222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID269() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1053");
		email.sendKeys("usr1053@gmailcom");
		password.sendKeys("t11222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID270() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1054");
		email.sendKeys("usr1054@gmailcom");
		password.sendKeys("t11222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID271() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1055");
		email.sendKeys("");
		password.sendKeys("u111222231");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID272() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1056");
		email.sendKeys("");
		password.sendKeys("u111222232");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID273() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1057");
		email.sendKeys("");
		password.sendKeys("u111222233");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID274() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1058");
		email.sendKeys("usr1058@gmail.com");
		password.sendKeys("u111222234");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID275() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1059");
		email.sendKeys("usr1059@gmail.com");
		password.sendKeys("u111222235");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID276() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1060");
		email.sendKeys("usr1060@gmail.com");
		password.sendKeys("u111222236");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID277() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1061");
		email.sendKeys("usr1061@gmailcom");
		password.sendKeys("u111222237");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID278() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1062");
		email.sendKeys("usr1062@gmailcom");
		password.sendKeys("u111222238");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID279() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1063");
		email.sendKeys("usr1063@gmailcom");
		password.sendKeys("u111222239");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID280() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1064");
		email.sendKeys("");
		password.sendKeys("v1112222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID281() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1065");
		email.sendKeys("");
		password.sendKeys("v1112222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID282() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1066");
		email.sendKeys("");
		password.sendKeys("v1112222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID283() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1067");
		email.sendKeys("usr1067@gmail.com");
		password.sendKeys("v1112222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID284() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1068");
		email.sendKeys("usr1068@gmail.com");
		password.sendKeys("v1112222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID285() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1069");
		email.sendKeys("usr1069@gmail.com");
		password.sendKeys("v1112222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID286() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1070");
		email.sendKeys("usr1070@gmailcom");
		password.sendKeys("v1112222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID287() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1071");
		email.sendKeys("usr1071@gmailcom");
		password.sendKeys("v1112222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID288() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("usr1072");
		email.sendKeys("usr1072@gmailcom");
		password.sendKeys("v1112222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID289() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00001");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID290() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00002");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID291() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00003");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID292() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00004");
		email.sendKeys("username00004@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID293() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00005");
		email.sendKeys("username00005@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID294() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00006");
		email.sendKeys("username00006@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID295() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00007");
		email.sendKeys("username00007@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID296() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00008");
		email.sendKeys("username00008@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID297() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00009");
		email.sendKeys("username00009@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID298() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00010");
		email.sendKeys("");
		password.sendKeys("p2001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID299() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00011");
		email.sendKeys("");
		password.sendKeys("p2002");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID300() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00012");
		email.sendKeys("");
		password.sendKeys("p2003");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID301() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00013");
		email.sendKeys("username00013@gmail.com");
		password.sendKeys("p2004");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID302() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00014");
		email.sendKeys("username00014@gmail.com");
		password.sendKeys("p2005");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID303() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00015");
		email.sendKeys("username00015@gmail.com");
		password.sendKeys("p2006");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID304() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00016");
		email.sendKeys("username00016@gmailcom");
		password.sendKeys("p2007");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID305() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00017");
		email.sendKeys("username00017@gmailcom");
		password.sendKeys("p2008");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID306() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00018");
		email.sendKeys("username00018@gmailcom");
		password.sendKeys("p2009");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID307() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00019");
		email.sendKeys("");
		password.sendKeys("q20001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID308() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00020");
		email.sendKeys("");
		password.sendKeys("q20002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID309() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00021");
		email.sendKeys("");
		password.sendKeys("q20003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID310() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00022");
		email.sendKeys("username00022@gmail.com");
		password.sendKeys("q20004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID311() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00023");
		email.sendKeys("username00023@gmail.com");
		password.sendKeys("q20005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID312() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00024");
		email.sendKeys("username00024@gmail.com");
		password.sendKeys("q20006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID313() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00025");
		email.sendKeys("username00025@gmailcom");
		password.sendKeys("q20007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID314() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00026");
		email.sendKeys("username00026@gmailcom");
		password.sendKeys("q20008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID315() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00027");
		email.sendKeys("username00027@gmailcom");
		password.sendKeys("q20009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID316() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00028");
		email.sendKeys("");
		password.sendKeys("r210001");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID317() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00029");
		email.sendKeys("");
		password.sendKeys("r210002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID318() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00030");
		email.sendKeys("");
		password.sendKeys("r210003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID319() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00031");
		email.sendKeys("username00031@gmail.com");
		password.sendKeys("r210004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID320() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00032");
		email.sendKeys("username00032@gmail.com");
		password.sendKeys("r210005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID321() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00033");
		email.sendKeys("username00033@gmail.com");
		password.sendKeys("r210006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID322() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00034");
		email.sendKeys("username00034@gmailcom");
		password.sendKeys("r210007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID323() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00035");
		email.sendKeys("username00035@gmailcom");
		password.sendKeys("r210008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID324() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00036");
		email.sendKeys("username00036@gmailcom");
		password.sendKeys("r210009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID325() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00037");
		email.sendKeys("");
		password.sendKeys("s2123451");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID326() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00038");
		email.sendKeys("");
		password.sendKeys("s2123452");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID327() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00039");
		email.sendKeys("");
		password.sendKeys("s2123453");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID328() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00040");
		email.sendKeys("username00040@gmail.com");
		password.sendKeys("s2123454");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID329() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00041");
		email.sendKeys("username00041@gmail.com");
		password.sendKeys("s2123455");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID330() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00042");
		email.sendKeys("username00042@gmail.com");
		password.sendKeys("s2123456");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID331() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00043");
		email.sendKeys("username00043@gmailcom");
		password.sendKeys("s2123457");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID332() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00044");
		email.sendKeys("username00044@gmailcom");
		password.sendKeys("s2123458");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID333() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00045");
		email.sendKeys("username00045@gmailcom");
		password.sendKeys("s2123459");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID334() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00046");
		email.sendKeys("");
		password.sendKeys("t21222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID335() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00047");
		email.sendKeys("");
		password.sendKeys("t21222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID336() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00048");
		email.sendKeys("");
		password.sendKeys("t21222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID337() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00049");
		email.sendKeys("username00049@gmail.com");
		password.sendKeys("t21222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID338() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00050");
		email.sendKeys("username00050@gmail.com");
		password.sendKeys("t21222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID339() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00051");
		email.sendKeys("username00051@gmail.com");
		password.sendKeys("t21222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID340() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00052");
		email.sendKeys("username00052@gmailcom");
		password.sendKeys("t21222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID341() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00053");
		email.sendKeys("username00053@gmailcom");
		password.sendKeys("t21222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID342() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00054");
		email.sendKeys("username00054@gmailcom");
		password.sendKeys("t21222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID343() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00055");
		email.sendKeys("");
		password.sendKeys("u211222231");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID344() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00056");
		email.sendKeys("");
		password.sendKeys("u211222232");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID345() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00057");
		email.sendKeys("");
		password.sendKeys("u211222233");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID346() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00058");
		email.sendKeys("username00058@gmail.com");
		password.sendKeys("u211222234");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID347() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00059");
		email.sendKeys("username00059@gmail.com");
		password.sendKeys("u211222235");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID348() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00060");
		email.sendKeys("username00060@gmail.com");
		password.sendKeys("u211222236");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID349() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00061");
		email.sendKeys("username00061@gmailcom");
		password.sendKeys("u211222237");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID350() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00062");
		email.sendKeys("username00062@gmailcom");
		password.sendKeys("u211222238");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID351() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00063");
		email.sendKeys("username00063@gmailcom");
		password.sendKeys("u211222239");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID352() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00064");
		email.sendKeys("");
		password.sendKeys("v2112222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID353() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00065");
		email.sendKeys("");
		password.sendKeys("v2112222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID354() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00066");
		email.sendKeys("");
		password.sendKeys("v2112222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID355() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00067");
		email.sendKeys("username00067@gmail.com");
		password.sendKeys("v2112222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID356() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00068");
		email.sendKeys("username00068@gmail.com");
		password.sendKeys("v2112222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID357() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00069");
		email.sendKeys("username00069@gmail.com");
		password.sendKeys("v2112222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID358() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00070");
		email.sendKeys("username00070@gmailcom");
		password.sendKeys("v2112222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID359() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00071");
		email.sendKeys("username00071@gmailcom");
		password.sendKeys("v2112222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID360() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username00072");
		email.sendKeys("username00072@gmailcom");
		password.sendKeys("v2112222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID361() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600001");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID362() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600002");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID363() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600003");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID364() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600004");
		email.sendKeys("username12345600004@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID365() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600005");
		email.sendKeys("username12345600005@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID366() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600006");
		email.sendKeys("username12345600006@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID367() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600007");
		email.sendKeys("username12345600007@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID368() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600008");
		email.sendKeys("username12345600008@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID369() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600009");
		email.sendKeys("username12345600009@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID370() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600010");
		email.sendKeys("");
		password.sendKeys("p3001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID371() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600011");
		email.sendKeys("");
		password.sendKeys("p3002");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID372() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600012");
		email.sendKeys("");
		password.sendKeys("p3003");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID373() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600013");
		email.sendKeys("username12345600013@gmail.com");
		password.sendKeys("p3004");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID374() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600014");
		email.sendKeys("username12345600014@gmail.com");
		password.sendKeys("p3005");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID375() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600015");
		email.sendKeys("username12345600015@gmail.com");
		password.sendKeys("p3006");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID376() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600016");
		email.sendKeys("username12345600016@gmailcom");
		password.sendKeys("p3007");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID377() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600017");
		email.sendKeys("username12345600017@gmailcom");
		password.sendKeys("p3008");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID378() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600018");
		email.sendKeys("username12345600018@gmailcom");
		password.sendKeys("p3009");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID379() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600019");
		email.sendKeys("");
		password.sendKeys("q30001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID380() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600020");
		email.sendKeys("");
		password.sendKeys("q30002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID381() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600021");
		email.sendKeys("");
		password.sendKeys("q30003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID382() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600022");
		email.sendKeys("username12345600022@gmail.com");
		password.sendKeys("q30004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID383() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600023");
		email.sendKeys("username12345600023@gmail.com");
		password.sendKeys("q30005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID384() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600024");
		email.sendKeys("username12345600024@gmail.com");
		password.sendKeys("q30006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID385() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600025");
		email.sendKeys("username12345600025@gmailcom");
		password.sendKeys("q30007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID386() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600026");
		email.sendKeys("username12345600026@gmailcom");
		password.sendKeys("q30008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID387() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600027");
		email.sendKeys("username12345600027@gmailcom");
		password.sendKeys("q30009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID388() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600028");
		email.sendKeys("");
		password.sendKeys("r310001");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID389() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600029");
		email.sendKeys("");
		password.sendKeys("r310002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID390() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600030");
		email.sendKeys("");
		password.sendKeys("r310003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID391() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600031");
		email.sendKeys("username12345600031@gmail.com");
		password.sendKeys("r310004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID392() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600032");
		email.sendKeys("username12345600032@gmail.com");
		password.sendKeys("r310005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID393() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600033");
		email.sendKeys("username12345600033@gmail.com");
		password.sendKeys("r310006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID394() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600034");
		email.sendKeys("username12345600034@gmailcom");
		password.sendKeys("r310007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID395() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600035");
		email.sendKeys("username12345600035@gmailcom");
		password.sendKeys("r310008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID396() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600036");
		email.sendKeys("username12345600036@gmailcom");
		password.sendKeys("r310009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID397() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600037");
		email.sendKeys("");
		password.sendKeys("s3123451");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID398() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600038");
		email.sendKeys("");
		password.sendKeys("s3123452");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID399() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600039");
		email.sendKeys("");
		password.sendKeys("s3123453");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID400() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600040");
		email.sendKeys("username12345600040@gmail.com");
		password.sendKeys("s3123454");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID401() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600041");
		email.sendKeys("username12345600041@gmail.com");
		password.sendKeys("s3123455");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID402() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600042");
		email.sendKeys("username12345600042@gmail.com");
		password.sendKeys("s3123456");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID403() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600043");
		email.sendKeys("username12345600043@gmailcom");
		password.sendKeys("s3123457");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID404() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600044");
		email.sendKeys("username12345600044@gmailcom");
		password.sendKeys("s3123458");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID405() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600045");
		email.sendKeys("username12345600045@gmailcom");
		password.sendKeys("s3123459");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID406() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600046");
		email.sendKeys("");
		password.sendKeys("t31222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID407() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600047");
		email.sendKeys("");
		password.sendKeys("t31222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID408() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600048");
		email.sendKeys("");
		password.sendKeys("t31222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID409() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600049");
		email.sendKeys("username12345600049@gmail.com");
		password.sendKeys("t31222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID410() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600050");
		email.sendKeys("username12345600050@gmail.com");
		password.sendKeys("t31222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID411() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600051");
		email.sendKeys("username12345600051@gmail.com");
		password.sendKeys("t31222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID412() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600052");
		email.sendKeys("username12345600052@gmailcom");
		password.sendKeys("t31222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID413() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600053");
		email.sendKeys("username12345600053@gmailcom");
		password.sendKeys("t31222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID414() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600054");
		email.sendKeys("username12345600054@gmailcom");
		password.sendKeys("t31222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID415() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600055");
		email.sendKeys("");
		password.sendKeys("u311222231");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID416() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600056");
		email.sendKeys("");
		password.sendKeys("u311222232");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID417() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600057");
		email.sendKeys("");
		password.sendKeys("u311222233");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID418() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600058");
		email.sendKeys("username12345600058@gmail.com");
		password.sendKeys("u311222234");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID419() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600059");
		email.sendKeys("username12345600059@gmail.com");
		password.sendKeys("u311222235");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID420() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600060");
		email.sendKeys("username12345600060@gmail.com");
		password.sendKeys("u311222236");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID421() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600061");
		email.sendKeys("username12345600061@gmailcom");
		password.sendKeys("u311222237");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID422() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600062");
		email.sendKeys("username12345600062@gmailcom");
		password.sendKeys("u311222238");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID423() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600063");
		email.sendKeys("username12345600063@gmailcom");
		password.sendKeys("u311222239");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID424() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600064");
		email.sendKeys("");
		password.sendKeys("v3112222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID425() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600065");
		email.sendKeys("");
		password.sendKeys("v3112222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID426() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600066");
		email.sendKeys("");
		password.sendKeys("v3112222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID427() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600067");
		email.sendKeys("username12345600067@gmail.com");
		password.sendKeys("v3112222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID428() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600068");
		email.sendKeys("username12345600068@gmail.com");
		password.sendKeys("v3112222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID429() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600069");
		email.sendKeys("username12345600069@gmail.com");
		password.sendKeys("v3112222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID430() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600070");
		email.sendKeys("username12345600070@gmailcom");
		password.sendKeys("v3112222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID431() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600071");
		email.sendKeys("username12345600071@gmailcom");
		password.sendKeys("v3112222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID432() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username12345600072");
		email.sendKeys("username12345600072@gmailcom");
		password.sendKeys("v3112222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID433() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700001");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID434() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700002");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID435() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700003");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID436() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700004");
		email.sendKeys("username123456700004@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID437() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700005");
		email.sendKeys("username123456700005@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID438() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700006");
		email.sendKeys("username123456700006@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID439() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700007");
		email.sendKeys("username123456700007@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID440() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700008");
		email.sendKeys("username123456700008@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID441() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700009");
		email.sendKeys("username123456700009@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID442() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700010");
		email.sendKeys("");
		password.sendKeys("p4001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID443() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700011");
		email.sendKeys("");
		password.sendKeys("p4002");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID444() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700012");
		email.sendKeys("");
		password.sendKeys("p4003");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID445() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700013");
		email.sendKeys("username123456700013@gmail.com");
		password.sendKeys("p4004");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID446() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700014");
		email.sendKeys("username123456700014@gmail.com");
		password.sendKeys("p4005");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID447() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700015");
		email.sendKeys("username123456700015@gmail.com");
		password.sendKeys("p4006");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID448() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700016");
		email.sendKeys("username123456700016@gmailcom");
		password.sendKeys("p4007");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID449() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700017");
		email.sendKeys("username123456700017@gmailcom");
		password.sendKeys("p4008");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID450() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700018");
		email.sendKeys("username123456700018@gmailcom");
		password.sendKeys("p4009");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID451() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700019");
		email.sendKeys("");
		password.sendKeys("q40001");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID452() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700020");
		email.sendKeys("");
		password.sendKeys("q40002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID453() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700021");
		email.sendKeys("");
		password.sendKeys("q40003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID454() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700022");
		email.sendKeys("username123456700022@gmail.com");
		password.sendKeys("q40004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID455() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700023");
		email.sendKeys("username123456700023@gmail.com");
		password.sendKeys("q40005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID456() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700024");
		email.sendKeys("username123456700024@gmail.com");
		password.sendKeys("q40006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID457() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700025");
		email.sendKeys("username123456700025@gmailcom");
		password.sendKeys("q40007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID458() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700026");
		email.sendKeys("username123456700026@gmailcom");
		password.sendKeys("q40008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID459() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700027");
		email.sendKeys("username123456700027@gmailcom");
		password.sendKeys("q40009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID460() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700028");
		email.sendKeys("");
		password.sendKeys("r410001");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID461() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700029");
		email.sendKeys("");
		password.sendKeys("r410002");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID462() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700030");
		email.sendKeys("");
		password.sendKeys("r410003");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID463() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700031");
		email.sendKeys("username123456700031@gmail.com");
		password.sendKeys("r410004");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID464() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700032");
		email.sendKeys("username123456700032@gmail.com");
		password.sendKeys("r410005");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID465() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700033");
		email.sendKeys("username123456700033@gmail.com");
		password.sendKeys("r410006");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID466() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700034");
		email.sendKeys("username123456700034@gmailcom");
		password.sendKeys("r410007");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID467() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700035");
		email.sendKeys("username123456700035@gmailcom");
		password.sendKeys("r410008");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID468() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700036");
		email.sendKeys("username123456700036@gmailcom");
		password.sendKeys("r410009");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID469() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700037");
		email.sendKeys("");
		password.sendKeys("s4123451");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID470() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700038");
		email.sendKeys("");
		password.sendKeys("s4123452");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID471() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700039");
		email.sendKeys("");
		password.sendKeys("s4123453");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID472() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700040");
		email.sendKeys("username123456700040@gmail.com");
		password.sendKeys("s4123454");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID473() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700041");
		email.sendKeys("username123456700041@gmail.com");
		password.sendKeys("s4123455");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID474() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700042");
		email.sendKeys("username123456700042@gmail.com");
		password.sendKeys("s4123456");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID475() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700043");
		email.sendKeys("username123456700043@gmailcom");
		password.sendKeys("s4123457");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID476() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700044");
		email.sendKeys("username123456700044@gmailcom");
		password.sendKeys("s4123458");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID477() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700045");
		email.sendKeys("username123456700045@gmailcom");
		password.sendKeys("s4123459");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID478() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700046");
		email.sendKeys("");
		password.sendKeys("t41222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID479() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700047");
		email.sendKeys("");
		password.sendKeys("t41222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID480() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700048");
		email.sendKeys("");
		password.sendKeys("t41222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID481() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700049");
		email.sendKeys("username123456700049@gmail.com");
		password.sendKeys("t41222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID482() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700050");
		email.sendKeys("username123456700050@gmail.com");
		password.sendKeys("t41222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID483() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700051");
		email.sendKeys("username123456700051@gmail.com");
		password.sendKeys("t41222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID484() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700052");
		email.sendKeys("username123456700052@gmailcom");
		password.sendKeys("t41222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID485() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700053");
		email.sendKeys("username123456700053@gmailcom");
		password.sendKeys("t41222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID486() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700054");
		email.sendKeys("username123456700054@gmailcom");
		password.sendKeys("t41222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID487() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700055");
		email.sendKeys("");
		password.sendKeys("u411222231");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID488() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700056");
		email.sendKeys("");
		password.sendKeys("u411222232");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID489() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700057");
		email.sendKeys("");
		password.sendKeys("u411222233");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID490() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700058");
		email.sendKeys("username123456700058@gmail.com");
		password.sendKeys("u411222234");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID491() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700059");
		email.sendKeys("username123456700059@gmail.com");
		password.sendKeys("u411222235");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID492() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700060");
		email.sendKeys("username123456700060@gmail.com");
		password.sendKeys("u411222236");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration successful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID493() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700061");
		email.sendKeys("username123456700061@gmailcom");
		password.sendKeys("u411222237");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID494() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700062");
		email.sendKeys("username123456700062@gmailcom");
		password.sendKeys("u411222238");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID495() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700063");
		email.sendKeys("username123456700063@gmailcom");
		password.sendKeys("u411222239");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID496() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700064");
		email.sendKeys("");
		password.sendKeys("v4112222331");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID497() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700065");
		email.sendKeys("");
		password.sendKeys("v4112222332");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID498() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700066");
		email.sendKeys("");
		password.sendKeys("v4112222333");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID499() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700067");
		email.sendKeys("username123456700067@gmail.com");
		password.sendKeys("v4112222334");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID500() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700068");
		email.sendKeys("username123456700068@gmail.com");
		password.sendKeys("v4112222335");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID501() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700069");
		email.sendKeys("username123456700069@gmail.com");
		password.sendKeys("v4112222336");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID502() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700070");
		email.sendKeys("username123456700070@gmailcom");
		password.sendKeys("v4112222337");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID503() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700071");
		email.sendKeys("username123456700071@gmailcom");
		password.sendKeys("v4112222338");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID504() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("username123456700072");
		email.sendKeys("username123456700072@gmailcom");
		password.sendKeys("v4112222339");

		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));

		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID505() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID506() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID507() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID508() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID509() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID510() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID511() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID512() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID513() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID514() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID515() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID516() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID517() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID518() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID519() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID520() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID521() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID522() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID523() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID524() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID525() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID526() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID527() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID528() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID529() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID530() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID531() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID532() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID533() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID534() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID535() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID536() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID537() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID538() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID539() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID540() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("aaaaaaa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID541() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID542() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID543() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID544() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID545() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID546() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID547() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID548() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID549() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID550() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID551() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID552() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID553() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID554() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID555() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID556() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID557() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID558() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID559() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID560() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID561() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID562() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID563() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID564() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID565() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID566() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID567() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("ababababab");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID568() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID569() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID570() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID571() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID572() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("female"));

		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID573() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));

		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmail.com");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID574() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("male"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID575() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("female"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

	@Test
	void testUserRegistration_TestCaseID576() throws Exception {

		WebElement username = driver.findElement(By.id("registerusername"));
		WebElement email = driver.findElement(By.id("registeremail"));
		WebElement password = driver.findElement(By.id("registerpassword"));
		WebElement gender = driver.findElement(By.id("other"));
		WebElement registerbutton = driver.findElement(By.id("btn-register"));

		username.sendKeys("mshahsiamansarydhrubo");
		email.sendKeys("siam@gmailcom");
		password.sendKeys("abababababa");
		gender.click();
		registerbutton.click();
		Thread.sleep(2000);

		String actualString = driver.findElement(By.id("regunsuccessfulmsg")).getText();
		assertTrue(actualString.contains("Registration unsuccessful"));
		driver.close();
	}

}

