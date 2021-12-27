package utilities;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class ClosePopup extends BasePage
{
	public ClosePopup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static boolean ValidateAndPopUp(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(5000);
	           // WebElement ele = driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
	            WebElement ele = driver.findElement(By.xpath("//*[@id='d55d6066-fd88-42cb-b3d6-4c159111bd6f']"));
	          //*[@id="5b258dc2-c6ff-42aa-8c2b-754a39b6b7ae"]
	          
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            ele.click(); 
	            System.out.println(true); 
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
	
	public static boolean ValidateAndPopUp1(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(5000);
	           // WebElement ele = driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
	            WebElement ele = driver.findElement(By.xpath("//*[@id='d55d6066-fd88-42cb-b3d6-4c159111bd6f']"));
	        
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            ele.click();
	            System.out.println(true);
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
}
