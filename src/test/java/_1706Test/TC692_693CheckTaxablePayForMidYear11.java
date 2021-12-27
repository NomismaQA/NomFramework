package _1706Test;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.verifyClosePayeErrorMessageOOPS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3e091eeb-65e5-4077-81b6-7752729c278c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1411, profileId = 101275)
public class TC692_693CheckTaxablePayForMidYear11 extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs() throws Exception
    {
        
    	sTestCaseID="TC692";
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
    
    
//   	_1939_page.AgentsSetting _AgentsSetting = new _1939_page.AgentsSetting(driver);
////    TestModellerLogger.SetLastNodeGuid("9c12e65b-7db5-4604-aadb-4fb04da5d1c9");
////    _AgentsSetting.GoToUrl();
////    
////
////    TestModellerLogger.SetLastNodeGuid("eaaefc30-621f-4537-b288-c0044655cb08");
////    _AgentsSetting.AssertUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("40d94aae-f05e-4f6d-a49a-cbc68c7aa060");
//    _AgentsSetting.Click_ClickAgentSettings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4584b632-51f1-42d2-b657-d4c77d169454");
//    _AgentsSetting.Click_clickPayroll();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c5c76273-6d5a-4c5a-90e6-5999ba109e09");
//    _AgentsSetting.Click_ClicktoAddDate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
//    _AgentsSetting.Enter_EnterAutoRunDate(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("6eacfabc-a22b-4a08-b808-3eedbcae0ddd");
//    _AgentsSetting.Click_ClickSave();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    
    
    verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
//  TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
//  _verifyClosePayeErrorMessage.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
//  _verifyClosePayeErrorMessage.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
  _verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
  
  
  VerifyEmailsData.PayrollDsbEmailBody _PayrollDsbEmailBody = new VerifyEmailsData.PayrollDsbEmailBody(driver);
  
	TestModellerLogger.SetLastNodeGuid("76227d22-84e4-4fc9-9614-7542782d7a70");
  _PayrollDsbEmailBody.Click_clickRunPayroll1();
  

  TestModellerLogger.SetLastNodeGuid("1a18737c-e1ab-42ed-920e-0a4c22ddc751");
  _PayrollDsbEmailBody.Click_RunPayroll2();
  
  

  Company_Director.TC7_CD_Alt_JoiningBetweenTxYr _CDBeforeTxYrLow = new Company_Director.TC7_CD_Alt_JoiningBetweenTxYr(driver);
  
  TestModellerLogger.SetLastNodeGuid("284ba20d-daea-4d15-a713-71b70abf0bc8");
  _CDBeforeTxYrLow.Click_gotoFiling_Management();
  
  _CDBeforeTxYrLow.Enter_getXMLData1();
  
  _CDBeforeTxYrLow.verifyTaxablegross();
  
  
//  TestModellerLogger.SetLastNodeGuid("284ba20d-daea-4d15-a713-71b70abf0bc8");
//  _CDBeforeTxYrLow.Click_gotoFiling_Management();
//  
//  PayrollDashboardUI.PayrollDashboardCheck _PayrollDashboardCheck = new PayrollDashboardUI.PayrollDashboardCheck(driver);
//	
//	TestModellerLogger.SetLastNodeGuid("ba20616f-2ad5-40d5-9166-657bb6b0822f");
//_PayrollDashboardCheck.Click_gotoPayrollDashboardBtn();


    }
    
    
    @Test  (priority=2,enabled=true, groups= {"subscriptAllowenceScheme","subscriptAllowenceScheme - Default Profile"})
    @TestModellerPath(guid = "31d2a370-1db7-493d-a71f-dd8a5031b654")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
        
    	sTestCaseID="TC693";
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
    
    
   	_1939_page.AgentsSetting _AgentsSetting = new _1939_page.AgentsSetting(driver);
//    TestModellerLogger.SetLastNodeGuid("9c12e65b-7db5-4604-aadb-4fb04da5d1c9");
//    _AgentsSetting.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eaaefc30-621f-4537-b288-c0044655cb08");
//    _AgentsSetting.AssertUrl();
    

