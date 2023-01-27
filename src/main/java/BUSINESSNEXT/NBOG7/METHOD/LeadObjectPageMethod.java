package BUSINESSNEXT.NBOG7.METHOD;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import BUSINESSNEXT.NBOG7.OBJECT.*;


public class LeadObjectPageMethod extends HomePageMethod{

   public static String leadid;
   public static String AmlCheckvalue;
   
   public void GetLeadId()
	  {
	   leadid=LeadObjectPageObject.get_leadIDCreated.getText();
	     System.out.println("Lead created succesfully ,Lead id:"+leadid);
	  }

   public void ClickOnOnBoardingJourney()

	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_salesonbaordingjourney.click();
	}


   public void categoryview(String Leadcategoryview) throws InterruptedException

	{
	        Select bucket2 = new Select(LeadObjectPageObject.sel_leadView);
          bucket2.selectByVisibleText(Leadcategoryview);
	}
  
   
   

   public void selfassignlead(String Leadview) throws InterruptedException

	{

		    
		    leadview(Leadview);
		    LeadObjectPageObject.clk_arrorw.click();
		    Thread.sleep(1000);
		    LeadObjectPageObject.clk_selectlead.click();
			Thread.sleep(1000);
			LeadObjectPageObject.clk_selfassignlead.click();
		    Thread.sleep(3000);
			LeadObjectPageObject.clk_closeProcessApplicationPopup.click();

		    Thread.sleep(1000);
	}


		    public void leadview(String leadview) throws InterruptedException

			{
				    
				    Select View = new Select(LeadObjectPageObject.clk_selectview);
				    View.selectByVisibleText(leadview);
				    Thread.sleep(2000);
				    
			}


   public void onMyBucketlead() throws InterruptedException

	{

	   LeadObjectPageObject.clk_selectthelead.click();

	}

   public void saveAndProceed()

 	{
 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	  LeadObjectPageObject.clk_saveandproceed.click();
 	}
   public void ClickOnRetailOnboarding()

	{
	   LeadObjectPageObject.clk_retailOnboardingOman.click();

	}
   public void ClickOnCorporateOnboarding()

	{
	   LeadObjectPageObject.clk_corporateOnboardingOman.click();

	}
   
   public void clickAMLButton()


   {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,250)", "");
		 *///driver.switchTo( ).alert( ).dismiss();
	   LeadObjectPageObject.clk_ldAMLBtn.click();
  

   }

public void ApprovedbyAuthorizerBtn()
{
	LeadObjectPageObject.clk_ldApprovedbyAuthorizerBtn.click();
  

   }

public void SendtoAuthorizerBtn()
{
	LeadObjectPageObject.clk_ldSendtoAuthorizerBtn.click();
  

   }
public void approvedByComplianceMaker()
{
	LeadObjectPageObject.clk_ldComplianceMakerBtn.click();
  

   }

public void approvedByComplianceChecker()
{
	LeadObjectPageObject.clk_ldComplianceCheckerBtn.click();
  

   }



public void clickGenerateCIFButton()
   {
	LeadObjectPageObject.clk_ldGenerateCIFBtn.click();
  
   }

   public void ClickOnboardCustomer()

 	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_OnboardCustomer.click();
 	}
   public void ClickOnNMDDtab()

	{
	   LeadObjectPageObject.clk_NMDDtab.click();

	}
   
   public void ClickOnClose()

  	{
  	   LeadObjectPageObject.btn_close.click();

  	}
   
		
		   public void closeContact1()
		   {
			   LeadObjectPageObject.clk_closeContact1.click();
			   
			   
			   
		   }
		   public void closeContact2()
		   {
			   LeadObjectPageObject.clk_closeContact2.click();
			   
			   
			   
		   }
		  
		   
