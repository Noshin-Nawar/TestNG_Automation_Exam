package util;


	import java.util.concurrent.TimeUnit;

	import org.junit.Test;
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class BrowserFactory {
		static WebDriver driver;
		@Test
		public static WebDriver init() 
			{
			System.setProperty("webdriver.chrome.driver","C:\\NOSHIN\\Cucumber_Projects\\TestNG_Project\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://techfios.com/test/101/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}
			
		public static void tearDown()
		{
		driver.close();
		driver.quit();
	}
}
