package BUSINESSNEXT.NBOG7.TESTSCENARIOS;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BUSINESSNEXT.NBOG7.API.*;
import BUSINESSNEXT.NBOG7.COMMON.*;
import BUSINESSNEXT.NBOG7.METHOD.*;


/* Lead creation process for NTB Individual

 */
//update Lea_ex9 set Lea_ex9_17=null where Lea_ex9_id=2186

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
@Listeners(BUSINESSNEXT.NBOG7.COMMON.ListnersClassAnotation.class)

   public class SC_008_Lead_Corporate_Low_CheckerApproval extends HomePageMethod
   {
	//Object for methods class
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	LeadCollectionPageMethod CLDLPM=new LeadCollectionPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
    
    TokenGeneration token=new TokenGeneration();
    AMLServicesForLead aml=new AMLServicesForLead();
    
   	AMLServicesForContact1 con1=new AMLServicesForContact1();
   	AMLServicesForContact2 con2=new AMLServicesForContact2();

    
   // BrowserStart br=new BrowserStart(); 
    //HomePageMethod home=new HomePageMethod();

	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    

    @Test(priority=1)
   	public void SC_008_TC_001() throws Exception
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
              lopm.categoryview("Corporate Leads");
              lopm.selfassignlead("Open A/c Verification Pending Corporate");
              screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
              lopm.leadview("My Leads");
              lopm.onMyBucketlead();   
              Thread.sleep(2000);
              screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
              lopm.GetLeadId();
              lopm.ClickAMLResponse();
              CLDLPM.getStatusCode();
              
              if (LeadCollectionPageMethod.Leadstatus.equalsIgnoreCase("Verification Pending") && LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase(""))
              {
              	
            
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
                 // CLDLPM.NotificationPOPUPClose();
                  screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
                  lopm.ClickAMLResponse();
                  
                  lopm.GetLeadId();
            
                  CLDLPM.getStatusCode();
                 
                  Thread.sleep(2000);
                  screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
                 
                   
                 
                  if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Found") || LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Pending with AML")||LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase(""))
                  
                  { 
                  	token.Token();
                  	aml.AMLServicesCall();
                  	Refresh();
                  	//lopm.VerifiedbyCheckerBtn();
                  	//lopm.RecordupdatePopUpConfirmation();
                  	
                  }
                  
                  CLDLPM.NotificationPOPUPClose();
                  lopm.ClickOnNMDDtab();   
                  lopm.GetContactIds();
                  lopm.GetAMLResponseForContacts();
                  
                  if (LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("Match Found") || LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("Pending with AML")||LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("")||LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("AML Checked"))
                      
                   {   
                  	token.Token();
                  	con1.AMLServicesCallCont1();
                  	con2.AMLServicesCallCont2();
                  	Refresh();
                   lopm.ClickOnNMDDtab(); 
                   lopm.GetAMLResponseForContacts();
                 
                  	
                  }
                  lopm.DetailsCorporate();
                  lopm.ClickAMLResponse();
                  lopm.ClickOnNMDDtab(); 
                  lopm.GetAMLResponseForContacts();
                  if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Not Found") && LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("Match Not Found"))
                     	
                  {   
                     	Refresh();
                     	lopm.VerifiedbyCheckerBtn();
                     	lopm.RecordupdatePopUpConfirmation();
                     	
                     		
                   }
                  
				            
				           
				           //Clcik On Nmdd Tab
				   		/*
				   		 * lopm.ClickOnNMDDtab(); Thread.sleep(500); lopm.closeContact1();
				   		 * lopm.SwitchToSecondaryWindow(); CLDLPM.CreatedNewLeadEdit();
				   		 * Thread.sleep(200); CLDLPM.entityOman("No"); CLDLPM.entityOtherCountry("No");
				   		 * Thread.sleep(200); screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
				   		 * CLDLPM.clickSave(); Thread.sleep(2000); closeCurrentBrowser();
				   		 * lopm.SwitchToParentWindow(); Refresh();
				   		 * 
				   		 * lopm.ClickOnNMDDtab(); lopm.closeContact2(); lopm.SwitchToSecondaryWindow();
				   		 * 
				   		 * CLDLPM.CreatedNewLeadEdit(); Thread.sleep(200); CLDLPM.entityOman("No");
				   		 * CLDLPM.entityOtherCountry("No"); Thread.sleep(200);
				   		 * screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-"); CLDLPM.clickSave();
				   		 * Thread.sleep(1000); Thread.sleep(500); closeCurrentBrowser();
				   		 * lopm.SwitchToParentWindow(); Refresh();
				   		 */        
	                  
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
	           screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
	           lopm.clickGenerateCIFButton();
	           Thread.sleep(10000);
	           screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
	           lopm.RecordupdatePopUpConfirmation();
	           Thread.sleep(6000);
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
           

   	          }
              
          CLDLPM.getStatusCode();
          
          if (LeadCollectionPageMethod.Leadstatus.equalsIgnoreCase("Verification Pending"))
              {
            	  
              
            	  
                   if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Found") || LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Pending with AML")||LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase(""))
                  
                    {   
                  	token.Token();
                  	aml.AMLServicesCall();
                  	Refresh();
                  	lopm.VerifiedbyCheckerBtn();
                  	lopm.RecordupdatePopUpConfirmation();
                  	
                   }
                 // CLDLPM.NotificationPOPUPClose();
                   lopm.ClickOnNMDDtab();   
                   lopm.GetContactIds();
                   lopm.GetAMLResponseForContacts();
                  
                  if (LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("Match Found") || LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("Pending with AML")||LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("")||LeadObjectPageMethod.contactid1amlcheck.equalsIgnoreCase("AML Checked"))
                      
                   {   
                  	token.Token();
                  	con1.AMLServicesCallCont1();
                  	con2.AMLServicesCallCont2();
                  	Refresh();
                    lopm.ClickOnNMDDtab(); 
                    lopm.GetAMLResponseForContacts();
                 
                  	
                    }
                    lopm.DetailsCorporate();
                    lopm.ClickAMLResponse();
                    lopm.ClickOnNMDDtab(); 
                    lopm.GetAMLResponseForContacts();
                    if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Not Found") && LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Not Found"))
                     	
                     {   
                     	Refresh();
                     	lopm.VerifiedbyCheckerBtn();
                     	lopm.RecordupdatePopUpConfirmation();
                     	
                     		
                     }
                  
			            
			           
			           //Clcik On Nmdd Tab
			   		/*
			   		 * lopm.ClickOnNMDDtab(); Thread.sleep(500); lopm.closeContact1();
			   		 * lopm.SwitchToSecondaryWindow(); CLDLPM.CreatedNewLeadEdit();
			   		 * Thread.sleep(200); CLDLPM.entityOman("No"); CLDLPM.entityOtherCountry("No");
			   		 * Thread.sleep(200); screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
			   		 * CLDLPM.clickSave(); Thread.sleep(2000); closeCurrentBrowser();
			   		 * lopm.SwitchToParentWindow(); Refresh();
			   		 * 
			   		 * lopm.ClickOnNMDDtab(); lopm.closeContact2(); lopm.SwitchToSecondaryWindow();
			   		 * 
			   		 * CLDLPM.CreatedNewLeadEdit(); Thread.sleep(200); CLDLPM.entityOman("No");
			   		 * CLDLPM.entityOtherCountry("No"); Thread.sleep(200);
			   		 * screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-"); CLDLPM.clickSave();
			   		 * Thread.sleep(1000); Thread.sleep(500); closeCurrentBrowser();
			   		 * lopm.SwitchToParentWindow(); Refresh();
			   		 */        
			                  
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
			           screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
			           lopm.clickGenerateCIFButton();
			           Thread.sleep(10000);
			           screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
			           lopm.RecordupdatePopUpConfirmation();
			           Thread.sleep(6000);
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
           
              }
          
          if  (LeadCollectionPageMethod.Leadstatus.equalsIgnoreCase("Pending at Checker"))
        	  
          {
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
	           screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
	           lopm.clickGenerateCIFButton();
	           Thread.sleep(10000);
	           screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
	           lopm.RecordupdatePopUpConfirmation();
	           Thread.sleep(6000);
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
           }
          else 
           	   
           {
           	   
           	   
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
    }
