package Step_Definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;

import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_Class;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Under16Form_Step extends Base_Class {

	public static Singleton ST = new Singleton();

	@Given("User able to launch url and Select the theme and read the preinformation details")
	public void user_able_to_launch_url_and_select_the_theme_and_read_the_preinformation_details() throws Throwable {

		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getURL();
		getDrive(url);
		ClickOnElement(ST.getunder16form().getselectTheme());
		ClickOnElement(ST.getunder16form().ClkstartBtn());
		ClickOnElement(ST.getunder16form().clknextbtn());
		ClickOnElement(ST.getunder16form().clknextbtn1());
		ClickOnElement(ST.getunder16form().clknextbtn2());
		ClickOnElement(ST.getunder16form().clkyesbtn());
		ClickOnElement(ST.getunder16form().clknextbtn3());
		ClickOnElement(ST.getunder16form().clknextbtn4());
		ClickOnElement(ST.getunder16form().clknextbtn5());
		ClickOnElement(ST.getunder16form().clknextbtn6());
		ClickOnElement(ST.getunder16form().clknextbtn7());
		ClickOnElement(ST.getunder16form().clknextbtn8());

	}

	@Given("Enter the post code and select the age category")
	public void enter_the_post_code_and_select_the_age_category() throws IOException, Throwable {
		String postcode = FileReaderManager.getInstanceFRM().getInstanceCR().getpostCode();
		EnterText(ST.getunder16form().Enterpostcode(), postcode);
		ClickOnElement(ST.getunder16form().clknextbtn9());
		ClickOnElement(ST.getunder16form().clkDD());
		//ClickOnElement(ST.getunder16form().ddSelectage());
		Thread.sleep(6000);
		//selectbyVisibleText(ST.getunder16form().ddSelectage(), "13");
		selectbyvalue(ST.getunder16form().clkDD(), "13");
		sleep(4000);
		ClickOnElement(ST.getunder16form().clknextbtn10());

	}

	@Given("Click on the proceed button")
	public void click_on_the_proceed_button() throws InterruptedException {
		ClickOnElement(ST.getunder16form().ClkproceedBtn());
		Thread.sleep(4000);

	}
	@Given("Enter the first name {string} Last name {string} and select the DOB")
	public void enter_the_first_name_last_name_and_select_the_dob(String string, String string2) throws IOException, InterruptedException {
		String fn = FileReaderManager.getInstanceFRM().getInstanceCR().getFirstName();
		EnterText(ST.getunder16form().enterfirstname(), fn);
		
		String ls= FileReaderManager.getInstanceFRM().getInstanceCR().getLastName();
		EnterText(ST.getunder16form().enterlastname(), ls);
		ClickOnElement(ST.getunder16form().clknextbtn11());
		Thread.sleep(4000);
		ClickOnElement(ST.getunder16form().clkdate());
		ClickOnElement(ST.getunder16form().selectdate());
		Thread.sleep(2000);
		ClickOnElement(ST.getunder16form().clkmonth());
		ClickOnElement(ST.getunder16form().selectmonth());
		ClickOnElement(ST.getunder16form().clkyear());
		ClickOnElement(ST.getunder16form().selectyear());
		ClickOnElement(ST.getunder16form().clknextbtn12());
		Thread.sleep(4000);
		
	}

	@Given("Enter the phone and email id {string} and click on next button")
	public void enter_the_phone_and_email_id_and_click_on_next_button(String string) throws IOException, InterruptedException {
		String mn = FileReaderManager.getInstanceFRM().getInstanceCR().getmobileno();
		EnterText(ST.getunder16form().EnterMobileno(), mn);
		String email= FileReaderManager.getInstanceFRM().getInstanceCR().getemail();
		EnterText(ST.getunder16form().Enteremail(), email);
		ClickOnElement(ST.getunder16form().clknextbtn13());
		Thread.sleep(5000);

	}

	@Given("finaly click on the finish button")
	public void finaly_click_on_the_finish_button() throws InterruptedException {
		ClickOnElement(ST.getunder16form().Clkfinishbtn());
		Thread.sleep(5000);
		ClickOnElement(ST.getunder16form().ClkFinish());

	}

	@Then("User launch staffhub URL and click on the Continue with Microsoft Azure buton")
	public void user_launch_staffhub_url_and_click_on_the_continue_with_microsoft_azure_buton() throws IOException {
		String staffurl= FileReaderManager.getInstanceFRM().getInstanceCR().StaffURL();
		driver.navigate().to(staffurl);
	}

	@Then("User Should enter the super admin Email {string} and enter the password {string}")
	public void user_should_enter_the_super_admin_email_and_enter_the_password(String string, String string2) throws InterruptedException, IOException {
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
	@Then("User navigate to dashboard page and click on the order and test result link")
	public void user_navigate_to_dashboard_page_and_click_on_the_order_and_test_result_link() throws InterruptedException, AWTException {
		ClickOnElement(ST.getunder16form().ClkorderResult());
		Thread.sleep(5000);
	}

	@Then("User able to Add the Contact attempts as email")
	public void user_able_to_add_the_contact_attempts_as_email() throws InterruptedException, IOException, AWTException {
		ClickOnElement(ST.getunder16form().Contactattempts());
		Thread.sleep(3000);
		ClickOnElement(ST.getunder16form().SelectType());
		ClickOnElement(ST.getunder16form().selectemailType());
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
		ClickOnElement(ST.getunder16form().SelectResponse());
		      Thread.sleep(4000);
		ClickOnElement(ST.getunder16form().clkSaveBtn());
		Thread.sleep(4000);
		

	}

	@Then("Finaly Aprovethe test kit")
	public void finaly_aprovethe_test_kit() throws InterruptedException, AWTException, IOException {
		ClickOnElement(ST.getunder16form().clkapprovebtn());
		ClickOnElement(ST.getunder16form().clientcheckbox());
		String address1=FileReaderManager.getInstanceFRM().getInstanceCR().getaddress1();
		EnterText(ST.getunder16form().EnterAddress1(), address1);
		String address2 = FileReaderManager.getInstanceFRM().getInstanceCR().getAddress2();
		EnterText(ST.getunder16form().EnterAddress2(), address2);
		String town = FileReaderManager.getInstanceFRM().getInstanceCR().gettown();
		EnterText(ST.getunder16form().EnterTown(), town);
		ClickOnElement(ST.getunder16form().SelectEthnicity());
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		ClickOnElement(ST.getunder16form().ClkState());
		Thread.sleep(4000);
		ClickOnElement(ST.getunder16form().Clkidentity());
		r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 //ClickOnElement(ST.getunder16form().Selectidentity());
		 Thread.sleep(2000);
		 String note= FileReaderManager.getInstanceFRM().getInstanceCR().getNote();
		 EnterText(ST.getunder16form().EnterNote(), note);
		 jsScrollDownElement(ST.getunder16form().clkApprovekitBtn());
		ClickOnElement(ST.getunder16form().clkApprovekitBtn());
		Thread.sleep(4000);
		ClickOnElement(ST.getunder16form().clkliliecheckbox());
		ClickOnElement(ST.getunder16form().clkfinishBtn1());
		Thread.sleep(7000);
		ClickOnElement(ST.getSTI16_17Form().clkcloseLink());
		 Thread.sleep(5000);
		ClickOnElement(ST.getunder16form().ViewApprovedlist());
		

	}

}
