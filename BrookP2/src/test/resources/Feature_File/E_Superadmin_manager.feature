#@Superadmin_manager
Feature: Super admin able to update the permission and archive the user

  @manager_permission
  Scenario: login as super admin sucessfull 
    Given User able to launch the staff url
    And Enter the super admin Email id "<Emailid>" and Password "<Password>"
    When Click on the setting icon and redirect to permission page
 @manager_permission
  Scenario: invite as manager and user
    And click on the add team memeber button
    And Enter the email and confirm email
    And select the location
    And choose the role and click on the send invite link button
    And Redirect the manage roles page

	@ManagerArchive
  Scenario: Super admin Edit the manager archive the permission
    And click on the edit link
    And Remove the archive a record permission
    And login as manager and verify the removed the permission present or not
    And Logout the manager login
    And login as super admin after the give the archive permission and logout
    And login manager and verify the manager archive permisssion
    
	@ManagerUnArchive
  Scenario: Super admin Edit the manager unarchive record the permission
    And click edit link
    And Remove the unarchive a record permission and logout
    And login manager and verify the removed the permission display or not and logout
    And login super admin after the give the unarchive permission and logout
    And Again login manager and verify the manager unarchive permisssion
    
	@ManagerExportArchive
  Scenario: Super admin update the export archive access
    And Remove the export archive access
    And verify the manager login updated permission
    And After login super admin again update permission
    And Again verify the manager login
	
	@ManagerViewFullDetails 
  Scenario: Super admin update view full details of record
    And Remove the view full details of record for the manager
    And check manager login updated permission
    And Again super admin user login and update permission again
    Then Verify the manager login for permission update or not
    
	@Manager_client_Contact
  Scenario: Super admin update add client contact attempts
    And Uncheck add client contact attempts for the manager
    And User check manager login updated permission
    And User should login as super admin and update permission again
    Then User Verify the manager login for permission update or not
    
    
	@Manager_Create_NewTeam
  Scenario: Super admin update the create new team member permission
    And Uncheck the create new team member access
    And User able to check the manager the updated permission
    And super admin again update the permission
    And manager again verify the updated permission
    
    
	@Manager_ArchiveTeam_Member
  Scenario: Super admin update archive the team member
    And check and uncheck the archive the team member
    And User should login and check the permission
    And user login as super again check the permisson
    And manager again verify the updated permission for archive team member
    
	@Manager_Team_MemberLocation
  Scenario: Super admin update the manage team member location
    And User able remove the permission as manage location
    And manager user login and verify the update permission
    And Again super user give the location permission for that user
    And Manager user login and check the location permission
    
    
	@Manager_Team_MemberRole
  Scenario: Super admin update the change team member role
    And User able to remove the team memeber role permission
    And login as manager and check role permission
    And Again login as super admin then update permission as change team member role
    And login and verify the role permission for manager
    
	@Manager_UnArchiveTeam_Member
  Scenario: Super admin update the unarchive team memeber
    And User should be remove the unarchive the team member
    And user login and check the update permission as remove the uncrchive
    And Super admin login and give the permission for unarchive the team member
    And user again login as manager and check the unarchive permission
