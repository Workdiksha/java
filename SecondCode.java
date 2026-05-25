import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.ChromeDriver", "C:\\Selenium webdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("diksha");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.name("login-button")).click();
		System.out.println(driver.findElement(By.cssSelector("h3[data-test = 'error']")).getText());
		
		

	}

}
