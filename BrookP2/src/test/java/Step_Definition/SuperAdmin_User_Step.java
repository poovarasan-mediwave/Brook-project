package Step_Definition;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_Class;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SuperAdmin_User_Step extends Base_Class{
	
	public static  Singleton ST = new Singleton();
	@Given("Super admin User1 able to launch the staff url")
	public void super_admin_user1_able_to_launch_the_staff_url() throws Exception {
		browserLaunch("chrome");
		String staffurl = FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		getDrive(staffurl);
	    
	}

	@Given("Enter the super admin user1 Email id {string} and Password {string}")
	public void enter_the_super_admin_user1_email_id_and_password(String string, String string2) throws IOException, Exception {
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

	@When("Click setting icon and its redirect to permission page")
	public void click_setting_icon_and_its_redirect_to_permission_page() throws Exception {
		ClickOnElement(ST.getsuperadmin_manager().getSetting());
	    
	}
//archive
	@Given("Superadmin2 click edit link and remove the archive record Permission")
	public void superadmin2_click_edit_link_and_remove_the_archive_record_permission() throws Exception {
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperAdmin_user().getUserlink());
		Thread.sleep(3000);
		ClickOnElement(ST.getsuperAdmin_user().getEditUser());
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		ClickOnElement(ST.getsuperadmin_manager().getArchivepermission());
		screenshot("40_Uncheck_UserArchive_record.png");
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

	@Given("User2 login and verify the removed the permission present or not")
	public void user2_login_and_verify_the_removed_the_permission_present_or_not() throws Exception {
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
		// ClickOnElement(ST.getunder16form().clkcheckbox());
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getSTI16_17Form().clkrejectedtab());
		Thread.sleep(5000);
		screenshot("41_Archiverecordbtn.png");
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

	@Given("Again login as super admin2 after the give the archive permission and logout")
	public void again_login_as_super_admin2_after_the_give_the_archive_permission_and_logout() throws Exception {
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
		screenshot("42_check_UserArchive_record.png");
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

	@Given("Again User2 login and verify the archive permisssion enable or not")
	public void again_user2_login_and_verify_the_archive_permisssion_enable_or_not() throws Exception {
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
		// ClickOnElement(ST.getunder16form().clkcheckbox());
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getSTI16_17Form().clkrejectedtab());
		Thread.sleep(4000);
		screenshot("43_viewArchiverecordbtn.png");
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
	//superadmin_UnarchiveUser
	@Given("Superadmin3 click edit link and remove the unarchive record Permission")
	public void superadmin3_click_edit_link_and_remove_the_unarchive_record_permission() throws Exception {
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
		screenshot("44_uncheck_UserUnarchive_record.png");
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

	@Given("User3 login and verify the removed the permission present or not")
	public void user3_login_and_verify_the_removed_the_permission_present_or_not() throws Exception {
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
		// ClickOnElement(ST.getunder16form().clkcheckbox());
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("45_User_View_removed_Unarchive_Permission.png");
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

	@Given("Again login as super admin3 after the give the unarchive permission and logout")
	public void again_login_as_super_admin3_after_the_give_the_unarchive_permission_and_logout() throws Exception {
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
		screenshot("46_Enable_UserUnarchive_record.png");
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

	@Given("Again User3 login and verify the unarchive permisssion enable or not")
	public void again_user3_login_and_verify_the_unarchive_permisssion_enable_or_not() throws Exception {
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
		// ClickOnElement(ST.getunder16form().clkcheckbox());
		ClickOnElement(ST.getsuperAdmin_user().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
		ClickOnElement(ST.getsuperadmin_manager().getarchiveTab());
		Thread.sleep(2000);
		screenshot("47_User_enabled__Unarchive_Permission.png");
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
	 //superadmin_ExportArchiverecord
	@Given("Superadmin4 click edit link and remove the Export Archive record  Permission")
	public void superadmin4_click_edit_link_and_remove_the_export_archive_record_permission() throws Exception {
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
		screenshot("48_Disable_exportArchive_record.png");
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

	@Given("User4 login and verify the removed the permission present or not")
	public void user4_login_and_verify_the_removed_the_permission_present_or_not() throws Exception {
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
		screenshot("49_verify_exportrecord_Permission.png");
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

	@Given("Again login as super admin4 after the give the Export Archive record  permission and logout")
	public void again_login_as_super_admin4_after_the_give_the_export_archive_record_permission_and_logout() throws Exception {
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
		Thread.sleep(3000);
		screenshot("50_Enable_export_archive_record.png");
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

	@Given("Again User4 login and verify the Export Archive record  permisssion enable or not")
	public void again_user4_login_and_verify_the_export_archive_record_permisssion_enable_or_not() throws Exception {
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
		screenshot("51_User_enabled_exportarchive_Permission.png");
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
	//superadmin_ViewFulldetails
	@Given("Superadmin5 click edit link and remove the view full details  Permission")
	public void superadmin5_click_edit_link_and_remove_the_view_full_details_permission() throws Exception {
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
		screenshot("52_disable_User_viewFull_details.png");
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
	@Given("User5 login and verify the removed the permission present or not")
	public void user5_login_and_verify_the_removed_the_permission_present_or_not() throws Exception {
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
		screenshot("53_viewUserFull_details_Permission.png");
		//ClickOnElement(ST.getsuperadmin_manager().getcloseIocndetails());
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
	@Given("Again login as super admin5 after the give the view full details  permission and logout")
	public void again_login_as_super_admin5_after_the_give_the_view_full_details_permission_and_logout() throws Exception {
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
		screenshot("54_Enable_User_viewFull_details.png");
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

	@Given("Again User5 login and verify the view full details permisssion enable or not")
	public void again_user5_login_and_verify_the_view_full_details_permisssion_enable_or_not() throws Exception {
	    
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
		screenshot("55_Verify_UserFull_details_Permission.png");
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

	
//superadmin_AddClientContact
	@Given("Superadmin6 click edit link and remove the Add client contact attempts  Permission")
	public void superadmin6_click_edit_link_and_remove_the_add_client_contact_attempts_permission() throws Exception {
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
		screenshot("56_uncheck_user_AddclientContact_record.png");
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

	@Given("User6 login and verify the removed the permission present or not")
	public void user6_login_and_verify_the_removed_the_permission_present_or_not() throws Exception {
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
		//ClickOnElement(ST.getsuperadmin_manager().getViewUserDetails());
		Thread.sleep(4000);
		screenshot("57_Verify_UserclientContact_Permission.png");
		//ClickOnElement(ST.getsuperadmin_manager().getcloseIocndetails());
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

	@Given("Again login as super admin6 after the give the Add client contact attempts  permission and logout")
	public void again_login_as_super_admin6_after_the_give_the_add_client_contact_attempts_permission_and_logout() throws Exception {
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
		screenshot("58_Enable_user_AddclientContact_record.png");
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

	@Given("Again User6 login and verify the Add client contact attempts  permisssion enable or not")
	public void again_user6_login_and_verify_the_add_client_contact_attempts_permisssion_enable_or_not() throws Exception {
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
		screenshot("59_Veiw_UserClientContact_Permission.png");
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
