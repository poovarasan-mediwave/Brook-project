@Manager_User
Feature: manager able to update the all permission for Users

  @managerUserLogin
  Scenario: Manager User able to login
    Given ManagerUser1 able to launch the staff url
    And Enter the manager user1 Emailid "<Emailid>" and manager Password "<Password>"
    When User able Click on the setting icon and it is redirect to permission page

  @InviteUser @managerUserLogin
  Scenario: As manager invite to user
    And User1 able click on the add team memeber button
    And User1 should Enter the email and confirm email
    And User1 able to select the location
    And User1 choose the role and click on the send invite link button
    And Navigate to the manage roles page

  @ManagerUser_Archive
  Scenario: Manager1 able to archive the user2
    And Manager1 click edit link and remove the archive record Permission
    And Login as User2 and verify the removed archive  permission present or not
    And Again login as manager1 after the give the archive permission and logout
    And Again User2 login and verify the archive permisssion enabled
    
  @ManagerUser_Unarchive
  Scenario: Manager2 able to unarchive the user3
    And Manager2 click edit link and remove the unarchive record Permission
    And Login as user3 and verify the removed Unarchive permission present or not
    And Again login as manager3 after the give the unarchive permission and logout
    And Again login as user3 and verify the unarchive permisssion enable or not

  @ManagerUser_ExportArchiverecord
  Scenario: Manager3 able to Export Archive record the user4
    And Manager4 click edit link and remove the Export Archive record  Permission
    And User4 login and verify the removed export Archive record  permission present or not
    And Again login as manager4 after the give the Export Archive record  permission and logout manager login
    And Again User4 able to login and verify the Export Archive record  permisssion enable or not

  @ManagerUser_ViewFulldetails
  Scenario: Manager5 able to view full details the user5
    And Manager5 click edit link and remove the view full details  Permission
    And User5 login and verify the removed  view full details the permission present or not
    And Again login as manager5 after the give the view full details  permission and logout
    And Again User5 able to login and verify the view full details permisssion enable or not

  @ManagerUser_AddClientContact
  Scenario: Manager6 able to Add client contact attempts the user6
    And Manager6 click edit link and remove the Add client contact attempts  Permission
    And User6 login and verify the removed Add client contact attempts is permission present or not
    And Again login as Manager6 after the give the Add client contact attempts  permission and logout
    And Again User6 should login and verify the Add client contact attempts  permisssion enable or not
