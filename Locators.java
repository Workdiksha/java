import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.ChromeDriver", "C:\\Selenium webdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://grotechminds.com/user-account/");
		driver.findElement(By.name("user_login")).sendKeys("Ashwini");
		driver.findElement(By.name("user_password")).sendKeys("123");
        driver.findElement(By.className("masterstudy-button__title")).click();
//System.out.println(driver.findElement(By.cssSelector("span.masterstudy-authorization__form-field-error")).getText());//
//driver.findElement(By.cssSelector(".masterstudy-authorization__switch-lost-pass")).click();//





Thread.sleep(3000); // simple wait

System.out.println(driver.findElement(By.cssSelector(".masterstudy-authorization__form-field-error")).getText());

Thread.sleep(3000); // wait again

driver.findElement(By.cssSelector(".masterstudy-authorization__switch-lost-pass")).click();
		}
	
	
}