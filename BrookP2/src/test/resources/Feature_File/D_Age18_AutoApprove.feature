@Age18_AutoApprove
Feature: User able to request the 16_17 auto approve kit flow 
 

  @Form18_autoapprove
  Scenario: User should able to order kit for 18 age home test 
    Given User should access hometest url 
    And User should Select theme and view the preinfo details 
    And User able to enter the "<postcode>" and select the age
    And User select the if have any sysmtoms and fill type of sex other details in the page
    And User enter  "<Firstname>" and "<Lastname>"  and select the DOB in the text field
    And User able to enter the "<mobileno>" and email "<address>" in the text field 
    And User view the order confimation page  
    And User able to  fill the address and click confirm button
    And User click confirm email check box 
    And User select the ethnicity and select gender and click on the next button
    And finally confirm the order of kit for age18
    And System  navigate to staffhub login page 
    And User able enter the super admin "<email>" and "<passowrd>"
    And Click on order result link Navigate to respective page
    And User able to View the kit in the approve list tab
   
    