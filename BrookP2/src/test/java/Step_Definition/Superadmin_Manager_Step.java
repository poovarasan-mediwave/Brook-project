package Step_Definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_Class;
import Page_Object_Model.Superadmin_manager_pom;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Superadmin_Manager_Step extends Base_Class {
	public static Singleton ST = new Singleton();

	@Given("User able to launch the staff url")
	public void user_able_to_launch_the_staff_url() throws IOException, InterruptedException {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		// String url = FileReaderManager.getInstanceFRM().getInstanceCR().getURL();
		// getDrive(url);
	}

	@Given("Enter the super admin Email id {string} and Password {string}")
	public void enter_the_super_admin_email_id_and_password(String string, String string2)
			throws IOException, InterruptedException {
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		// ClickOnElement(ST.getunder16form().clkcheckbox());
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);

	}

	@When("Click on the setting icon and redirect to permission page")
	public void click_on_the_setting_icon_and_redirect_to_permission_page() {
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
	}

	@Given("click on the add team memeber button")
	public void click_on_the_add_team_memeber_button() {
		ClickOnElement(ST.getsuperadmin_manager().getaddTeamMember());

	}

	@Given("Enter the email and confirm email")
	public void enter_the_email_and_confirm_email() throws IOException {
		String teamEmail1 = FileReaderManager.getInstanceFRM().getInstanceSA().getTeamemailadress();
		EnterText(ST.getsuperadmin_manager().getTeamemail(), teamEmail1);
		String TeamConfirmemail1 = FileReaderManager.getInstanceFRM().getInstanceSA().getTeamConfirmemail();
		EnterText(ST.getsuperadmin_manager().getTeamconfirmEmail(), TeamConfirmemail1);
	}

	@Given("select the location")
	public void select_the_location() throws InterruptedException, IOException, AWTException {

		ClickOnElement(ST.getsuperadmin_manager().getlocations());
		//Thread.sleep(2000);
		String location1 = FileReaderManager.getInstanceFRM().getInstanceSA().getlocation1();
		EnterText(ST.getsuperadmin_manager().getEnterlocations(), location1);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);

	}

	@Given("choose the role and click on the send invite link button")
	public void choose_the_role_and_click_on_the_send_invite_link_button() {
		ClickOnElement(ST.getsuperadmin_manager().getClkrole());
		ClickOnElement(ST.getsuperadmin_manager().getrole());
		ClickOnElement(ST.getsuperadmin_manager().getSendinvitelink());
	}

	@Given("Redirect the manage roles page")
	public void redirect_the_manage_roles_page() {
		ClickOnElement(ST.getsuperadmin_manager().getmanageRoletab());
		browserquit();

	}

	@Given("click on the edit link")
	public void click_on_the_edit_link() throws IOException, InterruptedException {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);

	}

	@Given("Remove the archive a record permission")
	public void remove_the_archive_a_record_permission() throws Exception {
		Thread.sleep(2000);
		//jsScrollDownElement(ST.getsuperadmin_manager().getArchivepermission());
	//	Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getArchivepermission());
		screenshot("1_Superadmin_Archive.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles=driver.getWindowHandles();
		for (String handle : handles) {
		if(!handle.equals(Parenthandle)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);
	}

	@Given("login as manager and verify the removed the permission present or not")
	public void login_as_manager_and_verify_the_removed_the_permission_present_or_not() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getrejectedtab());
		screenshot("2_archiveTab.png");
	}

	@Given("Logout the manager login")
	public void logout_the_manager_login() throws InterruptedException {
		String Parenthandle=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles=driver.getWindowHandles();
		for (String handle : handles) {
		if(!handle.equals(Parenthandle)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}	
	}

	@Given("login as super admin after the give the archive permission and logout")
	public void login_as_super_admin_after_the_give_the_archive_permission_and_logout() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getArchivepermission());
		screenshot("3_superadmin_updatearchive.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle1=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles1=driver.getWindowHandles();
		for (String handle : handles1) {
		if(!handle.equals(Parenthandle1)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
	}

	@Given("login manager and verify the manager archive permisssion")
	public void login_manager_and_verify_the_manager_archive_permisssion() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getrejectedtab());
		screenshot("4_add_archive.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}

	}
	
// Unarchive Permission -----------
	
	@Given("click edit link")
	public void click_edit_link() throws IOException, InterruptedException {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);

	}

	@Given("Remove the unarchive a record permission and logout")
	public void remove_the_unarchive_a_record_permission_and_logout() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getUnarchivePermission());
		Thread.sleep(3000);
		screenshot("5_Superadmin_remove_Unarchive_permission.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles=driver.getWindowHandles();
		for (String handle : handles) {
		if(!handle.equals(Parenthandle)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);
	}

	@Given("login manager and verify the removed the permission display or not and logout")
	public void login_manager_and_verify_the_removed_the_permission_display_or_not_and_logout() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("6_removed_Unarchive_Permission.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}
	}

	@Given("login super admin after the give the unarchive permission and logout")
	public void login_super_admin_after_the_give_the_unarchive_permission_and_logout() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getUnarchivePermission());
		Thread.sleep(3000);
		screenshot("7_Superadmin_again_update_permission.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle3=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles3=driver.getWindowHandles();
		for (String handle : handles3) {
		if(!handle.equals(Parenthandle3)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);
		
	}

	@Given("Again login manager and verify the manager unarchive permisssion")
	public void again_login_manager_and_verify_the_manager_unarchive_permisssion() throws Exception {

		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(3000);
		screenshot("8_updated_Unarchive_Permission.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}

	}
// export archive record 
	@Given("Remove the export archive access")
	public void remove_the_export_archive_access() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getExportPermissiom());
		Thread.sleep(3000);
		screenshot("9_Superadmin_remove_Export_permission.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);
	}

	@Given("verify the manager login updated permission")
	public void verify_the_manager_login_updated_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("10_Verify_export_Permission.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}

		
	}

	@Given("After login super admin again update permission")
	public void after_login_super_admin_again_update_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getExportPermissiom());
		Thread.sleep(3000);
		screenshot("11_Superadmin_updateExport_permission.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle3=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles3=driver.getWindowHandles();
		for (String handle : handles3) {
		if(!handle.equals(Parenthandle3)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);


	}

	@Given("Again verify the manager login")
	public void again_verify_the_manager_login() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(3000);
		screenshot("12_View_updated_export_Permission.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}

	}

	// View the User full details record
	@Given("Remove the view full details of record for the manager")
	public void remove_the_view_full_details_of_record_for_the_manager() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		//ClickOnElement(ST.getunder16form().ClkorderResult());
		//Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getFulldetails());
		Thread.sleep(3000);
		screenshot("13_Uncheck_fullDetails.png");
		//jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-400)", "");
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);

	}

	@Given("check manager login updated permission")
	public void check_manager_login_updated_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getViewUserDetails());
		Thread.sleep(5000);
		screenshot("Verify_details.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}
	}

	@Given("Again super admin user login and update permission again")
	public void again_super_admin_user_login_and_update_permission_again() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getFulldetails());
		Thread.sleep(3000);
		screenshot("14_clk_detailsCheckbox.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle3=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles3=driver.getWindowHandles();
		for (String handle : handles3) {
		if(!handle.equals(Parenthandle3)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);


	}

	@Then("Verify the manager login for permission update or not")
	public void verify_the_manager_login_for_permission_update_or_not() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getViewUserDetails());
		Thread.sleep(4000);
		screenshot("15_Viewdetails_again.png");
		ClickOnElement(ST.getsuperadmin_manager().getcloseIocndetails());
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}


	}
