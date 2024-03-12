@tag
Feature: Metabolic basal rate calculation
    As a user I want to calcule my metabolic basal rate So that I can make a diet and control my caloric intake

    @tag1
        Scenario: calculate metabolic basal rate with correct parameters
        Given I click on "calculate metabolic basal rate" Button
        When I introduce my gender, heigth, weight and age
        And I click on "send" Button
        Then I should see my metabolic basal rate


    @tag2
        Scenario: calculate metabolic basal rate with incorrect parameters
        Given I click on "calculate metabolic basal rate" Button
        When I introduce my gender, heigth, weight or age incorrectly
        And I click on "send" Button
        Then The system raises an exception