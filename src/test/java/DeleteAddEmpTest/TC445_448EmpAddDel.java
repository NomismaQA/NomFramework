package DeleteAddEmpTest;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Blue;
import pages.verifyClosePayeErrorMessageOOPS;
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
public class TC445_448EmpAddDel extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    
    @Test  (priority = 1,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickcl() throws Exception
    {
    	
    	
    	sTestCaseID="TC445";
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
	
	
	DeleteAddEmpPage.Add_Delete_Employee _Add_Delete_Employee = new DeleteAddEmpPage.Add_Delete_Employee(driver);
	
	TestModellerLogger.SetLastNodeGuid("9dfbe92c-eb24-47f9-b8b4-b761bf3a24ad");
    _Add_Delete_Employee.Click__New_Employee_();
    

    TestModellerLogger.SetLastNodeGuid("eca607be-67c2-40b7-aecf-5b6a8dcf4ebd");
    _Add_Delete_Employee.Click_Personal_Details();
    

    TestModellerLogger.SetLastNodeGuid("caf2c3f9-ae18-4dd0-a88a-e4a39377e79c");
    _Add_Delete_Employee.Enter_EnterFirstName(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("8ba29342-03c3-4f0d-a40a-7eda8917d388");
    _Add_Delete_Employee.Enter_EnterLastName(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("9bd8968b-2e34-4575-8891-b0ec7ca2a6e5");
    _Add_Delete_Employee.Select_Gender(data[7]);
    

    TestModellerLogger.SetLastNodeGuid("4aacd0cb-7ff5-4944-86ca-873a4fa0d5cf");
    _Add_Delete_Employee.Enter_EnterDOB(data[8]);
    

    TestModellerLogger.SetLastNodeGuid("80073638-eb5e-4bef-af4d-97faa137c6f8");
    _Add_Delete_Employee.Enter_Address1(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("11d94da7-49db-4ea6-b38b-09ab87671c08");
    _Add_Delete_Employee.Enter_EnterAddress2(data[10]);
    

    TestModellerLogger.SetLastNodeGuid("38cbf407-5307-4f5f-9350-c6cf81a543eb");
    _Add_Delete_Employee.Select_DropDownCountry(data[11]);
    

    TestModellerLogger.SetLastNodeGuid("ac2fba41-dd22-49e9-9855-c11544ca5ff3");
    _Add_Delete_Employee.Enter_Country(data[9]);
    

    TestModellerLogger.SetLastNodeGuid("6517cc9f-20b5-4e16-a068-583f9c397f75");
    _Add_Delete_Employee.Click_Mandatory_Payroll_Information();
    

    TestModellerLogger.SetLastNodeGuid("d08b0522-899a-4ecc-b208-dae733e6e4bd");
    _Add_Delete_Employee.Enter_EnterJoiningDate(data[12]);
    

    TestModellerLogger.SetLastNodeGuid("2fec68fa-bc70-4399-a319-4d766cd92f55");
    _Add_Delete_Employee.Select_PayrollFrequencyCode(data[13]);
    

    TestModellerLogger.SetLastNodeGuid("eadd6aca-15b3-4ad4-9f51-46a9e5a91282");
    _Add_Delete_Employee.Enter_EnterTaxCode(data[14]);
    

    TestModellerLogger.SetLastNodeGuid("44131a31-359f-456e-a413-1e866b8bc3cc");
    _Add_Delete_Employee.Click_Pay_Details();
    

    TestModellerLogger.SetLastNodeGuid("9daefca3-bfbf-47a9-87f1-15d7fe7e5049");
    _Add_Delete_Employee.Enter_EnterBasicSalary(data[15]);
    

    TestModellerLogger.SetLastNodeGuid("e973c4e9-b157-42f0-b867-0f451b5cac28");
    _Add_Delete_Employee.Click_Save();
	

    }
    
 
    
    
    @Test  (priority = 2,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickc4() throws Exception
    {
    	
    	
    	sTestCaseID="TC446";
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
	
	
	 PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);
	    
	    TestModellerLogger.SetLastNodeGuid("5b352d43-6f19-4f73-b2ec-bc79577eb857");
	    _PayrollDoUndo.Click_RunPayroll1();
	    

	    TestModellerLogger.SetLastNodeGuid("21c1b047-4521-4814-a8ef-f2520560bfa3");
	    _PayrollDoUndo.Click_RunPayroll2();
	    
	    
	    DeleteAddEmpPage.Add_Delete_Employee _Add_Delete_Employee = new DeleteAddEmpPage.Add_Delete_Employee(driver);
	    
	    TestModellerLogger.SetLastNodeGuid("72946bbb-b682-4582-a9d1-eb01ef0d27df");
	    _Add_Delete_Employee.Click_clickThreeDot();
	    
	    TestModellerLogger.SetLastNodeGuid("72946bbb-b682-4582-a9d1-eb01ef0d27df");
	    _Add_Delete_Employee.searchDeleteOption();
    
//    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
//    _PayrollDoUndo.Click_Undo_Last_Payroll_();
        
//    	PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);


    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
    _PayrollDoUndo.Click_Undo_Last_Payroll_();
 
    }
    
    
    @Test  (priority = 3,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickc3() throws Exception
    {
    	
    	
    	sTestCaseID="TC447";
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
	
	
	PayrollDashboardUI.PayrollDoUndo _PayrollDoUndo = new PayrollDashboardUI.PayrollDoUndo(driver);
    
    TestModellerLogger.SetLastNodeGuid("5b352d43-6f19-4f73-b2ec-bc79577eb857");
    _PayrollDoUndo.Click_RunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("21c1b047-4521-4814-a8ef-f2520560bfa3");
    _PayrollDoUndo.Click_RunPayroll2();
	
	
	DeleteAddEmpPage.Add_Delete_Employee _Add_Delete_Employee = new DeleteAddEmpPage.Add_Delete_Employee(driver);
    
    TestModellerLogger.SetLastNodeGuid("72946bbb-b682-4582-a9d1-eb01ef0d27df");
    _Add_Delete_Employee.Click_clickThreeDot();
	
    TestModellerLogger.SetLastNodeGuid("72946bbb-b682-4582-a9d1-eb01ef0d27df");
    _Add_Delete_Employee.TakeScShot();
    
    TestModellerLogger.SetLastNodeGuid("25154369-7bfc-4262-9657-22be161ad383");
    _PayrollDoUndo.Click_Undo_Last_Payroll_();


    }
    
    
    @Test  (priority = 4,enabled=true, groups= {"PayrollDoUndo","PayrollDoUndo - Default Profile"})
    @TestModellerPath(guid = "4c879fcd-32af-4e65-94f5-cf2cb4df97a1")
    public void GoToUrlAssertUrlClickRunPayroll1ClickRunPayroll2ClickgetSuccessMsgClickUndoLastPayrollClickc2() throws Exception
    {
    	
    	
    	sTestCaseID="TC448";
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
 
//_1747page.Agentpage ag=new _1747page.Agentpage(driver);
// 
// ag.Enter_ctl00cPHFiltertxtAgentName(data[3]);
// ag.Click_Search();
// ag.Click__Demo_();
// 

pages.agentpage _agentpage = new pages.agentpage(driver);
// TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
// _agentpage.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
// _agentpage.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
 _agentpage.Enter_SearchAgentName(data[3]);
 

 TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
 _agentpage.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
 _agentpage.Click_ClickAgent();
 

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
// TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
// _OpenClient.GoToUrl();
// 
//
// TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
// _OpenClient.AssertUrl();
 

 TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
 _OpenClient.Click_ClientsClick();
 

 TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
 _OpenClient.Enter_EnterClientName(data[4]);
 

 TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
 _OpenClient.Click_ClickSearch();
 

 TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
 _OpenClient.Click_ClickClient();
 
 
 	verifyClosePayeErrorMessageOOPS _verifyClosePayeErrorMessageOOPS = new verifyClosePayeErrorMessageOOPS(driver);
 	
 	
 	TestModellerLogger.SetLastNodeGuid("9943263e-4101-41b1-b065-ee4d78e4cc38");
	_verifyClosePayeErrorMessageOOPS.Click_ClickPayroll();
    
	
	DeleteAddEmpPage.Add_Delete_Employee _Add_Delete_Employee = new DeleteAddEmpPage.Add_Delete_Employee(driver);
	
	TestModellerLogger.SetLastNodeGuid("72946bbb-b682-4582-a9d1-eb01ef0d27df");
    _Add_Delete_Employee.Click_clickThreeDot();
    

    TestModellerLogger.SetLastNodeGuid("f075bef4-30d7-473b-a6c2-3a87e978016f");
    _Add_Delete_Employee.Click_chooseDelete();
    
    TestModellerLogger.SetLastNodeGuid("f075bef4-30d7-473b-a6c2-3a87e978016f");
    _Add_Delete_Employee.ClickDelete();
    
    }

}
