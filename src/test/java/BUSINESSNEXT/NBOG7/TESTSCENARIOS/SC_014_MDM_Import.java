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

   public class SC_014_MDM_Import extends HomePageMethod
   {
	//Object for methods class
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	LeadCollectionPageMethod CLDLPM=new LeadCollectionPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
   // BrowserStart br=new BrowserStart(); 
    //HomePageMethod home=new HomePageMethod();
    
    TokenGeneration token=new TokenGeneration();
    AMLServicesForLead aml=new AMLServicesForLead();
	

	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_014_TC_001() throws Exception
	{


    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.admin);
        EnterPassword(TestDataFromExcel.Password);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
      
        scrollToBottom();
        Thread.sleep(2000);
        ClickMDMWidget();
        Thread.sleep(1000);
        ClickMDMRelationShipmethod();
        scrollBy();
        lopm.categoryview("Relationship Method");
        lopm.leadview("Relationship Method View");
        lopm.clk_importButton();
        lopm.choosefileandfinish();  
        //lopm.clk_choosefile();
        lopm.categoryview("Relationship Method");
        lopm.leadview("Relationship Method View");
        lopm.SelectAllDatafromView("Relationship Method View");
      }
   }

   



