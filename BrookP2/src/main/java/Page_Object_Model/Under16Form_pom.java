package Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Lib_Global.Base_Class;

public class Under16Form_pom extends Base_Class{
	
	
	public Under16Form_pom() {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//button[text()=\"Dark\"]")
	private WebElement SelectTheme;
	@FindBy(xpath="//button[text()=\"Start\"]")
	private WebElement clkStartbtn;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn1;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn2;
	@FindBy(xpath = "//button[text()=\"Yes, I'd like to know more\"]")
	private WebElement clkYesBtn;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn3;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn4;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn5;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn6;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn7;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn8;
	@FindBy(xpath = "//input[@placeholder=\"Enter your postcode\"]")
	private WebElement enterPostCode;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn9;
	@FindBy(xpath = " (//select[@aria-label='Default select example'])[1]")
	private WebElement clkdd;
	//@FindBy(xpath="(//select[@class=\"form-select select-style\"]/option)[4]")
	//private WebElement selectAge;
	@FindBy(xpath="//select[@class=\"form-select select-style\"]")
	private WebElement selectAge;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn10;
	@FindBy(id="undr_16_sti")
	private WebElement clkProceedbtn;
	@FindBy(xpath="//input[@aria-label=\"first name\"]")
	private WebElement EnterFirstName;
	@FindBy(xpath="//input[@placeholder=\"Enter your last name\"]")
	private WebElement EnterLastName;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn11;
	@FindBy(xpath="//select[@class=\"form-select select-style\"]")
	private WebElement clkDate;
	@FindBy(xpath="(//select[@class=\"form-select select-style\"]/option)[4]")
	private WebElement SelectDate;
	@FindBy(xpath = "//select[@class=\"form-select select-style ml-2\"][1]")
	private WebElement clkMonth;
	@FindBy(xpath="(//select[@class=\"form-select select-style ml-2\"]/option)[4]")
	private WebElement SelectMonth;
	@FindBy (xpath = "//select[@class=\"form-select select-style ml-2\"][2]")
	private WebElement clkYear;
	@FindBy(xpath="(//select[@class=\"form-select select-style ml-2\"][2]/option)[2]")
	private WebElement selectYear;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn12;
	@FindBy(xpath="//input[@aria-label=\"Enter your Mobile Number\"]")
	private WebElement enterMobileno;
	@FindBy(xpath="//input[@placeholder=\"Enter your Email Address\"]")
	private WebElement enterEmail;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn13;
	@FindBy(id="u_16_completion")
	private WebElement clkFinishbtn;
	@FindBy(xpath= "//button[text()=\"Finish\"]")
	private WebElement clkfinish;
	@FindBy(xpath="//span[text()=\"Continue with Microsoft Azure\"]")
	private WebElement clkAzureLoginbtn;
	@FindBy(xpath = "//input[@id='i0116']")
	private WebElement externalemail;
	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement externalNext;
	@FindBy(xpath = "//input[@id='i0118']")
	private WebElement externalPassword;
	@FindBy(id = "idSIButton9")
	private WebElement exSigninbtn;
	@FindBy(id="KmsiCheckboxField")
	private WebElement clkCheckBox;
	@FindBy(id="idSIButton9")
	private WebElement exYesBtn;
	@FindBy(xpath="//a[text()=\"Orders and Results\"]")
	private WebElement clkOrderResultLink;
	@FindBy(xpath="(//button[contains(@class,'approve-kit-btn')])[1]")
	private WebElement addContactattempts;
	@FindBy(xpath="//div[@class=\" css-1s2u09g-control\"]")
	private WebElement selecttype;
	@FindBy(xpath="//span[@class=\"pl-2\"]")
	private WebElement selectEmailtype;
	@FindBy(xpath= "//div[@class='react-datepicker__input-container']")
	private WebElement clkattemptsDate;
	@FindBy(xpath="//div[@class=\"react-datepicker__month\"]/div[2]/div[5]")
	private WebElement Selectcontactdate;
	@FindBy(xpath="//div[@class=\"react-time-picker__inputGroup\"]/input[2]")
	private WebElement enterhr;
	@FindBy(xpath="//div[@class=\"react-time-picker__inputGroup\"]/input[3]")
	private WebElement entermin;
	@FindBy(xpath ="//select[@name=\"amPm\"]")
	private WebElement clktimepicker;
	@FindBy(xpath="//option[@value=\"pm\"][1]")
	private WebElement selecttimenoon;
	@FindBy(xpath="//div[@class=\"react-select__value-container css-1d8n9bt\"]")
	private WebElement clkresultres;
	@FindBy(xpath="//span[text()=\"Awaiting response\"]")
	private WebElement selectresponse;
	@FindBy(xpath= "//button[text()=\"Save\"]")
	private WebElement Clksavebtn;
	@FindBy(xpath="(//button[@class='approve-kit-btn'][normalize-space()='Approve'])[1]")
	private WebElement clkApproveBtn;
	@FindBy(xpath="(//span[@class='checkmark'])[1]")
	private WebElement clkClientcontactbox;
	@FindBy(id="address_1")
	private WebElement enterAddres1;
	@FindBy(id="address_2")
	private WebElement enterAddress2;
	@FindBy(id="town")
	private WebElement entertown;	
	@FindBy(xpath="(//div[@class=\"select-form__control css-1s2u09g-control\"])[1]")
	private WebElement selectEthnicity;
	@FindBy(xpath="(//input[@id=\"vehicle1\"])[1]")
	private WebElement clkstate;
	@FindBy(xpath="(//div[@class=\"select-form__input-container css-nwjfc\"])[2]")
	private WebElement ClkIdentity;
	@FindBy(xpath="//div[text()=\"Woman or girl\"]")
	private WebElement selectIdentity;
	@FindBy(xpath="//textarea[@class=\"form-control h-textbox w-txt area-color\"]")
	private WebElement enterNote;
	@FindBy(xpath="//button[text()=\"Approve test kit\"]")
	private WebElement clkApprovekitbtn;
	@FindBy(xpath="//span[@class=\"checkmark\"]")
	private WebElement clkLiliecheckbox;
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement clkFinishbtn1;
	@FindBy(xpath="//a[@href=\"/staffhub/order-kit?filters=Approved\"]")
	private WebElement viewApprovedList;
	
	
	
	
	
	
	public WebElement getselectTheme (){
		return SelectTheme;
		
	}
	public WebElement ClkstartBtn() {
		return clkStartbtn;
		
	}
	public WebElement clknextbtn() {
		return ClkNextBtn;
		
	}
	public WebElement clknextbtn1() {
		return ClkNextBtn1;
		
	}
	public WebElement clknextbtn2() {
		return ClkNextBtn2;
		
	}
	public WebElement clkyesbtn() {
		return clkYesBtn;
	}
	
	public WebElement clknextbtn3() {
		return ClkNextBtn3;
		
	}public WebElement clknextbtn4() {
		return ClkNextBtn4;
		
	}public WebElement clknextbtn5() {
		return ClkNextBtn5;
		
	}
	public WebElement clknextbtn6() {
		return ClkNextBtn6;
		
	}
	public WebElement clknextbtn7() {
		return ClkNextBtn7;
		
	}
	public WebElement clknextbtn8() {
		return ClkNextBtn8;
		
	}
	
	public WebElement Enterpostcode() {
		return enterPostCode;
	}
	public WebElement clknextbtn9() {
		return ClkNextBtn9;
		
	}
	public WebElement ddSelectage() {
		
		return selectAge;
	}
	public WebElement clkDD() {
		return clkdd;
	}
	public WebElement clknextbtn10() {
		return ClkNextBtn10;
		
	}
	public WebElement  ClkproceedBtn() {
		return clkProceedbtn;
	}
	
	public WebElement enterfirstname() {
		return EnterFirstName;
	}
	
	public WebElement enterlastname() {
		return EnterLastName;
	}
	public WebElement clknextbtn11() {
		return ClkNextBtn11;
		
	}
	
	public WebElement clkdate() {
		return clkDate;
	}
	public WebElement selectdate() {
		return SelectDate;
	}
	
	public WebElement clkmonth() {
		return clkMonth;
	}
	public WebElement selectmonth() {
		return SelectMonth;
	}
	public WebElement clkyear() {
		return clkYear;
	}
	public WebElement selectyear() {
		return selectYear;
	}
	
	public WebElement clknextbtn12() {
		return ClkNextBtn12;
	}
	public WebElement EnterMobileno() {
		return enterMobileno;
	}
	public WebElement Enteremail() {
		return enterEmail;
	}

	public WebElement clknextbtn13() {
		return ClkNextBtn13;
	}
	public WebElement Clkfinishbtn() {
		return clkFinishbtn;
	}
	public WebElement ClkFinish() {
		return clkfinish;
	}
	
	public WebElement clkazurelogin() {
		return clkAzureLoginbtn;
	}
	
	public WebElement enterazureEmail() {
		return externalemail;
	}
	public WebElement ExternalNext() {
		return externalNext;
	}
	public WebElement  extPassword() {
		return externalPassword;
	}
	public WebElement Signinbtn() {
		return exSigninbtn;
	}
	public WebElement clkcheckbox() {
		return clkCheckBox;
	}
	public WebElement exyesbtn() {
		return exYesBtn;
	}
	public WebElement ClkorderResult() {
		return clkOrderResultLink;
	}
	
	public WebElement Contactattempts() {
		return addContactattempts;
	}
	
	public WebElement SelectType() {
		return selecttype;
	}
	public WebElement selectemailType() {
		return selectEmailtype;
	}
	public WebElement AttemptsDate() {
		return clkattemptsDate;
	}
	public WebElement SelectcontactDate() {
		return Selectcontactdate;
	}
	public WebElement EnterHr() {
		return enterhr;
	}
	public WebElement EnterMin() {
		return entermin;
	}
	
	public WebElement TimePicker() {
		return clktimepicker;
	}
	public WebElement selecTimeNoon() {
		return selecttimenoon;
	}
	
	public WebElement ResultRes() {
		return clkresultres;
		
	}
	public WebElement SelectResponse() {
		return selectresponse;
	}
	public WebElement clkSaveBtn() {
		return Clksavebtn;
	}
	public WebElement clkapprovebtn() {
		return clkApproveBtn;
	}
	public WebElement clientcheckbox() {
		return clkClientcontactbox;
	}
	public WebElement EnterAddress1() {
		return enterAddres1;
	}
	public WebElement EnterAddress2() {
		return enterAddress2;
	}
	public WebElement EnterTown() {
		return entertown;
	}
	public WebElement SelectEthnicity()  {	
		return selectEthnicity;
	}
	public WebElement ClkState() {
		 return clkstate;
	}
	public WebElement Clkidentity() {
		return ClkIdentity;
	}
	public WebElement Selectidentity() {
		return selectIdentity;
	}
	
	public WebElement EnterNote() {
		return enterNote;
	}
	public WebElement clkApprovekitBtn() {
		return clkApprovekitbtn;
	}
	public WebElement clkliliecheckbox() {
		return clkLiliecheckbox;
	}
	public WebElement clkfinishBtn1() {
		return clkFinishbtn1;
	}
	public WebElement ViewApprovedlist() {
		return viewApprovedList;
	}
}
