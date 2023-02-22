package BUSINESSNEXT.NBOG7.OBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadCollectionPageObject extends LoginPageObject{

public LeadCollectionPageObject (WebDriver driver)

{
	super(driver);

}

//NBO
@FindBy(name="cust_1902")
public static WebElement sel_ldSalutation;

@FindBy(name="cust_661")
public static WebElement sel_ldcustomerSegment;

@FindBy(name="cust_125102")
public static WebElement sel_ldEntityOman;

@FindBy(name="cust_125103")
public static WebElement sel_ldEnityOtherCountry;

@FindBy(name="cust_1901")
public static WebElement ent_ldcustomerName;

@FindBy(name="cust_44")
public static WebElement ent_ldcompanyName;

@FindBy(xpath="//input[@data-autoid = 'cust_580_ctrl']")
public static WebElement ent_ldDateofBirth;

@FindBy(xpath="//input[@data-autoid='cust_1193_ctrl']")
public static WebElement ent_ldDateofEstablishment;

@FindBy(xpath="//input[@data-autoid='cust_1006_ctrl']")
public static WebElement ent_ldDateofRegistration;

@FindBy(name="cust_441")
public static WebElement ent_ldldCardNo;

@FindBy(name="cust_169")
public static WebElement ent_ldRegistrationPlace;

@FindBy(xpath="//input[@data-autoid = 'cust_582_ctrl']")
public static WebElement ent_ldIDCardExpiry;

@FindBy(xpath="//input[@data-autoid = 'cust_626_ctrl']")
public static WebElement ent_ldPassportExpiry;

@FindBy(xpath="//input[@data-autoid = 'cust_440_ctrl']")
public static WebElement ent_ldvisaExpiry;

@FindBy(xpath="//span[@data-autoid ='cust_112343_ctrl']")
public static WebElement get_riskcategory;


@FindBy(name="cust_583")
public static WebElement sel_ldEmployerType;

@FindBy(name="cust_516")
public static WebElement sel_ldp5UserCode;

@FindBy(name="cust_8121")
public static WebElement pic_ldAnalysisCode;

@FindBy(name="cust_1801")
public static WebElement pic_ldSub_Industry;

@FindBy(name="cust_1800")
public static WebElement pic_ldIndustry;


@FindBy(name="cust_1421")
public static WebElement sel_ldEntityType1;

@FindBy(name="cust_112473")
public static WebElement pic_ldNatureOfBusiness;

@FindBy(name="cust_1799")
public static WebElement pic_IndustrySector;


@FindBy(name="cust_592")
public static WebElement pic_ldCustomerProfession;

@FindBy(name="LE_PRODUCT")
public static WebElement sel_ldAccountType;

@FindBy(name="cust_1266")
public static WebElement ent_AccountShortName;

@FindBy(name="cust_429")
public static WebElement ent_ldshortName;


@FindBy(name="cust_112344")
public static WebElement ent_ldComplianceComment;
;

@FindBy(xpath="//a[@data-autoid='cust_125310_srch']")
public static WebElement clk_PSpicker;


@FindBy(name="Grid_SearchTextBox")
public static WebElement ent_ldPSsearchBox;


@FindBy(name="cust_125817")
public static WebElement ent_wishToUpdateInfo;

@FindBy(xpath="//div[@data-autoid='Product_type_name_0']")
public static WebElement clk_ldPSproductselect;

@FindBy(name="LE_MOBILE")
public static WebElement ent_ldMobile;

@FindBy(name="cust_667")
public static WebElement sel_ldLiteracy;

@FindBy(name="LE_LEADSOURCE")
public static WebElement sel_ldLeadSource;

@FindBy(xpath="//a[@data-autoid='cust_1001_srch']")
public static WebElement clk_PApicker;

@FindBy(xpath="//label[@for='checkbox0']")
public static WebElement clk_ldcheckboxPOA;


@FindBy(xpath="//button[normalize-space()='Ok']")
public static WebElement clk_ldOKbutton;

@FindBy(xpath="//a[@data-autoid='cust_3017_srch']")
public static WebElement clk_staffCodepicker;

@FindBy(xpath="//div[@data-autoid='con_ex1_6_0']")
public static WebElement clk_staffcode;

@FindBy(xpath="//a[@data-autoid='cust_125120_srch']")
public static WebElement clk_PEPpicker;

@FindBy(xpath="//a[@data-autoid='cust_125121_srch']")
public static WebElement clk_PEPpickerCorporate;

@FindBy(xpath="//div[@data-autoid='PEP_Status_Type_0']")
public static WebElement clk_ldPEPStatusselect;

@FindBy(xpath="//a[@data-autoid='cust_125136_srch']")
public static WebElement clk_ldAverageExpectedTransactionpicker;

@FindBy(xpath="//a[@data-autoid='cust_123381_srch']")
public static WebElement clk_ldLengthOfIncorporationpicker;

@FindBy(xpath="//a[@data-autoid='cust_123380_srch']")
public static WebElement clk_ldOwnershipStructurepicker;

@FindBy(xpath="//a[@data-autoid='cust_123350_srch']")
public static WebElement clk_screeningMatchespicker;

@FindBy(xpath="//a[@data-autoid='cust_123352_srch']")
public static WebElement clk_screeningMatchespickerCorporate;

@FindBy(xpath="//a[@data-autoid='cust_122989_srch']")
public static WebElement clk_ldCountryofOperationspicker;

@FindBy(xpath="//div[@data-autoid='Value_0']")
public static WebElement clk_ldScreeningvalueselect;

@FindBy(xpath="//div[@data-autoid='Business_Set_Up_Type_0']")
public static WebElement clk_ldBusinessSetUpType;


@FindBy(xpath="//a[@data-autoid='cust_123098_srch']")
public static WebElement clk_ldCountryofIncorporationpicker;

@FindBy(name="cust_24202")
public static WebElement sel_ldHNWIStatus;

@FindBy(name="cust_125060")
public static WebElement sel_ldCaptureAssociateParty;

@FindBy(name="cust_51")
public static WebElement ent_ldSurname;

@FindBy(name="cust_1788")
public static WebElement ent_ldvillano;

@FindBy(name="cust_24435")
public static WebElement sel_ldresidenceStatus;

@FindBy(name="cust_785")
public static WebElement ent_ldwayno;

@FindBy(name="cust_1787")
public static WebElement ent_ldbuildingno;

@FindBy(name="cust_1860")
public static WebElement pic_ldLocation;


@FindBy(name="cust_1859")
public static WebElement sel_ldWilayat;

@FindBy(xpath="//a[@data-autoid='cust_1419_srch']")
public static WebElement pic_ldemployer;


@FindBy(xpath="//div[@data-autoid='con_ex1_27_0']")
public static WebElement clk_ldcompanycode;

@FindBy(name="cust_635")
public static WebElement pic_ldDesignation;



@FindBy(name="cust_979")
public static WebElement pic_ldPOCode;

@FindBy(name="cust_636")
public static WebElement pic_ldPOCodeCorporate;


@FindBy(name="cust_1332")
public static WebElement pic_ldPOBoxCorporate;


@FindBy(name="cust_147")
public static WebElement ent_ldPOBox;

@FindBy(xpath="//a[@data-autoid='cust_123376_srch']")
public static WebElement clk_ldCountryofResidenceofSuppliersPicker;

@FindBy(xpath="//a[@data-autoid='cust_125128_srch']")
public static WebElement clk_ldCountryofResidenceofApplicantEntitypicker;

@FindBy(xpath="//a[@data-autoid='cust_125130_srch']")
public static WebElement clk_ldAETVpicker;


@FindBy(xpath="//a[@data-autoid='cust_125132_srch']")
public static WebElement clk_ldRSMpicker;


@FindBy(xpath="//div[@data-autoid='Sourcing_Channel_Code_0']")
public static WebElement clk_ldSourcingcode;


@FindBy(xpath="//a[@data-autoid='cust_122834_srch']")
public static WebElement clk_ldOriginCountry1;


@FindBy(xpath="//div[@data-autoid='Country_Name_0']")
public static WebElement clk_ldOriginCountry1name;

@FindBy(xpath="//a[@data-autoid='cust_122835_srch']")
public static WebElement clk_ldDestinationCountry1;


@FindBy(xpath="//a[@data-autoid='cust_125309_srch']")
public static WebElement clk_ldSourceOfFunds;


@FindBy(xpath="//div[@data-autoid='Source_of_Funds_Name_0']")
public static WebElement clk_ldSourceoffundSelect;


@FindBy(xpath="//input[@data-autoid='cust_624_ctrl']")
public static WebElement ent_ldMonthlyIncome;


@FindBy(name="cust_975")
public static WebElement ent_ldPlaceOfBirth;


@FindBy(name="cust_658")
public static WebElement pic_ldCountryOfBirth;


@FindBy(name="cust_673")
public static WebElement sel_ldgreencard;

@FindBy(name="cust_677")
public static WebElement sel_ldMakeOngoingPayment;

@FindBy(name="cust_1635")
public static WebElement sel_ldUSTax;

@FindBy(name="cust_695")
public static WebElement sel_ldUSCitizen;

@FindBy(name="cust_674")
public static WebElement sel_ldUSpassHolder;

@FindBy(css="a[data-autoid='FlowNext']")
public static WebElement clk_saveandproceed ;

//high form
@FindBy(name="cust_124562")
public static WebElement ent_ldPurposeofrequesting;

@FindBy(name="cust_124674")
public static WebElement sel_ldAlreadyborrowingrelationship ;

@FindBy(name="cust_124677")
public static WebElement sel_ldlookingforborrowingrelationship ;

@FindBy(name="cust_124635")
public static WebElement sel_ldcustomerIsSelfEmployed ;

@FindBy(name="cust_124584")
public static WebElement ent_ldLengthOfBusiness;

@FindBy(name="cust_124584")
public static WebElement ent_ldProfileOfCountry;

@FindBy(name="cust_124608")
public static WebElement ent_ldTrade;


@FindBy(name="cust_124610")
public static WebElement ent_ldMainOriginOfBusiness;

@FindBy(name="cust_124681")
public static WebElement sel_ldPresenceInDifferentCountry;

@FindBy(name="cust_124685")
public static WebElement sel_ldNoOfPersonEmployed;

@FindBy(name="cust_124612")
public static WebElement ent_ldNotBeRoutingFunds;


@FindBy(name="cust_55")
public static WebElement sel_ldCharitableServices;

@FindBy(name="cust_124606")
public static WebElement ent_ldTypeOfProduct;


@FindBy(name="cust_124566")
public static WebElement ent_ldVisaSponsorName;

@FindBy(name="cust_125617")
public static WebElement ent_ldEmployerNameHigh;

@FindBy(xpath="//a[@data-autoid='cust_125621_srch']")
public static WebElement pic_ldEmployerIndustryClick;


@FindBy(xpath="//a[@data-autoid='cust_125623_srch']")
public static WebElement pic_ldEmployerIncorporationCountryClick;

@FindBy(name="cust_125620")
public static WebElement sel_ldEmploymentType;

@FindBy(xpath="//a[@data-autoid='cust_125622_srch']")
public static WebElement pic_ldEmployerActivityClick;


@FindBy(xpath="//a[@data-autoid='cust_125678_srch']")
public static WebElement pic_ldEmployerCountryResidence;





@FindBy(name="cust_124588")
public static WebElement ent_ldBuildingName;

@FindBy(name="cust_147")
public static WebElement ent_ldEmployerPO;

@FindBy(name="cust_124567")
public static WebElement ent_ldHouseNO;

@FindBy(name="cust_124576")
public static WebElement ent_ldStreet1;

 
@FindBy(name="cust_125651")
public static WebElement ent_ldBuildingNOHigh;

@FindBy(name="cust_125652")
public static WebElement ent_ldStreetNO;
@FindBy(name="cust_125653")
public static WebElement ent_ldArea;
@FindBy(name="cust_125654")
public static WebElement ent_ldCity;


@FindBy(xpath="//a[@data-autoid='cust_125655_srch']")
public static WebElement pic_ldStateCountry;




@FindBy(name="cust_124637")
public static WebElement sel_ldPOAHolder;

@FindBy(name="cust_124638")
public static WebElement sel_ldIndividualsOrEntities;

@FindBy(name="cust_124590")
public static WebElement ent_ldOriginatorPartyName;


@FindBy(xpath="//a[@data-autoid='cust_124725_srch']")
public static WebElement pic_ldOriginatorPartyNationality;

@FindBy(name="cust_124591")
public static WebElement ent_ldOriginatorAccountNumber;

@FindBy(name="cust_125715")
public static WebElement ent_ldONatureofrelationship;


@FindBy(name="cust_125680")
public static WebElement ent_ldOriginatorBankName;

@FindBy(name="cust_124636")
public static WebElement sel_ldYearOfEmployment;

@FindBy(xpath="//a[@data-autoid='cust_124669_srch']")
public static WebElement pic_ldAttachProofClick;

@FindBy(xpath="//div[@data-autoid='ItemName_0']")
public static WebElement pic_ldAttachProofSelect;

@FindBy(name="cust_124701")
public static WebElement sel_ldRCVOrSndMoney;


@FindBy(name="cust_124692")
public static WebElement sel_ldIntstInHighRiskIndustry;



@FindBy(name="cust_124690")
public static WebElement sel_ldBusinessInHighRisk;

@FindBy(name="cust_124641")
public static WebElement sel_Sendmoneytocountry;

@FindBy(name="cust_124643")
public static WebElement sel_ldIES;

@FindBy(name="cust_124699")
public static WebElement sel_ldIESCorporate;

@FindBy(name="cust_124644")
public static WebElement sel_ldCstmrMntnRelationshipOtherOmani;

@FindBy(name="cust_124645")
public static WebElement sel_ldCstmrMntnRelationshipwithForeign;

@FindBy(name="cust_124646")
public static WebElement sel_ldDtlsOfAssociated;


@FindBy(name="cust_124696")
public static WebElement sel_ldPerformedSiteVisit;


@FindBy(name="cust_124713")
public static WebElement ent_ldPleaseJustify;





//

//CRS
@FindBy(name="cust_123396")
public static WebElement sel_ldcareOfAddress;

@FindBy(name="cust_123394")
public static WebElement sel_ldSelfCertification;

@FindBy(name="cust_123410")
public static WebElement sel_ldClassificationOfEntity;

@FindBy(name="cust_123398")
public static WebElement sel_ldstandingInstruction;

@FindBy(name="cust_123399")
public static WebElement sel_ldInternationalPhoneNumber;

@FindBy(name="cust_125313")
public static WebElement sel_ldMultipleNationality;

@FindBy(name="cust_123402")
public static WebElement sel_ldchangeInCircumstance;

@FindBy(name="cust_123408")
public static WebElement sel_ldPOASignatory;

@FindBy(name="cust_123404")
public static WebElement sel_ldHighValueRelation;

@FindBy(name="cust_123405")
public static WebElement sel_ldReportableAccount;


@FindBy(name="cust_123411")
public static WebElement sel_ldTypeOfCRS;

@FindBy(name="cust_123403")
public static WebElement sel_ldFlagForPre;

@FindBy(name="cust_125590")
public static WebElement sel_ldLegalIdentityType;

@FindBy(name="cust_122973")
public static WebElement ent_ldIDNoCRS;

@FindBy(name="cust_28624")
public static WebElement sel_ldTypeOfUBO;

@FindBy(xpath="//input[@data-autoid='cust_123401_ctrl']")
public static WebElement ent_lddateOfCRS;

@FindBy(xpath="//input[@data-autoid='cust_125716_ctrl']")
public static WebElement ent_ldCertificationValidity;


@FindBy(xpath="//a[@data-autoid='cust_124586_srch']")
public static WebElement pic_ldissuingcountry;


@FindBy(xpath="//div[@data-autoid='Country_Name_0']")
public static WebElement clk_ldIssuingCountry;

@FindBy(xpath="//input[@data-autoid='cust_123415_ctrl']/following-sibling::div/a")
public static WebElement clk_ldownershipDetailsupload;


@FindBy(xpath="//input[@data-autoid='cust_123412_ctrl']/following-sibling::div/a")
public static WebElement clk_ldActiveNfeForm;

@FindBy(xpath="//input[@data-autoid='cust_271_ctrl']/following-sibling::div/a")
public static WebElement clk_ldentityFormUploadupload;

@FindBy(name="qqfile")
public static WebElement clk_ldAttachmentField;

@FindBy(name="cust_125591")
public static WebElement ent_ldFinancialInstitution;

@FindBy(name="cust_125592")
public static WebElement clk_ldInvestmentEntity ;


@FindBy(xpath="//a[@data-autoid ='Lay_118827']")
public static WebElement clk_ldAddNewResidenct;

@FindBy(xpath="//a[@data-autoid ='Lay_118828']")
public static WebElement clk_ldAddNewResidenctCorporate;

@FindBy(xpath="//a[@data-autoid ='Lay_117621']")
public static WebElement clk_ldAddNewAuthorisedSignatory;

@FindBy(xpath="//a[@data-autoid ='Lay_118855']")
public static WebElement clk_ldAddNewSupplier;

@FindBy(xpath="//a[@data-autoid ='Lay_118856']")
public static WebElement clk_ldAddNewCustomer;

@FindBy(xpath="//a[@data-autoid='cust_123385_srch']")
public static WebElement pic_ldCountryOfTax;

@FindBy(name="cust_123444")
public static WebElement slk_ldTaxID;


@FindBy(name="cust_124774")
public static WebElement ent_ldDSupplierName;

@FindBy(name="cust_124780")
public static WebElement ent_ldDSupplierWebsite;

@FindBy(xpath="//a[@data-autoid='cust_124760_srch']")
public static WebElement pic_ldAddressCountry;

@FindBy(xpath="//a[@data-autoid='cust_124763_srch']")
public static WebElement pic_ldNatureOfBusinessAddSupplier;

@FindBy(name="cust_124777")
public static WebElement ent_ldTypeOfProductAddSupplier ;

@FindBy(name="cust_124767")
public static WebElement ent_ldPrcntgOfBusiness ;




@FindBy(name="cust_125070")
public static WebElement slk_ldAssociatedpartytype;


@FindBy(name="cust_123443")
public static WebElement slk_ldTaxIDNumber;

@FindBy(css="a[data-autoid='Update_0']")
public static WebElement clk_ldAdd ;



@FindBy(css="a[data-autoid='Save']")
public static WebElement clk_save ;



@FindBy(name="cust_712")
public static WebElement SEL_ldTitle;

@FindBy(name="cust_1397")
public static WebElement SEL_ldName;

@FindBy(name="cust_710")
public static WebElement SEL_ldCountryofIncorporation;

@FindBy(name="cust_800")
public static WebElement SEL_ldResidenceCountry;


//NBO


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

@FindBy(name="cust_124604")
public static WebElement ent_ldBusinessProfile;

@FindBy(name="cust_16")
public static WebElement sel_ldIntoExchangeMoney;


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

@FindBy(xpath="//input[contains(@data-autoid,'cust_625_ctrl')]")
public static WebElement ent_otherincome;


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

@FindBy(name="cust_1489")
public static WebElement clk_ldFatcaUpdate;



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


@FindBy(xpath="//span[@data-autoid= 'LE_STATUSCODE_ctrl']")
public static WebElement get_leadStatusCode;


@FindBy(xpath="//span[normalize-space()='Next']")
public static WebElement clk_Next ;

@FindBy(name="cust_125822")
public static WebElement sel_ldCashTransactions;

@FindBy(name="cust_125823")
public static WebElement sel_ldCustomerIsInLineWithProfile;

@FindBy(name="cust_125833")
public static WebElement sel_ldpPrformedOnCustomer;

@FindBy(name="cust_125830")
public static WebElement sel_ldAssociatedWithCustomer;

@FindBy(name="cust_125832")
public static WebElement sel_ldUtilizedForCmmrcialActivity;


@FindBy(xpath="//input[@data-autoid='cust_112566_ctrl']")
public static WebElement ent_TRNRegistrationDate ;


@FindBy(xpath="//input[@data-autoid='cust_2201_ctrl']")
public static WebElement ent_DateOfJoining;


@FindBy(name="cust_124704")
public static WebElement sel_existingHighValueIndividuals;


@FindBy(name="cust_124932")
public static WebElement sel_updateFATCAInfo;


}