package Step_Definition;

import Configuration_Reader.FileReaderManager;
import Lib_Global.Base_class1;
import Singleton_Design_pattern.Singleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class T4_flow_step extends Base_class1 {

	public static Singleton si = new Singleton();

	@Given("Launch the STI form URL")
	public void launch_the_sti_form_url() throws Throwable {
		browserLaunch(FileReaderManager.getInstanceFRM().gett4_flow().getBrowser());
		wait(20);
		getDrive(FileReaderManager.getInstanceFRM().gett4_flow().getSTIkit_URL());
		sleep(2000);
	}

	@When("User click on the theme and also click the start button")
	public void user_click_on_the_theme_and_also_click_the_start_button() {
		clickon_ListElement_indexbased(si.gett4_flow().getThemes(), 1);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getStart_button());
		wait(20);
	}

	@When("User enter the T4 related postcode and click on the next button")
	public void user_enter_the_t4_related_postcode_and_click_on_the_next_button() throws Throwable {

		enterText(si.gett4_flow().getPostcode_field(), FileReaderManager.getInstanceFRM().gett4_flow().getpostcode());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User select the age and click on the ext button")
	public void user_select_the_age_and_click_on_the_ext_button() {

		ClickOnElement(si.gett4_flow().getAge());
		wait(20);
		dynamic_TextSelection(si.gett4_flow().getAge_selection(), "22");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User select the symptoms in postage page and also click on the next button")
	public void user_select_the_symptoms_in_postage_page_and_also_click_on_the_next_button() {
		clickon_ListElement_indexbased(si.gett4_flow().getSymptoms(), 1);
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User click on the next button in preinfo page")
	public void user_click_on_the_next_button_in_preinfo_page() {
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User click on the Yes, Id like to know more button and also click the next button")
	public void user_click_on_the_yes_id_like_to_know_more_button_and_also_click_the_next_button() {

		ClickOnElement(si.gett4_flow().getPreinfo_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User select the type of sex and click the next button")
	public void user_select_the_type_of_sex_and_click_the_next_button() {

		select_typesofex("Vaginal", 1);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User select the genitals type and click the next button")
	public void user_select_the_genitals_type_and_click_the_next_button() {
		clickon_ListElement_indexbased(si.gett4_flow().getGenitals_types(), 0);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("USer click on the next button in vaginal sex and eligibility pass page")
	public void u_ser_click_on_the_next_button_in_vaginal_sex_and_eligibility_pass_page() {

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User click on the next button without select the multiple disease option in customise kit page")
	public void user_click_on_the_next_button_without_select_the_multiple_disease_option_in_customise_kit_page() {

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User click on the next button without select the options in edit kit page")
	public void user_click_on_the_next_button_without_select_the_options_in_edit_kit_page() {

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User click the next button in test kit and precontact page")
	public void user_click_the_next_button_in_test_kit_and_precontact_page() {

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User enter the firstname and lastname in contact username page and click the next button")
	public void user_enter_the_firstname_and_lastname_in_contact_username_page_and_click_the_next_button() {
		enterText(si.gett4_flow().getFirstname(), generateRandomName());
		sleep(2000);
		enterText(si.gett4_flow().getLastname(), generateRandomName());
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("user select the Date of birth and click the next button")
	public void user_select_the_date_of_birth_and_click_the_next_button() {
		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 0);
		wait(20);
		DateofBirth("Date", "15");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 1);
		wait(20);
		DateofBirth("Month", "May");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 2);
		wait(20);
		clickon_ListElement_indexbased(si.gett4_flow().getYear_list(), 1);
		sleep(2000);

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User enter the Mobilenumber and Email address and also click the next button")
	public void user_enter_the_mobilenumber_and_email_address_and_also_click_the_next_button() {

		enterText(si.gett4_flow().getMobilenumber(), generateRandomMobileNumber());
		sleep(1000);
		enterText(si.gett4_flow().getEmialaddress(), generateRandomEmail());
		sleep(1000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select the confirmation email option and click the next button")
	public void user_select_the_confirmation_email_option_and_click_the_next_button() {
		clickon_ListElement_indexbased(si.gett4_flow().getMail_confirmation(), 0);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User enter the address details and click on the next button")
	public void user_enter_the_address_details_and_click_on_the_next_button() throws Throwable {

		enterText(si.gett4_flow().getAddress(), FileReaderManager.getInstanceFRM().gett4_flow().getAddress());
		sleep(2000);

		jsScrollDownElement(si.gett4_flow().getTown());
		wait(20);
		enterText(si.gett4_flow().getTown(), FileReaderManager.getInstanceFRM().gett4_flow().getTown());
		sleep(2000);
		jsScrollDownElement(si.gett4_flow().getNext_button());
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User click on the confirm button in confirm address page")
	public void user_click_on_the_confirm_button_in_confirm_address_page() {
		ClickOnElement(si.gett4_flow().getConfirm_button());
		sleep(2000);
	}

	@When("User select on the consent check box and click the next button")
	public void user_select_on_the_consent_check_box_and_click_the_next_button() {

		ClickOnElement(si.gett4_flow().getConsent_checkbox());
		sleep(1500);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User click the next button in monitor question page")
	public void user_click_the_next_button_in_monitor_question_page() {
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select the ethnicity and click the next button")
	public void user_select_the_ethnicity_and_click_the_next_button() {

		ethnicity_selection("Asian");
		sleep(2000);
		ethnicity_selection("Indian");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select the gender and click the submit button")
	public void user_select_the_gender_and_click_the_submit_button() {

		gender_selection("boy");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getSubmit_button());
		sleep(2000);
	}

	@When("User click the next button in thank you page")
	public void user_click_the_next_button_in_thank_you_page() {

		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User click on the finish button in whatnext page")
	public void user_click_on_the_finish_button_in_whatnext_page() {
		ClickOnElement(si.gett4_flow().getFinish_button());
		sleep(3000);
		ClickOnElement(si.gett4_flow().getAllow_option());
		wait(20);
	}

	@Then("To verify the Brook page")
	public void to_verify_the_brook_page() {

		verificationprocess(si.gett4_flow().getVerify_brook(),
				"YOUR FREE & CONFIDENTIAL SEXUAL HEALTH & WELLBEING EXPERTS");

	}

//	Throat and rectum

	@When("User select on the throat and rectum option and click the next button in customise kit page")
	public void user_select_on_the_throat_and_rectum_option_and_click_the_next_button_in_customise_kit_page() {

		ClickOnElement(si.gett4_flow().getThroatandRectum_checkbox());
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);

	}

	@When("User click the next button witout select the bloood sample option in edit kit page")
	public void user_click_the_next_button_witout_select_the_bloood_sample_option_in_edit_kit_page() {

		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select on the Date of birth and click the next button")
	public void user_select_on_the_date_of_birth_and_click_the_next_button() {

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 0);
		wait(20);
		DateofBirth("Date", "27");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 1);
		wait(20);
		DateofBirth("Month", "October");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 2);
		wait(20);
		clickon_ListElement_indexbased(si.gett4_flow().getYear_list(), 1);
		sleep(2000);

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User select on the confirmation email option and click the next button")
	public void user_select_on_the_confirmation_email_option_and_click_the_next_button() {

		clickon_ListElement_indexbased(si.gett4_flow().getMail_confirmation(), 1);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select on the ethnicity option and click the next button")
	public void user_select_on_the_ethnicity_option_and_click_the_next_button() {

		ethnicity_selection("Asian");
		sleep(2000);
		ethnicity_selection("Pakis");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select the gender and click on the submit button")
	public void user_select_the_gender_and_click_on_the_submit_button() {

		gender_selection("girl");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getSubmit_button());
		sleep(2000);
	}

//	Both HIV and syphilis	
	@When("User select on the both HIV and syphilis option and click the next button in edit kit page")
	public void user_select_on_the_both_hiv_and_syphilis_option_and_click_the_next_button_in_edit_kit_page() {

		clickon_ListElement_indexbased(si.gett4_flow().getBloodsample_types(), 0);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select on the answer and click the next button in risk hepatitis page")
	public void user_select_on_the_answer_and_click_the_next_button_in_risk_hepatitis_page() {

		clickon_ListElement_indexbased(si.gett4_flow().getRisk_hepatitis_options(), 2);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select on the Date of birth and click on the next button")
	public void user_select_on_the_date_of_birth_and_click_on_the_next_button() {
		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 0);
		wait(20);
		DateofBirth("Date", "9");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 1);
		wait(20);
		DateofBirth("Month", "April");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 2);
		wait(20);
		clickon_ListElement_indexbased(si.gett4_flow().getYear_list(), 1);
		sleep(2000);

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User should select on the ethnicity option and click the next button")
	public void user_should_select_on_the_ethnicity_option_and_click_the_next_button() {

		ethnicity_selection("Other");
		sleep(2000);
		ethnicity_selection("Arab");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User should select the gender and click on the submit button")
	public void user_should_select_the_gender_and_click_on_the_submit_button() {

		gender_selection("not");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getSubmit_button());
		sleep(2000);
	}

//	Combination of throat and rectum and test for syphilis
	@When("User select the test for syphilis but not in HIV option and click the next button in edit kit page")
	public void user_select_the_test_for_syphilis_but_not_in_hiv_option_and_click_the_next_button_in_edit_kit_page() {

		clickon_ListElement_indexbased(si.gett4_flow().getBloodsample_types(), 1);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User select the answer and click on the next button in risk hepatitis page")
	public void user_select_the_answer_and_click_on_the_next_button_in_risk_hepatitis_page() {

		clickon_ListElement_indexbased(si.gett4_flow().getRisk_hepatitis_options(), 0);
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User click the next button in hepatitis vaccination, test kit and precontact page")
	public void user_click_the_next_button_in_hepatitis_vaccination_test_kit_and_precontact_page() {

		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User should select the Date of birth and click on the next button")
	public void user_should_select_the_date_of_birth_and_click_on_the_next_button() {

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 0);
		wait(20);
		DateofBirth("Date", "29");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 1);
		wait(20);
		DateofBirth("Month", "September");
		sleep(2000);

		clickon_ListElement_indexbased(si.gett4_flow().getDob(), 2);
		wait(20);
		clickon_ListElement_indexbased(si.gett4_flow().getYear_list(), 1);
		sleep(2000);

		ClickOnElement(si.gett4_flow().getNext_button());
		wait(20);
	}

	@When("User should select ethnicity option and click on the next button")
	public void user_should_select_ethnicity_option_and_click_on_the_next_button() {

		ethnicity_selection("Asian");
		sleep(2000);
		ethnicity_selection("Bangla");
		sleep(2000);
		ClickOnElement(si.gett4_flow().getNext_button());
		sleep(2000);
	}

	@When("User should select on the gender and click on the submit button")
	public void user_should_select_on_the_gender_and_click_on_the_submit_button() throws Throwable {

		gender_selection("self");
		sleep(2000);
		jsScrollDownElement(si.gett4_flow().getGender());
		sleep(1000);
		enterText(si.gett4_flow().getGender(), FileReaderManager.getInstanceFRM().gett4_flow().getgender());
		sleep(2000);
		jsScrollDownElement(si.gett4_flow().getSubmit_button());
		wait(20);
		ClickOnElement(si.gett4_flow().getSubmit_button());
		sleep(2000);
	}

}
