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

   public class SC_009_Lead_Retail_Medium_CheckerApproval extends HomePageMethod
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
        lopm.categoryview("Retail Leads");
        lopm.selfassignlead("Open A/c Verification Pending Retail");
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.leadview("My Leads");
        lopm.onMyBucketlead();   
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
        lopm.GetLeadId();
        CLDLPM.getriskcategory();
        lopm.ClickAMLResponse();
        CLDLPM.getStatusCode();
        
        if (LeadCollectionPageMethod.Leadstatus.equals("Verification Pending"))
        {
			        	
			        	if (LeadCollectionPageMethod.Leadstatus.equals("Verification Pending") && LeadObjectPageMethod.AmlCheckvalue.equals(""))
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
			            CLDLPM.NotificationPOPUPClose();
			            screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
			            lopm.ClickAMLResponse();
			            
			            
			
			            if (LeadObjectPageMethod.AmlCheckvalue.equals("Match Found") || LeadObjectPageMethod.AmlCheckvalue.equals("Pending with AML")||LeadObjectPageMethod.AmlCheckvalue.equals(""))
			            
			            { 
			            	token.Token();
			            	aml.AMLServicesCall();
			            	Refresh();
			            	//lopm.VerifiedbyCheckerBtn();
			            	//lopm.RecordupdatePopUpConfirmation();
						            	
						 }
						           
			             // lopm.DetailsCorporate();
			             lopm.ClickAMLResponse();
			           
			              if (LeadObjectPageMethod.AmlCheckvalue.equals("Match Not Found"))
			               	
			               {   
			              
			              if (LeadCollectionPageMethod.riskcategory.equals("Low"))
			            	  
			              {
			            	  Refresh();
			                  lopm.VerifiedbyCheckerBtn();
			                  lopm.RecordupdatePopUpConfirmation();
			                  
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
			  		        Thread.sleep(6000);
			  		        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
			  		        lopm.RecordupdatePopUpConfirmation();
			  		        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
			  		        Thread.sleep(6000);
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
			            	Refresh();
			               	lopm.SendtoAuthorizerBtn();
			               	lopm.RecordupdatePopUpConfirmation();
			               	
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
					        CLDLPM.NotificationPOPUPClose();
					        Thread.sleep(500);
					        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
					      
			              }
 
 
			               }
           
        
       
					       
        
                            }
        
        }
        
       CLDLPM.getStatusCode();
        	 
       if (LeadCollectionPageMethod.Leadstatus.equals("Verification Pending"))
       {
 
            	if (LeadObjectPageMethod.AmlCheckvalue.equals("Match Found") || LeadObjectPageMethod.AmlCheckvalue.equals("Pending with AML")||LeadObjectPageMethod.AmlCheckvalue.equals(""))
            
            	{ 
            	token.Token();
            	aml.AMLServicesCall();
            	Refresh();
            	//lopm.VerifiedbyCheckerBtn();
            	//lopm.RecordupdatePopUpConfirmation();
            	
            	}
           
            	//lopm.DetailsCorporate();
            	lopm.ClickAMLResponse();
           
            	if (LeadObjectPageMethod.AmlCheckvalue.equals("Match Not Found") )
               	
            		 if (LeadCollectionPageMethod.riskcategory.equals("Low"))
		            	  
		              {
		            	  Refresh();
		                  lopm.VerifiedbyCheckerBtn();
		                  lopm.RecordupdatePopUpConfirmation();
		                  
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
		  		        Thread.sleep(6000);
		  		        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		  		        lopm.RecordupdatePopUpConfirmation();
		  		        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
		  		        Thread.sleep(6000);
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
		            	Refresh();
		               	lopm.SendtoAuthorizerBtn();
		               	lopm.RecordupdatePopUpConfirmation();
		               	
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
				        CLDLPM.NotificationPOPUPClose();
				        Thread.sleep(500);
				        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
				      
		              }

           
        
            	
        }
        
	
       
    CLDLPM.getStatusCode();
        	 
    if (LeadCollectionPageMethod.Leadstatus.equals("Pending at Checker") && LeadCollectionPageMethod.riskcategory.equals("Low"))
       
    {
       
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
        CLDLPM.NotificationPOPUPClose();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_001_Lead_RetailJourneyLow-");
       
       
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
