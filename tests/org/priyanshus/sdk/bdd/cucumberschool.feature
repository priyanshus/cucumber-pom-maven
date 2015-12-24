@school
Feature: Cucumber school
User can play first lesson for free

Scenario: User can visit the cucumber home page
    Given I am on the cucumber school page
    When I play first free lesson
    Then video modal should be visible