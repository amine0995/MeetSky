
  Feature: verify the size column order
    Background:
      Given the user is on the login page
      And the user enters the driver information
      Then the user should be able to login
@bysize
    Scenario: the use verify the size column order changing by size
      When the user check the order by size
      Then the user clicks on Size
      And the user see new order by size column

  @byorder
  Scenario: the use verify the modify column order changing by modified
    When




