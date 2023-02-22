package BUSINESSNEXT.NBOG7.METHOD;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BUSINESSNEXT.NBOG7.OBJECT.*;

public class LeadCollectionPageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;
	public static String Employeetype;
	public static String Leadstatus;
	public static String riskcategory;

//************************Fill the Info for new lead process*****************************-------------//
//NBO
	public void SalutationID(String Salute) {
		Select sal = new Select(LeadCollectionPageObject.sel_ldSalutation);
		// sal.selectByValue(Salute);
		sal.selectByVisibleText(Salute);
	}
	
	public void customerSegment(String Salute) {
		Select sal = new Select(LeadCollectionPageObject.sel_ldcustomerSegment);
		sal.selectByVisibleText(Salute);
	}
	
	
	public void entityOman(String Salute) {
		Select sal = new Select(LeadCollectionPageObject.sel_ldEntityOman);
		sal.selectByVisibleText(Salute);
	}
	
	public void entityOtherCountry(String Salute) {
		Select sal = new Select(LeadCollectionPageObject.sel_ldEnityOtherCountry);
		sal.selectByVisibleText(Salute);
	}
	
	public void CustomerName()
	{
		Random r = new Random();
		 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    final int N = 6;
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < N; i++) {
		        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		    }
		    String firstname = sb.toString();
		    LeadCollectionPageObject.ent_ldcustomerName.sendKeys(firstname);
		     }
	public void companyName()
	{
		Random r = new Random();
		 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    final int N = 6;
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < N; i++) {
		        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		    }
		    String firstname = sb.toString();

		    LeadCollectionPageObject.ent_ldcompanyName.sendKeys(firstname);
		    }
	
	public void DateOfBirth(String date)
	{

		    LeadCollectionPageObject.ent_ldDateofBirth.sendKeys(date);
		    }
	public void DateOfEstablishment(String date)
	{

		    LeadCollectionPageObject.ent_ldDateofEstablishment.sendKeys(date);
		    }
	
	public void IDCardNo()
    {

Random rand = new Random();
int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
int num2 = rand.nextInt(743);
int num3 = rand.nextInt(10000);

DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

String mnumbername = df3.format(num1) + df3.format(num2)  + df4.format(num3);
SDmobilenumber=mnumbername;
LeadCollectionPageObject.ent_ldldCardNo.sendKeys(mnumbername);

    }
	public void CRno(){
		IDCardNo();
	}
	
	public void IDCardExpiry() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now().plusYears(3);   
		LeadCollectionPageObject.ent_ldIDCardExpiry.sendKeys(dtf.format(now));
	}
	
	public void passportExpiry() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now().plusYears(3);   
		LeadCollectionPageObject.ent_ldPassportExpiry.sendKeys(dtf.format(now));
		
	}
	
	public void visaExpiry() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now().plusYears(3);   
		LeadCollectionPageObject.ent_ldvisaExpiry.sendKeys(dtf.format(now));
		
	}
	
	public void CRExpiry() {
		
		IDCardExpiry();
	}
	
	 public void EmployerType(String type) throws InterruptedException
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldEmployerType);
	    	//sel.selectByValue(Product);
	    	sel.selectByVisibleText(type);
	    	Thread.sleep(1000);
	    }
	 public void dateOfRegistration(String type)
	    {
	    	LeadCollectionPageObject.ent_ldDateofRegistration.sendKeys( type);
	    }
	 
	 public void placeOfRegistration(String type)
	    {
	    	LeadCollectionPageObject.ent_ldRegistrationPlace.sendKeys(type);
	    }
	 public void entityType(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldEntityType1);
	    	//sel.selectByValue(Product);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void customerProfession(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldCustomerProfession;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void subIndustryCorporate(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldSub_Industry;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void Industry(String Industry) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldIndustry;
	    	clients.sendKeys(Industry);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 
	 
	 public void NatureOfBusiness(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldNatureOfBusiness;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void IndustrySector(String IndustrySec) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_IndustrySector;
	    	clients.sendKeys(IndustrySec);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 
	 public void subIndustry(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldCustomerProfession;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void AnalysisCode(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldAnalysisCode;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void AccountType(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldAccountType);
	    	//sel.selectByValue(Product);
	    	sel.selectByVisibleText(type);
	    }
	 public void p5UserCode(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldp5UserCode);
	    	//sel.selectByValue(Product);
	    	sel.selectByVisibleText(type);
	    }
	 
	 
	 public void AccountShortName(String name)
		{

			    LeadCollectionPageObject.ent_AccountShortName.sendKeys(name);
			    }
	 
	 
	 public void otherincome(String name)
		{

			    LeadCollectionPageObject.ent_otherincome.sendKeys(name);
			    }
	 
	 
	 public void shortName(String name)
		{

			    LeadCollectionPageObject.ent_ldshortName.sendKeys(name);
			    }
	 
	 public void ProductsAndServices(String product) throws InterruptedException {
		 LeadCollectionPageObject.clk_PSpicker.click();
		 Thread.sleep(700);
		 WebElement clients= LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(product);
		 Thread.sleep(500);

		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldPSproductselect.click(); 
	 }
	 
	 public void EnterMobile() {
			Random rand = new Random();
			int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
			int num2 = rand.nextInt(743);
			int num3 = rand.nextInt(10000);

			DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
			DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

			String mnumbername = "9"+df3.format(num1) + df3.format(num2) + df4.format(num3)+"7";
			SDmobilenumber = mnumbername;
			LeadCollectionPageObject.ent_ldMobile.sendKeys(mnumbername);
		}
	 
	 
	 public void Literacy(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldLiteracy);
	    	//sel.selectByValue(Product);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void LeadSource(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldLeadSource);
	    	//sel.selectByValue(Product);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void PurposeOfAccount(String type1) throws InterruptedException {
		 
		 
		 LeadCollectionPageObject.clk_PApicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
			clients.sendKeys(type1);
			 Thread.sleep(800);

			clients.sendKeys(Keys.ENTER);
			 Thread.sleep(1000);

		 LeadCollectionPageObject.clk_ldcheckboxPOA.click();
		 Thread.sleep(100);
		 LeadCollectionPageObject.clk_ldOKbutton.click(); 
	 }
	

	 
	 
	 public void staffCode() throws InterruptedException {
		 LeadCollectionPageObject.clk_staffCodepicker.click();
		 Thread.sleep(500);
		 LeadCollectionPageObject.clk_staffcode.click();
		 
	 }
	 public void PEPStatus(String type1) throws InterruptedException {
		 LeadCollectionPageObject.clk_PEPpicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type1);
		 Thread.sleep(800);

		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(500);
		 LeadCollectionPageObject.clk_ldPEPStatusselect.click();
	 }
	 
	 public void PEPStatusCorporate(String type1) throws InterruptedException {
		 LeadCollectionPageObject.clk_PEPpickerCorporate.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type1);
		 Thread.sleep(500);

		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(700);
		 LeadCollectionPageObject.clk_ldPEPStatusselect.click();
	 }
	 
	 public void AverageExpectedTransaction(String type1) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldAverageExpectedTransactionpicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type1);
		 Thread.sleep(100);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(800);
		 LeadCollectionPageObject.clk_ldScreeningvalueselect.click();
	 }
	 
	 public void LengthofIncorporation(String type1) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldLengthOfIncorporationpicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type1);
		 Thread.sleep(1000);

		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldScreeningvalueselect.click();
	 }
	 
	 public void OwnershipStructure(String type1) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldOwnershipStructurepicker.click();
		 Thread.sleep(800);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type1);
		 Thread.sleep(800);

		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(800);
		 LeadCollectionPageObject.clk_ldScreeningvalueselect.click();
	 }
	 
	 
	 public void Screeningmatches(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_screeningMatchespicker.click();
		 Thread.sleep(900);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1100);
		 LeadCollectionPageObject.clk_ldScreeningvalueselect.click();
	 }
	 public void ScreeningmatchesCorporate(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_screeningMatchespickerCorporate.click();
		 Thread.sleep(800);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldScreeningvalueselect.click();
	 }
	 
	 public void CountryofIncorporation(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldCountryofIncorporationpicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(800);
		 LeadCollectionPageObject.clk_ldOriginCountry1name.click();
	 }
	 
	 public void CountryofOperations(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldCountryofOperationspicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(700);
		 LeadCollectionPageObject.clk_ldOriginCountry1name.click();
	 }
	 
	 public void CountryofResidenceofSuppliers(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldCountryofResidenceofSuppliersPicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(500);
		 LeadCollectionPageObject.clk_ldOriginCountry1name.click();
	 }
	 
	 public void CountryofResidenceofApplicantEntity(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldCountryofResidenceofApplicantEntitypicker.click();
		 Thread.sleep(1000);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		 Thread.sleep(500);
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldOriginCountry1name.click();
		 Thread.sleep(1000);
	 }
	 
	 


	 
	 public void HNWIStatus(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldHNWIStatus);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void CaptureAssociatedPartyInfo(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldCaptureAssociateParty);
	    	sel.selectByVisibleText(type);
	    }
	 public void shareholderowning10ormore(String type)
	    {
		 CaptureAssociatedPartyInfo(type);
		 
	    }
	 
	 
	 public void Surname(String type)
	    {
	    	LeadCollectionPageObject.ent_ldSurname.sendKeys("type");
	    }
	 
	 public void Residencestatus(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldresidenceStatus);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void Buildingno(String type)
	    {
	    	LeadCollectionPageObject.ent_ldbuildingno.sendKeys(type);
	    }
	 
	 public void wayNo(String type)
	    {
	    	LeadCollectionPageObject.ent_ldwayno.sendKeys(type);
	    }
	 
	 public void villaNo(String type)
	    {
	    	LeadCollectionPageObject.ent_ldvillano.sendKeys(type);
	    }
	 
	 public void Wilayat(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldWilayat);
	    	sel.selectByVisibleText(type);
	    } 
	 
	 public void Location(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldLocation;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 
	 
	 
	 
	 
	 
	 
	 public void Designation(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldDesignation;
	    	clients.sendKeys(salesID);
			Thread.sleep(1200);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(800);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void Employer(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldemployer.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldcompanycode.click();
	 }
	 
	 
	 
	 public void POCode(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldPOCode;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void POCodeCorporate(String salesID) throws InterruptedException
	    {
	    	WebElement clients= LeadCollectionPageObject.pic_ldPOCodeCorporate;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 
	 public void PObox(String salesID) throws InterruptedException
	    {
	     LeadCollectionPageObject.ent_ldPOBox.sendKeys(salesID);;
	    	
			}
	 
	 public void POboxCorporate(String salesID) throws InterruptedException
	    {
	     LeadCollectionPageObject.pic_ldPOBoxCorporate.sendKeys(salesID);;
	    	
			}
	 
	 public void AverageExpectedTransactionValuePerAnnum(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldAETVpicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(900);
		 LeadCollectionPageObject.clk_ldScreeningvalueselect.click();
	 }
	 
	 public void relationshipAndServicingMethod(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldRSMpicker.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(500);
		 LeadCollectionPageObject.clk_ldSourcingcode.click();
	 }
	 
	 public void originCountry1(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldOriginCountry1.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1100);
		 LeadCollectionPageObject.clk_ldOriginCountry1name.click();
	 }
	 public void destinationCountry1(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldDestinationCountry1.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldOriginCountry1name.click();
	 }
	 public void sourceOfFunds(String type) throws InterruptedException {
		 LeadCollectionPageObject.clk_ldSourceOfFunds.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(900);
		 LeadCollectionPageObject.clk_ldSourceoffundSelect.click();
	 }
	 
	 public void MonthlyIncome(String salesID) throws InterruptedException
	    {
	     LeadCollectionPageObject.ent_ldMonthlyIncome.sendKeys(salesID);;
	    	
			}
	 
	 //KYC
	 
	 public void PlaceOfBirth(String salesID) throws InterruptedException
	    {
	     LeadCollectionPageObject.ent_ldPlaceOfBirth.sendKeys(salesID);;
	    	
			}
	 
	 public void CountryOfBirth(String salesID) throws InterruptedException
	    {			Thread.sleep(500);

	    	WebElement clients= LeadCollectionPageObject.pic_ldCountryOfBirth;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ENTER);
			}
	 public void countryofIncorporation(String salesID) throws InterruptedException
	    {			Thread.sleep(500);

	    	WebElement clients= LeadCollectionPageObject.SEL_ldCountryofIncorporation;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ENTER);
			}
	 public void ResidenceCountry(String salesID) throws InterruptedException
	    {			
		 
		    Thread.sleep(1000);
		    WebElement clients= LeadCollectionPageObject.SEL_ldResidenceCountry;
	    	clients.sendKeys(salesID);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			clients.sendKeys(Keys.ENTER);
			}
	 
	 public void GreenCardHolderFlag(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldgreencard);
	    	sel.selectByVisibleText(type);
	    }
	 
	 
	 public void MakeOngoingPayment(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldMakeOngoingPayment);
	    	sel.selectByVisibleText(type);
	    }
	 
	 
	 public void getStatusCode() 
	 
	 {
		    Leadstatus=LeadCollectionPageObject.get_leadStatusCode.getText();
		    System.out.println("Lead Status is: "+Leadstatus);
		    
		
	   }
	 
	 
     public void getriskcategory() 
	 
	 {
	
	        riskcategory=LeadCollectionPageObject.get_riskcategory.getText();
		    System.out.println("Risk Category is: "+riskcategory);
		    
		
	   }

	 
	   public void waitTillNextStatusCode(String nextstatuscode) throws InterruptedException {
		  do{
			  //Refresh();
			  wait();
			 // Thread.sleep(1500);
			  
		  }   while(Leadstatus.equalsIgnoreCase(nextstatuscode));
		  
	   }
	  
	   
	 public void USTax(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldUSTax);
	    	sel.selectByVisibleText(type);
	    }
	 public void USCitizen(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldUSCitizen);
	    	sel.selectByVisibleText(type);
	    }
	 public void USPassport(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldUSpassHolder);
	    	sel.selectByVisibleText(type);
	    }
	 
	
	 
	 
	 
	 public void saveAndProceed() throws InterruptedException

	 	{
	 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
           Thread.sleep(1000);
		 LeadCollectionPageObject.clk_saveandproceed.click();
	 	}
	 
	 
	 public void clickknext() throws InterruptedException

	 	{
	 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        Thread.sleep(1000);
		 LeadCollectionPageObject.clk_Next.click();
	 	}
	 
	 
	 
