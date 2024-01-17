import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		
	
		driver.quit();
	}

}
