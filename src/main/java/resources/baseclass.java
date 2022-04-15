package resources;


	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class baseclass {
	public WebDriver driver;
	public WebDriver intializeDriver() throws IOException {
	// to read properties file
	FileInputStream fis = new FileInputStream("C:\\Users\\91942\\eclipse-workspace\\endtoendtestNGproject\\src\\main\\java\\resources\\data.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	if (browserName.equals("chrome"))

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91942\\OneDrive\\Desktop\\selenium jas\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();	
	

	}
	else if (browserName.equals("Firefox")) {
	//firefox code
	}
	else if (browserName.equals("IE")) {
	//IE code
	}
	else {
	System.out.println("u should choose any of browser");
	}
	return driver;
	}
	@BeforeMethod
	public void launchBrowser() throws IOException {
	driver=intializeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	}

	}

