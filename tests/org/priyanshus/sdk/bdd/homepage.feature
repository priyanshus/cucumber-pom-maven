@homepage
Feature: Home page
User can visit Cucumber home page
User can watch first lesson for free

Scenario: User can visit the cucumber home page
    Given I am on the cucumber home page
    Then title should be "Cucumber"
    
Scenario: User can visit the cucumber home page
    Given I am on the cucumber home page
    When I visit the cucumber school
    Then I should see button to watch first lesson free