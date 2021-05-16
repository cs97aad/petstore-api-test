Feature: As a user,
  I want to be able to find pets by status

  @test
  Scenario Outline: To find pets by status and pets name
    Given I request to find pets by status as "<status>"
    When the response status code is equal to 200
#    Then the response has pets with status "<status>" and name "<name>"

    Examples:
      | status    | name   |
      | available | doggie |
