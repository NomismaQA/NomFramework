package _1942_2010page;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/50146e73-d54d-4a61-af0e-d88b332a9bd3
@TestModellerModule(guid = "50146e73-d54d-4a61-af0e-d88b332a9bd3")
public class summaryverify extends BasePage
{
	
	float totalActualamount=0;
	
	
	public summaryverify (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Reports_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_SideMenu1_hrefReports']");

	private By P45FormsElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP60']");

	private By SelectP45FormElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlForm']");

	private By PayslipsclickElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory']");

	private By Statutory_Maternity_PaternityclickElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportStatutorySPPandParentingPay']");

	private By Employee_Details_ListclickElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportEmployeeListByCompany']");

	private By Individual_Employee_Pay_ScheduleclickElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportEmployeePayHistoryDeatils']");

	private By Apprenticeship_LevyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefApprenticeshipLevy']");

	private By BACs_Payment_Upload_FileElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefBankAccountDetails']");

	private By P11Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportP11']");

	private By Payroll_Reporting_Period_SummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefReportPeriodTotal']");

	private By Payroll_SummaryElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_hrefPayrollSummary']");
	
	private By SubContrPaymentElem = By.xpath("//*[@id='aspnetForm']/main/div/div[3]/header/h2");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12018");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12018");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12018");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12018";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportsAccMenu.aspx?PayrollCompanyCode=12018")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Reports 
     * @name Click  Reports 
     */
	public void Click__Reports_()
	{
        
		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_", "Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
	}

     
	/**
 	 * Click P45Forms
     * @name Click P45Forms
     */
	public void Click_P45Forms()
	{
        
		WebElement elem = getWebElement(P45FormsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_P45Forms", "Click_P45Forms failed. Unable to locate object: " + P45FormsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_P45Forms", "Click_P45Forms failed. Unable to locate object: " + P45FormsElem.toString());

			Assert.fail("Unable to locate object: " + P45FormsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_P45Forms");

		TestModellerLogger.PassStep(m_Driver, "Click_P45Forms");
	}

    
	/**
 	 * Select SelectP45Form
	 * @throws Exception 
	 * @name Select SelectP45Form
     */
    public void Select_SelectP45Form(String SelectP45Form) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(SelectP45FormElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectP45Form", "Select_SelectP45Form failed. Unable to locate object: " + SelectP45FormElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectP45Form", "Select_SelectP45Form failed. Unable to locate object: " + SelectP45FormElem.toString());

 			Assert.fail("Unable to locate object: " + SelectP45FormElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectP45Form);
 		Thread.sleep(2000);
 		
 		TakeScreenshot.takeScreenshot(m_Driver, "SelectP45Form");
 		
 		m_Driver.switchTo().defaultContent();
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectP45Form " + SelectP45Form);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectP45Form " + SelectP45Form);
 	}

     
	/**
 	 * Click Payslipsclick
	 * @throws Exception 
     * @name Click Payslipsclick
     */
	public void Click_Payslipsclick() throws Exception
	{
        
		WebElement elem = getWebElement(PayslipsclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payslipsclick", "Click_Payslipsclick failed. Unable to locate object: " + PayslipsclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payslipsclick", "Click_Payslipsclick failed. Unable to locate object: " + PayslipsclickElem.toString());

			Assert.fail("Unable to locate object: " + PayslipsclickElem.toString());
        }
		System.out.println("HelloPayslip");

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "PayslipClick");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payslipsclick");

		TestModellerLogger.PassStep(m_Driver, "Click_Payslipsclick");
	}

     
	/**
 	 * Click Statutory Maternity & Paternityclick
	 * @throws Exception 
     * @name Click Statutory Maternity & Paternityclick
     */
	public void Click_Statutory_Maternity_Paternityclick() throws Exception
	{
        
		WebElement elem = getWebElement(Statutory_Maternity_PaternityclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Statutory_Maternity_Paternityclick", "Click_Statutory_Maternity_Paternityclick failed. Unable to locate object: " + Statutory_Maternity_PaternityclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Statutory_Maternity_Paternityclick", "Click_Statutory_Maternity_Paternityclick failed. Unable to locate object: " + Statutory_Maternity_PaternityclickElem.toString());

			Assert.fail("Unable to locate object: " + Statutory_Maternity_PaternityclickElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "clickOnMaternity_Paternity");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Statutory_Maternity_Paternityclick");

		TestModellerLogger.PassStep(m_Driver, "Click_Statutory_Maternity_Paternityclick");
	}

     
	/**
 	 * Click Employee Details Listclick
	 * @throws Exception 
     * @name Click Employee Details Listclick
     */
	public void Click_Employee_Details_Listclick() throws Exception
	{
        
		WebElement elem = getWebElement(Employee_Details_ListclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Employee_Details_Listclick", "Click_Employee_Details_Listclick failed. Unable to locate object: " + Employee_Details_ListclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Employee_Details_Listclick", "Click_Employee_Details_Listclick failed. Unable to locate object: " + Employee_Details_ListclickElem.toString());

			Assert.fail("Unable to locate object: " + Employee_Details_ListclickElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "ClickEmployeeDetailList");

		ExtentReportManager.passStep(m_Driver, "Click_Employee_Details_Listclick");

		TestModellerLogger.PassStep(m_Driver, "Click_Employee_Details_Listclick");
	}

     
	/**
 	 * Click Individual Employee Pay Scheduleclick
	 * @throws Exception 
     * @name Click Individual Employee Pay Scheduleclick
     */
	public void Click_Individual_Employee_Pay_Scheduleclick() throws Exception
	{
        
		WebElement elem = getWebElement(Individual_Employee_Pay_ScheduleclickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Individual_Employee_Pay_Scheduleclick", "Click_Individual_Employee_Pay_Scheduleclick failed. Unable to locate object: " + Individual_Employee_Pay_ScheduleclickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Individual_Employee_Pay_Scheduleclick", "Click_Individual_Employee_Pay_Scheduleclick failed. Unable to locate object: " + Individual_Employee_Pay_ScheduleclickElem.toString());

			Assert.fail("Unable to locate object: " + Individual_Employee_Pay_ScheduleclickElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "ClickEmployeePaySchedule");	

		ExtentReportManager.passStep(m_Driver, "Click_Individual_Employee_Pay_Scheduleclick");

		TestModellerLogger.PassStep(m_Driver, "Click_Individual_Employee_Pay_Scheduleclick");
	}

     
	/**
 	 * Click Apprenticeship Levy
	 * @throws Exception 
     * @name Click Apprenticeship Levy
     */
	public void Click_Apprenticeship_Levy() throws Exception
	{
        
		WebElement elem = getWebElement(Apprenticeship_LevyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Apprenticeship_Levy", "Click_Apprenticeship_Levy failed. Unable to locate object: " + Apprenticeship_LevyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Apprenticeship_Levy", "Click_Apprenticeship_Levy failed. Unable to locate object: " + Apprenticeship_LevyElem.toString());

			Assert.fail("Unable to locate object: " + Apprenticeship_LevyElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "clickAppremticeship");

		ExtentReportManager.passStep(m_Driver, "Click_Apprenticeship_Levy");

		TestModellerLogger.PassStep(m_Driver, "Click_Apprenticeship_Levy");
	}

     
	/**
 	 * Click BACs Payment Upload File
	 * @throws Exception 
     * @name Click BACs Payment Upload File
     */
	public void Click_BACs_Payment_Upload_File() throws Exception
	{
        
		WebElement elem = getWebElement(BACs_Payment_Upload_FileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BACs_Payment_Upload_File", "Click_BACs_Payment_Upload_File failed. Unable to locate object: " + BACs_Payment_Upload_FileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BACs_Payment_Upload_File", "Click_BACs_Payment_Upload_File failed. Unable to locate object: " + BACs_Payment_Upload_FileElem.toString());

			Assert.fail("Unable to locate object: " + BACs_Payment_Upload_FileElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "ClickBACPayment");	

		ExtentReportManager.passStep(m_Driver, "Click_BACs_Payment_Upload_File");

		TestModellerLogger.PassStep(m_Driver, "Click_BACs_Payment_Upload_File");
	}

     
	/**
 	 * Click P11
	 * @throws Exception 
     * @name Click P11
     */
	public void Click_P11() throws Exception
	{
        
		WebElement elem = getWebElement(P11Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_P11", "Click_P11 failed. Unable to locate object: " + P11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_P11", "Click_P11 failed. Unable to locate object: " + P11Elem.toString());

			Assert.fail("Unable to locate object: " + P11Elem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "clickP11");

		ExtentReportManager.passStep(m_Driver, "Click_P11");

		TestModellerLogger.PassStep(m_Driver, "Click_P11");
	}

     
	/**
 	 * Click Payroll Reporting Period Summary
	 * @throws Exception 
     * @name Click Payroll Reporting Period Summary
     */
	public void Click_Payroll_Reporting_Period_Summary() throws Exception
	{
        
		WebElement elem = getWebElement(Payroll_Reporting_Period_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Reporting_Period_Summary", "Click_Payroll_Reporting_Period_Summary failed. Unable to locate object: " + Payroll_Reporting_Period_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Reporting_Period_Summary", "Click_Payroll_Reporting_Period_Summary failed. Unable to locate object: " + Payroll_Reporting_Period_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_Reporting_Period_SummaryElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "PayrollReportingPeriod");

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Reporting_Period_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Reporting_Period_Summary");
	}

     
	/**
 	 * Click Payroll Summary
	 * @throws Exception 
     * @name Click Payroll Summary
     */
	public void Click_Payroll_Summary() throws Exception
	{
        
		WebElement elem = getWebElement(Payroll_SummaryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll_Summary", "Click_Payroll_Summary failed. Unable to locate object: " + Payroll_SummaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll_Summary", "Click_Payroll_Summary failed. Unable to locate object: " + Payroll_SummaryElem.toString());

			Assert.fail("Unable to locate object: " + Payroll_SummaryElem.toString());
        }

		elem.click();
		TakeScreenshot.takeScreenshot(m_Driver, "PayrollSummry");

		ExtentReportManager.passStep(m_Driver, "Click_Payroll_Summary");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll_Summary");
	}
	
	

	
	/**
 	 * verifysubcontratorAmount
	 * @throws Exception 
     * @name Click Payroll Summary
     */
	public void verifysubcontratorAmount() throws Exception
	{
		int len=m_Driver.findElements(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[3]/table/tbody/tr/td[2]/div/div")).size();
		System.out.println("len="+len);
		
		for(int i=3;i<=len+2;i++)
		{
			if(i!=5)
			{
			String amount=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[4]/td[3]/table/tbody/tr["+i+"]/td[2]/div/div")).getText();
			System.out.println("amount="+amount);
			amount=amount.replaceAll("[�]", "");
			amount=amount.replaceAll("[,]", "");
			
			float changedamount=Float.parseFloat(amount);
			
			totalActualamount=totalActualamount+changedamount;
			}
			
		}
		
		System.out.println("Actual amoun="+totalActualamount);
		
		String amount2=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[6]/td[2]/table/tbody/tr[2]/td[2]/div/div")).getText();
		System.out.println("amount2"+amount2);
		amount2=amount2.replaceAll("[�]", "");
		amount2=amount2.replaceAll("[,]", "");
		
		float Expectedamount=Float.parseFloat(amount2);
		
		System.out.println("Expected Amount="+Expectedamount);
		
		assertEquals(totalActualamount, Expectedamount);
	}
	
	
}