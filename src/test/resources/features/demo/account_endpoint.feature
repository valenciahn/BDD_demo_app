Feature: Validate Account Endpoints

  Scenario: Find by account number
    Given I have this url:"http://192.168.1.121:2222/accounts/"
    When I look for this account number "123456789"
    Then I should see "Keri Lee" as owner

  Scenario: Try to find by account number
    Given I have this url:"http://192.168.1.121:2222/accounts/"
    When I look for this account number "123456788"
    Then I should see "404" as http code

  Scenario: Find by account owner
    Given I have this url:"http://192.168.1.121:2222/accounts/owner/"
    When I look for this owner "Keri Lee"
    Then I should see "123456789" as accountNumber