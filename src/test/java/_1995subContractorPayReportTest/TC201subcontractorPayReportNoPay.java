package _1995subContractorPayReportTest;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Blue;
import pages.frequency.runpayrollpage1;
import pages.frequency.weeklyFrequency;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/61094e72-17a3-4f97-8e81-923bd7e8148c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1353, profileId = 101220)
public class TC201subcontractorPayReportNoPay extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (groups= {"subScriptPayFrequency","subScriptPayFrequency - Default Profile"})
    @TestModellerPath(guid = "05667963-18ac-43c9-9286-f1838557c35a")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
    	
    	sTestCaseID="TC201";
        Sheet="Sheet3";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
        
        pages.loginpage4 _loginpage = new pages.loginpage4(driver);
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
    
    
    
	_1399subContr.CISContrctorSearch _CISContrctorSearch = new _1399subContr.CISContrctorSearch(driver);
//		TestModellerLogger.SetLastNodeGuid("3e3bf5fe-6c31-48f8-86d7-19fa3fc63234");
//		_CISContrctorSearch.GoToUrl();
//
//
//		TestModellerLogger.SetLastNodeGuid("2da2f92a-b5eb-4fc7-9844-f31e173db2be");
//		_CISContrctorSearch.AssertUrl();


		TestModellerLogger.SetLastNodeGuid("ebdefc4d-ae35-40b5-96f9-386aff9dd658");
		_CISContrctorSearch.Click_clickCIS();


		TestModellerLogger.SetLastNodeGuid("85b6fb06-eabe-42c6-9786-713b81636869");
		_CISContrctorSearch.Click_clickContractorList();


		TestModellerLogger.SetLastNodeGuid("3a82676f-048d-4d69-bf1b-6fbe160ea282");
		_CISContrctorSearch.Enter_EnterContractorName(data[4]);


		TestModellerLogger.SetLastNodeGuid("e4b3696d-5ae4-44e5-8eff-65b04c075a46");
		_CISContrctorSearch.Click_SearchContractorname();


		TestModellerLogger.SetLastNodeGuid("ae741c88-e2dd-4be9-a495-95bd77fbc081");
		_CISContrctorSearch.Click_Clickoncontractor();
    
		
    	_1995subContractorPayreport._1995subcontractorPayReport __1995subcontractorPayReport = new _1995subContractorPayreport._1995subcontractorPayReport(driver);
//    TestModellerLogger.SetLastNodeGuid("bbd9f4a3-2f69-4fb4-a369-d256fbfa547b");
//    __1995subcontractorPayReport.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("12320bfb-0954-4523-9eff-b4f8265cc6c6");
//    __1995subcontractorPayReport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5bc72705-6b1c-43c2-801b-ec51d9356242");
    __1995subcontractorPayReport.Click_gotoCISReports();
    

    TestModellerLogger.SetLastNodeGuid("0f1921f1-746c-45d5-873b-9ba96dc1208b");
    __1995subcontractorPayReport.Click_clickAll_Subcontractors_Pay_Totals();
    

    TestModellerLogger.SetLastNodeGuid("bb239a24-5acf-48be-aa1e-7d6e35787d57");
    __1995subcontractorPayReport.Select_selectPeriod(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("9df89dcd-bd87-4b65-bc56-8969f5efe6f5");
    __1995subcontractorPayReport.Click_getsubContractorList();
    

    TestModellerLogger.SetLastNodeGuid("32d52cc1-9b88-4429-8200-8260a10fea09");
    __1995subcontractorPayReport.Click_gotoCISReports();
    

    TestModellerLogger.SetLastNodeGuid("5b44f846-d5cb-48d3-b3e6-232b71d6a830");
    __1995subcontractorPayReport.Click_clickCIS300_Monthly_Return_Report();
    

    TestModellerLogger.SetLastNodeGuid("23d1a961-2afd-4024-a56c-67019fb1ef22");
    __1995subcontractorPayReport.Select_selectPeriod(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("6b567461-fb33-4200-9b93-1dc1bd01b591");
    __1995subcontractorPayReport.Click_clickSearch();
    

    TestModellerLogger.SetLastNodeGuid("0e123805-66d6-4ce7-87ed-4b2177eeb81d");
    __1995subcontractorPayReport.Click_mtchsubContractor();		



    
    }

}
