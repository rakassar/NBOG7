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

public class SC_015_Lead_RetailKYC extends HomePageMethod {
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
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		EnterUserName(TestDataFromExcel.SSO);
		EnterPassword(TestDataFromExcel.Password);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		LoginButtonClick();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CheckRole();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");

		ClickOnLeadswidget();
		Thread.sleep(1000);
		lopm.categoryview("Retail Leads");
		lopm.leadview("Account Opened");
		lopm.onMyBucketlead();

		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CLDLPM.NotificationPOPUPClose();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		lopm.goToCustomer360();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CLDLPM.NotificationPOPUPClose();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollToBottom();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");

		lopm.clickRetailKYCButton();
		lopm.SwitchToSecondaryWindow();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		lopm.ClickOnRetailOnboarding();
		lopm.SwitchToParentWindow();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CLDLPM.TRNRegistrationDate("24/02/2023");

		CLDLPM.wishToUpdateInfo("No");
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CLDLPM.DateOfJoining("24/02/2023");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");

		// CLDLPM.customerSegment("Private");

		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		CLDLPM.CashTransactions("No");
		CLDLPM.CustomerIsInLineWithProfile("No");
		CLDLPM.PrformedOnCustomer("No");
		CLDLPM.AssociatedWithCustomer("No");
		CLDLPM.UtilizedForCmmrcialActivity("No");
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CLDLPM.saveAndProceed();
		// CLDLPM.getStatusCode();

	}

	@Test(priority = 2)
	public void SC_001_TC_002() throws Exception {

		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		
		Thread.sleep(200);
		
		scrollBy();
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CLDLPM.existingHighValueIndividuals("No");
		CLDLPM.updateFATCAInfo("No");
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");

		CLDLPM.saveAndProceed();
		
		
		
		Thread.sleep(5000);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(3000);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		// scrollBy();
		// CLDLPM.waitTillNextStatusCode("Verification Pending");

	}

	@Test(priority = 3)
	public void SC_001_TC_003() throws Exception {
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		CLDLPM.saveAndProceed();
		Thread.sleep(6000);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		CLDLPM.saveAndProceed();
		Thread.sleep(5000);

		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
		scrollBy();
		Thread.sleep(200);
		screen.ScreenshotMethod("SC_015_Lead_RetailKYC-");
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
