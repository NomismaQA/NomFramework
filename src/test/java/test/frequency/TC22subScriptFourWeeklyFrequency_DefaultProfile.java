package test.frequency;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import pages.payslip_Green;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/88fffc54-d989-455f-b905-9d8ff7a1e266
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1358, profileId = 101226)
public class TC22subScriptFourWeeklyFrequency_DefaultProfile extends TestBase
{
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;


    
    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "47059d2c-e4d1-4bd9-b07b-44f49df9173f")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs1() throws Exception
    {
       
    	sTestCaseID="TC22";
        Sheet="Sheet1";
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
    

payslip_Green _payslip = new payslip_Green(driver);
//    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
//    _payslip.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
//    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    
    
    pages.frequency.FourWeekly _FourWeekly = new pages.frequency.FourWeekly(driver);
//    TestModellerLogger.SetLastNodeGuid("03f2e0aa-083a-4d15-b394-3fa24cc7575e");
//    _FourWeekly.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("7b131195-ce19-4087-8bbf-48a8a2699bdb");
//    _FourWeekly.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0880b77d-b0ce-4a20-8ebe-396cbf90d16b");
    _FourWeekly.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("0e019eb1-1739-4316-9fad-7e6e95706049");
    _FourWeekly.Select_SelectpayMode(data[5]);
    

    TestModellerLogger.SetLastNodeGuid("2ef5d6f4-4598-4559-a526-064eb052df3c");
    _FourWeekly.Enter_FourWeeklyPayrollEndDate(data[6]);
    

    TestModellerLogger.SetLastNodeGuid("21e7fc1e-2454-4449-aae2-53ad4888ef82");
    _FourWeekly.Click_ClickSave();
    


pages.frequency.runpayrollpagefourweekly _runpayrollpage = new pages.frequency.runpayrollpagefourweekly(driver);
//    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
//    _runpayrollpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
//    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    



    }