//    TestModellerLogger.SetLastNodeGuid("40d94aae-f05e-4f6d-a49a-cbc68c7aa060");
//    _AgentsSetting.Click_ClickAgentSettings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("4584b632-51f1-42d2-b657-d4c77d169454");
//    _AgentsSetting.Click_clickPayroll();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c5c76273-6d5a-4c5a-90e6-5999ba109e09");
//    _AgentsSetting.Click_ClicktoAddDate();
//    
//
//    TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
//    _AgentsSetting.Enter_EnterAutoRunDate(data[4]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("6eacfabc-a22b-4a08-b808-3eedbcae0ddd");
//    _AgentsSetting.Click_ClickSave();
//    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
//    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
//    _OpenClient.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
//    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName(data[4]);
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    
    
    verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
//  TestModellerLogger.SetLastNodeGuid("78bf52da-502f-4503-bb97-b41051eba82c");
//  _verifyClosePayeErrorMessage.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("c9b025ad-2025-4174-9800-7912c22ab683");
//  _verifyClosePayeErrorMessage.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
  _verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
  
  
  PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


  TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
  _PayrollDoUndo.Click_Undo_Last_Payroll_();
  
    }
  

/*  TestModellerLogger.SetLastNodeGuid("aa04cc2d-3731-4ff6-b43d-958eb4e9fe45");
  _verifyClosePayeErrorMessageOOPS.Click_gotoEditCompany();
  

  TestModellerLogger.SetLastNodeGuid("0bf3be1b-b00c-4d1e-a715-8a4e4ab4fdc8");
  _verifyClosePayeErrorMessageOOPS.Click_gotoPayrollDetails();
  
  
  _1939_page.TC02_AutoPayrollDate _PaymentMmgt = new _1939_page.TC02_AutoPayrollDate(driver);
//  TestModellerLogger.SetLastNodeGuid("ef7cf453-0267-47db-8388-a31200eaa772");
//  _PaymentMmgt.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("19e695c6-8a6b-4c2e-b79d-8449a407f239");
//  _PaymentMmgt.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("7e5cbc6f-c4b2-470c-b459-816f3042236e");
  _PaymentMmgt.Click_clickPayrollSettings();
  
  
  
//  	TestModellerLogger.SetLastNodeGuid("849e834c-99a0-4b65-84af-eed39ae07fac");
//  	_PaymentMmgt.Enter_AutoRunDate(data[6]);
  
  
	_1939_page.Enable_Automatic_Payroll _Enable_Automatic_Payroll = new _1939_page.Enable_Automatic_Payroll(driver);
	
    TestModellerLogger.SetLastNodeGuid("87e761a2-e708-41be-9ac7-300af5e89105");
    _Enable_Automatic_Payroll.Click_ClickEnableAutorun();
    

    TestModellerLogger.SetLastNodeGuid("9dd05302-4394-46c5-b3e5-7db65c3593cd");
    _Enable_Automatic_Payroll.Click_ClickContinue();
    

    TestModellerLogger.SetLastNodeGuid("b0709c62-6d43-411b-afb5-8444d1c06800");
    _Enable_Automatic_Payroll.Select_SelectEmailMode(data[6]);
    
    
    
    TestModellerLogger.SetLastNodeGuid("b0709c62-6d43-411b-afb5-8444d1c06800");
    _Enable_Automatic_Payroll.Click_SelectYes();
    

    TestModellerLogger.SetLastNodeGuid("98493ed0-a6be-479e-8013-48656b5a7faa");
    _Enable_Automatic_Payroll.Click_Continue2();
    

    TestModellerLogger.SetLastNodeGuid("a7a1a484-f86e-436c-93b4-06be15d9cd29");
    _Enable_Automatic_Payroll.Click_Enable2();
  

//  TestModellerLogger.SetLastNodeGuid("2f5590f7-e106-4057-8440-b5c6996e6e06");
//  _PaymentMmgt.Click_clickCompanyDetails();
//  

//  TestModellerLogger.SetLastNodeGuid("32dc191c-633b-4a08-ad95-6ec15efe8800");
//  _PaymentMmgt.Click_MarkYestoPaymentMmgt();
//  
//
  TestModellerLogger.SetLastNodeGuid("80af7c8d-d174-4330-ae3d-d09047f3fdc2");
  _PaymentMmgt.Click_clickSave();
  

  TestModellerLogger.SetLastNodeGuid("fb1cd1d6-71fb-45a6-91fb-8aec8d6c71de");
  _PaymentMmgt.Click_getmsg();
  
  
  


    }
*/
}
