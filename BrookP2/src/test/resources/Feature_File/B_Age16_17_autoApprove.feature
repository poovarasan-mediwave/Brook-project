@16&17form_automApprove
Feature: User able to request the 16_17 auto approve kit flow 
 

  @form16_17Auto_approve
  Scenario: User should order kit for 16 and 17 age 
    Given User should launch hometest url 
    And Select theme and view the preinfo details and click next button
    And User should enter the <postcode> and select the age
    And User have any sysmtoms and fill type of sex other details in the page
    And User enter the <Firstname> and <Lastname> and select the DOB
    And User able to enter the <mobileno> and email <address> in the text field 
    And User should  view the order confimation page and select the consent 
    And User should fill the address and click confirm button
    And User click confirm email check box and click on next button
    And User select the ethnicity and select gender
    And finally confirm the order of kit 
    And User should navigate to staffhub login page 
    And User should enter the super admin <email> and <passowrd>
    And The page Navigate to dashboard page and redirect to order result link
    And View the kit in the approve list tab
   
    