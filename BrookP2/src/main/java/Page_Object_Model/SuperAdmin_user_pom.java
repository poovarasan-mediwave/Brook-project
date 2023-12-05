package Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lib_Global.Base_Class;

public class SuperAdmin_user_pom extends Base_Class {
	
	public SuperAdmin_user_pom() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//a[@href=\"/staffhub/settings/manage-roles/user-permissions\"]")
	private WebElement ClkUserlink;
	@FindBy(xpath="(//span[@class=\"edit-label\"])[4]")
	private WebElement clkEditUser;
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
	@FindBy (xpath="(//span[@class=\"checkmark\"])[4]")
	private WebElement removeArchivepermission;
	@FindBy (xpath="(//span[@class=\"checkmark\"])[5]")
	private WebElement removeunArchivepermission;
	
	
	
	
	
	
	
	public WebElement getUserlink() {
		return ClkUserlink;
	}
	public WebElement getEditUser() {
		return clkEditUser;
	}
	public WebElement getenterUserEmail() {
		return externalemail;
	}
	public WebElement ExternalNext() {
		return externalNext;
	}
	public WebElement  getenterUserPassword() {
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
	
	public WebElement getArchivepermission() {
		return removeArchivepermission;
	}
	public WebElement getunArchivepermission() {
		return removeunArchivepermission;
	}
	
	
	
	

}
