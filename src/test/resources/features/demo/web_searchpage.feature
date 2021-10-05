Feature: Find accounts on web page
  Searching exist or not exist users from UI

  Scenario: Search existing user by account number on search page
    Given account manger navigate to bank page
    And go to search page
    When account manager look for this account number "123456789"
    Then account manager should see "Account Details" title

  @Pending
  Scenario: Search existing user by account number on search page 2
    Given account manger navigate to bank page
    And go to search page
    When account manager look for this account number "123456788"
    Then account manager should see "Account Details" title


