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

public class SC_006_Lead_CorporateJourneyHigh extends HomePageMethod {
	// Object for methods class
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	LeadCollectionPageMethod CLDLPM = new LeadCollectionPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	Screenshot screen = new Screenshot();
	// BrowserStart br=new BrowserStart();
	// HomePageMethod home=new HomePageMethod();

	// ************************Fill the Info for SD
	// process*****************************-------------//
	// ListnersClassAnotation css=new ListnersClassAnotation();
	@Test(priority = 1)
	public void SC_001_TC_001() throws Exception {

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
		CLDLPM.dateOfRegistration("29/12/1927");
		CLDLPM.placeOfRegistration("Noida");
		CLDLPM.entityType("CD01-GENERAL PARTNERSHIPS");
		CLDLPM.AccountType("Call Deposit");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		//CLDLPM.ProductsAndServices("Cards");
		CLDLPM.AnalysisCode("AGRICULTURE & ALLIED ACTIVITY");
		CLDLPM.p5UserCode("COR-Corporate Customer");
		CLDLPM.NatureOfBusiness("Activities of call centers");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		CLDLPM.staffCode();
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		CLDLPM.AverageExpectedTransaction("Above OMR 500k");
		CLDLPM.LengthofIncorporation("Greater than 1 year");
		CLDLPM.OwnershipStructure("Government owned and controlled");
		CLDLPM.sourceOfFunds("Government Aid");
		CLDLPM.Screeningmatches("Positive Match (no Financial Crime negative news)");
		CLDLPM.CountryofIncorporation("American Samoa");
		CLDLPM.CountryofOperations("Oman");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		CLDLPM.originCountry1("Algeria");
		CLDLPM.destinationCountry1("Oman");
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

	@Test(priority = 2)
	public void SC_001_TC_002() throws Exception {

		// CLDLPM.CareofAddressApplicable("No");
		CLDLPM.SelfCertificationRequired("No");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.ClassificationOfEntity("Active NFFE");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.EntityFormUpload();
		scrollBy();
		CLDLPM.LegalIdentityType("Non-Financial Entity (NFE)");
		// CLDLPM.FinancialInstitution("hello");
		// CLDLPM.investmentEntity("hello");
		CLDLPM.addNewResidenctCountryCorporate();
		CLDLPM.TaxID("Yes");
		CLDLPM.CountryOfTax("American Samoa");
		CLDLPM.TaxIDNumber("123432");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.clickAdd();
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		// CLDLPM.CustomerLicenseownershipDetailsUpload(); Field removoed from UI
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		// CLDLPM.TypeOfCRS("Active NFE");
		// CLDLPM.ActiveNfeForm();
		CLDLPM.IDNoCRS("452424");
		CLDLPM.dateOfCRS("25/11/2022");
		// CLDLPM.ChangeinCircumstance("No");
		CLDLPM.POASignatoryAuthorityControlling("No");
		CLDLPM.HighvalueRelationshipManagerInquiry("Not Conducted");
		CLDLPM.ReportableAccountflag("No");
		CLDLPM.flagforPreexisting("No");

		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.saveAndProceed();
		Thread.sleep(5000);

	}

	@Test(priority = 3)
	public void SC_001_TC_003() throws Exception {
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
	}

	@Test(priority = 4)
	public void SC_001_TC_004() throws Exception {
		Thread.sleep(3000);
		scrollBy();
		Thread.sleep(3000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		Thread.sleep(1000);				
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		Thread.sleep(3000);
		CLDLPM.saveAndProceed();
		Thread.sleep(5000);

	}

	@Test(priority = 5)
	public void SC_001_TC_005() throws Exception {
		CLDLPM.Purposeofrequesting("Test");
		CLDLPM.Alreadyborrowingrelationship("No");
		CLDLPM.lookingforborrowingrelationship("No");
		CLDLPM.LengthOfBusiness("342");
		CLDLPM.BusinessProfile("Test");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();

		CLDLPM.typeOfProduct("Education");
		CLDLPM.IntoExchangeMoney("No");
		CLDLPM.CharitableServices("No");
		CLDLPM.Trade("Yes");
		CLDLPM.MainOriginOfBusiness("MAIN ORIGIN");
		CLDLPM.NotBeRoutingFunds("nOOOO");

		CLDLPM.OriginatorPartyNationality("american samoa");
		CLDLPM.OriginatorPartyName("Hello");
		CLDLPM.OriginatorBankName("bsiahl");
		CLDLPM.OriginatorAccountNumber("92829213");
		CLDLPM.Natureofrelationship("hellooo");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		CLDLPM.AttachProofClick();
		CLDLPM.PresenceInDifferentCountry("No");
		CLDLPM.NoOfPersonEmployed("1-5");
		CLDLPM.IESCorporate("No");
		CLDLPM.ManagaedByNaturalPerson("No");
		CLDLPM.BusinessInHighRisk("No");
		CLDLPM.IntstInHighRiskIndustry("No");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		CLDLPM.AddNewSupplier();
		CLDLPM.SupplierName("Authorized Signatory");
		CLDLPM.SupplierWebsite("www.NBOBusiness.com");
		CLDLPM.AddressCountry("American");
		CLDLPM.NatureOfBusinessAddSupplier("Testing");
		CLDLPM.TypeOfProductAddSupplier("hello bello");
		CLDLPM.PrcntgOfBusiness("55");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");

		CLDLPM.clickAdd();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();

		CLDLPM.AddNewCustomer();
		CLDLPM.SupplierName("Authorized Signatory");
		CLDLPM.SupplierWebsite("www.NBOBusiness.com");
		CLDLPM.AddressCountry("American");
		CLDLPM.NatureOfBusinessAddSupplier("Testing");
		CLDLPM.TypeOfProductAddSupplier("hello bello");
		CLDLPM.PrcntgOfBusiness("55");

		CLDLPM.clickAdd();

		CLDLPM.DtlsOfAssociated("No");
		CLDLPM.PerformedSiteVisit("No");
		CLDLPM.PleaseJustify("I am justifying");

		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		scrollBy();
		CLDLPM.saveAndProceed();
		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public void SC_001_TC_006() throws Exception {
		Thread.sleep(3000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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

	@Test(priority = 7)
	public void SC_001_TC_007() throws Exception {
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
		lopm.categoryview("Corporate Leads");
		lopm.selfassignlead("Open A/c Verification Pending Corporate");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.leadview("My Leads");
		lopm.onMyBucketlead();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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
		lopm.clickAMLButton();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.RecordupdatePopUpConfirmation();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");

		lopm.ClickOnNMDDtab();
		Thread.sleep(500);
		lopm.closeContact1();
		lopm.SwitchToSecondaryWindow();
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(200);
		CLDLPM.entityOman("No");
		CLDLPM.entityOtherCountry("No");
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.clickSave();
		Thread.sleep(2000);
		closeCurrentBrowser();
		lopm.SwitchToParentWindow();
		Refresh();

		lopm.ClickOnNMDDtab();
		lopm.closeContact2();
		lopm.SwitchToSecondaryWindow();

		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(200);
		CLDLPM.entityOman("No");
		CLDLPM.entityOtherCountry("No");
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.clickSave();
		Thread.sleep(1000);
		Thread.sleep(500);
		closeCurrentBrowser();
		lopm.SwitchToParentWindow();
		Refresh();
		Thread.sleep(1000);

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
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.SendtoAuthorizerBtn();
		Thread.sleep(1000);
		lopm.RecordupdatePopUpConfirmation();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		QuiteBrowser();
	}

	@Test(priority = 8)
	public void SC_001_TC_008() throws Exception {
		launchBrowser();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		EnterUserName(TestDataFromExcel.Authorizer);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		EnterPassword(TestDataFromExcel.Password);
		LoginButtonClick();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CheckRole();
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		clk_leadobject();
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.categoryview("Corporate Leads");
		lopm.selfassignlead("Pending with Authorizer Oman Corp");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.leadview("My Leads");
		lopm.onMyBucketlead();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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
		lopm.ApprovedbyAuthorizerBtn();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.RecordupdatePopUpConfirmation();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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
		QuiteBrowser();

	}

	@Test(priority = 9)
	public void SC_001_TC_009() throws Exception {
		launchBrowser();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		EnterUserName(TestDataFromExcel.ComplianceMaker);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		EnterPassword(TestDataFromExcel.Password);
		LoginButtonClick();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CheckRole();
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		clk_leadobject();
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.categoryview("Corporate Leads");
		lopm.selfassignlead("Pending with Compliance Maker Oman Corp");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.leadview("My Leads");
		lopm.onMyBucketlead();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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
		lopm.approvedByComplianceMaker();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.complianceComment("COMMENTS");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.clickUpdate();
		Thread.sleep(2000);
		lopm.RecordupdatePopUpConfirmation();
		Thread.sleep(2000);
		CLDLPM.NotificationPOPUPClose();
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
		QuiteBrowser();

	}

	@Test(priority = 10)
	public void SC_001_TC_010() throws Exception {
		launchBrowser();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		EnterUserName(TestDataFromExcel.ComplianceChecker);
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
		lopm.categoryview("Corporate Leads");
		lopm.selfassignlead("Pending with Compliance Checker Oman Corp");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.leadview("My Leads");
		lopm.onMyBucketlead();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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
		lopm.approvedByComplianceChecker();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.RecordupdatePopUpConfirmation();
		Thread.sleep(2000);
		CLDLPM.NotificationPOPUPClose();
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
		QuiteBrowser();

	}

	@Test(priority = 11)
	public void SC_001_TC_011() throws Exception {
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
		lopm.categoryview("Corporate Leads");
		lopm.selfassignlead("Approved by Authorizer/Compliance fr A/C Opening C");
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.leadview("My Leads");
		lopm.onMyBucketlead();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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
		lopm.clickGenerateCIFButton();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		lopm.RecordupdatePopUpConfirmation();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		CLDLPM.NotificationPOPUPClose();
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
		QuiteBrowser();
	}

	// screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */

}