//high risk form
	 public void Purposeofrequesting(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldPurposeofrequesting.sendKeys(value);;
	 	}
	 
	 public void Alreadyborrowingrelationship(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldAlreadyborrowingrelationship);
	    	sel.selectByVisibleText(type);
	    }
	 public void lookingforborrowingrelationship(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldlookingforborrowingrelationship);
	    	sel.selectByVisibleText(type);
	    }
	 public void customerIsSelfEmployed(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldcustomerIsSelfEmployed);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void LengthOfBusiness(String type)
	    {
	    	LeadCollectionPageObject.ent_ldLengthOfBusiness.sendKeys(type);
	    }
	 
	 public void profileOfCompany(String type)
	    {
	    	LeadCollectionPageObject.ent_ldProfileOfCountry.sendKeys(type);
	    }
	 
	 public void typeOfProduct(String type)
	    {
	    	LeadCollectionPageObject.ent_ldTypeOfProduct.sendKeys(type);
	    }
	 
	 public void Trade(String type)
	    {
	    	LeadCollectionPageObject.ent_ldTrade.sendKeys(type);
	    }
	 
	 public void MainOriginOfBusiness(String type)
	    {
	    	LeadCollectionPageObject.ent_ldMainOriginOfBusiness.sendKeys(type);
	    }
	 public void BusinessProfile(String type)
	    {
	    	LeadCollectionPageObject.ent_ldBusinessProfile.sendKeys(type);
	    }
	 public void NotBeRoutingFunds(String type)
	    {
	    	LeadCollectionPageObject.ent_ldNotBeRoutingFunds.sendKeys(type);
	    }
	 
	 public void CharitableServices(String type)
	    {
		 Select sel=new Select(LeadCollectionPageObject.sel_ldCharitableServices);
	    	sel.selectByVisibleText(type);
	    }
	 
	 
	 public void IntoExchangeMoney(String type)
	    {
		 Select sel=new Select(LeadCollectionPageObject.sel_ldIntoExchangeMoney);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void PresenceInDifferentCountry(String type)
	    {
		 Select sel=new Select(LeadCollectionPageObject.sel_ldPresenceInDifferentCountry);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void NoOfPersonEmployed(String type)
	    {
		 Select sel=new Select(LeadCollectionPageObject.sel_ldNoOfPersonEmployed);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void VisaSponsorName(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldVisaSponsorName.sendKeys(value);
	 	}
	 
	 public void BuildingName(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldBuildingName.sendKeys(value);
	 	}
	 
	 public void EmployerPO(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldEmployerPO.sendKeys(value);
	 	}
	 public void EmployerNameHigh() throws InterruptedException

	 	{
		 Random r = new Random();
		 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    final int N = 6;
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < N; i++) {
		        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		    }
		    String firstname = sb.toString();
		 LeadCollectionPageObject.ent_ldEmployerNameHigh.sendKeys(firstname);
	 	}
	 public void employerIndustry(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldEmployerIndustryClick.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldScreeningvalueselect.click();
	 }
	 
	 public void OriginatorPartyNationality(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldOriginatorPartyNationality.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldIssuingCountry.click();
	 }
	 
	 public void employerIncorporationCountry(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldEmployerIncorporationCountryClick.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldIssuingCountry.click();
	 }
	 
	 public void StateCountry(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldStateCountry.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldIssuingCountry.click();
	 }
	 
	 
	 public void EmploymentType(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldEmploymentType);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void IndividualsOrEntities(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldIndividualsOrEntities);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void sePOAHolder(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldPOAHolder);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void EmployerCountryResidence(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldEmployerCountryResidence.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldIssuingCountry.click();
	 }
 public void EmployerActivity() throws InterruptedException {
		 
		 
		 LeadCollectionPageObject.pic_ldEmployerActivityClick.click();
		 Thread.sleep(500);


		 LeadCollectionPageObject.clk_ldcheckboxPOA.click();
		 Thread.sleep(100);
		 LeadCollectionPageObject.clk_ldOKbutton.click(); 
	 }
	 
	 
	 
	 public void HouseNO(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldHouseNO.sendKeys(value);
	 	}
	 public void StreetName(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldStreet1.sendKeys(value);
	 	}
	 public void City(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldCity.sendKeys(value);
	 	}
	 
	 public void Area(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldArea.sendKeys(value);
	 	}
	 
	 public void StreetNO(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldStreetNO.sendKeys(value);
	 	} 
	 
	 public void BuildingNOHigh(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldBuildingNOHigh.sendKeys(value);
	 	} 
	 
	 public void Natureofrelationship(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldONatureofrelationship.sendKeys(value);
	 	}
	 public void OriginatorAccountNumber(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldOriginatorAccountNumber.sendKeys(value);
	 	}
	 
	 public void OriginatorPartyName(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldOriginatorPartyName.sendKeys(value);
	 	}
	 
	 public void OriginatorBankName(String value) throws InterruptedException

	 	{
		 LeadCollectionPageObject.ent_ldOriginatorBankName.sendKeys(value);
	 	}
	
public void AttachProofClick() throws InterruptedException {
		 
		 
		 LeadCollectionPageObject.pic_ldAttachProofClick.click();
		 Thread.sleep(1000);

		 LeadCollectionPageObject.pic_ldAttachProofSelect.click();
		 Thread.sleep(100);
		
	 }
	 
	 public void RCVOrSndMoney(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldRCVOrSndMoney);
	    	sel.selectByVisibleText(type);
	    }
	 
	 
	 public void Sendmoneytocountry(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_Sendmoneytocountry);
	    	sel.selectByVisibleText(type);
	    }
	 public void ManagaedByNaturalPerson(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldRCVOrSndMoney);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void BusinessInHighRisk(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldBusinessInHighRisk);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void IntstInHighRiskIndustry(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldIntstInHighRiskIndustry);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void IES(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldIES);
	    	sel.selectByVisibleText(type);
	    }
	 public void IESCorporate(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldIESCorporate);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void CstmrMntnRelationshipOtherOmani(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldCstmrMntnRelationshipOtherOmani);
	    	sel.selectByVisibleText(type);
	    }
	 public void CstmrMntnRelationshipwithForeign(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldCstmrMntnRelationshipwithForeign);
	    	sel.selectByVisibleText(type);
	    }
	 public void DtlsOfAssociated(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldDtlsOfAssociated);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void PerformedSiteVisit(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldPerformedSiteVisit);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void PleaseJustify(String type)
	    {
	    LeadCollectionPageObject.ent_ldPleaseJustify.sendKeys(type);
	    }
	 
	 
	 //
	 
