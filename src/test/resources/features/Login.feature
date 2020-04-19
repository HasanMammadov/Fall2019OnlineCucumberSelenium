@login
Feature: Login
  As user, I want to be able to login with username and password
Background: Open login page
  Given user is on the login page

  @sales_manager
  Scenario: Login as sales manager and verify that title is Dashboard
    When user logs in as a sales manager
    Then user should verify that title is a Dashboard

  @store_manager
  Scenario: Login as store manager and verify that title is Dashboard
    When user logs in as a store manager
    Then user should verify that title is a Dashboard


    @driver @dashboard
    Scenario: Login as driver and verify that title is a Dashboard
      When user logs in as a driver
      Then user should verify that title is a Dashboard

      @login_with_params
      Scenario Outline: login with parameters
        When user enters  "<username>" and  "<password>"
        Then user should verify that title is a Dashboard
        Examples:
          |username        |password    |
          |storemanager85  | UserUser123|
          |salesmanager110 | UserUser123|
          |user19          | UserUser12 |

