package BUSINESSNEXT.NBOG7.TESTSCENARIOS;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BUSINESSNEXT.NBOG7.API.*;
import BUSINESSNEXT.NBOG7.API.TokenGeneration;
import BUSINESSNEXT.NBOG7.COMMON.*;
import BUSINESSNEXT.NBOG7.METHOD.*;


/* Lead creation process for NTB Individual

 */
//update Lea_ex9 set Lea_ex9_17=null where Lea_ex9_id=2186

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
@Listeners(BUSINESSNEXT.NBOG7.COMMON.ListnersClassAnotation.class)

   public class SC_012_Lead_Retail_2ndLevel_checker extends HomePageMethod
   {
	//Object for methods class
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	LeadCollectionPageMethod CLDLPM=new LeadCollectionPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    
    TokenGeneration token=new TokenGeneration();
    AMLServicesForLead aml=new AMLServicesForLead();
	

    
   // BrowserStart br=new BrowserStart(); 
    //HomePageMethod home=new HomePageMethod();

	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    

    @Test(priority=1)
	public void SC_0012_TC_001() throws Exception
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.Checker);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        ClickOnLeadswidget();
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        lopm.categoryview("Retail Leads");
        Thread.sleep(2000);
        lopm.selfassignlead("Approved by Authorizer/Compliance fr A/C Opening R");
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        lopm.leadview("My Leads");
        lopm.onMyBucketlead();   
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        lopm.clickGenerateCIFButton();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        lopm.RecordupdatePopUpConfirmation();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_004_Lead_RetailJourneyLow-");
        QuiteBrowser();
        
        
       
        

	}


    }

