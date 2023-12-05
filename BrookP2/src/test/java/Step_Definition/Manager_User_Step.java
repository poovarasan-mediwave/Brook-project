package Step_Definition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_Class;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Manager_User_Step extends Base_Class {
	
	public static Singleton ST = new Singleton();
	
	@Given("ManagerUser1 able to launch the staff url")
	public void manager_user1_able_to_launch_the_staff_url() throws IOException {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
	    
	}

	@Given("Enter the manager user1 Emailid {string} and manager Password {string}")
	public void enter_the_manager_user1_emailid_and_manager_password(String string, String string2) throws Exception {
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
	    
	}

	@When("User able Click on the setting icon and it is redirect to permission page")
	public void user_able_click_on_the_setting_icon_and_it_is_redirect_to_permission_page() {
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
	    
	}

	@Given("User1 able click on the add team memeber button")
	public void user1_able_click_on_the_add_team_memeber_button() {
		ClickOnElement(ST.getsuperadmin_manager().getaddTeamMember());
	    
	}

	@Given("User1 should Enter the email and confirm email")
	public void user1_should_enter_the_email_and_confirm_email() throws Exception {
		String teamEmail1 = FileReaderManager.getInstanceFRM().getInstanceSA().getTeamemailadress();
		EnterText(ST.getsuperadmin_manager().getTeamemail(), teamEmail1);
		String TeamConfirmemail1 = FileReaderManager.getInstanceFRM().getInstanceSA().getTeamConfirmemail();
		EnterText(ST.getsuperadmin_manager().getTeamconfirmEmail(), TeamConfirmemail1);
	}

	@Given("User1 able to select the location")
	public void user1_able_to_select_the_location() throws Exception {
		ClickOnElement(ST.getsuperadmin_manager().getlocations());
		//Thread.sleep(5000);
		String location1 = FileReaderManager.getInstanceFRM().getInstanceSA().getlocation1();
		EnterText(ST.getsuperadmin_manager().getselectlocation1(), location1);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
	    
	}

	@Given("User1 choose the role and click on the send invite link button")
	public void user1_choose_the_role_and_click_on_the_send_invite_link_button() {
		ClickOnElement(ST.getsuperadmin_manager().getClkrole());
		ClickOnElement(ST.getsuperadmin_manager().getrole());
		ClickOnElement(ST.getsuperadmin_manager().getSendinvitelink());
	    
	}

	@Given("Navigate to the manage roles page")
	public void navigate_to_the_manage_roles_page() {
		ClickOnElement(ST.getsuperadmin_manager().getmanageRoletab());
		browserquit();
	    
	}
// Manager Archive
	@Given("Manager1 click edit link and remove the archive record Permission")
	public void manager1_click_edit_link_and_remove_the_archive_record_permission() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getArchivepermission());
		screenshot("60_Manager_UserArchive_record.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("Login as User2 and verify the removed archive  permission present or not")
	public void login_as_user2_and_verify_the_removed_archive_permission_present_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
	
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getSTI16_17Form().clkrejectedtab());
		Thread.sleep(5000);
		screenshot("61_View_Archive_record_button.png");
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

	@Given("Again login as manager1 after the give the archive permission and logout")
	public void again_login_as_manager1_after_the_give_the_archive_permission_and_logout() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getArchivepermission());
		screenshot("62_Manager_clk_UserArchive_record.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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
	@Given("Again User2 login and verify the archive permisssion enabled")
	public void again_user2_login_and_verify_the_archive_permisssion_enabled() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
	
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getSTI16_17Form().clkrejectedtab());
		Thread.sleep(5000);
		screenshot("63_Again View_Archive_record_button.png");
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

	// manager Unarchive the user 
	@Given("Manager2 click edit link and remove the unarchive record Permission")
	public void manager2_click_edit_link_and_remove_the_unarchive_record_permission() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().getunArchivepermission());
		screenshot("64_Disable_User_Unarchive_record.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("Login as user3 and verify the removed Unarchive permission present or not")
	public void login_as_user3_and_verify_the_removed_unarchive_permission_present_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("65_User_removed_Unarchive_Permission1.png");
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

	@Given("Again login as manager3 after the give the unarchive permission and logout")
	public void again_login_as_manager3_after_the_give_the_unarchive_permission_and_logout() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().getunArchivepermission());
		screenshot("66_enable1_User_Unarchive_record.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("Again login as user3 and verify the unarchive permisssion enable or not")
	public void again_login_as_user3_and_verify_the_unarchive_permisssion_enable_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("67_Again User_Unarchive_Permission1.png");
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
	//export archive permission
	@Given("Manager4 click edit link and remove the Export Archive record  Permission")
	public void manager4_click_edit_link_and_remove_the_export_archive_record_permission() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getExportPermissiom());
		screenshot("68_Manager_Disable_exportArchive_record.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("User4 login and verify the removed export Archive record  permission present or not")
	public void user4_login_and_verify_the_removed_export_archive_record_permission_present_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("69_User_verify_export_Permission.png");
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

	@Given("Again login as manager4 after the give the Export Archive record  permission and logout manager login")
	public void again_login_as_manager4_after_the_give_the_export_archive_record_permission_and_logout_manager_login() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getExportPermissiom());
		screenshot("70_Manager_enable_export_record.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("Again User4 able to login and verify the Export Archive record  permisssion enable or not")
	public void again_user4_able_to_login_and_verify_the_export_archive_record_permisssion_enable_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("71_Againview_User_export_Permission.png");
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
// view full details permission
	@Given("Manager5 click edit link and remove the view full details  Permission")
	public void manager5_click_edit_link_and_remove_the_view_full_details_permission() throws Exception {
		
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getFulldetails());
		Thread.sleep(3000);
		screenshot("72_Manager_disable_viewFull_details.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("User5 login and verify the removed  view full details the permission present or not")
	public void user5_login_and_verify_the_removed_view_full_details_the_permission_present_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getViewUserDetails());
		Thread.sleep(4000);
		screenshot("73_User_viewFull_details_Permission.png");
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

	@Given("Again login as manager5 after the give the view full details  permission and logout")
	public void again_login_as_manager5_after_the_give_the_view_full_details_permission_and_logout() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getFulldetails());
		screenshot("74_Manager_Enable_viewFull_details.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("Again User5 able to login and verify the view full details permisssion enable or not")
	public void again_user5_able_to_login_and_verify_the_view_full_details_permisssion_enable_or_not() throws Exception {browserLaunch("chrome");
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
	String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
	EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
	ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
	String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
	EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
	Thread.sleep(2000);
	ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
	Thread.sleep(2000);
	ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
	driver.switchTo().window(Parenthandle);
	Thread.sleep(6000);
	ClickOnElement(ST.getunder16form().ClkorderResult());
	Thread.sleep(5000);
	ClickOnElement(ST.getsuperadmin_manager().getViewUserDetails());
	Thread.sleep(4000);
	screenshot("75_User_Verify_Fuldetails_Permission.png");
	ClickOnElement(ST.getsuperadmin_manager().getcloseIocndetails());
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
// add client contact attempts
	@Given("Manager6 click edit link and remove the Add client contact attempts  Permission")
	public void manager6_click_edit_link_and_remove_the_add_client_contact_attempts_permission() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getAddclientContactAttempts());
		Thread.sleep(3000);
		screenshot("76_Remove_AddclientContact.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("User6 login and verify the removed Add client contact attempts is permission present or not")
	public void user6_login_and_verify_the_removed_add_client_contact_attempts_is_permission_present_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		screenshot("77_User_Disabled_clientContact_Permission.png");
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

	@Given("Again login as Manager6 after the give the Add client contact attempts  permission and logout")
	public void again_login_as_manager6_after_the_give_the_add_client_contact_attempts_permission_and_logout() throws Exception {
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
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getAddclientContactAttempts());
		screenshot("78_Manager_Enable_AddclientContact.png");
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);
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

	@Given("Again User6 should login and verify the Add client contact attempts  permisssion enable or not")
	public void again_user6_should_login_and_verify_the_add_client_contact_attempts_permisssion_enable_or_not() throws Exception {
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
		String Useremail = FileReaderManager.getInstanceFRM().getInstanceSU().getUserEmail();
		EnterText(ST.getsuperAdmin_user().getenterUserEmail(),Useremail );
		ClickOnElement(ST.getsuperadmin_manager().ExternalNext());
		String Userpass = FileReaderManager.getInstanceFRM().getInstanceSU().getUserPassword();
		EnterText(ST.getsuperAdmin_user().getenterUserPassword(), Userpass);
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().Signinbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getaddcontactbtn());
		Thread.sleep(5000);
		screenshot("79_Again User ViewClientContact_Permission.png");
		ClickOnElement(ST.getsuperadmin_manager().getclkcontactcloseIcon());
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

	

}
