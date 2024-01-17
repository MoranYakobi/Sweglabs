package swegLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwegLabsJava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		tc02_FailedLogin(driver, "standard_user", "123456");

		tc03_FailedLogin(driver, "standard_user", "");

		tc04_FailedLogin(driver, "moran", "secret_sauce");

		tc05_FailedLogin(driver, "moran", "moran");

		tc06_FailedLogin(driver, "moran", "");

		tc07_FailedLogin(driver, "", "secret_sauce");

		tc08_FailedLogin(driver, "", "moran");

		tc09_FailedLogin(driver, "", "");

		tc01_FailedLogin(driver, "standard_user", "secret_sauce");

	}

	//LOGIN
	public static void login(WebDriver driver, String userName,String password) {
		driver.navigate().refresh();
		//insert user name
		driver.findElement(By.cssSelector("#user-name")).sendKeys(userName);
		//insert password
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		//click login
		driver.findElement(By.cssSelector("#login-button")).click(); }

	//TC02- failed login - valid user name & invalid password 
	public static void tc02_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 02 - FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 02 - FAILED LOGIN -- FAILED");
		}
	}
	//TC03 - failed login - valid user name & null password 
	public static void tc03_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = ("Epic sadface: Password is required");
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 03- FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 03- FAILED LOGIN -- FAILED");
		}
	}
	//TC04 - failed login - invalid user name & valid password 
	public static void tc04_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 04- FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 04- FAILED LOGIN -- FAILED");
		}
	}

	//TC05 - failed login - invalid user name & invalid password 
	public static void tc05_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 05- FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 05- FAILED LOGIN -- FAILED");
		}
	}


	//TC06 - failed login - invalid user name & null password 
	public static void tc06_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Epic sadface: Password is required";
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 06- FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 06- FAILED LOGIN -- FAILED");
		}
	}

	//TC07 - failed login - null user name & valid password 
	public static void tc07_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Epic sadface: Username is required";
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 07- FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 07- FAILED LOGIN -- FAILED");
		}
	}

	//TC08 - failed login - null user name & invalid password 
	public static void tc08_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Epic sadface: Username is required";
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 08- FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 08- FAILED LOGIN -- FAILED");
		}
	}
	//TC09 - failed login - null user name & null password 
	public static void tc09_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Epic sadface: Username is required";
		String actual = driver.findElement(By.cssSelector(" h3")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 09- FAILED LOGIN -- PASS");
		} else {
			System.out.println("TC 09- FAILED LOGIN -- FAILED");
		}
	}
	//TC01 - failed login - null user name & null password 
	public static void tc01_FailedLogin(WebDriver driver, String userName, String password) {

		login(driver, userName, password);

		String expected = "Products";
		String actual = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")).getText();

		if (expected.equals(actual)) {
			System.out.println("TC 01- Login successful-- PASS");
		} else {
			System.out.println("TC 01- FAILED LOGIN -- FAILED");
		}
		driver.quit();
	}		
}