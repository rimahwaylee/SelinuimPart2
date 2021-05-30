package packDocker.Docker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Stopdocker {
	
	@AfterTest
	public  void stopdocker() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Runtime rt = Runtime.getRuntime();
		rt.exec("cmd /c start dockercomposedown.bat");
		
		 Thread.sleep(10000);
		String file = "out.txt";

		BufferedReader buff = new BufferedReader(new FileReader(file));
		String currentLine = buff.readLine();
		boolean flag = false;
		 Thread.sleep(10000);

		while (currentLine != null && !flag)

		{

		if (currentLine.contains("Shutdown complete")) {
		System.out.println("found my text");
		flag = true;
		break;
		}

		currentLine = buff.readLine();
		}
		buff.close();

		Assert.assertTrue(flag);

		
	}

}
