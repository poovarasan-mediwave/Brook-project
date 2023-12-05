package Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lib_Global.Base_Class;

public class Age16_17_autoApprove_pom extends Base_Class{
	
	public Age16_17_autoApprove_pom() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="(//select[@class=\"form-select select-style\"]/option)[6]")
	private WebElement selectAge16;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn16;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn17;
	@FindBy(xpath="(//input[@placeholder='Enter your address line 1'])[1]")
	private WebElement EnterAddressline1;
	@FindBy(xpath="(//input[@placeholder='Enter your address line 2'])[1]")
	private WebElement enteraddressline2;
	@FindBy(xpath="//input[@placeholder='Enter your postcode']")
	private WebElement jspostcode;
	@FindBy(xpath="(//input[@placeholder='Enter your address line 3'])[1]")
	private WebElement enterAddressline3;
	@FindBy(xpath="(//input[@placeholder='Enter your town/city'])[1]")
	private WebElement enterTown;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn18;
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	private WebElement clkConfirmBtn;
	@FindBy(xpath="(//input[@id='vehicle1'])[1]")
	private WebElement clkConfirmCheckbox;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn19;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn20;
	@FindBy(xpath="(//input[@id=\"vehicle1\"])[1]")
	private WebElement selectAsian;
	@FindBy(xpath="(//input[@id=\"vehicle1\"])[3]") 
	private WebElement selectPakistani;
	//gender
	@FindBy(xpath="//button[text()=\"Woman or girl\"]")
	private WebElement genderAsWoman;
	@FindBy(xpath="//button[text()=\"Man or boy\"]")
	private WebElement genderAsMan;
	@FindBy(xpath="//button[text()=\"Non-binary\"]")
	private WebElement genderAsNonbinary;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn21;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn22;
	@FindBy(xpath="//button[text()=\"Next\"]")
	private WebElement ClkNextBtn23;
	@FindBy(xpath="//button[text()=\"Finish\"]")
	private WebElement clkFinishbtn;

	
	public WebElement Getselectage() {
		return selectAge16;
	}
	public WebElement Clknextbtn16() {
		return ClkNextBtn16;
	}
	public WebElement Clknextbtn17() {
		return ClkNextBtn17;
	}
	public WebElement Getaddressline1() {
		return EnterAddressline1;
	}
	public WebElement getaddressline2() {
		return enteraddressline2;
	}
	public WebElement getjsPostcode() {
		return jspostcode;
	}
	public WebElement getenterAddressline3() {
		return enterAddressline3;
	}
	public WebElement gettown() {
		return enterTown;
	}
	public WebElement Clknextbtn18() {
		return ClkNextBtn18;
	}
	public WebElement getConfirnbtn() {
		return clkConfirmBtn;
	}
	public WebElement getConfirmCheckbox() {
		return clkConfirmCheckbox;
	}
	public WebElement Clknextbtn19() {
		return ClkNextBtn19;
	}
	public WebElement Clknextbtn20() {
		return ClkNextBtn20;
	}
	public WebElement getAsian() {
		return selectAsian;
	}
	public WebElement getPakistani() {
		return selectPakistani;
	}
	public WebElement getgenderAsWoman() {
		return genderAsWoman;
	}
	public WebElement getgenderAsMan() {
		return genderAsMan;
	}
	public WebElement getgenderAsNonbinary() {
		return genderAsNonbinary;
	}
	public WebElement Clknextbtn21() {
		return ClkNextBtn21;
	}
	public WebElement Clknextbtn22() {
		return ClkNextBtn22;
	}
	public WebElement Clknextbtn23() {
		return ClkNextBtn23;
	}
	public WebElement getclkFinishbtn() {
		return clkFinishbtn;
	}
}
