package Step_Definition;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_Class;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;



public class Age16_17_autoAprove_Step extends Base_Class {
	
	public static Singleton ST = new Singleton();
	
	
	@Given("User should launch hometest url")
	public void user_should_launch_hometest_url() throws IOException {
		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getURL();
		getDrive(url);
	    
	}

	@Given("Select theme and view the preinfo details and click next button")
	public void select_theme_and_view_the_preinfo_details_and_click_next_button() throws IOException {
		ClickOnElement(ST.getSTI16_17Form().darkTheme());
		ClickOnElement(ST.getSTI16_17Form().ClkstartBtn());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn1());
		ClickOnElement(ST.getSTI16_17Form().clknextbtn2());
		ClickOnElement(ST.getSTI16_17Form().SkipPreinfo());
	}

	@Given("User should enter the <postcode> and select the age")
	public void user_should_enter_the_postcode_and_select_the_age() throws IOException, InterruptedException {
		String pc = FileReaderManager.getInstanceFRM().getInstanceCR().getpostCode();
		EnterText(ST.getSTI16_17Form().Enterpostcode(), pc);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn3());
		ClickOnElement(ST.getAge18_AutoApprove().getclkdd());
		Thread.sleep(3000);
		selectbyvalue(ST.getAge18_AutoApprove().getclkdd(), "17");
		sleep(5000);
	ClickOnElement(ST.getSTI16_17Form().clknextbtn4());
	    
	}

	@Given("User have any sysmtoms and fill type of sex other details in the page")
	public void user_have_any_sysmtoms_and_fill_type_of_sex_other_details_in_the_page() throws IOException, InterruptedException {
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

	@Given("User enter the <Firstname> and <Lastname> and select the DOB")
	public void user_enter_the_firstname_and_lastname_and_select_the_dob() throws IOException, InterruptedException {
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

	@Given("User able to enter the <mobileno> and email <address> in the text field")
	public void user_able_to_enter_the_mobileno_and_email_address_in_the_text_field() throws IOException, InterruptedException {
		String mn = FileReaderManager.getInstanceFRM().getinstanceSR().getmobileno2();
		EnterText(ST.getSTI16_17Form().EnterMobileno(), mn);
		String email= FileReaderManager.getInstanceFRM().getinstanceSR().getemailadress();
		EnterText(ST.getSTI16_17Form().Enteremail(), email);
		ClickOnElement(ST.getSTI16_17Form().clknextbtn13());
		Thread.sleep(5000);
	}

	@Given("User should  view the order confimation page and select the consent")
	public void user_should_view_the_order_confimation_page_and_select_the_consent() throws IOException, InterruptedException {
		//		ClickOnElement(ST.getSTI16_17Form().clkYesemailConfirm());
				ClickOnElement(ST.getSTI16_17Form().clknoEmailconfirm());
				ClickOnElement(ST.getSTI16_17Form().clknextbtn14());
				ClickOnElement(ST.getSTI16_17Form().clknextbtn15());
				Thread.sleep(2000);
				jsScrollDownElement(ST.getSTI16_17Form().clkConsentcheckbox9());
				Thread.sleep(9000);
				ClickOnElement(ST.getSTI16_17Form().clkConsentcheckbox9());
				ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn16());
			
				
		
	}

	@Given("User should fill the address and click confirm button")
	public void user_should_fill_the_address_and_click_confirm_button() throws IOException, InterruptedException {
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn17());
		String al1=FileReaderManager.getInstanceFRM().getinstanceAA().getaddressline1();
		EnterText(ST.getAge16_17_autoApprove().Getaddressline1(), al1);
		String al2 = FileReaderManager.getInstanceFRM().getinstanceAA().getaddressline2();
		EnterText(ST.getAge16_17_autoApprove().getaddressline2(), al2);
		jsScrollDownElement(ST.getAge16_17_autoApprove().getjsPostcode());
		String al3 = FileReaderManager.getInstanceFRM().getinstanceAA().getaddressline3();
		EnterText(ST.getAge16_17_autoApprove().getenterAddressline3(), al3);
		String town= FileReaderManager.getInstanceFRM().getinstanceAA().gettown();
		EnterText(ST.getAge16_17_autoApprove().gettown(), town);
		jsScrollDownElement(ST.getAge16_17_autoApprove().Clknextbtn18());
		Thread.sleep(5000);
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn18());
		Thread.sleep(2000);
		ClickOnElement(ST.getAge16_17_autoApprove().getConfirnbtn());
	    
	}

	@Given("User click confirm email check box and click on next button")
	public void user_click_confirm_email_check_box_and_click_on_next_button() throws IOException, InterruptedException {
		ClickOnElement(ST.getAge16_17_autoApprove().getConfirmCheckbox());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn19());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn20());
		Thread.sleep(3000);
	    
	}

	@Given("User select the ethnicity and select gender")
	public void user_select_the_ethnicity_and_select_gender() throws IOException, InterruptedException {
		ClickOnElement(ST.getAge16_17_autoApprove().getAsian());
		jsScrollDownElement(ST.getAge16_17_autoApprove().getPakistani());
		ClickOnElement(ST.getAge16_17_autoApprove().getPakistani());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn21());
		ClickOnElement(ST.getAge16_17_autoApprove().getgenderAsWoman());
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn22());
		Thread.sleep(3000);	   
	}

	@Given("finally confirm the order of kit")
	public void finally_confirm_the_order_of_kit() throws IOException, InterruptedException {
		ClickOnElement(ST.getAge16_17_autoApprove().Clknextbtn23());
		ClickOnElement(ST.getAge16_17_autoApprove().getclkFinishbtn());
		Thread.sleep(3000);
	}

	@Given("User should navigate to staffhub login page")
	public void user_should_navigate_to_staffhub_login_page() throws IOException {
		String staffurl= FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		driver.navigate().to(staffurl); 
	}

	@Given("User should enter the super admin <email> and <passowrd>")
	public void user_should_enter_the_super_admin_email_and_passowrd() throws InterruptedException, IOException {
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

	@Given("The page Navigate to dashboard page and redirect to order result link")
	public void the_page_navigate_to_dashboard_page_and_redirect_to_order_result_link() throws InterruptedException {
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
	    
	}

	@Given("View the kit in the approve list tab")
	public void view_the_kit_in_the_approve_list_tab() throws InterruptedException, IOException {
		Thread.sleep(4000);
		ClickOnElement(ST.getunder16form().ViewApprovedlist());
		Thread.sleep(3000);
		screenShot("/BrookP2/ScreenShot/approve.png");
	    
	}
}