/*
    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "5a6a0417-206a-43d3-85d8-2b8bdce7c7b6")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs2()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Arturo98");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("uLVE7LwO26");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("veritatis");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("nihil");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.weeklyFrequency _weeklyFrequency = new pages.weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287.42304829861");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "deae19fe-bbf2-43bb-9eb4-9c3c4d598dc8")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs3()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Garett_Herman");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("f3RQGFjvNe");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("similique");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("excepturi");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.weeklyFrequency _weeklyFrequency = new pages.weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287.42304829861");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "5a5cb8b2-1831-4c37-ba1a-d3931610eace")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs4()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Tressa93");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("VZ7auKWDSy");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("quaerat");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("optio");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Monthly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.weeklyFrequency _weeklyFrequency = new pages.weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "ae5bf182-5c08-4b71-848b-76d784026aa4")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs5()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Rasheed.Thiel79");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("URcJtouqcW");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("placeat");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("fugit");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Fortnightly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.weeklyFrequency _weeklyFrequency = new pages.weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "427737de-f6f0-4741-a975-c7bd40e3ae57")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs6()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Horacio.OKon43");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("5fb9lVOmym");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("tempore");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("nisi");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("FourWeekly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.weeklyFrequency _weeklyFrequency = new pages.weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "784df9dd-d848-4909-bd30-69afdbbba8fa")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs7()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Xzavier_Abbott");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("Rx81lS241A");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("repellendus");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("qui");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Green");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.weeklyFrequency _weeklyFrequency = new pages.weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }

    @Test  (groups= {"subScriptWeeklyFrequency","subScriptWeeklyFrequency - Default Profile"})
    @TestModellerPath(guid = "6e3e4122-e64b-4a83-ba0d-d22a6d5d9289")
    public void GoToUrlAssertUrlPositiveEnterEnterUsernamePositiveEnterEnterpasswordClickLoginButtonGoToUrlAs8()
    {
        
        pages.loginpage _loginpage = new pages.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername("Jeremy36");
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword("XqGmPrgifn");
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

pages.agentpage _agentpage = new pages.agentpage(driver);
    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
    _agentpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
    _agentpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName("omnis");
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    

pages.OpenClient _OpenClient = new pages.OpenClient(driver);
    TestModellerLogger.SetLastNodeGuid("a2eed44d-804f-4b67-9b66-2c070de63801");
    _OpenClient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("eb92f601-3d2d-49bb-879e-ec9f2e62447f");
    _OpenClient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d52cbb9-3379-41d8-b7a6-175f48cb6c94");
    _OpenClient.Click_ClientsClick();
    

    TestModellerLogger.SetLastNodeGuid("d0ca1211-df90-488b-a0c0-e841ed6d76a5");
    _OpenClient.Enter_EnterClientName("similique");
    

    TestModellerLogger.SetLastNodeGuid("4f7d6ed5-0600-42c8-a4d5-cf5ee8710c93");
    _OpenClient.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("7d1c5e4e-2c98-44f6-9046-8c959f182449");
    _OpenClient.Click_ClickClient();
    

pages.payslip _payslip = new pages.payslip(driver);
    TestModellerLogger.SetLastNodeGuid("300a58c3-f94e-454a-a07e-b59f42067db9");
    _payslip.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cd342f2a-6174-45a8-825e-cfb2a6fc10fc");
    _payslip.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8f497b9-33c0-4c39-bf26-595e889fe36f");
    _payslip.Click_ClickPayroll();
    

    TestModellerLogger.SetLastNodeGuid("23be5cc2-a814-441a-bd93-1259e9cd737c");
    _payslip.Click_gotoEditCompany();
    

    TestModellerLogger.SetLastNodeGuid("830a477f-25b6-4192-a363-21bc8e650287");
    _payslip.Click_clickPayrollDetails();
    

    TestModellerLogger.SetLastNodeGuid("3517f720-6625-4f86-9d29-386402999915");
    _payslip.Click_clickPayrollSettings();
    

    TestModellerLogger.SetLastNodeGuid("8c8be12c-6d3a-45e6-b3d8-0e2f6e4b95f2");
    _payslip.Select_TemplateColor("Blue");
    

    TestModellerLogger.SetLastNodeGuid("e6563590-51e7-4329-aff5-e73745977d7e");
    _payslip.Click_ClickSave();
    

    TestModellerLogger.SetLastNodeGuid("aa8d5ec7-bbc0-49df-a6eb-d64cdb94738c");
    _payslip.Click_gotoReports();
    

    TestModellerLogger.SetLastNodeGuid("5e3c9663-2b6a-470f-8f37-22c394dbc458");
    _payslip.Click_ClickPayslips();
    

    TestModellerLogger.SetLastNodeGuid("e2b0f05b-f663-4a27-a923-1d4ebed48de8");
    _payslip.Click_clickReGenerate();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d74e-cd12-4819-beb5-67b3a817dc30");
    _payslip.Click_downloadPaySlip();
    

    TestModellerLogger.SetLastNodeGuid("1fd0b599-53b3-451b-bf2c-871f2aa57638");
    _payslip.Click_gotoPayrollDashboard();
    

pages.FrequencySet _FrequencySet = new pages.FrequencySet(driver);
    TestModellerLogger.SetLastNodeGuid("564b814b-70d6-49c1-857a-a401e4415828");
    _FrequencySet.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09a3be4f-3775-47cb-8139-af0fa98ee4ba");
    _FrequencySet.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10360639-06a2-4153-a923-94b7e129ad51");
    _FrequencySet.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("bc000deb-9644-44f3-8250-44ab14c168ca");
    _FrequencySet.Select_payMode("Annually");
    

    TestModellerLogger.SetLastNodeGuid("bf31ec7a-a244-44c7-9b9e-340dd1c8ce83");
    _FrequencySet.Enter_SelectFrequency("");
    

    TestModellerLogger.SetLastNodeGuid("accce833-ca74-4808-808d-69fc58f96bd8");
    _FrequencySet.Click_clickSave();
    

pages.runpayrollpage _runpayrollpage = new pages.runpayrollpage(driver);
    TestModellerLogger.SetLastNodeGuid("41775e8c-28c4-4cba-954e-aca841f0ed7d");
    _runpayrollpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0518b3a7-d88c-4e37-bacb-9ad4acff8239");
    _runpayrollpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("94626dd9-1b9e-47de-aee8-c1d2c0d8ec6f");
    _runpayrollpage.Click_gotoPayrollDashboard();
    

    TestModellerLogger.SetLastNodeGuid("669fca75-1b52-4237-b4ff-d80ec72e73d3");
    _runpayrollpage.Click_ClickRunPayroll1();
    

    TestModellerLogger.SetLastNodeGuid("d10efd7b-df4a-4dfc-acf2-97992c2e4340");
    _runpayrollpage.Click_ClickRunPayroll2();
    

pages.weeklyFrequency _weeklyFrequency = new pages.weeklyFrequency(driver);
    TestModellerLogger.SetLastNodeGuid("3cda3b45-754e-4f47-a870-82706c251f21");
    _weeklyFrequency.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("09be5efa-c172-49e1-aa11-86112ba1883d");
    _weeklyFrequency.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b66b1f4-823d-43e1-94b1-6cbb755ca091");
    _weeklyFrequency.Click_ClickAdditionalFrequecy();
    

    TestModellerLogger.SetLastNodeGuid("ad051a9b-cd3a-4699-92df-ab6c5cd6c946");
    _weeklyFrequency.Select_selectpayMode("Weekly");
    

    TestModellerLogger.SetLastNodeGuid("f3fa98aa-350a-433a-ac59-bebd78002d82");
    _weeklyFrequency.Enter_WeeklyPayrollEndDate("44287");
    

    TestModellerLogger.SetLastNodeGuid("80a80029-b980-49b7-a731-2dd47899a3e7");
    _weeklyFrequency.Click_clickSave();
    

    }
*/
}
