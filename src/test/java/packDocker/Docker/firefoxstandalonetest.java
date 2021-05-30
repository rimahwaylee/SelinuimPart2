package packDocker.Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firefoxstandalonetest {
	
	@Test
	public void test1() throws MalformedURLException {
	
	DesiredCapabilities cap = DesiredCapabilities.firefox();
	
	URL u = new URL("http://localhost:4444/");
	RemoteWebDriver driver = new RemoteWebDriver(u, cap);
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	
	driver.close();
	
	}

}