//CRS
	 public void CareofAddressApplicable(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldcareOfAddress);
	    	sel.selectByVisibleText(type);
	    }
	 public void SelfCertificationRequired(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldSelfCertification);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void ClassificationOfEntity(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldClassificationOfEntity);
	    	sel.selectByVisibleText(type);
	    }
	 public void StandingInstructiontoTransfer(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldstandingInstruction);
	    	sel.selectByVisibleText(type);
	    }
	 public void InternationalPhoneNumber(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldInternationalPhoneNumber);
	    	sel.selectByVisibleText(type);
	    }
	 public void MultipleNationality(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldMultipleNationality);
	    	sel.selectByVisibleText(type);
	    }
	 public void ChangeinCircumstance(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldchangeInCircumstance);
	    	sel.selectByVisibleText(type);
	    }
	 public void POASignatoryAuthorityControlling(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldPOASignatory);
	    	sel.selectByVisibleText(type);
	    }
	 public void HighvalueRelationshipManagerInquiry(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldHighValueRelation);
	    	sel.selectByVisibleText(type);
	    }
	 public void ReportableAccountflag(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldReportableAccount);
	    	sel.selectByVisibleText(type);
	    }
	 public void flagforPreexisting(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldFlagForPre);
	    	sel.selectByVisibleText(type);
	    }
	 
	 
	 public void dateOfCRS(String date)
		{

			LeadCollectionPageObject.ent_lddateOfCRS.sendKeys(date);


		}
	
	 public void CertificationValidity(String date)
		{

			LeadCollectionPageObject.ent_ldCertificationValidity.sendKeys(date);


		}
	
	 public void IssuingCountry(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldissuingcountry.click();
		 Thread.sleep(500);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldIssuingCountry.click();
	 }
	
	 public void CustomerLicenseownershipDetailsUpload() throws InterruptedException {
		 LeadCollectionPageObject.clk_ldownershipDetailsupload.click();
		 Thread.sleep(1000);
		 attachmentField();
		 Thread.sleep(1000);
		 clickSave();
	 }
	 
	 public void ActiveNfeForm() throws InterruptedException {
		 LeadCollectionPageObject.clk_ldActiveNfeForm.click();
		 Thread.sleep(1000);
		 attachmentField();
		 Thread.sleep(1000);
		 clickSave();
	 }
	 
	 public void EntityFormUpload() throws InterruptedException {
		 LeadCollectionPageObject.clk_ldentityFormUploadupload.click();
		 Thread.sleep(1000);
		 attachmentField();
		 Thread.sleep(1000);
		 clickSave();
	 }
	 
	 public void attachmentField() {
		 
		 LeadCollectionPageObject.clk_ldAttachmentField.sendKeys(InputImage);;
		 
		 
		 
	 }
	 
 public void NameField(String Name) {
		 
		 LeadCollectionPageObject.SEL_ldName.sendKeys(Name);;
		 
		 
		 
	 }
 public void IDNoCRS(String Name) {
	 
	 LeadCollectionPageObject.ent_ldIDNoCRS.sendKeys(Name);;
	 
	 
	 
 }
 
	 public void LegalIdentityType(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldLegalIdentityType);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void TypeOfUBO(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldTypeOfUBO);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void TypeOfCRS(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.sel_ldTypeOfCRS);
	    	sel.selectByVisibleText(type);
	    }
	 
	 public void Associatedpartytype(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.slk_ldAssociatedpartytype);
	    	sel.selectByVisibleText(type);
	    }
	 
	 
	 public void Title(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.SEL_ldTitle);
	    	sel.selectByVisibleText(type);
	    }
      public void FinancialInstitution(String data) {
		 
		 LeadCollectionPageObject.ent_ldFinancialInstitution.sendKeys(data);;
		 
		 
		 
	 }

     public void investmentEntity(String data) {
	 
	 LeadCollectionPageObject.clk_ldInvestmentEntity.sendKeys(data);;
	 
	 
	 
}
	 public void clickSave() throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.clk_save.click();
	 }
	 
	 public void addNewResidenctCountry() throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.clk_ldAddNewResidenct.click();
	 }
	 public void addNewResidenctCountryCorporate() throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.clk_ldAddNewResidenctCorporate.click();
	 }
	 
	 public void addNewAuthorizedSignatory() throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.clk_ldAddNewAuthorisedSignatory.click();
	 }
	 
	 public void AddNewSupplier() throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.clk_ldAddNewSupplier.click();
	 }
	 
	 public void SupplierName(String file) throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.ent_ldDSupplierName.sendKeys(file);;
	 }
	 public void TypeOfProductAddSupplier(String file) throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.ent_ldTypeOfProductAddSupplier.sendKeys(file);;
	 }
	 public void PrcntgOfBusiness(String file) throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.ent_ldPrcntgOfBusiness.sendKeys(file);;
	 }
	 
	 public void SupplierWebsite(String file) throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.ent_ldDSupplierWebsite.sendKeys(file);;
	 }
	 public void AddressCountry(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldAddressCountry.click();
		 Thread.sleep(800);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldIssuingCountry.click();
	 }
	 
	 public void NatureOfBusinessAddSupplier(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldNatureOfBusinessAddSupplier.click();
		 Thread.sleep(800);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldBusinessSetUpType.click();
	 }
	 
	 
	 
	 
	 
	 public void AddNewCustomer() throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.clk_ldAddNewCustomer.click();
	 }
	 
	 
	 public void CountryOfTax(String type) throws InterruptedException {
		 LeadCollectionPageObject.pic_ldCountryOfTax.click();
		 Thread.sleep(800);
		 WebElement clients = LeadCollectionPageObject.ent_ldPSsearchBox;
		clients.sendKeys(type);
		clients.sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 LeadCollectionPageObject.clk_ldIssuingCountry.click();
	 }
	 
	 public void TaxID(String type)
	    {
	    	Select sel=new Select(LeadCollectionPageObject.slk_ldTaxID);
	    	sel.selectByVisibleText(type);
	    }
	 public void TaxIDNumber(String no) throws InterruptedException {
		 Thread.sleep(800);

		 LeadCollectionPageObject.slk_ldTaxIDNumber.sendKeys(no);;
	 }
	 
	 public void clickAdd() throws InterruptedException {
		 Thread.sleep(500);

		 LeadCollectionPageObject.clk_ldAdd.click();
	 }
	 
	
	 
	
	
