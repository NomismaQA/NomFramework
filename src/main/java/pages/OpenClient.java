package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7815bfc3-7a70-43d6-a994-342f3e78874d
@TestModellerModule(guid = "7815bfc3-7a70-43d6-a994-342f3e78874d")
public class OpenClient extends BasePage
{
	public OpenClient (WebDriver driver)
	{
		super(driver); 
	}


	
	private By ClientsClickElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By EnterClientNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ClickSearchElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ClickClientElem = By.xpath("//TR[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/TD/SPAN[@class='border-btm-dotted']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClientsClick
	 * @throws InterruptedException 
     * @name Click ClientsClick
     */
	public void Click_ClientsClick() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClientsClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

			Assert.fail("Unable to locate object: " + ClientsClickElem.toString());
        }

		//Thread.sleep(10000);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		
		jsExec.executeScript("arguments[0].click();", elem);
	
		
		 
	//	Thread.sleep(20000);
	//	ClosePopup.ValidateAndPopUp1(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click_ClientsClick");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientsClick");
	}

      
	/**
 	 * Enter EnterClientName
     * @name Enter EnterClientName
     */
 	public void Enter_EnterClientName(String EnterClientName)
 	{
 	    
 		WebElement elem = getWebElement(EnterClientNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
         }

 		elem.sendKeys(EnterClientName);
 	//	ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterClientName " + EnterClientName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterClientName " + EnterClientName);
 	}

     
	/**
 	 * Click ClickSearch
     * @name Click ClickSearch
     */
	public void Click_ClickSearch()
	{
        
		WebElement elem = getWebElement(ClickSearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickSearch", "Click_ClickSearch failed. Unable to locate object: " + ClickSearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickSearch", "Click_ClickSearch failed. Unable to locate object: " + ClickSearchElem.toString());

			Assert.fail("Unable to locate object: " + ClickSearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClickSearch");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickSearch");
	}

     
	/**
 	 * Click ClickClient
     * @name Click ClickClient
     */
	public void Click_ClickClient()
	{
        
		WebElement elem = getWebElement(ClickClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickClient", "Click_ClickClient failed. Unable to locate object: " + ClickClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickClient", "Click_ClickClient failed. Unable to locate object: " + ClickClientElem.toString());

			Assert.fail("Unable to locate object: " + ClickClientElem.toString());
        }

		elem.click();
          	
		ChangeWindow.tabswitch(m_Driver);
		
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickClient");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickClient");
	}
}