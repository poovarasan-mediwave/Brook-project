package Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lib_Global.Base_Class;

public class Superadmin_manager_pom extends Base_Class {
	
	public Superadmin_manager_pom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//img[@alt='Settings'])[1]")
	private WebElement clkSetting;
	@FindBy (xpath="//button[normalize-space()='Add team member']")
	private WebElement ClkAddTeamMember;
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement enterteamMemberemail;
	@FindBy(xpath="//input[@name=\"confirmEmail\"]")
	private WebElement enterteamConfirmEmail;
	@FindBy(xpath="(//div[normalize-space()='Select locations'])[2]")
	private WebElement ClkLocation;
	@FindBy(xpath="(//div[normalize-space()='Select locations'])[2]")
	private WebElement ClkLocation1;
	@FindBy(xpath="(//div[@id=\"react-select-10-option-0\"])[1]")
	private WebElement selectlocation1;
	@FindBy(xpath="(//div[@id=\"react-select-10-option-1\"])[1]")
	private WebElement selectlocation2;
	@FindBy(xpath="(//div[normalize-space()='Select role'])[2]")
	private WebElement clkRole;
	@FindBy(xpath="//div[text()=\"Manager\"]")
	private WebElement roleAsmanager;
	@FindBy(xpath="(//button[normalize-space()='Send invite link'])[1]")
	private WebElement clkSendinviteLink;
	@FindBy(xpath="(//a[normalize-space()='Manage roles'])[1]")
	private WebElement clkManageRoletab;
	//manager Archive
	@FindBy(xpath="(//span[@class='edit-label'][normalize-space()='Edit'])[2]")
	private WebElement clkeditlink;
	@FindBy (xpath="(//span[@class=\"checkmark\"])[4]")
	private WebElement removeArchivepermission;
	@FindBy(xpath="(//img[@alt='Logout'])[1]")
	private WebElement clkLogout;
	@FindBy(xpath="(//div[@role=\"button\"])[1]")
	private WebElement clklogoutpopup;
	@FindBy(xpath="(//button[normalize-space()='Update'])[1]")
	private WebElement clkupdatebtn;
	@FindBy(xpath="(//span[@class=\"checkmark\"])[9]")
	private WebElement clkNewteamMember;
	//manager user login
	
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
	
	@FindBy(xpath=" (//a[normalize-space()='Rejected'])[1]")
	private WebElement clkRejectedTab;
	@FindBy (xpath="(//span[@class='checkmark'])[5]")
	private WebElement clkUnarchivepermission;
	@FindBy(xpath="(//a[normalize-space()='Archive'])[1]")
	private WebElement clkArchiveTab;
	@FindBy (xpath="(//span[@class='checkmark'])[6]")
	private WebElement Exportpermission;
	@FindBy(xpath="(//span[@class='checkmark'])[7]")
	private WebElement clkviewfulldetails;
	@FindBy(xpath="(//td[@data-label='Name'])[1]")
	private WebElement ViewUserdetails;
	@FindBy(xpath="(//img[@alt='close White Icon'])[1]")
	private WebElement clkCloseicondetails;
	@FindBy(xpath="(//span[@class='checkmark'])[8]")
	private WebElement AddclientContactAttempts;
	@FindBy(xpath="(//button[contains(@class,'approve-kit-btn')])[1]")
	private WebElement clkaddcontactbtn;
	@FindBy(xpath="(//img[@alt='closeIcon'])[1]")
	private WebElement clkcontactcloseIocn;
	@FindBy(xpath="(//span[@class='checkmark'])[9]")
	private WebElement clkCreatenewTeamMember;
	@FindBy(xpath="(//span[@class='checkmark'])[10]")
	private WebElement clkArchiveteamMember;
	@FindBy(xpath="(//span[@class=\"checkmark\"])[7]")
	private WebElement clkuserArchive;
	@FindBy(xpath=" (//input[@id='vr-dots'])[1]")
	private WebElement CheckArchiveText;
	@FindBy(xpath="(//span[@class='checkmark'])[11]")
	private WebElement ManageTeamMemberLocation;
	@FindBy(xpath="(//span[@class=\"name-column\"])[6]")
	private WebElement clkUserName;
	@FindBy(xpath="(//img[@alt='closeWhiteIcon'])[1]")
	private WebElement clkLocationCloseicon;
	@FindBy(xpath="(//span[@class='checkmark'])[12]")
	private WebElement clkchangeTeamrole;
	@FindBy(xpath="(//span[@class='checkmark'])[13]")
	private WebElement clkUnarchiveTeam;
	@FindBy(xpath="(//li[@class=\"Cascade-module_dropdownMenuItem__2z87N Cascade-module_withSubitem__3m2pc\"])")
	private WebElement accountType;
	@FindBy(xpath="//a[@href=\"/staffhub/settings/manage-roles/archive-permissions\"]")
	private WebElement ClkArchiveLink;

	
	
	
	
