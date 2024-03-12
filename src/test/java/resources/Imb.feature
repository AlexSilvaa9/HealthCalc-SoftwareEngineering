@tag
Feature: Metabolic basal rate calculation
    As a user I want to calcule my metabolic basal rate So that I can make a diet and control my caloric intake

    @tag1
        Scenario Outline: calculate metabolic basal rate with correct parameters
        Given I click on "calculate metabolic basal rate" Button
        When I introduce my gender <g>, heigth <h>, weight <w> or age <age> 
        And I click on "send" Button
        Then The system returns <value>
        Examples:
        | w |age |  h | g |value |
        |150|  90| 200|'m'|2305.0|
        |150|  90| 200|'f'|2139.0|
      

    @tag2
        Scenario: calculate metabolic basal rate with incorrect parameters
        Given I click on "calculate metabolic basal rate" Button
        When I introduce my gender <g>, heigth <h>, weight <w> or age <age> incorrectly
        And I click on "send" Button
        Then The system raises an exception

        Examples:
        |w |age|h | g |
        |-1|  1| 1|'m'|
        | 1| -1| 1|'m'|
        | 1|  1|-1|'m'|
        | 1|  1| 1|'z'|