//NBO
	public void CreatedNewLeadEdit()
	{

		LeadCollectionPageObject.clk_ldNewLeadEdit.click();


	}


	public void selectstatuscode()
	{

		LeadCollectionPageObject.clk_statuscodedocs.click();

	}



	public void Enteremail()
	{

        Random r = new Random();
		 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    final int N = 6;
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < N; i++) {
		        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		    }


		    String lastname = sb.toString();

		    final int M = 3;
		    StringBuilder sb1 = new StringBuilder();
		    for (int i = 0; i < M; i++) {
		        sb1.append(alphabet.charAt(r.nextInt(alphabet.length())));
		    }

		    String lastname1 = sb1.toString();

		    String email=lastname+"@"+lastname1+".com";

		    LeadCollectionPageObject.ent_ldemail.sendKeys(email);
	}


	public void dob(String mm,String dd,String yyyy)

    {
    	Select sel1=new Select(LeadCollectionPageObject.sel_dobmm);
    	//sel.selectByValue(Product);
    	sel1.selectByVisibleText(mm);

    	Select sel2=new Select(LeadCollectionPageObject.sel_dobdd);
    	//sel.selectByValue(Product);
    	sel2.selectByVisibleText(dd);

    	Select sel3=new Select(LeadCollectionPageObject.sel_dobyyyy);
    	//sel.selectByValue(Product);
    	sel3.selectByVisibleText(yyyy);

    }

		    public void PlcaeOfBirth()
			{

		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();


				    LeadCollectionPageObject.ent_ldplaceofbirth.sendKeys(firstname);
}


		    public void MaidanName()
			{

		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();


				    LeadCollectionPageObject.ent_ldmaidanname.sendKeys(firstname);
				    }

		    public void Gender(String gender)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldgender);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(gender);
		    }


		    public void CustomerType(String CustomerType)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldcustomertype);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(CustomerType);
		    }

		    public void CustomerContact(String customercontact)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldCustomerContact);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(customercontact);
		    }


		    public void CivilStatus(String cvlsts)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldCivilStaus);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(cvlsts);
		    }
		    public void settlementaccntType(String accounttype)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_settlementaccntType);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(accounttype);
		    }

		    public void UpdateDetailsTrustTreasury(String Updatedetails)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldUpdatedetailsTrustTreasury);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(Updatedetails);
		    }
		    public void settlementaccntPickerclk()
		    {
		   LeadCollectionPageObject.pic_ldSelectSettleAccount.click();

		    }
		    public void settlementaccntclk()
		    {
		   LeadCollectionPageObject.clk_ldSettleAccount.click();

		    }

		    public void BusinnesSegment(String BussSegment)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldBusinessSegmentType);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(BussSegment);
		    }
		    public void ClientSegment(String clntsegment) throws InterruptedException
		    {
		    	WebElement clients= LeadCollectionPageObject.pic_ldclientsegment;
		    	clients.sendKeys(clntsegment);
				Thread.sleep(1000);
				clients.sendKeys(Keys.ARROW_DOWN);
				clients.sendKeys(Keys.ENTER);

		    }
		    public void salesID(String salesID) throws InterruptedException
		    {
		    	WebElement clients= LeadCollectionPageObject.pic_ldSalesid;
		    	clients.sendKeys(salesID);
				Thread.sleep(1000);
				clients.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(500);
				clients.sendKeys(Keys.ENTER);
				}

		    public void SoleOwner(String soleowner)

		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldSoleOwner);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(soleowner);
		    }

            public void CustomerRelationship(String Relationship)

		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldrelationshiptype);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(Relationship);
		    }
            public void OnlyBBNRequired(String Relationship)

		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldOnlyBBNrequired);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(Relationship);
		    }

		    public void Employeetype(String empytype)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldEmployeType);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(empytype);
		    }

		    public void CheckEmployeetype()
		    {
		    	 Employeetype=LeadCollectionPageObject.sel_ldEmployeTypedetail.getText();

		    	System.out.println(Employeetype);

		    	}


		    public void IncomeRange(String incomrange)
		    {
		    	Select sel=new Select(LeadCollectionPageObject.sel_ldIncomeRange);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(incomrange);
		    }


		    public void Industry_Classification(String IndClsn) throws InterruptedException
		    {
		    	WebElement Industry_Classification = LeadCollectionPageObject.sel_ldIndustrialClassification;
				Industry_Classification.sendKeys(IndClsn);
				Thread.sleep(1000);
				Industry_Classification.sendKeys(Keys.DOWN);
				Thread.sleep(500);
				Industry_Classification.sendKeys(Keys.ENTER);
				Thread.sleep(500);
		    }

		    public void NatureOfWork(String NTWORK) throws InterruptedException
		    {

		    	WebElement Nature_work  = LeadCollectionPageObject.sel_ldNatureWork;
		    	Thread.sleep(300);
		    	Nature_work .sendKeys(NTWORK);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.DOWN);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.ENTER);
		    	Thread.sleep(1000);
		    }
		    public void GroupID(String groupid) throws InterruptedException
		    {

		    	LeadCollectionPageObject.clk_ldGroupID.sendKeys(groupid);
		    	}

		    public void NatureOfWorkNEW(String NTWORK) throws InterruptedException
		    {

		    	WebElement Nature_work  = LeadCollectionPageObject.sel_ldNatureWorkNEW;
		    	Thread.sleep(300);
		    	Nature_work .sendKeys(NTWORK);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.DOWN);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.ENTER);
		    	Thread.sleep(1000);
		    }

		    public void dosriFlag (String flag)
		    {
		    	Select sel = new Select(LeadCollectionPageObject.clk_ldDosriFlag);
		    	sel.selectByVisibleText(flag);

		    }
		    
		    
		    public void complianceComment (String flag)
		    {
		    	LeadCollectionPageObject.ent_ldComplianceComment.sendKeys(flag);

		    }
		    public void clickUpdate ()
		    {
		    	LeadCollectionPageObject.clk_ldAdd.click();

		    }
		    
		    
		    public void fatcaFlag (String flag)
		    {
		    	Select sel = new Select(LeadCollectionPageObject.clk_ldFatcaFlag);
		    	sel.selectByVisibleText(flag);

		    }
		    
		    public void fatcaUpdate(String flag)
		    {
		    	Select sel = new Select(LeadCollectionPageObject.clk_ldFatcaUpdate);
		    	sel.selectByVisibleText(flag);

		    }
		    public void occupation (String Occupation)
		    {
		    	Select sel = new Select(LeadCollectionPageObject.sel_ldOccupation);
		    	sel.selectByVisibleText(Occupation);

		    }

		    public void forEmployment (String foremployment)
		    {
		    	Select sel = new Select(LeadCollectionPageObject.sel_ldForEmployment);
		    	sel.selectByVisibleText(foremployment);

		    }

		    public void workingsince (String month,String year)
		    {
		    	Select sel1 = new Select(LeadCollectionPageObject.sel_ldWorkingSinceMonth);
		    	sel1.selectByVisibleText(month);
		    	Select sel2 = new Select(LeadCollectionPageObject.sel_ldWorkingSinceYear);
		    	sel2.selectByVisibleText(year);

		    }



		    public void Sourceoffunds (String source)
		    {
		    	Select sel1 = new Select(LeadCollectionPageObject.sel_ldSourceForEmployment);
		    	sel1.selectByVisibleText(source);

		    }

		    public void Tin(String tin)
		    {

	Random rand = new Random();
    int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
    int num2 = rand.nextInt(743);
    int num3 = rand.nextInt(10000);

    DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
    DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

    String mnumbername = df3.format(num1) + df3.format(num2)  + df4.format(num3);
    SDmobilenumber=mnumbername;
    LeadCollectionPageObject.ent_ldTin.sendKeys(mnumbername);

		    }

		    public void employername()
		    {

		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();

			    LeadCollectionPageObject.ent_ldemployerName.sendKeys(firstname);

		    }

		    public void businessname()
		    {

		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();


			    LeadCollectionPageObject.ent_ldBusinessName.sendKeys(firstname);

		    }

		    public void IDPrrof (String IDPrrof) throws InterruptedException
		    {
		    	Thread.sleep(500);
		    	WebElement ID = LeadCollectionPageObject.pic_ldIdProof;
				ID.sendKeys(IDPrrof);
				Thread.sleep(2000);
				ID.sendKeys(Keys.DOWN);
				Thread.sleep(1000);
				ID.sendKeys(Keys.ENTER);
				Thread.sleep(1000);


		    }
		    public void IDNumner ()
		    {

		    	Random rand = new Random();
		        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		        int num2 = rand.nextInt(743);
		        int num3 = rand.nextInt(10000);

		        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		        String mnumbername = df3.format(num1) + df3.format(num2)  + df4.format(num3);
		        SDmobilenumber=mnumbername;
		        LeadCollectionPageObject.ent_ldIDNo.sendKeys(mnumbername);

		    }

		    public void AoCode(String aocode)
		    {
		    	Select sel1 = new Select(LeadCollectionPageObject.sel_ldAoCode);
		    	sel1.selectByVisibleText(aocode);

		    }



		    public void ClickOnAddress()
		    {
		    	LeadCollectionPageObject.clk_ldAddressTab.click();

		    }

		    public void streetfied()
		    {
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String lastname = sb.toString();
				    LeadCollectionPageObject.ent_ldStreet.sendKeys(lastname);

		    }




		    public void PermanentAddresssameasPresentAddress(String padassameprad) throws InterruptedException
		    {
		    	Select sel1 = new Select(LeadCollectionPageObject.sel_ldperaddaspreadd);
		    	sel1.selectByVisibleText(padassameprad);


		    }


		    public void Zipcode(String Zipcode) throws InterruptedException
		    {
		    	WebElement zip = LeadCollectionPageObject.pic_ldZipCode;
				zip.sendKeys(Zipcode);
				Thread.sleep(1000);
				zip.sendKeys(Keys.DOWN);
				Thread.sleep(1000);
				zip.sendKeys(Keys.ENTER);

		    }


		    public void EconomicActivity(String economic) throws InterruptedException
		    {
		    	WebElement eco = LeadCollectionPageObject.pic_ldeconomicActivity;
		    	eco.sendKeys(economic);
		    	Thread.sleep(1000);
				eco.sendKeys(Keys.DOWN);
				Thread.sleep(700);
		    	eco.sendKeys(Keys.ENTER);
		    	Thread.sleep(1000);


		    }

		    public void mailingaddress(String mailingaddress)
		    {
		    	Select sel1 = new Select(LeadCollectionPageObject.sel_ldMailingAddress);
		    	sel1.selectByVisibleText(mailingaddress);

		    }



		    public void leadredbutton()
		    {
		    	LeadCollectionPageObject.btn_leadredbutton.click();


		    }

		    public void clickCRRSCButton()


		    {
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * js.executeScript("window.scrollBy(0,250)", "");
				 *///driver.switchTo( ).alert( ).dismiss();
		    	LeadCollectionPageObject.clk_CRRSCBtn.click();

		    }
            public void clickIndiAccntCreateBtn()


		    {

		    	LeadCollectionPageObject.clk_IndiAccntCreateBtn.click();

		    }

		    public void clickaddScndryLeadButton()


		    {
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * js.executeScript("window.scrollBy(0,250)", "");
				 *///driver.switchTo( ).alert( ).dismiss();
		    	LeadCollectionPageObject.clk_addScndryLeadButton.click();

		    }


              public void NotificationPOPUPClose()


		    {

		    	LeadCollectionPageObject.clk_ClosePopup.click();

		    }



              public void clickEditOFAC(String ofac)


		    {

            	Select sel1 = new Select(LeadCollectionPageObject.sel_Ofac);
  		    	sel1.selectByVisibleText(ofac);


		    }

              //// Non individual fields
              public void CustomerCategory(String CustomerType)
  		    {
  		    	Select sel=new Select(LeadCollectionPageObject.sel_ldcustomerCategory);
  		    	//sel.selectByValue(Product);
  		    	sel.selectByVisibleText(CustomerType);
  		    }
              public void businessExpiry(String businessExpiry)


  		    {

  		    	LeadCollectionPageObject.clk_BusinessExpiry.sendKeys(businessExpiry);

  		    }
              public void TypeOfCorp(String TypeOfCorp)
    		    {
    		    	Select sel=new Select(LeadCollectionPageObject.sel_ldTypeOfCorp);
    		    	//sel.selectByValue(Product);
    		    	sel.selectByVisibleText(TypeOfCorp);
    		    }

              public void EntityType(String EntityType)
  		    {
  		    	Select sel=new Select(LeadCollectionPageObject.sel_ldEntityType);
  		    	//sel.selectByValue(Product);
  		    	sel.selectByVisibleText(EntityType);
  		    }
              public void CorporateDocumentPickerCLK() throws InterruptedException


    		    {
            	  JavascriptExecutor js = (JavascriptExecutor) driver;
          		js.executeScript("window.scrollBy(0,1700)", "");
          		Thread.sleep(1000);

    		    	LeadCollectionPageObject.sel_ldCorporateDocumentPickerCLK.click();

    		    }

              public void CorporateDocumentPickerCheck()


    		    {

    		    	LeadCollectionPageObject.sel_ldCorporateDocumentPickerCheck.click();

    		    }
              public void AddressTabNonindi()
  		    {
  		    	LeadCollectionPageObject.clk_ldAddressTabNonindi.click();

  		    }
              public void streetfiedNonIndi()
  		    {
  		    	Random r = new Random();
  				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  				    final int N = 6;
  				    StringBuilder sb = new StringBuilder();
  				    for (int i = 0; i < N; i++) {
  				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
  				    }
  				    String lastname = sb.toString();
  				    LeadCollectionPageObject.ent_ldStreetNonIndi.sendKeys(lastname);

  		    }

              public void ZipcodeNonIndi(String Zipcode) throws InterruptedException
  		    {
  		    	WebElement zip = LeadCollectionPageObject.pic_ldZipCodeNonIndi;
  				zip.sendKeys(Zipcode);
  				Thread.sleep(1000);
  				zip.sendKeys(Keys.DOWN);
  				Thread.sleep(1000);
  				zip.sendKeys(Keys.ENTER);

  		    }
              public void clickCRRSCButtonNonIndi()


  		    {
  				/*
  				 * JavascriptExecutor js = (JavascriptExecutor) driver;
  				 * js.executeScript("window.scrollBy(0,250)", "");
  				 *///driver.switchTo( ).alert( ).dismiss();
  		    	LeadCollectionPageObject.clk_CRRSCBtnNonIndi.click();

  		    }
              public void PlantAddresssameasOfficeAddress(String padassameprad) throws InterruptedException
  		    {
  		    	Select sel1 = new Select(LeadCollectionPageObject.sel_ldperaddaspreaddNonIndi);
  		    	sel1.selectByVisibleText(padassameprad);


  		    }



}