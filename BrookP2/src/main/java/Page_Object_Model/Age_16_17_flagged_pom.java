package Page_Object_Model;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lib_Global.Base_Class;

public class Age_16_17_flagged_pom extends Base_Class{
	
	
	public Age_16_17_flagged_pom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=\"Dark\"]")
	private WebElement selectDarktheme;
	@FindBy(xpath="//button[text()=\"Start\"]")
	private WebElement clkStartbtn;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn1;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn2;
	@FindBy(xpath="//p[text()=\"I'm good, let's skip to the form\"]")
	private WebElement skippreinfo;
	@FindBy(xpath = "//input[@placeholder=\"Enter your postcode\"]")
	private WebElement enterPostCode;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn3;
	@FindBy(xpath = "//select[@class=\"form-select select-style\"]")
	private WebElement clkdd1;
	@FindBy(xpath="(//select[@class=\"form-select select-style\"]/option)[6]")
	private WebElement selectAge16;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn4;
	//symptoms yes , no , don't no
	@FindBy(xpath="//button[text()=\"No\"]")
	private WebElement clkNobtn;
	@FindBy(xpath="//button[text()=\"Yes\"]")
	private WebElement yesbtn;
	@FindBy(xpath="//button[text()=\"Don't know\"]")
	private WebElement clkDontknowbtn;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn5;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn6;
	//typeofsex
	@FindBy(id="flexCheckDefault")
	private WebElement clkVaginalbox;
	@FindBy(xpath="//button[text()=\"given\"]")
	private WebElement selectVaginalgiven;
	@FindBy(xpath="//button[text()=\"received\"]")
	private WebElement selectVaginalreceived;
	@FindBy(xpath="//input[@value=\"Anal\"]")
	private WebElement clkanal;
	@FindBy(xpath="(//button[@type='button'][normalize-space()='received'])[2]")
	private WebElement AnalReceived;
	@FindBy(xpath="//input[@value=\"Toys\"]")
	private WebElement clktoycheckBox;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn7;
	
	//genitals
	@FindBy(id="flexCheckDefault")
	private WebElement clkvaginacheckbox;
	@FindBy(xpath="//input[@value=\"Penis\"]")
	private WebElement clkpenischeckbox;
	@FindBy(xpath="//input[@value=\"I don't know\"]")
	private WebElement dontknowCheckbox;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn8;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn9;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn10;
	
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
	@FindBy(id="yes")
	private WebElement clkYesEmailconfirm;
	@FindBy(id="no")
	private WebElement clkNoemailConfirm;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn14;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn15;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[1]")
	private WebElement clkconsentCheckbox1;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[2]")
	private WebElement clkconsentCheckbox2;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[3]")
	private WebElement clkconsentCheckbox3;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[4]")
	private WebElement clkconsentCheckbox4;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[5]")
	private WebElement clkconsentCheckbox5;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[6]")
	private WebElement clkconsentCheckbox6;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[7]")
	private WebElement clkconsentCheckbox7;
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[8]")
	private WebElement clkconsentCheckbox8;
	//@FindBy(xpath="//div[text()=\"None of the above apply to me\"]")
	@FindBy(xpath="(//input[@id=\"vehicle1\"])[9]")
	private WebElement clkconsentCheckbox9;
	@FindBy(id="u_18_consent_barrier")
	private WebElement clkSubmitBtn;
	@FindBy(xpath= "//button[text()=\"Finish\"]")
	private WebElement clkfinish;
	@FindBy(xpath="//span[text()=\"Phone\"]")
	private WebElement selectPhone;
	@FindBy(xpath="//span[text()=\"Client contacted\"]")
	private WebElement clkClientcontacted;
	@FindBy(xpath="//div[@class=\"sub-btn\"]/button[2]")
	private WebElement clkrejectbtn;
	@FindBy(xpath="(//span[@class='checkmark'])[1]")
	private WebElement clkclientcheckbox;
	@FindBy(xpath="(//span[@class='checkmark'])[2]")
	private WebElement reasoncheckbox1;
	@FindBy(xpath="(//span[@class='checkmark'])[3]")
	private WebElement reasoncheckbox2;
	@FindBy(xpath="(//span[@class='checkmark'])[4]")
	private WebElement reasoncheckbox3;
	@FindBy(xpath="(//span[@class='checkmark'])[5]")
	private WebElement reasoncheckbox4;
	@FindBy(xpath=" //button[normalize-space()='Reject test kit']")
	private WebElement clkRejectKit;
	@FindBy(xpath="(//div[@class='popup-btn close-pop'])[1]")
	private WebElement clkcloselink;
	@FindBy(xpath="(//a[normalize-space()='Rejected'])[1]")
	private WebElement rejectedTab;
	
	
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn17;
	
	
	public WebElement darkTheme() {
		return selectDarktheme;
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
	public WebElement SkipPreinfo() {
		return skippreinfo;
	}
	public WebElement Enterpostcode() {
		return enterPostCode;
	}
	public WebElement clknextbtn3() {
		return ClkNextBtn3;
		
	}
	public WebElement clkDD() {
		return clkdd1;
	}
	public WebElement ddSelectage() {
		
		return selectAge16;
	}
	public WebElement clknextbtn4() {
	return ClkNextBtn4;
	}
	//symptoms yes , no , don't no
	public WebElement clknobtn() {
		return clkNobtn;
	}
	public WebElement clkYesbtn() {
		return yesbtn;
	}
	public WebElement dontknow() {
		return clkDontknowbtn;
	}
	public WebElement clknextbtn5() {
		return ClkNextBtn5;
		}
	public WebElement clknextbtn6() {
		return ClkNextBtn6;
		}
	public WebElement Clkvaginal() {
		return clkVaginalbox;
	}
	public WebElement VaginalGiven() {
		return selectVaginalgiven;
	}
	public WebElement VaginalReceived() {
		return selectVaginalreceived;
	}
	public WebElement ClkAnal() {
		return clkanal;
	}
	public WebElement analreceived() {
		return AnalReceived;
	}
	public WebElement  toyCheckbox() {
		return clktoycheckBox;
	}
	public WebElement clknextbtn7() {
		return ClkNextBtn7;
		}
	public  WebElement vaginaCheckBox() {
		return clkvaginacheckbox;
	}
	public WebElement PenisCheckbox() {
		return clkpenischeckbox;
		
	}
	public WebElement dontknowcheckbox() {
		return dontknowCheckbox;
	}
	public WebElement clknextbtn8() {
		return ClkNextBtn8;
		}
	public WebElement clknextbtn9() {
		return ClkNextBtn9;
		}
	public WebElement clknextbtn10() {
		return ClkNextBtn10;
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
	public WebElement clkYesemailConfirm() {
		return clkYesEmailconfirm;
	}
	public WebElement clknoEmailconfirm() {
		return clkNoemailConfirm;
	}
	public WebElement clknextbtn14() {
		return ClkNextBtn14;
	}
	
	public WebElement clkConsentcheckbox1() {
		return clkconsentCheckbox1;
	}
	public WebElement clkConsentcheckbox2() {
		return clkconsentCheckbox2;
	}
	public WebElement clkConsentcheckbox3() {
		return clkconsentCheckbox3;
	}
	public WebElement clkConsentcheckbox4() {
		return clkconsentCheckbox4;
	}
	public WebElement clkConsentcheckbox5() {
		return clkconsentCheckbox5;
	}
	public WebElement clkConsentcheckbox6() {
		return clkconsentCheckbox6;
	}
	public WebElement clkConsentcheckbox7() {
		return clkconsentCheckbox7;
	}
	
	public WebElement clkConsentcheckbox8() {
		return clkconsentCheckbox8;
	}
	public WebElement clkConsentcheckbox9() {
		return clkconsentCheckbox9;
	}
	public WebElement clknextbtn15() {
		return ClkNextBtn15;
	}
	public WebElement submitBtn() {
		return clkSubmitBtn;
	}
	public WebElement ClkFinish() {
		return clkfinish;
	}
	public WebElement selectphone() {
		return  selectPhone;
	}
	public WebElement clkClientContacted() {
		return clkClientcontacted;
	}
	public WebElement clkRejectbtn() {
		return clkrejectbtn;
	}
	public WebElement clkclientcheckBox() {
		return clkclientcheckbox;
	}
	public WebElement Reasoncheckbox1() {
		return reasoncheckbox1;
	}
	public WebElement Reasoncheckbox2() {
		return reasoncheckbox2;
	}
	public WebElement Reasoncheckbox3() {
		return reasoncheckbox3;
	}
	public WebElement Reasoncheckbox4() {
		return reasoncheckbox4;
	}
	public WebElement clkRejectkit() {
		return clkRejectKit;
	}
	public WebElement clkcloseLink() {
		return clkcloselink;
	}
	public WebElement clkrejectedtab() {
		return rejectedTab;
	}
	public WebElement clknextbtn17() {
		return ClkNextBtn17;
	}
}

