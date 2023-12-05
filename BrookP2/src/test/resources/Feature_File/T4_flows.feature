@T4_flow
Feature: Test the T4 different flows

  Background: 
    Given Launch the STI form URL
    When User click on the theme and also click the start button
    And User enter the T4 related postcode and click on the next button
    And User select the age and click on the ext button
    And User select the symptoms in postage page and also click on the next button
    And User click on the next button in preinfo page
    And User click on the Yes, Id like to know more button and also click the next button
    And User select the type of sex and click the next button
    And User select the genitals type and click the next button
    And USer click on the next button in vaginal sex and eligibility pass page

  Scenario: T4 flow without select the Multiple disease
    And User click on the next button without select the multiple disease option in customise kit page
    And User click on the next button without select the options in edit kit page
    And User click the next button in test kit and precontact page
    And User enter the firstname and lastname in contact username page and click the next button
    And user select the Date of birth and click the next button
    And User enter the Mobilenumber and Email address and also click the next button
    And User select the confirmation email option and click the next button
    And User enter the address details and click on the next button
    And User click on the confirm button in confirm address page
    And User select on the consent check box and click the next button
    And User click the next button in monitor question page
    And User select the ethnicity and click the next button
    And User select the gender and click the submit button
    And User click the next button in thank you page
    And User click on the finish button in whatnext page
    Then To verify the Brook page

  Scenario: T4 flow with Throat and Rectum
    And User select on the throat and rectum option and click the next button in customise kit page
    And User click the next button witout select the bloood sample option in edit kit page
    And User click the next button in test kit and precontact page
    And User enter the firstname and lastname in contact username page and click the next button
    And User select on the Date of birth and click the next button
    And User enter the Mobilenumber and Email address and also click the next button
    And User select on the confirmation email option and click the next button
    And User enter the address details and click on the next button
    And User click on the confirm button in confirm address page
    And User select on the consent check box and click the next button
    And User click the next button in monitor question page
    And User select on the ethnicity option and click the next button
    And User select the gender and click on the submit button
    And User click the next button in thank you page
    And User click on the finish button in whatnext page
    Then To verify the Brook page

  Scenario: T4 flow with Blood sample for both HIV and syphilis
    And User click on the next button without select the multiple disease option in customise kit page
    And User select on the both HIV and syphilis option and click the next button in edit kit page
    And User select on the answer and click the next button in risk hepatitis page
    And User click the next button in test kit and precontact page
    And User enter the firstname and lastname in contact username page and click the next button
    And User select on the Date of birth and click on the next button
    And User enter the Mobilenumber and Email address and also click the next button
    And User select the confirmation email option and click the next button
    And User enter the address details and click on the next button
    And User click on the confirm button in confirm address page
    And User select on the consent check box and click the next button
    And User click the next button in monitor question page
    And User should select on the ethnicity option and click the next button
    And User should select the gender and click on the submit button
    And User click the next button in thank you page
    And User click on the finish button in whatnext page
    Then To verify the Brook page

  @T4_flow1
  Scenario: T4 flow with combination of Throat and rectum and test for syphilis but not HIV
    And User select on the throat and rectum option and click the next button in customise kit page
    And User select the test for syphilis but not in HIV option and click the next button in edit kit page
    And User select the answer and click on the next button in risk hepatitis page
    And User click the next button in hepatitis vaccination, test kit and precontact page
    And User enter the firstname and lastname in contact username page and click the next button
    And User should select the Date of birth and click on the next button
    And User enter the Mobilenumber and Email address and also click the next button
    And User select on the confirmation email option and click the next button
    And User enter the address details and click on the next button
    And User click on the confirm button in confirm address page
    And User select on the consent check box and click the next button
    And User click the next button in monitor question page
    And User should select ethnicity option and click on the next button
    And User should select on the gender and click on the submit button
    And User click the next button in thank you page
    And User click on the finish button in whatnext page
    Then To verify the Brook page
