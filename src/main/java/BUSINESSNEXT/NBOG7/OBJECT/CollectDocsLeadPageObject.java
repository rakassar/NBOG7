package BUSINESSNEXT.NBOG7.OBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectDocsLeadPageObject extends LoginPageObject{

public CollectDocsLeadPageObject (WebDriver driver)

{
	super(driver);

}


//Fill the all text box type info//
@FindBy(className="icon-edit")
public static WebElement clk_ldNewLeadEdit;

@FindBy(id="2")
public static WebElement clk_statuscodedocs;

@FindBy(name="LE_EMAIL")
public static WebElement ent_ldemail;

@FindBy(name="cust_175")
public static WebElement pic_ldSalesid;


@FindBy(xpath="(//select[@class='selectbox selectbox--ba'])[1]")
public static WebElement sel_dobmm;

@FindBy(xpath="(//select[@class='selectbox selectbox--ba'])[2]")
public static WebElement sel_dobdd;

@FindBy(xpath="(//select[@class='selectbox selectbox--ba'])[3]")
public static WebElement sel_dobyyyy;


@FindBy(name="cust_47")
public static WebElement ent_ldplaceofbirth;

@FindBy(name="LE_GENDER")
public static WebElement sel_ldgender;

@FindBy(name="cust_50")
public static WebElement sel_ldcustomertype;

@FindBy(name="cust_212")
public static WebElement ent_ldmaidanname;
@FindBy(name="cust_920")
public static WebElement sel_ldCustomerContact;
@FindBy(name="cust_66")
public static WebElement sel_ldCivilStaus;
@FindBy(name="cust_2592")
public static WebElement sel_ldBusinessSegmentType;
@FindBy(name="cust_2593")
public static WebElement pic_ldclientsegment;
@FindBy(name="cust_162")
public static WebElement sel_ldSoleOwner;


@FindBy(name="cust_1960")
public static WebElement sel_ldrelationshiptype;

@FindBy(name="cust_898")
public static WebElement sel_ldOnlyBBNrequired;

//Employment section

@FindBy(name="cust_63")
public static WebElement sel_ldEmployeType;

@FindBy(css="span[data-autoid='cust_63_ctrl']")
public static WebElement sel_ldEmployeTypedetail;

@FindBy(name="cust_2597")
public static WebElement sel_ldIncomeRange;
@FindBy(name="cust_1563")
public static WebElement sel_ldIndustrialClassification;
@FindBy(name="cust_57")
public static WebElement sel_ldNatureWork;

@FindBy(name="cust_2835")
public static WebElement sel_ldNatureWorkNEW;

@FindBy(name="cust_77")
public static WebElement sel_ldOccupation;
@FindBy(name="cust_80")
public static WebElement sel_ldOtherOccupation;
@FindBy(name="cust_2353")
public static WebElement sel_ldForEmployment;
@FindBy(name="cust_86")
public static WebElement ent_ldTin;
@FindBy(name="cust_48")
public static WebElement ent_ldemployerName;
@FindBy(name="cust_1562")
public static WebElement pic_ldeconomicActivity;

@FindBy(xpath="(//select[@class='selectbox selectbox--ba'])[4]")
public static WebElement sel_ldWorkingSinceMonth;
@FindBy(xpath="(//select[@class='selectbox selectbox--ba'])[5]")
public static WebElement sel_ldWorkingSinceYear;
@FindBy(name="cust_494")
public static WebElement ent_ldBusinessName;
@FindBy(name="cust_61")
public static WebElement sel_ldSourceForEmployment;



@FindBy(name="cust_467")
public static WebElement pic_ldIdProof;
@FindBy(name="cust_90")
public static WebElement ent_ldIDNo;
@FindBy(name="cust_2624")
public static WebElement sel_ldAoCode;

//Address section
@FindBy(name="SALUTATION")
public static WebElement pic_ldCountry;
@FindBy(xpath="//span[@title='Address']")
public static WebElement clk_ldAddressTab;


@FindBy(xpath="//span[@title='Address Details']")
public static WebElement clk_ldAddressTabNonindi;

@FindBy(name="LE_ZIP_CODE")
public static WebElement pic_ldZipCode;
@FindBy(name="LE_LOCALITY")
public static WebElement ent_ldStreet;
@FindBy(name="cust_242")
public static WebElement sel_ldperaddaspreadd;
@FindBy(name="cust_1812")
public static WebElement sel_ldMailingAddress;


@FindBy(xpath="//*[@id=\\\"newobject\\\"]/div[3]/div/div")
public static WebElement btn_leadredbutton;

@FindBy(css="span[class='close-icon']")
public static WebElement clk_ClosePopup;

@FindBy(name="cust_1718")
public static WebElement sel_Ofac;

//gold5.5
/*
 * @FindBy(css="i[class='icon icon icon-screenflow']") public static WebElement
 * clk_CRRSCBtn;
 */

@FindBy(xpath="//span[normalize-space()='Perform CRRSC']")
public static WebElement clk_CRRSCBtn;

@FindBy(xpath="//span[normalize-space()='Individual Customer/Account Creation']")
public static WebElement clk_IndiAccntCreateBtn;

@FindBy(xpath="//span[normalize-space()='Add Secondary Lead']")
public static WebElement clk_addScndryLeadButton;

@FindBy(name="cust_2038")
public static WebElement sel_settlementaccntType;


@FindBy(name="cust_2739")
public static WebElement sel_ldUpdatedetailsTrustTreasury;

@FindBy(xpath="//a[@data-autoid= 'cust_2047_srch']")
public static WebElement pic_ldSelectSettleAccount;

@FindBy(xpath="//div[@data-autoid='holdingnumber_0']")
public static WebElement clk_ldSettleAccount;

@FindBy(name="cust_1806")
public static WebElement clk_ldGroupID;

@FindBy(name="cust_1540")
public static WebElement clk_ldDosriFlag;
@FindBy(name="cust_1575")
public static WebElement clk_ldFatcaFlag;

/*
 * @FindBy(xpath="//*[contains(@class,'icon icon icon-screenflow')]") public
 * static WebElement clk_CRRSCTAB;
 */

//Non individual fields
@FindBy(name="cust_49")
public static WebElement sel_ldcustomerCategory;

@FindBy(xpath="//input[@title = 'MM/DD/YYYY']")
public static WebElement clk_BusinessExpiry;

@FindBy(name="cust_56")
public static WebElement sel_ldTypeOfCorp;

@FindBy(xpath="//a[@data-autoid='cust_1391_srch']")
public static WebElement sel_ldCorporateDocumentPickerCLK;

@FindBy(name="cust_928")
public static WebElement sel_ldEntityType;

@FindBy(id="select-all-checkbox")
public static WebElement sel_ldCorporateDocumentPickerCheck;

@FindBy(name="cust_526")
public static WebElement pic_ldZipCodeNonIndi;
@FindBy(name="cust_527")
public static WebElement ent_ldStreetNonIndi;

@FindBy(xpath="//span[normalize-space()='Perform CRRSC - Non Ind']")
public static WebElement clk_CRRSCBtnNonIndi;

@FindBy(name="cust_1516")
public static WebElement sel_ldperaddaspreaddNonIndi;
}