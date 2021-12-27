package Company_Director_Tests;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/206acabd-0821-4d3a-8853-2c179d48b020
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1458, profileId = 101338)
public class T88TC6CDJoiningBeforeTxYr_DefaultProfile extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

	

    
    @Test  (groups= {"CDBeforeTxYrLow","CDBeforeTxYrLow - Default Profile"})
    @TestModellerPath(guid = "6154f8da-3ed2-4656-be58-d9e49ddd2601")
    public void GoToUrlAssertUrlClickgotoReportsClickclickP11ClickgetLELAmountClickgetPTAmountClickgetUELAmou() throws Exception
    {
    	
    	sTestCaseID="TC88";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
    	
      
    	
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

    volentry_Pension.gotoPayrollSetting _payslip = new volentry_Pension.gotoPayrollSetting(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    
    
    
    frequency.SearchEMPpage _EMPSearch = new frequency.SearchEMPpage(driver);
    
    TestModellerLogger.SetLastNodeGuid("7cb4ab9c-9920-4049-bbb2-cfffbbc1c65f");
    _EMPSearch.Click_clickEmployeeList();
    

    TestModellerLogger.SetLastNodeGuid("3fd95f28-2ee3-423e-bb39-696f925e309a");
    _EMPSearch.Select_selectEmployeeStatus(data[5]);
    
    
    _EMPSearch.Enter_SearchEmployeFirstName(data[6]);
    
   // driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ParentContent_cPHFilter_txtSearch' and @type='text']")).sendKeys(data[6]);

    TestModellerLogger.SetLastNodeGuid("ffc5a6e7-cc13-493e-86f2-6023149d1833");
    _EMPSearch.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("b69f3861-c4f1-4301-91c4-586a41760159");
    _EMPSearch.Click_clickonEmpName();
    
    
    
    Company_Director.getEMPJoiningDate _Empfrqchange = new Company_Director.getEMPJoiningDate(driver);
//    TestModellerLogger.SetLastNodeGuid("b5881c0d-a1ae-4bb8-975a-5a3a8b98b819");
//    _Empfrqchange.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("557b84c8-cbd7-4fe4-91a7-325695c18947");
//    _Empfrqchange.AssertUrl();
    

 
    

    TestModellerLogger.SetLastNodeGuid("cec2b39a-880b-4090-9dac-068b5c6a8a54");
    _Empfrqchange.Click_clickEditemployeedetails();
    

    TestModellerLogger.SetLastNodeGuid("cc5eb559-bd12-41be-9607-8b1d69d8dbb4");
    _Empfrqchange.Click_gotoMandatoryPayrollInformation();
    
   
    TestModellerLogger.SetLastNodeGuid("f2ba1cf7-8019-409e-8d55-d9615b60e8f9");
    _Empfrqchange.Click_clickPayDetails();
    

    TestModellerLogger.SetLastNodeGuid("ea3cf16d-46bf-48e2-99c6-c3151fb7cf46");
    _Empfrqchange.Enter_getAnnualSalary();
    
        
    	Company_Director.CDBeforeTxYrLow _CDBeforeTxYrLow = new Company_Director.CDBeforeTxYrLow(driver);
//    TestModellerLogger.SetLastNodeGuid("9a295bfe-a994-43be-8225-f0e1a144e225");
//    _CDBeforeTxYrLow.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("858d284f-1e2a-4293-9c55-212b2a405b87");
//    _CDBeforeTxYrLow.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ba56a51d-53f3-4eda-88c7-4db9ce3410e3");
    _CDBeforeTxYrLow.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("47cb4eac-a4e7-412c-b67a-352223c97f7b");
    _CDBeforeTxYrLow.Click_clickP11();
    
    
    
   
    

    TestModellerLogger.SetLastNodeGuid("06b60cd7-2a3e-458f-9beb-425d1b487433");
    _CDBeforeTxYrLow.Click_getLELAmount();
    

    TestModellerLogger.SetLastNodeGuid("3c886f70-44ed-4a78-a49c-5f9322d999c6");
    _CDBeforeTxYrLow.Click_getPTAmount();
    

    TestModellerLogger.SetLastNodeGuid("7cbddbc5-fece-443b-af54-2770fb17c460");
    _CDBeforeTxYrLow.Click_getUELAmount();
    
    
    TestModellerLogger.SetLastNodeGuid("7cbddbc5-fece-443b-af54-2770fb17c460");
    _CDBeforeTxYrLow.CalledAnnualSalary();
    
    
    

//    TestModellerLogger.SetLastNodeGuid("284ba20d-daea-4d15-a713-71b70abf0bc8");
//    _CDBeforeTxYrLow.Click_gotoFiling_Management();
//    
//
////    TestModellerLogger.SetLastNodeGuid("3a7f0cc1-77d8-4038-9946-acd84502d9f1");
////    _CDBeforeTxYrLow.Click_clickFPS();
//    
//    _CDBeforeTxYrLow.Enter_getXMLData();
//    
//    
//    _CDBeforeTxYrLow.checkXML();

    }

}
