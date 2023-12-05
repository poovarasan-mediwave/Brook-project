@STIFormUnder16
Feature: TO verify the under16 STI kit flow

  @Under16form
  Scenario: User able to order the test kit for under16
    Given User able to launch url and Select the theme and read the preinformation details
    And Enter the post code and select the age category
    And Click on the proceed button
    And Enter the first name "<FirstName>" Last name "<lastName>" and select the DOB
    And Enter the phone and email id "<User email id >" and click on next button
    And finaly click on the finish button
    Then User launch staffhub URL and click on the Continue with Microsoft Azure buton
    And User Should enter the super admin Email "<super admin Email>" and enter the password "<super admin password >"
    And User navigate to dashboard page and click on the order and test result link
    Then User able to Add the Contact attempts as email
    And Finaly Aprovethe test kit
