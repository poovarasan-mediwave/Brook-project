package Step_Definition;

import java.io.IOException;
import java.util.Set;


import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_Class;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;

public class Age16_17Flagged_Step extends Base_Class{
	
	public static Singleton ST= new Singleton();
	@Given("User launch hometest url")
	public void user_launch_hometest_url() throws IOException {
		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getURL();
		getDrive(url);
	    
	}

	@Given("Select the theme and view the preinfo details click next button")
	public void select_the_theme_and_view_the_preinfo_details_click_next_button() throws IOException {
		
		ClickOnElement(ST.getSTI16_17Form().darkTheme());
		ClickOnElement(ST.getSTI16_17Form().ClkstartBtn());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn1());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn2());
		ClickOnElement(ST.getSTI16_17Form().SkipPreinfo());
		
	   
	}

	@Given("User enter the {string} and select the age")
	public void user_enter_the_and_select_the_age(String string) throws IOException, InterruptedException {
		String pc = FileReaderManager.getInstanceFRM().getInstanceCR().getpostCode();
		EnterText(ST.getSTI16_17Form().Enterpostcode(), pc);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn3());
		ClickOnElement(ST.getSTI16_17Form().clkDD());
		sleep(2000);
		selectbyvalue(ST.getunder16form().clkDD(), "17");
		//ClickOnElement(ST.getunder16form().ddSelectage());
		sleep(5000);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn4());
		
	    
	}

	@Given("User should have any sysmtoms and fill type of sex other details")
	public void user_should_have_any_sysmtoms_and_fill_type_of_sex_other_details() throws IOException, InterruptedException {
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

	@Given("User enter the {string} and {string} and select the DOB")
	public void user_enter_the_and_and_select_the_dob(String string, String string2) throws IOException, InterruptedException {
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

	@Given("User should enter the {string} and email {string}")
	public void user_should_enter_the_and_email(String string, String string2) throws IOException, InterruptedException {
		String mn = FileReaderManager.getInstanceFRM().getinstanceSR().getmobileno2();
		EnterText(ST.getSTI16_17Form().EnterMobileno(), mn);
		String email= FileReaderManager.getInstanceFRM().getinstanceSR().getemailadress();
		EnterText(ST.getSTI16_17Form().Enteremail(), email);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn13());
		Thread.sleep(5000);
	    
	}

	@Given("User view the order confimation page and select the consent")
	public void user_view_the_order_confimation_page_and_select_the_consent() throws IOException {
	    //ClickOnElement(ST.getSTI16_17Form().clkYesemailConfirm());
		ClickOnElement(ST.getSTI16_17Form().clknoEmailconfirm());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn14());
	}

	@Given("User finally click on the submit button")
	public void user_finally_click_on_the_submit_button() throws IOException, InterruptedException {
		ClickOnElement(ST.getSTI16_17Form().clknextbtn15());
		ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox1());
		ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox2());
		ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox3());
		ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox4());
		ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox5());
		//ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox6());
	//	ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox7());
	//	ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox8());
		//ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox9());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn15());
		ClickOnElement(ST.getSTI16_17Form().submitBtn());
		Thread.sleep(4000);
		ClickOnElement(ST.getSTI16_17Form().ClkFinish());
	    
	}

	@Given("User navigate to staffhub login")
	public void user_navigate_to_staffhub_login() throws IOException {
		String staffurl= FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		driver.navigate().to(staffurl);
	    
	}

	@Given("User enter the super admin {string} and {string}")
	public void user_enter_the_super_admin_and(String string, String string2) throws InterruptedException, IOException {
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

	@Given("Navigate to dashboard page and redirect to order result link")
	public void navigate_to_dashboard_page_and_redirect_to_order_result_link() throws InterruptedException {
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
	    
	}

	@Given("Add the Contact attempts as details")
	public void add_the_contact_attempts_as_details() throws InterruptedException, IOException {
		ClickOnElement(ST.getunder16form().Contactattempts());
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().SelectType());
		//ClickOnElement(ST.getunder16form().selectemailType());
		ClickOnElement(ST.getSTI16_17Form().selectphone());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().AttemptsDate());
		ClickOnElement(ST.getunder16form().SelectcontactDate());
		String hr = FileReaderManager.getInstanceFRM().getInstanceCR().getContactHr();
		EnterText(ST.getunder16form().EnterHr(), hr);
		String min= FileReaderManager.getInstanceFRM().getInstanceCR().getcontactMin();
		EnterText(ST.getunder16form().EnterMin(), min);
		ClickOnElement(ST.getunder16form().TimePicker());
		ClickOnElement(ST.getunder16form().selecTimeNoon());
		ClickOnElement(ST.getunder16form().ResultRes());
		ClickOnElement(ST.getSTI16_17Form().clkClientContacted());
	    
	}

	@Given("Finaly reject the test kit and view user in rejected tab")
	public void finaly_reject_the_test_kit_and_view_user_in_rejected_tab() throws IOException, InterruptedException {
		ClickOnElement(ST.getSTI16_17Form().clkRejectbtn());
		Thread.sleep(2000);
		ClickOnElement(ST.getSTI16_17Form().clkclientcheckBox());
		ClickOnElement(ST.getSTI16_17Form().Reasoncheckbox1());
		ClickOnElement(ST.getSTI16_17Form().Reasoncheckbox2());
		ClickOnElement(ST.getSTI16_17Form().Reasoncheckbox3());
		ClickOnElement(ST.getSTI16_17Form().Reasoncheckbox4());
		Thread.sleep(2000);
		jsScrollDownElement(ST.getunder16form().EnterNote());
		 String note= FileReaderManager.getInstanceFRM().getInstanceCR().getNote();
		 EnterText(ST.getunder16form().EnterNote(), note);
		 jsScrollDownElement(ST.getSTI16_17Form().clkRejectkit());
		 ClickOnElement(ST.getSTI16_17Form().clkRejectkit());
		 ClickOnElement(ST.getunder16form().clkliliecheckbox());
		 ClickOnElement(ST.getunder16form().clkfinishBtn1());
		 Thread.sleep(4000);
		ClickOnElement(ST.getSTI16_17Form().clkcloseLink());
		 Thread.sleep(5000);
		ClickOnElement(ST.getSTI16_17Form().clkrejectedtab());
		
		
	   
	}

	

}
