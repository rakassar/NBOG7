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

   public class SC_002_Lead_CorporateJourneyLow extends HomePageMethod
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


    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.SSO);
        EnterPassword(TestDataFromExcel.Password);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");

        ClickOnLeadswidget();
        Thread.sleep(1000);
        lopm.categoryview("Corporate Leads");
        lopm.leadview("My Leads");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.ClickOnboardCustomer();
        lopm.SwitchToSecondaryWindow();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.ClickOnCorporateOnboarding();
        lopm.SwitchToParentWindow();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CLDLPM.customerSegment("Retail Banking - Mass");
        CLDLPM.companyName();
        CLDLPM.shortName("vin");
        CLDLPM.DateOfEstablishment("29/12/1965");
        CLDLPM.CRno();
        CLDLPM.CRExpiry();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.dateOfRegistration("29/12/1922");
        CLDLPM.placeOfRegistration("Noida");
        CLDLPM.entityType("CD01-GENERAL PARTNERSHIPS");
        CLDLPM.AccountType("Call Deposit");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.ProductsAndServices("Cards");
        CLDLPM.AnalysisCode("AGRICULTURE & ALLIED ACTIVITY");
        CLDLPM.p5UserCode("COR-Corporate Customer");
        CLDLPM.NatureOfBusiness("Activities of call centers");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.staffCode();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.AverageExpectedTransaction("Upto OMR 100k");
        CLDLPM.LengthofIncorporation("Greater than 1 year");
        CLDLPM.OwnershipStructure("Government owned and controlled");
        CLDLPM.sourceOfFunds("Government Aid");
        CLDLPM.Screeningmatches("Positive Match (no Financial Crime negative news)");
        CLDLPM.CountryofIncorporation("Oman");
        CLDLPM.CountryofOperations("American Samoa");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.originCountry1("American Samoa");
        CLDLPM.destinationCountry1("American Samoa");
        CLDLPM.CountryofResidenceofSuppliers("American Samoa");
        CLDLPM.CountryofResidenceofApplicantEntity("American Samoa");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.shareholderowning10ormore("No");
        CLDLPM.relationshipAndServicingMethod("Face-to-Face Channel (via Branch)");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.EnterMobile();
        CLDLPM.POCodeCorporate("100 - Al Qurum");
        CLDLPM.POboxCorporate("987");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.fatcaUpdate("No");
        CLDLPM.PurposeOfAccount("Business Transactions");
        CLDLPM.subIndustryCorporate("Abrasive product manufacturing");
        
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CLDLPM.saveAndProceed();
        Thread.sleep(5000);
        
        
	}
    
    @Test(priority=2)
	public void SC_001_TC_002() throws Exception
	{
    	
    	//CLDLPM.CareofAddressApplicable("No");
    	CLDLPM.SelfCertificationRequired("No");
    	CLDLPM.ClassificationOfEntity("Active NFFE");
    	CLDLPM.EntityFormUpload();
    	CLDLPM.LegalIdentityType("Financial Institution (FI) – Investment Entity");
    	CLDLPM.FinancialInstitution("hello");
        CLDLPM.investmentEntity("hello"); 
    	CLDLPM.addNewResidenctCountryCorporate();
    	CLDLPM.TaxID("Yes");
    	CLDLPM.CountryOfTax("American Samoa");
    	CLDLPM.TaxIDNumber("123432");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	CLDLPM.clickAdd();
    	screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	scrollBy();
    	CLDLPM.CustomerLicenseownershipDetailsUpload();
    	screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	scrollBy();
        CLDLPM.TypeOfCRS("Active NFE");
        CLDLPM.ActiveNfeForm();
        CLDLPM.dateOfCRS("25/11/2022");
        CLDLPM.ChangeinCircumstance("No");
        CLDLPM.POASignatoryAuthorityControlling("No");
        CLDLPM.HighvalueRelationshipManagerInquiry("Not Conducted");
    	CLDLPM.ReportableAccountflag("No");
    	CLDLPM.flagforPreexisting("No");
    	
        
    	
    	screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CLDLPM.saveAndProceed();
        Thread.sleep(5000);
        

	}
    
    @Test(priority=3)
	public void SC_001_TC_003() throws Exception
	{
    	Thread.sleep(4000);
    	screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	CLDLPM.addNewAuthorizedSignatory();
    	CLDLPM.Associatedpartytype("Authorized Signatory");
    	CLDLPM.Title("MR.");
    	CLDLPM.NameField("vISHAL");
    	CLDLPM.countryofIncorporation("AMERICAN SAMOA"); 
    	CLDLPM.ResidenceCountry("AMERICAN SAMOA");
    	CLDLPM.PEPStatusCorporate("Not Applicable");
        CLDLPM.ScreeningmatchesCorporate("Positive Match (no Financial Crime negative news)");
    	CLDLPM.clickAdd();
    	Thread.sleep(500);
    	
    	CLDLPM.addNewAuthorizedSignatory();
    	CLDLPM.Associatedpartytype("UBO");
    	CLDLPM.NameField("vISHAL");
    	CLDLPM.countryofIncorporation("AMERICAN SAMOA");
    	CLDLPM.TypeOfUBO("Individual");
    	CLDLPM.ResidenceCountry("AMERICAN SAMOA");
    	CLDLPM.PEPStatusCorporate("Not Applicable");
        CLDLPM.ScreeningmatchesCorporate("Positive Match (no Financial Crime negative news)");
    	CLDLPM.clickAdd();
    	 CLDLPM.saveAndProceed();
         Thread.sleep(5000);
    	
    	
    	
    	
        scrollBy();
        Thread.sleep(3000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	CLDLPM.saveAndProceed();
    	Thread.sleep(6000);
    	screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	CLDLPM.clickClosePopup();
        Thread.sleep(1000);
    	lopm.GetLeadId();
    	scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	QuiteBrowser();
    	
    	
	}
    
    @Test(priority=4)
	public void SC_001_TC_004() throws Exception
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.Checker);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        ClickOnLeadswidget();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.categoryview("Retail Leads");
        lopm.selfassignlead("Open A/c Verification Pending Retail");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.leadview("My Leads");
        lopm.onMyBucketlead();   
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CLDLPM.clickAMLButton();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CLDLPM.clickGenerateCIFButton();
        Thread.sleep(6000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.ProcessApplicationPopUpClose();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        Thread.sleep(6000);
        CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        scrollBy();
        

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
