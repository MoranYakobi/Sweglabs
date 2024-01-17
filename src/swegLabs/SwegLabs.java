package swegLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwegLabs {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//insert user name
		driver.findElement(By.cssSelector("[name='user-name']")).sendKeys("standard_user");
		
		
		//insert password
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("secret_sauce");
		
		
		//click login
		driver.findElement(By.cssSelector("#login-button")).click();
	}

}
