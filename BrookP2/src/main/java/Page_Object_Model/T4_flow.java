package Page_Object_Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lib_Global.Base_class1;

public class T4_flow extends Base_class1 {

	public T4_flow() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@aria-labelledby='button-group-title']/li/button")
	private List<WebElement> themes;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Start']")
	private WebElement start_button;

	@FindBy(xpath = "//input[@id='postCode']")
	private WebElement postcode_field;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Next']")
	private WebElement next_button;

	@FindBy(id = "postageverification")
	private WebElement age;

	@FindBy(xpath = "//select[@id='postageverification']/option")
	private List<WebElement> age_selection;

	@FindBy(xpath = "//ul[@aria-labelledby='postAge-btn']/li/button")
	private List<WebElement> symptoms;

	@FindBy(xpath = "//button[@id='perinfo4']")
	private WebElement preinfo_button;

	@FindBy(xpath = "//div[@class='pad-tp font-check mb-4']/div/input")
	private List<WebElement> genitals_types;

	@FindBy(id = "checkBoxId")
	private WebElement throatandRectum_checkbox;

	@FindBy(xpath = "//div[@class='pad-tp font-check mb-4']/label/span")
	private List<WebElement> bloodsample_types;

	@FindBy(xpath = "//div[@class='sti-kit-radio-blk']/label/span")
	private List<WebElement> risk_hepatitis_options;

	@FindBy(id = "firstName")
	private WebElement firstname;

	@FindBy(xpath = "//input[@aria-label='Last name']")
	private WebElement lastname;

	@FindBy(xpath = "//div[@class='dateofbirth-head']/select")
	private List<WebElement> dob;

	@FindBy(xpath = "//div[@class='dateofbirth-head']/select/option[normalize-space()='Year']/following-sibling::option")
	private List<WebElement> year_list;

	@FindBy(xpath = "//input[@aria-label='Enter your Mobile Number']")
	private WebElement mobilenumber;

	@FindBy(xpath = "//input[@aria-label='Enter your Email Address']")
	private WebElement emialaddress;

	@FindBy(xpath = "//div[@class='b1-style b1-style Dark-txt-global']/div/input")
	private List<WebElement> mail_confirmation;

	@FindBy(id = "address_form_id")
	private WebElement address;

	@FindBy(xpath = "//input[@aria-describedby='emailHelp'][@placeholder='Enter your town/city']")
	private WebElement town;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Confirm']")
	private WebElement confirm_button;

	@FindBy(xpath = "//input[@id='vehicle1']")
	private WebElement consent_checkbox;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Submit']")
	private WebElement submit_button;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Finish']")
	private WebElement Finish_button;

	@FindBy(xpath = "//button[normalize-space()='Allow all']")
	private WebElement allow_option;

	@FindBy(xpath = "//h1[normalize-space()='Your free & confidential sexual health & wellbeing experts']")
	private WebElement verify_brook;

	@FindBy(xpath = "//input[@placeholder='Enter your gender']")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}

	public WebElement getAllow_option() {
		return allow_option;
	}

	public WebElement getVerify_brook() {
		return verify_brook;
	}

	public List<WebElement> getThemes() {
		return themes;
	}

	public WebElement getStart_button() {
		return start_button;
	}

	public WebElement getPostcode_field() {
		return postcode_field;
	}

	public WebElement getNext_button() {
		return next_button;
	}

	public WebElement getAge() {
		return age;
	}

	public List<WebElement> getAge_selection() {
		return age_selection;
	}

	public List<WebElement> getSymptoms() {
		return symptoms;
	}

	public WebElement getPreinfo_button() {
		return preinfo_button;
	}

	public List<WebElement> getGenitals_types() {
		return genitals_types;
	}

	public WebElement getThroatandRectum_checkbox() {
		return throatandRectum_checkbox;
	}

	public List<WebElement> getBloodsample_types() {
		return bloodsample_types;
	}

	public List<WebElement> getRisk_hepatitis_options() {
		return risk_hepatitis_options;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public List<WebElement> getDob() {
		return dob;
	}

	public List<WebElement> getYear_list() {
		return year_list;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getEmialaddress() {
		return emialaddress;
	}

	public List<WebElement> getMail_confirmation() {
		return mail_confirmation;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getTown() {
		return town;
	}

	public WebElement getConfirm_button() {
		return confirm_button;
	}

	public WebElement getSubmit_button() {
		return submit_button;
	}

	public WebElement getConsent_checkbox() {
		return consent_checkbox;
	}

	public WebElement getFinish_button() {
		return Finish_button;
	}

}
