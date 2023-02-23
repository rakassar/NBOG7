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

public class SC_016_Lead_CorporateKYC extends HomePageMethod {
	// Object for methods class
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	LeadCollectionPageMethod CLDLPM = new LeadCollectionPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	Screenshot screen = new Screenshot();
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
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		EnterUserName(TestDataFromExcel.SSO);
		EnterPassword(TestDataFromExcel.Password);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		LoginButtonClick();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		CheckRole();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");

		ClickOnLeadswidget();
		Thread.sleep(1000);
		lopm.categoryview("Corporate Leads");
		lopm.leadview("Account Opened");
		lopm.onMyBucketlead();

		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		CLDLPM.NotificationPOPUPClose();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		lopm.goToCustomer360();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollToBottom();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");

		lopm.clickCorporateKYCButton();
		lopm.SwitchToSecondaryWindow();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		lopm.ClickOnCorporateOnboarding();
		lopm.SwitchToParentWindow();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		CLDLPM.TRNRegistrationDate("24/02/2023");

		
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		CLDLPM.lengthOfRelationshipWithBank();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");

		// CLDLPM.customerSegment("Private");

		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		CLDLPM.CashTransactions("No");
		CLDLPM.CustomerIsInLineWithProfile("No");
		CLDLPM.PrformedOnCustomer("No");
		CLDLPM.AssociatedWithCustomer("No");
		CLDLPM.MajorCreditsInAccount("No");
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		CLDLPM.saveAndProceed();
		// CLDLPM.getStatusCode();

	}

	@Test(priority = 2)
	public void SC_001_TC_002() throws Exception {

		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		
		Thread.sleep(200);
		
		scrollBy();
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		CLDLPM.existingHighValueIndividuals("No");
		CLDLPM.updateFATCAInfo("No");
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");

		CLDLPM.saveAndProceed();
		
		
		
		Thread.sleep(5000);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(3000);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		// scrollBy();
		// CLDLPM.waitTillNextStatusCode("Verification Pending");

	}

	@Test(priority = 3)
	public void SC_001_TC_003() throws Exception {
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		CLDLPM.saveAndProceed();
		Thread.sleep(6000);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		CLDLPM.saveAndProceed();
		Thread.sleep(5000);

		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_016_Lead_CorporateKYC-");
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
