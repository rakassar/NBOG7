package BUSINESSNEXT.NBOG7.TESTSCENARIOS;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BUSINESSNEXT.NBOG7.COMMON.*;
import BUSINESSNEXT.NBOG7.METHOD.*;


/* Lead creation process for NTB Individual

 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
@Listeners(BUSINESSNEXT.NBOG7.COMMON.ListnersClassAnotation.class)

   public class SC_001_Lead_RetailJourneyLow extends HomePageMethod
   {
	//Object for methods class
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	LeadCollectionPageMethod CLDLPM=new LeadCollectionPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
   // BrowserStart br=new BrowserStart(); 
    //HomePageMethod home=new HomePageMethod();

	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_001_TC_001() throws Exception
	{

    	//rizwan

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_TC_001-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.SSO);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_TC_001-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_TC_001-");
        CheckRole();
        screen.ScreenshotMethod("SC_001_TC_001-");

        ClickOnLeadswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_TC_001-");
        lopm.ClickOnboardCustomer();
        
        lopm.SwitchToSecondaryWindow();
        lopm.ClickOnRetailOnboarding();
        lopm.SwitchToParentWindow();
        CLDLPM.SalutationID("MR.");
        CLDLPM.CustomerName("TestLead");
        CLDLPM.DateOfBirth("29/12/1925");
        CLDLPM.IDCardNo();
        CLDLPM.MonthlyIncome("98755");
        CLDLPM.IDCardExpiry();
        CLDLPM.EmployerType("Free-Zone Corporations");
        CLDLPM.customerProfession("Actor");
        CLDLPM.AccountType("Call Deposit");
        CLDLPM.AccountShortName("vin");
        CLDLPM.ProductsAndServices("Loans and Advances");
        CLDLPM.EnterMobile();
        CLDLPM.Literacy("Literate");
        CLDLPM.LeadSource("Google");
        CLDLPM.PurposeOfAccount();
        CLDLPM.staffCode();
        CLDLPM.PEPStatus("Not Applicable");
        CLDLPM.Screeningmatches("Positive Match (no Financial Crime negative news)");
        CLDLPM.HNWIStatus("No");
        CLDLPM.CaptureAssociatedPartyInfo("No");
        CLDLPM.Surname("bishal");
        CLDLPM.Residencestatus("Resident");
        CLDLPM.Buildingno("234");
        CLDLPM.wayNo("234");
        CLDLPM.villaNo("324");
        CLDLPM.POCode("101 - City Center MUSCAT");
        CLDLPM.PObox("12");
        CLDLPM.AverageExpectedTransactionValuePerAnnum("Upto OMR 25k");
        CLDLPM.relationshipAndServicingMethod("Face-to-Face Channel (via Branch)Face-to-Face Channel (via Branch)");
        CLDLPM.originCountry1("American Samoa");
        CLDLPM.destinationCountry1("American Samoa");
        CLDLPM.sourceOfFunds("Government Aid");
        CLDLPM.MonthlyIncome("98755");
        CLDLPM.PlaceOfBirth("American Samoa");
        CLDLPM.CountryOfBirth("AMERICAN SAMOA");
        CLDLPM.GreenCardHolderFlag("No");
        CLDLPM.MakeOngoingPayment("No");
        CLDLPM.USTax("No");
        CLDLPM.USCitizen("No");
        CLDLPM.USPassport("No");
        
        
	}

  //screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */


}
