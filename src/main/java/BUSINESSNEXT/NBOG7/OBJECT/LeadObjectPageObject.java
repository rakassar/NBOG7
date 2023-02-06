package BUSINESSNEXT.NBOG7.OBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadObjectPageObject extends LoginPageObject{

public LeadObjectPageObject (WebDriver driver)

{
	super(driver);

}


@FindBy(xpath="//i[@title='Onboard Customer']")
public static WebElement clk_OnboardCustomer ;




@FindBy(xpath="//div[contains(@class,'form-element__control')]//div/span[contains(@data-autoid,'LE_NUMBER_ctrl')]")
public static WebElement get_leadIDCreated ;

//quick link and OnBaording journey option
    @FindBy(id="1")
    public static WebElement clk_salesonbaordingjourney ;
    @FindBy(css="a[data-autoid='FlowNext']")
    public static WebElement clk_saveandproceed ;

	//process Application
	@FindBy(xpath="//span[normalize-space()='Process Application']")
	public static WebElement clk_ProcessApplication;

	//process Application
		@FindBy(xpath="//button[normalize-space()='Ok']")
		public static WebElement clk_closeProcessApplicationPopup;

		@FindBy(xpath="(//a[@id ='1'])[3]")
		 public static WebElement clk_corporateOnboardingOman ;
		
		
		@FindBy(xpath="//span[normalize-space()='AML Verification']")
		public static WebElement clk_ldAMLBtn;

		
		@FindBy(xpath="//span[normalize-space()='Verified by Checker']")
		public static WebElement btn_VerifiedbyChecker;
		
		@FindBy(xpath="//span[normalize-space()='Approved by Authorizer']")
		public static WebElement clk_ldApprovedbyAuthorizerBtn;


		@FindBy(xpath="//span[normalize-space()='Send to Authorizer']")
		public static WebElement clk_ldSendtoAuthorizerBtn;
		
		@FindBy(xpath="//span[normalize-space()='Approved by Compliance Maker']")
		public static WebElement clk_ldComplianceMakerBtn;
		
		@FindBy(xpath="//span[normalize-space()='Approved by Compliance Checker']")
		public static WebElement clk_ldComplianceCheckerBtn;

		@FindBy(xpath="//span[normalize-space()='Generate CIF']")
		public static WebElement clk_ldGenerateCIFBtn;
		
		@FindBy(id="1")
		 public static WebElement clk_retailOnboardingOman ;

		@FindBy(xpath="//span[@title = 'NMDD']")
		 public static WebElement clk_NMDDtab ;
		
		@FindBy(xpath="//span[@title='Details (Corporate)']")
		 public static WebElement clk_DetailsCoporate ;
		
		@FindBy(xpath="(//span[@class ='acd-link-text'])[6]")
		 public static WebElement clk_closeContact1 ;
		@FindBy(xpath="(//span[@class ='acd-link-text'])[8]")
		 public static WebElement clk_closeContact2;
		
		
		
		

	     @FindBy(xpath="//span[@title = 'Activities']")
		 public static WebElement clk_Activitiestab ;


	     @FindBy(name="QueryCategoryId")
	     public static WebElement sel_leadView;


	     @FindBy(css="select[name='QueryViewId']")
	   public static WebElement clk_selectview;

	     @FindBy(xpath="//a[@class='filterGroup__button acid-btn acid-btn--outline-brand']")
	     public static WebElement clk_arrorw ;

	     @FindBy(xpath="//label[@for='checkbox0']")
	     public static WebElement clk_selectlead ;

	     @FindBy(css="[data-autoid='LeadID_0']")
	     public static WebElement clk_selectthelead ;

	     @FindBy(xpath="//i[@title='CRAM Leads - Self Assign']")
	     public static WebElement clk_selfassignlead ;


    @FindBy(id="BTN_NEW")
    public static WebElement clk_plussign;
    @FindBy(xpath=".//*[@id='addvividScroll']/li[3]/a")
    public static WebElement link_SavingsandDeposits;
    @FindBy(xpath=".//*[@id='addvividScroll']/li[2]/a")
    public static WebElement link_CorporateLoan;
    @FindBy(xpath="//div[contains(@class,'closeBtn clearfix')]/div/ul/li[2]/a/span")
    public static WebElement btn_SaveandProceed;
    @FindBy(xpath="//div[starts-with(@class,'summarycard')]/div[1]/span")
    public static WebElement extra_Leadid;
    @FindBy(xpath="//div[contains(@class,'object-action-btn')]/ul/li[2]/a/span")
    public static WebElement btn_SaveandProceed_edit;

  
    @FindBy(xpath="//span[normalize-space()='Close']")
    public static WebElement btn_close;

   //searching  functionality for lead
    @FindBy(id="lnkadvance")
    public static WebElement btn_Advancesearched;
    @FindBy(id="MobilePhone")
    public static WebElement btn_AdvancesearchedByMobilePhone;
    @FindBy(id="LeadID")
    public static WebElement btn_AdvancesearchedByLeadIDs;
    @FindBy(id="srchBtn")
    public static WebElement btn_Clickleadsearch;
    @FindBy(id="BTN_EDIT")
    public static WebElement btn_ClickOnEditButton;

    @FindBy(xpath="//span[normalize-space()='Update to 360']")
    public static WebElement btn_ClickOnUpdtButton;


    @FindBy(name="cust_2739")
    public static WebElement Sel_popupdt360;

   //update button
    @FindBy(xpath="//span[normalize-space()='Update']")
	public static WebElement clk_update360;

    //BM  approve button
    @FindBy(xpath="//span[normalize-space()='Approved']")
	public static WebElement clk_BmApproveBttn;
  
    
  //BM  comments box button
    @FindBy(name="LE_DESCRIPTION")
	public static WebElement clk_BmComments;
    
  //Trust Ops convert lead
    @FindBy(css="span[data-autoid='cust_110001_ctrl']")
	public static WebElement txt_AML_Check;
    
    //Contacts IDs
    @FindBy(xpath="//span//div[@data-autoid='ContactID_0']")
	public static WebElement get_comntactId1;
    //Contacts IDs
    @FindBy(xpath="//span//div[@data-autoid='ContactID_1']")
	public static WebElement get_comntactId2;
    
    
  //Contacts IDs
    @FindBy(xpath="//span//div[@data-autoid='Con_ex2_88_0']")
	public static WebElement get_comntactId1amlcheck;
    
  //Contacts IDs
    @FindBy(xpath="//span//div[@data-autoid='Con_ex2_88_1']")
	public static WebElement get_comntactId2amlcheck;
    
    
    







 }