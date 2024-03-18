
@tag
Feature: Ideal weight calculation
    As a user I want to calcule my ideal weight So that I can set goals to improve my physical health 

    @tag1
        Scenario Outline: Calculate ideal weight with correct parameters
        Given my gender <g> and heigth <h>
        When I calculate my ideal weight
        Then I should see my ideal wheight <value>
        Examples:
            |  h | g |value |
            | 190|'m'|  80  |
            | 190|'f'|  74  |
        

    @tag2
        Scenario Outline: calculate ideal weight with incorrect parameters
        Given my gender <g> or heigth <h> incorrectly
        When I calculate my ideal weight
        Then The system raises an exception
        Examples:
            |  h | g |
            | -1 |'m'|
            | 140|'z'|