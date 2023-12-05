@Superadmin_User
Feature: Super admin able to update the all permission for Users

  @SuperadminLogin
  Scenario: SuperAdmin1 able to login user1
    Given Super admin User1 able to launch the staff url
    And Enter the super admin user1 Email id "<Emailid>" and Password "<Password>"
    When Click setting icon and its redirect to permission page

   @SuperadminLogin
  Scenario: Superadmin able to archive the user2
    And Superadmin2 click edit link and remove the archive record Permission
    And User2 login and verify the removed the permission present or not
    And Again login as super admin2 after the give the archive permission and logout
    And Again User2 login and verify the archive permisssion enable or not

  @superadmin_UnarchiveUser
  Scenario: Superadmin able to unarchive the user3
    And Superadmin3 click edit link and remove the unarchive record Permission
    And User3 login and verify the removed the permission present or not
    And Again login as super admin3 after the give the unarchive permission and logout
    And Again User3 login and verify the unarchive permisssion enable or not

  @superadmin_ExportArchiverecord
  Scenario: Superadmin able to Export Archive record the user4
    And Superadmin4 click edit link and remove the Export Archive record  Permission
    And User4 login and verify the removed the permission present or not
    And Again login as super admin4 after the give the Export Archive record  permission and logout
    And Again User4 login and verify the Export Archive record  permisssion enable or not

  @superadmin_ViewFulldetails
  Scenario: Superadmin able to view full details the user5
    And Superadmin5 click edit link and remove the view full details  Permission
    And User5 login and verify the removed the permission present or not
    And Again login as super admin5 after the give the view full details  permission and logout
    And Again User5 login and verify the view full details permisssion enable or not

  @superadmin_AddClientContact
  Scenario: Superadmin able to Add client contact attempts the user6
    And Superadmin6 click edit link and remove the Add client contact attempts  Permission
    And User6 login and verify the removed the permission present or not
    And Again login as super admin6 after the give the Add client contact attempts  permission and logout
    And Again User6 login and verify the Add client contact attempts  permisssion enable or not