	public WebElement getSetting() {
		return clkSetting;
	}
	public WebElement getaddTeamMember() {
		return  ClkAddTeamMember;
	}
	public WebElement getTeamemail() {
		return enterteamMemberemail;
	}
	public WebElement getTeamconfirmEmail() {
		return enterteamConfirmEmail;
	}
	public WebElement getlocations() {
		return ClkLocation;
	}
	public WebElement getEnterlocations() {
		return ClkLocation1;
	}
	public WebElement getselectlocation1() {
		return selectlocation1;
	}
	public WebElement getselectlocation2() {
		return selectlocation2;
	}
	public WebElement getClkrole() {
		return clkRole;
	}
	public WebElement getrole() {
		return roleAsmanager;
	}
	public WebElement getSendinvitelink() {
		return clkSendinviteLink;
	}
	public WebElement getmanageRoletab() {
		return clkManageRoletab;
	}
	public WebElement getEditLink() {
		return clkeditlink;
	}
	public WebElement getArchivepermission() {
		return removeArchivepermission;
	}
	public WebElement getUpdatebtn() {
		return clkupdatebtn;
	}
	public WebElement getclkNewteamMember() {
		return clkNewteamMember;
	}
	public WebElement getLogout() {
		return clkLogout;
	}
	public WebElement getclkpopup() {
		return clklogoutpopup;
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
	public WebElement getrejectedtab() {
		return clkRejectedTab;
	}
	public WebElement getUnarchivePermission() {
		return clkUnarchivepermission;
	}
	public WebElement getarchiveTab() {
		return clkArchiveTab;
	}
	public WebElement getExportPermissiom() {
		return Exportpermission;
	}
	public WebElement getFulldetails() {
		return clkviewfulldetails;
	}
	public WebElement getViewUserDetails() {
		return ViewUserdetails;
	}
	public WebElement getcloseIocndetails() {
		return clkCloseicondetails;
	}
	public WebElement getAddclientContactAttempts() {
		return AddclientContactAttempts;
	}
	public WebElement getaddcontactbtn() {
		return clkaddcontactbtn;
	}
	public WebElement getclkcontactcloseIcon() {
		return clkcontactcloseIocn;
	}
	public WebElement getcreate_newTeamMember() {
		return clkCreatenewTeamMember;
	}
	public WebElement getArchiveteamMember() {
		return clkArchiveteamMember;
	}
	public WebElement getUserArchive() {
		return clkuserArchive;
	}
	public WebElement getviewArchiveText() {
		return CheckArchiveText;
	}
	public WebElement getManageTeamMemberLocation() {
		return ManageTeamMemberLocation;
	}
	public WebElement getUserName() {
		return clkUserName;
	}
	public WebElement getlocationcloseIcon() {
		return clkLocationCloseicon;
	}
	public WebElement getChangeTeamRole() {
		return clkchangeTeamrole;
	}
	public WebElement GetUnacrchiveTeam() {
		return clkUnarchiveTeam;
	}
	public WebElement getaccountType() {
		return accountType;
	}
	public WebElement getClkArchiveLink() {
		return ClkArchiveLink;
	}
}
