package packDocker.Docker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Startdocker {
	@BeforeTest
	public  void startdocker() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		rt.exec("cmd /c start dockercomposeup.bat");
		System.out.println("started!!!!!!!!!!!!");
		
		Thread.sleep(10000);
		String file = "out.txt";

		BufferedReader buff = new BufferedReader(new FileReader(file));
		String currentLine = buff.readLine();
		boolean flag = false;
		Thread.sleep(10000);

		while (currentLine != null && !flag)

		{

		if (currentLine.contains("Starting Selenium Grid Node")) {
		System.out.println("found my text");
		flag = true;
		break;
		}

		currentLine = buff.readLine();
		}
		buff.close();

		Assert.assertTrue(flag);
		Thread.sleep(10000);
		
	}

}