//@Manager_client_Contact
	@Given("Uncheck add client contact attempts for the manager")
	public void uncheck_add_client_contact_attempts_for_the_manager() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getAddclientContactAttempts());
		Thread.sleep(3000);
		screenshot("16_Uncheck_clientContact.png");
		js.executeScript("window.scrollBy(0,-400)", "");
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);
	}

	@Given("User check manager login updated permission")
	public void user_check_manager_login_updated_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		System.out.println("Contact attempts");
		//ClickOnElement(ST.getsuperadmin_manager().getViewUserDetails());
		//Thread.sleep(5000);
		screenshot("17_Verify_details.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}

	}

	@Given("User should login as super admin and update permission again")
	public void user_should_login_as_super_admin_and_update_permission_again() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getAddclientContactAttempts());
		Thread.sleep(3000);
		screenshot("18_CheckClientcontact.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle3=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles3=driver.getWindowHandles();
		for (String handle : handles3) {
		if(!handle.equals(Parenthandle3)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);		

	}

	@Then("User Verify the manager login for permission update or not")
	public void user_verify_the_manager_login_for_permission_update_or_not() throws Exception {browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getaddcontactbtn());
		Thread.sleep(5000);
		screenshot("19_ViewClientContact_again.png");
		ClickOnElement(ST.getsuperadmin_manager().getclkcontactcloseIcon());
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
				if(!handle.equals(Parenthandle2)) {
					driver.switchTo().window(handle);
					ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
					browserquit();
				}}
	}
