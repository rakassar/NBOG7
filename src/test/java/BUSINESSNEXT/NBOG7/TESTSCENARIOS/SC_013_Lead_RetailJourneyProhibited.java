package BUSINESSNEXT.NBOG7.TESTSCENARIOS;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BUSINESSNEXT.NBOG7.API.AMLServicesForLead;
import BUSINESSNEXT.NBOG7.API.TokenGeneration;
import BUSINESSNEXT.NBOG7.COMMON.*;
import BUSINESSNEXT.NBOG7.METHOD.*;


/* Lead creation process for NTB Individual

 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
@Listeners(BUSINESSNEXT.NBOG7.COMMON.ListnersClassAnotation.class)

   public class SC_013_Lead_RetailJourneyProhibited extends HomePageMethod
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
	public void SC_013_TC_001() throws Exception
	{

    	
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.SSO);
        EnterPassword(TestDataFromExcel.Password);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");

        ClickOnLeadswidget();
        Thread.sleep(1000);
        lopm.categoryview("Corporate Leads");
        lopm.leadview("My Leads");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.ClickOnboardCustomer();
        lopm.SwitchToSecondaryWindow();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.ClickOnRetailOnboarding();
        lopm.SwitchToParentWindow();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.SalutationID("MR.");
        CLDLPM.CustomerName();
        CLDLPM.DateOfBirth("29/12/1965");
        CLDLPM.IDCardNo();
        CLDLPM.IDCardExpiry();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.MonthlyIncome("98755");
        CLDLPM.EmployerType("Free-Zone Corporations");
        CLDLPM.customerProfession("Accountant");
        CLDLPM.AccountType("Call Deposit");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        //CLDLPM.ProductsAndServices("Asset Management");
        CLDLPM.AccountShortName("vin");
        CLDLPM.EnterMobile();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.Literacy("Literate");
        CLDLPM.LeadSource("Google");
        scrollBy();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.PurposeOfAccount("Brokerage (if applicable)");
        CLDLPM.staffCode();
        CLDLPM.PEPStatus("Not Applicable");
        CLDLPM.Screeningmatches("Positive Match (with Financial Crime negative news)");
        CLDLPM.HNWIStatus("Yes");
        CLDLPM.CaptureAssociatedPartyInfo("No");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.Surname("bishal");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.Designation("D001-General Manager");
        CLDLPM.Employer("007");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.POCode("101 - City Center MUSCAT");
        CLDLPM.PObox("12");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.AverageExpectedTransactionValuePerAnnum("Upto OMR 25k");
        CLDLPM.relationshipAndServicingMethod("Digital Channel (via Self-service Kiosk)");
        CLDLPM.originCountry1("Albania");
        CLDLPM.destinationCountry1("Albania");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.sourceOfFunds("Government Aid");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.Residencestatus("Resident");
        CLDLPM.Buildingno("234");
        CLDLPM.wayNo("234");
        CLDLPM.villaNo("324");
        CLDLPM.Location("CCAE-MUSCAT");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        CLDLPM.PlaceOfBirth("American Samoa");
        CLDLPM.CountryOfBirth("AMERICAN SAMOA");
        CLDLPM.GreenCardHolderFlag("No");
        CLDLPM.MakeOngoingPayment("No");
        CLDLPM.USTax("No");
        CLDLPM.USCitizen("No");
        CLDLPM.USPassport("No");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.saveAndProceed();
        Thread.sleep(5000);
        CLDLPM.getStatusCode();
        
	}
    
    //CRS
    @Test(priority=2)
	public void SC_013_TC_002() throws Exception
	{
    	
    	CLDLPM.CareofAddressApplicable("No");
    	CLDLPM.SelfCertificationRequired("No");
    	CLDLPM.MultipleNationality("No");
    	scrollBy();
    	CLDLPM.StandingInstructiontoTransfer("No");
    	screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	CLDLPM.InternationalPhoneNumber("No");
    	//CLDLPM.ChangeinCircumstance("No");
    	CLDLPM.CertificationValidity("29/12/2029");
    	//CLDLPM.CustomerLicenseownershipDetailsUpload();
    	screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	CLDLPM.addNewResidenctCountry();
    	CLDLPM.TaxID("Yes");
    	CLDLPM.CountryOfTax("American Samoa");
    	CLDLPM.TaxIDNumber("123432");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	CLDLPM.clickAdd();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
    	//CLDLPM.POASignatoryAuthorityControlling("No");
    	CLDLPM.HighvalueRelationshipManagerInquiry("Not Conducted");
    	CLDLPM.ReportableAccountflag("No");
    	//CLDLPM.flagforPreexisting("No");
    	CLDLPM.dateOfCRS("29/12/2001");
    	screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
    	CLDLPM.IssuingCountry("American Samoa");
    	screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.saveAndProceed();
        Thread.sleep(6000);
        //CLDLPM.getStatusCode();

	}
    
    @Test(priority=3)
	public void SC_013_TC_003() throws Exception
	{
    	screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	Thread.sleep(2000);
    	screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	CLDLPM.saveAndProceed();
    	Thread.sleep(6000);
    	
    	
    	
	}
    	
    //EDD
    @Test(priority=4)
    		public void SC_013_TC_004() throws Exception
    		{	
    		 CLDLPM.Purposeofrequesting("Test");
    		 CLDLPM.Alreadyborrowingrelationship("No");
             CLDLPM.lookingforborrowingrelationship("No");
             CLDLPM.customerIsSelfEmployed("No");
             CLDLPM.VisaSponsorName("Test");
             screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
             scrollBy();
             
             CLDLPM.employerIndustry("Education");
             CLDLPM.EmployerNameHigh();
             CLDLPM.employerIncorporationCountry("american samoa");
             CLDLPM.EmploymentType("Government Sector");
             CLDLPM.EmployerCountryResidence("Oman");
             CLDLPM.EmployerActivity();
             CLDLPM.HouseNO("111");
             CLDLPM.BuildingName("Avipsa");
             CLDLPM.BuildingNOHigh("121");         
             CLDLPM.StreetName("121");
             
             CLDLPM.StreetNO("hello123");
             CLDLPM.Area("Area");
             CLDLPM.City("cITY");
             screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
             scrollBy();
             CLDLPM.StateCountry("american samoa");
             CLDLPM.sePOAHolder("No");
             CLDLPM.IndividualsOrEntities("No");
             CLDLPM.OriginatorPartyNationality("american samoa");
             CLDLPM.OriginatorPartyName("Hello");
             CLDLPM.OriginatorBankName("bsiahl");
             CLDLPM.OriginatorAccountNumber("92829213");
             CLDLPM.Natureofrelationship("hellooo");
             CLDLPM.AttachProofClick();
             //CLDLPM.RCVOrSndMoney("No");
             CLDLPM.Sendmoneytocountry("No");
             CLDLPM.IES("No");
             CLDLPM.CstmrMntnRelationshipOtherOmani("No");
             screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
             scrollBy();
             CLDLPM.CstmrMntnRelationshipwithForeign("No");
             CLDLPM.DtlsOfAssociated("No");
             screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
             scrollBy();
             CLDLPM.saveAndProceed();
             Thread.sleep(3000);

             
    		}
    	@Test(priority=5)
 		public void SC_013_TC_005() throws Exception
 		{	
    	Thread.sleep(3000);
    	screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	CLDLPM.NotificationPOPUPClose();
        Thread.sleep(1000);
    	lopm.GetLeadId();
    	scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	QuiteBrowser();
    	
    	
	}
    
    	  @Test(priority=6)
    		public void SC_013_TC_006() throws Exception
    		{
    	    	launchBrowser();
    	    	Thread.sleep(1000);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	    	TestDataFromExcel.DataRead();
    	    	Thread.sleep(500);
    	 		EnterUserName(TestDataFromExcel.Checker);
    	 		Thread.sleep(1000);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        EnterPassword(TestDataFromExcel.Password);
    	        LoginButtonClick();
    	        Thread.sleep(1000);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        CheckRole();
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        ClickOnLeadswidget();
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        lopm.categoryview("Retail Leads");
    	        lopm.selfassignlead("Open A/c Verification Pending Retail");
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        lopm.leadview("My Leads");
    	        lopm.onMyBucketlead();   
    	        Thread.sleep(2000);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        lopm.GetLeadId();
    	        CLDLPM.getriskcategory();
    	        lopm.ClickAMLResponse();
    	        CLDLPM.getStatusCode();
    	        
    	        if (LeadCollectionPageMethod.Leadstatus.equalsIgnoreCase("Verification Pending"))
    	        {
    				        	
    				        	if (LeadCollectionPageMethod.Leadstatus.equalsIgnoreCase("Verification Pending") && LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase(""))
    				            {
    				             	
    				        	CLDLPM.NotificationPOPUPClose();
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            scrollBy();
    				            Thread.sleep(500);
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            scrollBy();
    				            Thread.sleep(500);
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            scrollBy();
    				            Thread.sleep(500);
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            scrollBy();
    				            Thread.sleep(500);
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            scrollBy();
    				            Thread.sleep(500);
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            lopm.clickAMLButton();
    				            Thread.sleep(1000);
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            lopm.RecordupdatePopUpConfirmation();
    				            Thread.sleep(1000);
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				          //  CLDLPM.NotificationPOPUPClose();
    				            screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				            lopm.ClickAMLResponse();
    				            
    				            
    				
    				            if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Found") || LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Pending with AML")||LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase(""))
    				            
    				            { 
    				            	token.Token();
    				            	aml.AMLServicesCall();
    				            	Refresh();
    				            	//lopm.VerifiedbyCheckerBtn();
    				            	//lopm.RecordupdatePopUpConfirmation();
    							            	
    							 }
    							           
    				             // lopm.DetailsCorporate();
    				             lopm.ClickAMLResponse();
    				           
    				              if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Not Found"))
    				               	
    				               {   
    				              
    				              if (LeadCollectionPageMethod.riskcategory.equalsIgnoreCase("Low"))
    				            	  
    				              {
    				            	  Refresh();
    				                  lopm.VerifiedbyCheckerBtn();
    				                  lopm.RecordupdatePopUpConfirmation();
    				                  
    				                 scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        lopm.clickGenerateCIFButton();
    				  		        Thread.sleep(6000);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        lopm.RecordupdatePopUpConfirmation();
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        Thread.sleep(6000);
    				  		        CLDLPM.NotificationPOPUPClose();
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				  		        Thread.sleep(500);
    				  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    				  		        scrollBy();
    				                 	
    				              }
    	               		       
    				              else
    				            	  
    				              {
    				            	Refresh();
    				               	lopm.SendtoAuthorizerBtn();
    				               	lopm.RecordupdatePopUpConfirmation();
    				               	
    				                scrollBy();
    						        Thread.sleep(500);
    						        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    						        scrollBy();
    						        Thread.sleep(500);
    						        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    						        scrollBy();
    						        Thread.sleep(500);
    						        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    						        scrollBy();
    						        Thread.sleep(500);
    						        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    						        scrollBy();
    						        Thread.sleep(500);
    						        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    						        CLDLPM.NotificationPOPUPClose();
    						        Thread.sleep(500);
    						        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    						      
    				              }
    	 
    	 
    				               }
    	           
    	        
    	       
    						       
    	        
    	                            }
    	        
    	        }
    	        
    	       CLDLPM.getStatusCode();
    	        	 
    	       if (LeadCollectionPageMethod.Leadstatus.equalsIgnoreCase("Verification Pending"))
    	       {
    	 
    	            	if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Found") || LeadObjectPageMethod.AmlCheckvalue.equals("Pending with AML")||LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase(""))
    	            
    	            	{ 
    	            	token.Token();
    	            	aml.AMLServicesCall();
    	            	Refresh();
    	            	//lopm.VerifiedbyCheckerBtn();
    	            	//lopm.RecordupdatePopUpConfirmation();
    	            	
    	            	}
    	           
    	            	//lopm.DetailsCorporate();
    	            	lopm.ClickAMLResponse();
    	           
    	            	if (LeadObjectPageMethod.AmlCheckvalue.equalsIgnoreCase("Match Not Found") )
    	            	{
    	               	
    	            		 if (LeadCollectionPageMethod.riskcategory.equalsIgnoreCase("Low"))
    			            	  
    			              {
    			            	  Refresh();
    			                  lopm.VerifiedbyCheckerBtn();
    			                  lopm.RecordupdatePopUpConfirmation();
    			                  
    			                 scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        lopm.clickGenerateCIFButton();
    			  		        Thread.sleep(6000);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        lopm.RecordupdatePopUpConfirmation();
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        Thread.sleep(6000);
    			  		        CLDLPM.NotificationPOPUPClose();
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			  		        Thread.sleep(500);
    			  		        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    			  		        scrollBy();
    			                 	
    			              }
    	          		       
    			              else
    			            	  
    			              {
    			            	Refresh();
    			               	lopm.SendtoAuthorizerBtn();
    			               	lopm.RecordupdatePopUpConfirmation();
    			               	
    			                scrollBy();
    					        Thread.sleep(500);
    					        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    					        scrollBy();
    					        Thread.sleep(500);
    					        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    					        scrollBy();
    					        Thread.sleep(500);
    					        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    					        scrollBy();
    					        Thread.sleep(500);
    					        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    					        scrollBy();
    					        Thread.sleep(500);
    					        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    					        CLDLPM.NotificationPOPUPClose();
    					        Thread.sleep(500);
    					        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    					      
    			              }

    	           
    	            	}
    	            	
    	        }
    	        
    		
    	       
    	    CLDLPM.getStatusCode();
    	        	 
    	    if (LeadCollectionPageMethod.Leadstatus.equalsIgnoreCase("Pending at Checker") && LeadCollectionPageMethod.riskcategory.equalsIgnoreCase("Low"))
    	       
    	    {
    	       
    	    	scrollBy();
    	        Thread.sleep(500);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        scrollBy();
    	        Thread.sleep(500);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        scrollBy();
    	        Thread.sleep(500);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        scrollBy();
    	        Thread.sleep(500);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        scrollBy();
    	        Thread.sleep(500);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	        CLDLPM.NotificationPOPUPClose();
    	        Thread.sleep(500);
    	        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	       
    	       
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
    
    @Test(priority=7)
	public void SC_013_TC_007() throws Exception
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.Authorizer);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        clk_leadobject();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.categoryview("Retail Leads");
        lopm.selfassignlead("Pending with Authorizer Oman Retail");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.leadview("My Leads");
        lopm.onMyBucketlead();   
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        CLDLPM.getStatusCode();
    	lopm.GetLeadId();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.ApprovedbyAuthorizerBtn();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.RecordupdatePopUpConfirmation();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        QuiteBrowser();
        
        
       
        

	}
    
    @Test(priority=8)
	public void SC_013_TC_008() throws Exception
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.ComplianceMaker );
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        clk_leadobject();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.categoryview("Retail Leads");
        lopm.selfassignlead("Pending with Compliance Maker Oman Retail");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.leadview("My Leads");
        lopm.onMyBucketlead();   
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        CLDLPM.getStatusCode();
    	lopm.GetLeadId();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.approvedByComplianceMaker();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.complianceComment("COMMENTS");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.clickUpdate();
        Thread.sleep(2000);
        lopm.RecordupdatePopUpConfirmation();
        Thread.sleep(2000);
        CLDLPM.NotificationPOPUPClose();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        QuiteBrowser();

	}
    
    @Test(priority=9)
	public void SC_013_TC_009() throws Exception
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.ComplianceChecker);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        ClickOnLeadswidget();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.categoryview("Retail Leads");
        lopm.selfassignlead("Pending with Compliance Checker Oman Retail");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.leadview("My Leads");
        lopm.onMyBucketlead();   
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        CLDLPM.getStatusCode();
    	lopm.GetLeadId();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.approvedByComplianceChecker();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.RecordupdatePopUpConfirmation();
        Thread.sleep(2000);
        CLDLPM.NotificationPOPUPClose();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        QuiteBrowser();

	}
    
    @Test(priority=10)
	public void SC_013_TC_010() throws Exception
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.Checker);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CheckRole();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        ClickOnLeadswidget();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.categoryview("Retail Leads");
        Thread.sleep(2000);
        lopm.selfassignlead("Approved by Authorizer/Compliance fr A/C Opening R");
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.leadview("My Leads");
        lopm.onMyBucketlead();   
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        CLDLPM.getStatusCode();
    	lopm.GetLeadId();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.clickGenerateCIFButton();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        lopm.RecordupdatePopUpConfirmation();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        CLDLPM.NotificationPOPUPClose();
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
        scrollBy();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_013_Lead_RetailJourneyLow-");
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
