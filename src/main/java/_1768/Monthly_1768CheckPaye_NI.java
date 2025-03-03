package _1768;

import pages.BasePage;
import pages1.PaymentManagementForQtrPaye;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/06435bf3-980f-4e06-b0c4-04efe555932a
@TestModellerModule(guid = "06435bf3-980f-4e06-b0c4-04efe555932a")
public class Monthly_1768CheckPaye_NI extends BasePage
{
	
	int i;
	int size;
	int j=4;
	double PAYE_NIValue=0;
	static double prevTax=0.0;
	static double prevBalowed=0.0;
	double TaxAmount=0;
	double EmployeeNIAmount=0;
	double EmployerNIAmount=0;
	double TotalAmount=0;
	double BalanceOwedAmount=0;
	double NIC_Emp_Allowancevalue=0;
	double SMP_SPP_Recoveryvalue=0;
	double SMP_SPP_Compensationvalue=0;
	double SMP_SSP_Funding_Recvalue=0;
	static double totalNIC_Emp_Allowancevalue=0;
	double totalTaxCompensation=0;
	double totalTaxtoHMRC=0;
//	static String[] calledOverpayment =new String[12];
	double HMRC_Over_Paymentvalue=0;
	double Totalamount=0;
	
	double BalancecarryAmount=0;
	
	
	
	public Monthly_1768CheckPaye_NI (WebDriver driver)
	{
		super(driver);
	}


	
	