//@Manager_Create_NewTeam
	@Given("Uncheck the create new team member access")
	public void uncheck_the_create_new_team_member_access() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getcreate_newTeamMember());
		Thread.sleep(3000);
		screenshot("20_Uncheck_newTeam_Member.png");
		//js.executeScript("window.scrollBy(0,-600)", "");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);
	}

	@Given("User able to check the manager the updated permission")
	public void user_able_to_check_the_manager_the_updated_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		screenshot("21_Verify_AddTeam_Memberbtn.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		}
	}

	@Given("super admin again update the permission")
	public void super_admin_again_update_the_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getcreate_newTeamMember());
		Thread.sleep(3000);
		screenshot("22_check_newTeam_Member.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);

	}

	@Given("manager again verify the updated permission")
	public void manager_again_verify_the_updated_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		screenshot("23_View_AddTeam_Memberbtn.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		}
	}
//@Manager_ArchiveTeam_Member
	@Given("check and uncheck the archive the team member")
	public void check_and_uncheck_the_archive_the_team_member() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getArchiveteamMember());
		Thread.sleep(3000);
		screenshot("24_Uncheck_archiveTeam_Member.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);

	}

	@Given("User should login and check the permission")
	public void user_should_login_and_check_the_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getUserArchive());
		ClickOnElement(ST.getsuperadmin_manager().getviewArchiveText());
		Thread.sleep(2000);
		screenshot("25_Verify_ArchiveTeam_Member.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}
	}

	@Given("user login as super again check the permisson")
	public void user_login_as_super_again_check_the_permisson() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getArchiveteamMember());
		Thread.sleep(3000);
		screenshot("26_check_archiveTeam_Member.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);


	}

	@Given("manager again verify the updated permission for archive team member")
	public void manager_again_verify_the_updated_permission_for_archive_team_member() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getUserArchive());
		ClickOnElement(ST.getsuperadmin_manager().getviewArchiveText());
		Thread.sleep(2000);
		screenshot("27_View_ArchiveTeam_MemberText.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}

	}
//@Manager_Team_MemberLocation
	@Given("User able remove the permission as manage location")
	public void user_able_remove_the_permission_as_manage_location() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getManageTeamMemberLocation());
		Thread.sleep(3000);
		screenshot("28_Uncheck_TeamMember.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);


	}

	@Given("manager user login and verify the update permission")
	public void manager_user_login_and_verify_the_update_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getUserName());
		Thread.sleep(3000);
		screenshot("29_TeamMember_location.png");
		ClickOnElement(ST.getsuperadmin_manager().getlocationcloseIcon());
		Thread.sleep(2000);
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
	}

	@Given("Again super user give the location permission for that user")
	public void again_super_user_give_the_location_permission_for_that_user() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getManageTeamMemberLocation());
		Thread.sleep(3000);
		screenshot("30_Uncheck_archiveTeam_Member.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-600)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);
	}

	@Given("Manager user login and check the location permission")
	public void manager_user_login_and_check_the_location_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getUserName());
		Thread.sleep(3000);
		screenshot("31_AgainviewTeamMember_location.png");
		ClickOnElement(ST.getsuperadmin_manager().getlocationcloseIcon());
		Thread.sleep(2000);
		
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}


	}
