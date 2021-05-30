package packDocker.Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeStandalone {
	
	@Test
	public  void test3() throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.edge();

		URL u = new URL("http://localhost:4444/");
		RemoteWebDriver driver = new RemoteWebDriver(u, cap);
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());

		driver.close();

		}
	
	
}
