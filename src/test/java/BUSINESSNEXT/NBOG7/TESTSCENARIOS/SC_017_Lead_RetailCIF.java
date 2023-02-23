package BUSINESSNEXT.NBOG7.TESTSCENARIOS;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BUSINESSNEXT.NBOG7.COMMON.*;
import BUSINESSNEXT.NBOG7.METHOD.*;

import BUSINESSNEXT.NBOG7.API.*;
import BUSINESSNEXT.NBOG7.API.TokenGeneration;

/* Lead creation process for NTB Individual

 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
@Listeners(BUSINESSNEXT.NBOG7.COMMON.ListnersClassAnotation.class)

public class SC_017_Lead_RetailCIF extends HomePageMethod {
	// Object for methods class
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	LeadCollectionPageMethod CLDLPM = new LeadCollectionPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	Screenshot screen = new Screenshot();
	CaseStagePageMethod CSPM = new CaseStagePageMethod();
	// BrowserStart br=new BrowserStart();
	// HomePageMethod home=new HomePageMethod();

	TokenGeneration token = new TokenGeneration();
	AMLServicesForLead aml = new AMLServicesForLead();

	// ************************Fill the Info for SD
	// process*****************************-------------//
	// ListnersClassAnotation css=new ListnersClassAnotation();
	@Test(priority = 1)
	public void SC_001_TC_001() throws Exception {

		launchBrowser();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		EnterUserName(TestDataFromExcel.SSO);
		EnterPassword(TestDataFromExcel.Password);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		LoginButtonClick();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		CheckRole();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		ClickOnLeadswidget();
		Thread.sleep(1000);
		lopm.categoryview("Retail Leads");
		Thread.sleep(500);
		lopm.leadview("Account Opened");
		lopm.onMyBucketlead();

		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		CLDLPM.NotificationPOPUPClose();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		lopm.goToCustomer360();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		CLDLPM.NotificationPOPUPClose();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollToBottom();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		lopm.clickRetailKYCButton();
		lopm.SwitchToSecondaryWindow();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		lopm.ClickOnCorporateOnboarding();
		lopm.SwitchToParentWindow();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		// CLDLPM.TRNRegistrationDate("24/02/2023");

		// CLDLPM.wishToUpdateInfo("No");
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		// CLDLPM.DateOfJoining("24/02/2023");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		// CLDLPM.customerSegment("Private");

		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		/*
		 * CLDLPM.CashTransactions("No"); CLDLPM.CustomerIsInLineWithProfile("No");
		 * CLDLPM.PrformedOnCustomer("No"); CLDLPM.AssociatedWithCustomer("No");
		 * CLDLPM.UtilizedForCmmrcialActivity("No");
		 * screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		 */CLDLPM.saveAndProceed();
		// CLDLPM.getStatusCode();

	}

	@Test(priority = 2)
	public void SC_001_TC_002() throws Exception {

		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		Thread.sleep(200);

		scrollBy();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		CLDLPM.existingHighValueIndividuals("No");
		CLDLPM.updateFATCAInfo("No");
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		CLDLPM.saveAndProceed();

		Thread.sleep(5000);

	}

	@Test(priority = 3)
	public void SC_001_TC_003() throws Exception {
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		CLDLPM.NotificationPOPUPClose();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		QuiteBrowser();

	}

	@Test(priority = 4)
	public void SC_001_TC_004() throws Exception {
		launchBrowser();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		EnterUserName(TestDataFromExcel.Checker);
		EnterPassword(TestDataFromExcel.Password);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		LoginButtonClick();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		CheckRole();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		CSPM.clk_caseobject("CIF Maintenance");
		CSPM.clk_selfassigncase("Maintenance Request Pending with checker Retail");
		Thread.sleep(1000);
		CSPM.sel_caseview("Maintenance Case Assigned to me");
		Thread.sleep(1000);
		CSPM.clk_onMyBucketcase();
		Thread.sleep(1000);

		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		scrollToBottom();
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");

		lopm.clickAMLButton();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		lopm.RecordupdatePopUpConfirmation();
		scrollToTop();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollToBottom();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		lopm.clickApproveButton();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		Thread.sleep(500);
		lopm.RecordupdatePopUpConfirmation();
		scrollToTop();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_017_Lead_RetailCIF-");
		scrollBy();
		Thread.sleep(200);
		QuiteBrowser();

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
