package packDocker.Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeStandalone {
	
	@Test
	public  void test2() throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL u = new URL("http://localhost:4444/");
		RemoteWebDriver driver = new RemoteWebDriver(u, cap);
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println("chrome");

		driver.close();

		}
}
