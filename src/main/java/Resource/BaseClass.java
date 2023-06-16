package Resource;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public WebDriver initializeDriver() throws IOException, IOException {

		prop = new Properties();

		// mention the below chrome option to solve timeout exception issue
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);

		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
			// driver = new ChromeDriver();
			driver = new ChromeDriver(options);
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", prop.getProperty("Firefox"));
			driver = new FirefoxDriver();
		}

		// driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		String urlName = prop.getProperty("url");
		System.out.println(urlName);
		driver.navigate().to(urlName);
		return driver;
	}

}
