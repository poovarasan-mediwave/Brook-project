@16&17formUserflow
Feature: User request the 16_17 kit 
 

  @form16_Reject_flow
  Scenario: User able to order kit for 16 and 17 age pepole 
    Given User launch hometest url 
    And Select the theme and view the preinfo details click next button
    And User enter the "<postcode>" and select the age
    And User should have any sysmtoms and fill type of sex other details 
    And User enter the "<Firstname>" and "<Lastname>" and select the DOB
    And User should enter the "<mobileno>" and email "<address>"
    And User view the order confimation page and select the consent 
    And User finally click on the submit button 
    And User navigate to staffhub login
    And User enter the super admin "<email>" and "<passowrd>" 
    And Navigate to dashboard page and redirect to order result link
    And  Add the Contact attempts as details
    And Finaly reject the test kit and view user in rejected tab
    

  