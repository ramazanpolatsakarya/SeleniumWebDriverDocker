package seldocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/**
 * @author CHIRAG
 *
 */
public class ChromeTest {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url,cap);
		driver.get("https://google.com");
		System.out.println("=> "+driver.getTitle());
		driver.quit();
	}

}