//	@Manager_Team_MemberRole
	@Given("User able to remove the team memeber role permission")
	public void user_able_to_remove_the_team_memeber_role_permission() throws  Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getChangeTeamRole());
		Thread.sleep(3000);
		screenshot("32_Uncheck_TeamMemberRole.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);

		

	}

	@Given("login as manager and check role permission")
	public void login_as_manager_and_check_role_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getUserArchive());
		ClickOnElement(ST.getsuperadmin_manager().getviewArchiveText());
		//Actions action = new Actions(driver);
		//action.moveToElement(ST.getsuperadmin_manager().getaccountType()).perform();
		Thread.sleep(3000);
		screenshot("33_TeamMember_role.png");
		Thread.sleep(2000);
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);

		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}

		

	}

	@Given("Again login as super admin then update permission as change team member role")
	public void again_login_as_super_admin_then_update_permission_as_change_team_member_role() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getChangeTeamRole());
		Thread.sleep(3000);
		screenshot("34_check_TeamMemberRole.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);


	}

	@Given("login and verify the role permission for manager")
	public void login_and_verify_the_role_permission_for_manager() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getUserArchive());
		ClickOnElement(ST.getsuperadmin_manager().getviewArchiveText());
		//Actions action = new Actions(driver);
		//action.moveToElement(ST.getsuperadmin_manager().getaccountType()).perform();
		Thread.sleep(3000);
		screenshot("35_AgainviewTeamMember_role.png");
		Thread.sleep(2000);
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}
	}
//@Manager_UnArchiveTeam_Member
	@Given("User should be remove the unarchive the team member")
	public void user_should_be_remove_the_unarchive_the_team_member() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().GetUnacrchiveTeam());
		Thread.sleep(3000);
		screenshot("36_Uncheck_unarchiveTeam.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);


	}

	@Given("user login and check the update permission as remove the uncrchive")
	public void user_login_and_check_the_update_permission_as_remove_the_uncrchive() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getClkArchiveLink());
		Thread.sleep(3000);
		screenshot("37_unarchive.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}


	}

	@Given("Super admin login and give the permission for unarchive the team member")
	public void super_admin_login_and_give_the_permission_for_unarchive_the_team_member() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String azureemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		ClickOnElement(ST.getsuperadmin_manager().getEditLink());
		Thread.sleep(3000);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().GetUnacrchiveTeam());
		Thread.sleep(3000);
		screenshot("38_check_UnarchiveMember.png");
		jsScrollUpElement(ST.getsuperadmin_manager().getUpdatebtn());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(4000);
		ClickOnElement(ST.getsuperadmin_manager().getUpdatebtn());
		String Parenthandle4=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles4=driver.getWindowHandles();
		for (String handle : handles4) {
		if(!handle.equals(Parenthandle4)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
		}
		}
		Thread.sleep(5000);

	}

	@Given("user again login as manager and check the unarchive permission")
	public void user_again_login_as_manager_and_check_the_unarchive_permission() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
		String Parenthandle = driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(Parenthandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(5000);
		String manageremail = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerEmail();
		EnterText(ST.getsuperadmin_manager().enterazureEmail(), manageremail);
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String managerpass = FileReaderManager.getInstanceFRM().getInstanceSA().getManagerPassword();
		EnterText(ST.getsuperadmin_manager().extPassword(), managerpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getClkArchiveLink());
		Thread.sleep(3000);
		screenshot("39_AgainViewUnarchive.png");
		String Parenthandle2=	driver.getWindowHandle();
		ClickOnElement(ST.getsuperadmin_manager().getLogout());
		Thread.sleep(3000);
		Set<String>handles2=driver.getWindowHandles();
		for (String handle : handles2) {
		if(!handle.equals(Parenthandle2)) {
		driver.switchTo().window(handle);
		ClickOnElement(ST.getsuperadmin_manager().getclkpopup());
		browserquit();
	
		}
		
		}
	}

}
