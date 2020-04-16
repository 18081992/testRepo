import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	public static void main(String[] args) throws InterruptedException {	
		// for chrome browser ..
		//System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDemo\\Jars\\DriverExecutable\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
				
		// firefox browser ..
		//System.setProperty("webdriver.firefox.geckodriver", "D:\\SeleniumDemo\\Jars\\DriverExecutable\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		//IE browser
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.
				  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
		System.setProperty("webdriver.ie.IEDriverServer", "D:\\SeleniumDemo\\Jars\\DriverExecutable\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver(cap);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