	private By clickSummaryAttachmentElem = By.xpath("//label[normalize-space()= 'Payroll Summary']/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12571");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12571");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12571");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12571";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/ReportPayrollSummary.aspx?PayrollCompanyCode=12571")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
   /*check checkbalanceOwed Monthly
    * 
    * 	
    */
        	    	
        public void checkPAYE_NI() throws InterruptedException
        	    	{
        	    		
        	    		try {
        	    		List<WebElement> data1=m_Driver.findElements(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']/option"));
        	    	//	System.out.println(data1.get(i).getText());

        	    		
        	    		
        	    		size=data1.size();
        	    		
        	    		String[] a=new String [size];
        	    		
        	    		for(i=0;i<size;i++)
        	    		{
        	    		//	System.out.println("i=="+i);
        	    		a[i]=data1.get(i).getText();
        	    	//	System.out.println("date is="+a[i]);
        	    		}
        	    		

        	    				        for(i=size;i>=1;i--)
        	    				        {
        	    				     //   	System.out.println("value of i="+i);
        	    				        

        	    				            WebElement PeriodEnd=m_Driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_ddlPayrollDate']")); 
        	    				  	
        	    				  		 Select date=new Select(PeriodEnd); 
        	    				  		 Thread.sleep(1000);
        	    				  
        	    				  		  date.selectByVisibleText(a[i-1]);
        	    				  		 Thread.sleep(1000);
        	    				  		 
    //Tax Finding
        	    	        		      	
        	    	        		      	String Tax=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Employer NI')]//following::td[3]/div/div")).getText();
        	    	        		      	//System.out.println(Tax);
        	    	        		      	String str=Tax.replaceAll("[�]", "");
        	    	        		      	str=str.replaceAll("[,]", "");
        	    	        		      	
        	    	        		      	TaxAmount = Double.parseDouble(str);
        	    	        		  		System.out.println("This is Tax amount="+TaxAmount);
        	    	        		      	
        	    				  		 
        	    				  		 

    //Employee NI Finding
        	    	        		  		
        	    	        		  		String EmployeeNI=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Employer NI')]//following::td[6]/div/div")).getText();
        	    	        		      	//System.out.println(EmployeeNI);
        	    	        		  		String EmployeeNIstr=EmployeeNI.replaceAll("[�]", "");
        	    	        		  		EmployeeNIstr=EmployeeNIstr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 EmployeeNIAmount = Double.parseDouble(EmployeeNIstr);    	        		  		
        	    	        		  		System.out.println("This is EmployeeNI amount="+EmployeeNIAmount);
        	    	        		  		
        	    	        		  		
        	    	        		  		
        	    	        		  		
        	//Employer NI Finding
        	    	        		      	
        	    	        		      	String EmployerNI=m_Driver.findElement(By.xpath("//*[starts-with(text(), 'Employer NI')]//following::td[8]/div/div")).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		      	String EmployerNIstr=EmployerNI.replaceAll("[�]", "");
        	    	        		      	EmployerNIstr=EmployerNIstr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 EmployerNIAmount = Double.parseDouble(EmployerNIstr);    	        		  	
        	    	        		  		System.out.println("This is EmployerNI amount="+EmployerNIAmount);
        	    	        		      	
        	
     //NIC Emp Allowance
        	    	        		  		String NIC_Emp_Allowance=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'NIC Emp Allowance')]//following::td/div/div")).get(0).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		  		NIC_Emp_Allowance=NIC_Emp_Allowance.replaceAll("[�]", "");
        	    	        		  		NIC_Emp_Allowance=NIC_Emp_Allowance.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		NIC_Emp_Allowancevalue = Double.parseDouble(NIC_Emp_Allowance);    	        		  	
        	    	        		  		System.out.println("This is NIC_Emp_Allowancevalue amount="+NIC_Emp_Allowancevalue);
        	    	        		  		
        	    	        		  		
        	    	        		  		totalNIC_Emp_Allowancevalue=totalNIC_Emp_Allowancevalue+NIC_Emp_Allowancevalue;
        	    	        		  		Assert.assertTrue(totalNIC_Emp_Allowancevalue<=4000);
        	    	        		  		
        	    	        		  		if(NIC_Emp_Allowancevalue!=0)
        	    	        		  		{
        	    	        		  			if(NIC_Emp_Allowancevalue>=EmployerNIAmount)
        	    	        		  			{
        	    	        		  			NIC_Emp_Allowancevalue=NIC_Emp_Allowancevalue-EmployerNIAmount;
        	    	        		  			EmployerNIAmount=0;
        	    	        		  			}
        	    	        		  			else
        	    	        		  			{
        	    	        		  				NIC_Emp_Allowancevalue=EmployerNIAmount-NIC_Emp_Allowancevalue;
            	    	        		  			EmployerNIAmount=0;
        	    	        		  			}
        	    	        		  		}
        	    	        		  		
        	    	        		  		
        	    	        		  		
        	 
        	    	        		  		
        	//SMP/SPP Recovery
        	    	        		  		String SMP_SPP_Recovery=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SPP Recovery')]//following::td/div/div")).get(0).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[�]", "");
        	    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[,]", "");
        	    	        		  		SMP_SPP_Recovery=SMP_SPP_Recovery.replaceAll("[-]", "");
        	    	        		      	
        	    	        		  		SMP_SPP_Recoveryvalue = Double.parseDouble(SMP_SPP_Recovery);    	        		  	
        	    	        		  		System.out.println("This is SMP_SPP_Recoveryvalue amount="+SMP_SPP_Recoveryvalue);
        	    	        		  		
        	    	        		  		
        	    	        		  		
        	//SMP/SPP Compensation
        	    	        		  		String SMP_SPP_Compensation=m_Driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[10]/td[3]/table/tbody/tr/td/table/tbody/tr[19]/td[3]/div/div")).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[�]", "");
        	    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[,]", "");
        	    	        		  		SMP_SPP_Compensation=SMP_SPP_Compensation.replaceAll("[-]", "");
        	    	        		      	
        	    	        		  		SMP_SPP_Compensationvalue = Double.parseDouble(SMP_SPP_Compensation);    	        		  	
        	    	        		  		System.out.println("This is SMP_SPP_Compensationvalue amount="+SMP_SPP_Compensationvalue);
        	    	        		  		
        	    	        		  		
        	    	        		  		
        	 //SMP/SSP Funding Rec.
        	    	        		  		String SMP_SSP_Funding_Rec=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'SMP/SSP Funding Rec.')]//following::td/div/div")).get(0).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[�]", "");
        	    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[,]", "");
        	    	        		  		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[-]", "");
        	    	        		  		
        	    	        		  		SMP_SSP_Funding_Recvalue = Double.parseDouble(SMP_SSP_Funding_Rec);    	        		  	
        	    	        		  		System.out.println("This is SMP_SSP_Funding_Recvalue amount="+SMP_SSP_Funding_Recvalue);
        	    	        		  		
        	    	        
        	  //get HMRC Over Payment   	        		  		
        	
        	    	        		  		String HMRC_Over_Payment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'HMRC Over Payment')]//following::td/div/div")).get(0).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		  		HMRC_Over_Payment=HMRC_Over_Payment.replaceAll("[�]", "");
        	    	        		  		HMRC_Over_Payment=HMRC_Over_Payment.replaceAll("[,]", "");
        	    	        		  //		SMP_SSP_Funding_Rec=SMP_SSP_Funding_Rec.replaceAll("[-]", "");
        	    	        		  		
        	    	        		  		HMRC_Over_Paymentvalue = Double.parseDouble(HMRC_Over_Payment);    	        		  	
        	    	        		  		System.out.println("This is HMRC_Over_Paymentvalue amount="+HMRC_Over_Paymentvalue);
        	    	        		  		
        	    	        		  		

        	    	        		  		
        	//Total Compensation calculation
        	    	        		  		
        	    	        		  		totalTaxCompensation=NIC_Emp_Allowancevalue+SMP_SPP_Recoveryvalue+SMP_SPP_Compensationvalue+SMP_SSP_Funding_Recvalue+HMRC_Over_Paymentvalue;
        	    	        		  		totalTaxCompensation=(double) (Math.round(totalTaxCompensation*100)/100.0);  
        	    	        		  		System.out.println("totalTaxCompensation="+totalTaxCompensation);
        	
        	//Total Tax calculation to be paid to HMRC
        	    	        		  		
        	    	        		  		totalTaxtoHMRC=TaxAmount+EmployeeNIAmount+EmployerNIAmount;
        	    	        		  		totalTaxtoHMRC=(double) (Math.round(totalTaxtoHMRC *100)/100.0);
        	    	        		  		System.out.println("totalTaxtoHMRC="+totalTaxtoHMRC);
        	    	        		  		
        	    	        		  		
        	//Balance owed (b/f)
        	    	        		  		
        	    	        		  		String BalanceOwed=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(0).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		      	String BalanceOwedstr=BalanceOwed.replaceAll("[�]", "");
        	    	        		      	BalanceOwedstr=BalanceOwedstr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 BalanceOwedAmount = Double.parseDouble(BalanceOwedstr);   	        		  	
        	    	        		  		System.out.println("This is Balance owed="+BalanceOwedAmount);
        	    	        		  		
        	    	        		  		
        	//Balance c/f 
        	    	        		  		
        	    	        		  		String Balancecarry=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'Balance')]//following::td/div/div[@style='width:35.83mm;min-width: 35.83mm;']")).get(1).getText();
        	    	        		      	//System.out.println(EmployerNI);
        	    	        		      	String Balancecarrystr=Balancecarry.replaceAll("[�]", "");
        	    	        		      	Balancecarrystr=Balancecarrystr.replaceAll("[,]", "");
        	    	        		      	
        	    	        		  		 BalancecarryAmount = Double.parseDouble(Balancecarrystr);    	        		  	
        	    	        		  		System.out.println("This is Balance c/f="+BalancecarryAmount);
        	    	        		  		
        	    	        		  		
        	    	        		  		
        	//Payment DUE to HMRC				  		 
        	        				  		String PAYE_NI=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:32.65mm;min-width: 32.65mm;']")).get(0).getText();
        	        			      	
        	        			      	String PAYE_NIstr=PAYE_NI.replaceAll("[�]", "");
        	        			      			PAYE_NIstr=PAYE_NIstr.replaceAll("[,]", "");
        	        			      	
        	        			  		 PAYE_NIValue = Double.parseDouble(PAYE_NIstr);
        	        			  		 System.out.println("PAYE_NIValue="+PAYE_NIValue);
        	        			  		 
        	        			  		 
        	        			  		 
        	//Getting payment done in month
        	        			  		 
        	         			  		String TotalPayment=m_Driver.findElements(By.xpath("//*[starts-with(text(), 'PAYE & NI')]//following::td/div/div[@style='width:32.65mm;min-width: 32.65mm;']")).get(0).getText();
        	         		      	
        	         		      	String TotalPaymentstr=TotalPayment.replaceAll("[�]", "");
        	         		      			TotalPaymentstr=TotalPaymentstr.replaceAll("[,]", "");
        	         		      	
        	         		  		 Totalamount = Double.parseDouble(TotalPaymentstr);
        	         		  		System.out.println("TotalAmount="+Totalamount);
        	         		  		
        	         		  		
        	         		  		
 
        	    		 }
        	    		
        	    		}
     
        	    		catch (Exception e) 
        		  		{
    						System.out.println(e);
    						e.printStackTrace();
    					} 			        
        	    				        
      
        	    		
     
        	    	}

}