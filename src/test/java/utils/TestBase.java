package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String url = prop.getProperty("QAUrl");
		String browser_prop = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");

		// result = testCondition ? value1:value2
		String chooseBrowser = browser_maven != null ? browser_maven : browser_prop;

		if (driver == null) {
			if (chooseBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//src//test//resources//seleniumdrivers//chromedriver.exe");

				driver = new ChromeDriver();
			}

			if (chooseBrowser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "//src//test//resources//seleniumdrivers//msedgedriver.exe");

				driver = new EdgeDriver();
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			driver.manage().window().maximize();
		}

		return driver;
	}

}
