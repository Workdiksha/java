//import org.openqa.selenium.chrome.ChromeDriver;//
//import org.openqa.selenium.firefox.FirefoxDriver;//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*WebDriver driver2 = new ChromeDriver();*/
		//System.setProperty("WebDriver.chrome.driver","C:\\Selenium webdriver.exe");//
		
		//System.setProperty("WebDriver.gecko.driver","C:\\Selenium webdriver.exe");
		//WebDriver driver = new FirefoxDriver();//
		
		System.setProperty("WebDriver.edge.driver","C:\\driver3.exe");
		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://grotechminds.com/user-account/");
		
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		driver3.close();
		driver3.quit();
		
		
	
		

	}

}
