
@tag
Feature: Ideal weight calculation
    As a user I want to calcule my ideal weight So that I can set goals to improve my physical health 

    @tag1
        Scenario: Calculate ideal weight with correct parameters
        Given I click on "calculate ideal weight" Button
        When I introduce my gender and heigth
        And I click on "send" Button
        Then I should see my ideal wheight

    @tag2
        Scenario: calculate ideal weight with incorrect parameters
        Given I click on "calculate ideal weight" Button
        When I introduce my gender or heigth incorrectly
        And I click on "send" Button
        Then The system raises an exception
