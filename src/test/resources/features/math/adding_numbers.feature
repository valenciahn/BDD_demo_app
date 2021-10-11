Feature: Number Operations
#comentario para prueba 1
  Scenario: Adding two numbers
    Given a is 1
    And b is 2
    When I add a and b
    Then the total should be 3
  @Pending
  Scenario: Substract numbers
    Given a is 1
    And b is 2
    When I substract a to b
    Then the total should be 1