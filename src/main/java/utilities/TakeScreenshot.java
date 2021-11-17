package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.OutputType;

public class TakeScreenshot {

	public static void takeScreenshot (WebDriver m_Driver , String ScreenshotName ) throws Exception
	{
		
		try {
			TakesScreenshot ts=(TakesScreenshot)m_Driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("./Screenshots/"+ScreenshotName+".png"));
		
		}
		catch (Exception e) 
		{
			System.out.println("Exception while taking screenshot");
		}

	}

}
