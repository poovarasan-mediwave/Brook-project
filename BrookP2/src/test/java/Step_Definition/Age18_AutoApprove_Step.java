package Step_Definition;

import java.io.IOException;
import java.util.Set;

import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_Class;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;

public class Age18_AutoApprove_Step extends Base_Class{
	
	public static Singleton ST = new Singleton();
	
	@Given("User should access hometest url")
	public void user_should_access_hometest_url() throws IOException {
		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getURL();
		getDrive(url);
	}

	@Given("User should Select theme and view the preinfo details")
	public void user_should_select_theme_and_view_the_preinfo_details() throws IOException {
		//ClickOnElement(ST.getSTI16_17Form().darkTheme());
		ClickOnElement(ST.getAge18_AutoApprove().getHighcontrast());
		ClickOnElement(ST.getSTI16_17Form().ClkstartBtn());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn1());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn2());
		ClickOnElement(ST.getSTI16_17Form().SkipPreinfo());  
	}

	@Given("User able to enter the {string} and select the age")
	public void user_able_to_enter_the_and_select_the_age(String string) throws IOException, InterruptedException {
		String pc = FileReaderManager.getInstanceFRM().getInstanceCR().getpostCode();
		EnterText(ST.getSTI16_17Form().Enterpostcode(), pc);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn3());
		ClickOnElement(ST.getAge18_AutoApprove().getclkdd());
		sleep(2000);
		selectbyvalue(ST.getAge18_AutoApprove().getclkdd(), "19");
		sleep(5000);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn4()); 
	}

	@Given("User select the if have any sysmtoms and fill type of sex other details in the page")
	public void user_select_the_if_have_any_sysmtoms_and_fill_type_of_sex_other_details_in_the_page() throws IOException, InterruptedException {
		//symptoms yes , no , don't no
		//ClickOnElement(ST.getSTI16_17Form().clkYesbtn());
			ClickOnElement(ST.getSTI16_17Form().clknobtn());
			//ClickOnElement(ST.getSTI16_17Form().dontknow());
			Thread.sleep(3000);
			ClickOnElement(ST.getSTI16_17Form().clknextbtn5());
			ClickOnElement(ST.getSTI16_17Form().clknextbtn6());
			Thread.sleep(3000);
			ClickOnElement(ST.getSTI16_17Form().Clkvaginal());
			ClickOnElement(ST.getSTI16_17Form().VaginalGiven());
			//ClickOnElement(ST.getSTI16_17Form().VaginalReceived());
			jsScrollDownElement(ST.getSTI16_17Form().toyCheckbox());
			Thread.sleep(2000);
			ClickOnElement(ST.getSTI16_17Form().ClkAnal());
			ClickOnElement(ST.getSTI16_17Form().analreceived());
			ClickOnElement(ST.getSTI16_17Form().clknextbtn7());
			//ClickOnElement(ST.getSTI16_17Form().vaginaCheckBox());
			ClickOnElement(ST.getSTI16_17Form().PenisCheckbox());
			Thread.sleep(2000);
			//ClickOnElement(ST.getSTI16_17Form().dontknowcheckbox());
			ClickOnElement(ST.getSTI16_17Form().clknextbtn8());
			ClickOnElement(ST.getSTI16_17Form().clknextbtn9());
			Thread.sleep(3000);
			ClickOnElement(ST.getSTI16_17Form().clknextbtn10());
	    
	}

	@Given("User enter  {string} and {string}  and select the DOB in the text field")
	public void user_enter_and_and_select_the_dob_in_the_text_field(String string, String string2) throws IOException, InterruptedException {
		String fn1 = FileReaderManager.getInstanceFRM().getinstanceSR().getfname();
		EnterText(ST.getSTI16_17Form().enterfirstname(), fn1);
		
		String ln1= FileReaderManager.getInstanceFRM().getinstanceSR().getlname();
		EnterText(ST.getSTI16_17Form().enterlastname(), ln1);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn11());
		Thread.sleep(4000);
		ClickOnElement(ST.getSTI16_17Form().clkdate());
		ClickOnElement(ST.getSTI16_17Form().selectdate());
		Thread.sleep(2000);
		ClickOnElement(ST.getSTI16_17Form().clkmonth());
		ClickOnElement(ST.getSTI16_17Form().selectmonth());
		ClickOnElement(ST.getSTI16_17Form().clkyear());
		ClickOnElement(ST.getSTI16_17Form().selectyear());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn12());
		Thread.sleep(4000);
	   
	}

	@Given("User able to enter the {string} and email {string} in the text field")
	public void user_able_to_enter_the_and_email_in_the_text_field(String string, String string2) throws IOException, InterruptedException {
		String mn = FileReaderManager.getInstanceFRM().getInstanceCR().getmobileno();
		EnterText(ST.getunder16form().EnterMobileno(), mn);
		String email= FileReaderManager.getInstanceFRM().getInstanceCR().getemail();
		EnterText(ST.getunder16form().Enteremail(), email);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn13());
		Thread.sleep(5000);
	}

	@Given("User view the order confimation page")
	public void user_view_the_order_confimation_page() throws IOException, InterruptedException {
		//ClickOnElement(ST.getSTI16_17Form().clkYesemailConfirm());
		ClickOnElement(ST.getSTI16_17Form().clknoEmailconfirm());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn14());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn15());
		Thread.sleep(2000);
		//ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn16());    
	}

	@Given("User able to  fill the address and click confirm button")
	public void user_able_to_fill_the_address_and_click_confirm_button() throws IOException, InterruptedException {
		//ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn17());
		String al1=FileReaderManager.getInstanceFRM().getinstanceAA().getaddressline1();
		EnterText(ST.getAge16_17_autoApprove().Getaddressline1(), al1);
		String al2 = FileReaderManager.getInstanceFRM().getinstanceAA().getaddressline2();
		EnterText(ST.getAge16_17_autoApprove().getaddressline2(), al2);
		jsScrollDownElement(ST.getAge16_17_autoApprove().getjsPostcode());
		String al3 = FileReaderManager.getInstanceFRM().getinstanceAA().getaddressline3();
		EnterText(ST.getAge16_17_autoApprove().getenterAddressline3(), al3);
		String town= FileReaderManager.getInstanceFRM().getinstanceAA().gettown();
		EnterText(ST.getAge16_17_autoApprove().gettown(), town);
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn18());
		Thread.sleep(2000);
		ClickOnElement(ST.getAge16_17_autoApprove().getConfirnbtn());
	    
	}

	@Given("User click confirm email check box")
	public void user_click_confirm_email_check_box() throws IOException, InterruptedException {
		ClickOnElement(ST.getAge16_17_autoApprove().getConfirmCheckbox());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn19());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn20());
		Thread.sleep(3000);
	    
	}

	@Given("User select the ethnicity and select gender and click on the next button")
	public void user_select_the_ethnicity_and_select_gender_and_click_on_the_next_button() throws IOException, InterruptedException {
		ClickOnElement(ST.getAge16_17_autoApprove().getAsian());
		jsScrollDownElement(ST.getAge16_17_autoApprove().getPakistani());
		ClickOnElement(ST.getAge16_17_autoApprove().getPakistani());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn21());
		ClickOnElement(ST.getAge16_17_autoApprove().getgenderAsWoman());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn22());
		Thread.sleep(3000);	   
	}

	@Given("finally confirm the order of kit for age18")
	public void finally_confirm_the_order_of_kit_for_age18() throws IOException, InterruptedException {
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn23());
		ClickOnElement(ST.getAge16_17_autoApprove().getclkFinishbtn());
		Thread.sleep(3000);
	    
	}

	@Given("System  navigate to staffhub login page")
	public void system_navigate_to_staffhub_login_page() throws IOException {
		String staffurl= FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		driver.navigate().to(staffurl);
	}

	@Given("User able enter the super admin {string} and {string}")
	public void user_able_enter_the_super_admin_and(String string, String string2) throws IOException, InterruptedException {
		Thread.sleep(3000);
		String Parenthandle=driver.getWindowHandle();
		ClickOnElement(ST.getunder16form().clkazurelogin());
		sleep(3000);
		Set<String>handles=driver.getWindowHandles();
		for (String handle : handles) {
		if(!handle.equals(Parenthandle)) {
		driver.switchTo().window(handle);
		}
		}
		Thread.sleep(5000);
		String azureemail= FileReaderManager.getInstanceFRM().getInstanceCR().getsEmail();
		EnterText(ST.getunder16form().enterazureEmail(), azureemail);
		ClickOnElement(ST.getunder16form().ExternalNext());
		String azurepass = FileReaderManager.getInstanceFRM().getInstanceCR().getsPassword();
		EnterText(ST.getunder16form().extPassword(), azurepass);
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().Signinbtn());
		Thread.sleep(2000);
		//ClickOnElement(ST.getunder16form().clkcheckbox());
		ClickOnElement(ST.getunder16form().exyesbtn());
		driver.switchTo().window(Parenthandle);
		Thread.sleep(6000);

	}

	@Given("Click on order result link Navigate to respective page")
	public void click_on_order_result_link_navigate_to_respective_page() throws InterruptedException {
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
	    
	}

	@Given("User able to View the kit in the approve list tab")
	public void user_able_to_view_the_kit_in_the_approve_list_tab() throws InterruptedException, IOException {
		Thread.sleep(4000);
		ClickOnElement(ST.getunder16form().ViewApprovedlist());
		Thread.sleep(3000);
		screenShot("/BrookP2/ScreenShot/approve18age.png");
	}



	

}
