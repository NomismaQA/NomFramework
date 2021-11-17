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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ca9ecadd-4bb2-4a51-aa90-ae7678b43455
@TestModellerModule(guid = "ca9ecadd-4bb2-4a51-aa90-ae7678b43455")
public class agentpage extends BasePage
{
	public agentpage (WebDriver driver)
	{
		super(driver);
	}


	
	private By SearchAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By ClickSearchElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

//	private By ClickAgentElem = By.xpath("//TD[contains(text(),'VikasDemo')]");
	
	private By ClickAgentElem = By.xpath("//*[@id='ctl00_divSubContent']/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Default.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter SearchAgentName
	 * @throws InterruptedException 
     * @name Enter SearchAgentName
     */
 	public void Enter_SearchAgentName(String SearchAgentName) throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(SearchAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchAgentNameElem.toString());
         }
 		
 		Thread.sleep(2000);

 		elem.sendKeys(SearchAgentName);
 		//Thread.sleep(150000);
 		
// 		ClosePopup.ValidateAndPopUp(m_Driver);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);
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
 	 * Click ClickAgent
	 * @throws InterruptedException 
     * @name Click ClickAgent
     */
	public void Click_ClickAgent() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickAgentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickAgent", "Click_ClickAgent failed. Unable to locate object: " + ClickAgentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickAgent", "Click_ClickAgent failed. Unable to locate object: " + ClickAgentElem.toString());

			Assert.fail("Unable to locate object: " + ClickAgentElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
		
		Thread.sleep(1000);
          	
 
		ExtentReportManager.passStep(m_Driver, "Click_ClickAgent");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickAgent");
	}
}