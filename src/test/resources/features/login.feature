@login
Feature: user should be able to login

  Scenario: login as a driver
    Given the user is on the login page
    And the user enters the driver information
    Then the user should be able to login
#@w
##  Feature: changed file view
#  Scenario Outline: folder view should be changed by <button>
#    And the user should see files dynamically
#    Then the user clicks on "<button>"
#    And the user should see changed files
#
#    Examples:
#      |button|
#      |Name  |
#      |Size  |
#      |Modified|