//Click on Activities tab on lead detail page
public void ClickOnActivitiestab()

	{
	LeadObjectPageObject.clk_Activitiestab.click();

	}


   public void ProcessApplication()

 	{
 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_ProcessApplication.click();


 	}
   public void update360() throws InterruptedException

	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_update360.click();
	   Thread.sleep(1000);
	   LeadObjectPageObject.clk_closeProcessApplicationPopup.click();



	}

   public void BmApproveButtonclk() throws InterruptedException

	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_BmApproveBttn.click();
	   Thread.sleep(1000);
	}
  


   public void SwitchToSecondaryWindow()

   {
   	//String mainWindowHandle = driver.getWindowHandle();
       //System.out.println("Main Window"+mainWindowHandle);
       Set<String> multiplewindows=driver.getWindowHandles();
       Iterator<String> iterator = multiplewindows.iterator();
       String mainWindow = iterator.next();
       String ChildWindow = iterator.next();
       driver.switchTo().window(ChildWindow);

   }

   public void SwitchToParentWindow()

   {
   	//String mainWindowHandle = driver.getWindowHandle();
       //System.out.println("Main Window"+mainWindowHandle);
       Set<String> multiplewindows=driver.getWindowHandles();
       Iterator<String> iterator = multiplewindows.iterator();
       String mainWindow = iterator.next();
       driver.switchTo().window(mainWindow);

   }

   public void BmApproveComments(String BmComment) throws InterruptedException
   {
	   LeadObjectPageObject.clk_BmComments.sendKeys(BmComment);

	}

   public void BmApproveUpdate() throws InterruptedException
   {
	   LeadObjectPageObject.clk_update360.click();
	   Thread.sleep(1000);
	   LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
	}



   public void popupdate360(String popupdt360)

   {
   	Select sel1=new Select(LeadObjectPageObject.Sel_popupdt360);
   	sel1.selectByVisibleText(popupdt360);
   }

   public void RecordupdatePopUpConfirmation()

	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	   LeadObjectPageObject.clk_closeProcessApplicationPopup.click();


	}



	public void ClickPlusSign()

	{
		LeadObjectPageObject.clk_plussign.click();
	}

	public void ClickSavingAndDepositeLink() throws InterruptedException

	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", LeadObjectPageObject.link_SavingsandDeposits);

	}


public void ClickOnSaveAndProceed() throws InterruptedException

	{
	JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", LeadObjectPageObject.btn_SaveandProceed);

	}

public void ClickOnSaveAndProceedEdit() throws InterruptedException

	{		HomePageObject.btn_SaveandProceed_edit.click();

	}

public void ClickCorporateLoanLink() throws InterruptedException

{
	LeadObjectPageObject.link_CorporateLoan.click();

}

public void ClickOnEditButton()

{
	LeadObjectPageObject.btn_ClickOnEditButton.click();
}
public void ClickOnUpdtButton()

{
	LeadObjectPageObject.btn_ClickOnUpdtButton.click();
}


public void Clicksearchaftertype()

{
	LeadObjectPageObject.btn_Clickleadsearch.click();
}



public void ClickOnAdvancesearched() throws InterruptedException

{
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
    //executor.executeScript("arguments[0].click();", HomePageObject.btn_Advancesearched);
 HomePageObject.btn_Advancesearched.click();

}

public String ExtractLeadid()

{
	leadid =LeadObjectPageObject.extra_Leadid.getText();
	return leadid;
}
public void ClickOnOnBoardingJourneyNonIndi()

{
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	driver.findElements(By.id("1")).get(2).click();
  // LeadObjectPageObject.clk_salesonbaordingjourney.get(2).click();;
}


public void ClickAMLResponse()

{
	AmlCheckvalue=LeadObjectPageObject.txt_AML_Check.getText();
	System.out.print(AmlCheckvalue);
	
}


public void VerifiedbyCheckerBtn()


{
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,250)", "");
		 *///driver.switchTo( ).alert( ).dismiss();
	   LeadObjectPageObject.btn_VerifiedbyChecker.click();


}

}
